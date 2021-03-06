package com.ric.web;

import javax.security.auth.message.config.AuthConfigFactory;

import org.apache.catalina.authenticator.jaspic.AuthConfigFactoryImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ric.bill.Config;
import com.ric.st.impl.SoapConfig;
import com.ric.st.impl.TaskController;

import ru.gosuslugi.dom.signature.demo.commands.Command;
import ru.gosuslugi.dom.signature.demo.commands.ListCommand;
import ru.gosuslugi.dom.signature.demo.commands.SignCommand;

@SpringBootApplication
public class Soap2GisApplication implements CommandLineRunner {

	public static Command sc;
	private static ApplicationContext applicationContext = null;
	
    //access command line arguments
    @Override
    public void run(String... args) throws Exception {

        //do something

    }
    
	public static void main(String[] args) {
		// Не удалять! отвалится ЭЦП!
		System.setProperty("org.apache.xml.security.resource.config", "resource/tj-msxml.xml");
		  
        String mode = args != null && args.length > 0 ? args[0] : null;

		if (AuthConfigFactory.getFactory() == null) {
            AuthConfigFactory.setFactory(new AuthConfigFactoryImpl());
        }
        
        if (applicationContext != null && mode != null && "stop".equals(mode)) {
            System.exit(SpringApplication.exit(applicationContext, new ExitCodeGenerator() {
                @Override
                public int getExitCode() {
                    return 0;
                }
            }));
        } else {
            SpringApplication app = new SpringApplication(Soap2GisApplication.class);
            applicationContext = app.run(args);
            
            TaskController taskContr = applicationContext.getBean(TaskController.class);
            SoapConfig soapConfig = applicationContext.getBean(SoapConfig.class);
            //Создать объект подписывания XML
    		try {
    			sc = new SignCommand(soapConfig.getSignPass(), soapConfig.getSignPath());
    			//System.out.println("Объект подписывания XML СОЗДАН!");
    		} catch (Exception e1) {
    			System.out.println("Объект подписывания XML не создан!");
    			e1.printStackTrace();
    		}

            try {
				taskContr.searchTask();
			} catch (Exception e) {
				e.printStackTrace();
			}
            
            // Завершить выполнение приложения
            SpringApplication.exit(applicationContext, () -> 0);
        }
		
	}
}
