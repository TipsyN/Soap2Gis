
package ru.gosuslugi.dom.schema.integration.metering_device_base;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.gosuslugi.dom.schema.integration.metering_device_base package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.gosuslugi.dom.schema.integration.metering_device_base
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExportElectricMeteringValueType }
     * 
     */
    public ExportElectricMeteringValueType createExportElectricMeteringValueType() {
        return new ExportElectricMeteringValueType();
    }

    /**
     * Create an instance of {@link ExportOneRateMeteringValueType }
     * 
     */
    public ExportOneRateMeteringValueType createExportOneRateMeteringValueType() {
        return new ExportOneRateMeteringValueType();
    }

    /**
     * Create an instance of {@link OneRateMeteringValueType }
     * 
     */
    public OneRateMeteringValueType createOneRateMeteringValueType() {
        return new OneRateMeteringValueType();
    }

    /**
     * Create an instance of {@link ElectricMeteringValueType }
     * 
     */
    public ElectricMeteringValueType createElectricMeteringValueType() {
        return new ElectricMeteringValueType();
    }

}
