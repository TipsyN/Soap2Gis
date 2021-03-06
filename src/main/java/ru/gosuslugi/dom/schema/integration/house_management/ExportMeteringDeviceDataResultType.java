
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for exportMeteringDeviceDataResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exportMeteringDeviceDataResultType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}MeteringDeviceFullInformationType">
 *       &lt;sequence>
 *         &lt;element name="MeteringDeviceRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         &lt;element name="StatusRootDoc">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Active"/>
 *               &lt;enumeration value="Archival"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MeteringDeviceVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringDeviceGUIDType"/>
 *         &lt;element name="VersionNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="StatusVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UpdateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MeteringOwner" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}orgRootEntityGUID" maxOccurs="100"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MeteringDeviceGISGKHNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportMeteringDeviceDataResultType", propOrder = {
    "meteringDeviceRootGUID",
    "statusRootDoc",
    "meteringDeviceVersionGUID",
    "versionNumber",
    "statusVersion",
    "updateDateTime",
    "meteringOwner",
    "meteringDeviceGISGKHNumber"
})
public class ExportMeteringDeviceDataResultType
    extends MeteringDeviceFullInformationType
{

    @XmlElement(name = "MeteringDeviceRootGUID", required = true)
    protected String meteringDeviceRootGUID;
    @XmlElement(name = "StatusRootDoc", required = true)
    protected String statusRootDoc;
    @XmlElement(name = "MeteringDeviceVersionGUID", required = true)
    protected String meteringDeviceVersionGUID;
    @XmlElement(name = "VersionNumber", required = true)
    protected BigInteger versionNumber;
    @XmlElement(name = "StatusVersion", required = true)
    protected String statusVersion;
    @XmlElement(name = "UpdateDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDateTime;
    @XmlElement(name = "MeteringOwner")
    protected ExportMeteringDeviceDataResultType.MeteringOwner meteringOwner;
    @XmlElement(name = "MeteringDeviceGISGKHNumber", required = true)
    protected String meteringDeviceGISGKHNumber;

    /**
     * Gets the value of the meteringDeviceRootGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeteringDeviceRootGUID() {
        return meteringDeviceRootGUID;
    }

    /**
     * Sets the value of the meteringDeviceRootGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeteringDeviceRootGUID(String value) {
        this.meteringDeviceRootGUID = value;
    }

    /**
     * Gets the value of the statusRootDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusRootDoc() {
        return statusRootDoc;
    }

    /**
     * Sets the value of the statusRootDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusRootDoc(String value) {
        this.statusRootDoc = value;
    }

    /**
     * Gets the value of the meteringDeviceVersionGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeteringDeviceVersionGUID() {
        return meteringDeviceVersionGUID;
    }

    /**
     * Sets the value of the meteringDeviceVersionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeteringDeviceVersionGUID(String value) {
        this.meteringDeviceVersionGUID = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersionNumber(BigInteger value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the statusVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusVersion() {
        return statusVersion;
    }

    /**
     * Sets the value of the statusVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusVersion(String value) {
        this.statusVersion = value;
    }

    /**
     * Gets the value of the updateDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDateTime() {
        return updateDateTime;
    }

    /**
     * Sets the value of the updateDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDateTime(XMLGregorianCalendar value) {
        this.updateDateTime = value;
    }

    /**
     * Gets the value of the meteringOwner property.
     * 
     * @return
     *     possible object is
     *     {@link ExportMeteringDeviceDataResultType.MeteringOwner }
     *     
     */
    public ExportMeteringDeviceDataResultType.MeteringOwner getMeteringOwner() {
        return meteringOwner;
    }

    /**
     * Sets the value of the meteringOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportMeteringDeviceDataResultType.MeteringOwner }
     *     
     */
    public void setMeteringOwner(ExportMeteringDeviceDataResultType.MeteringOwner value) {
        this.meteringOwner = value;
    }

    /**
     * Gets the value of the meteringDeviceGISGKHNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeteringDeviceGISGKHNumber() {
        return meteringDeviceGISGKHNumber;
    }

    /**
     * Sets the value of the meteringDeviceGISGKHNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeteringDeviceGISGKHNumber(String value) {
        this.meteringDeviceGISGKHNumber = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}orgRootEntityGUID" maxOccurs="100"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orgRootEntityGUID"
    })
    public static class MeteringOwner {

        @XmlElement(namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/", required = true)
        protected List<String> orgRootEntityGUID;

        /**
         * Gets the value of the orgRootEntityGUID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orgRootEntityGUID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrgRootEntityGUID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOrgRootEntityGUID() {
            if (orgRootEntityGUID == null) {
                orgRootEntityGUID = new ArrayList<String>();
            }
            return this.orgRootEntityGUID;
        }

    }

}
