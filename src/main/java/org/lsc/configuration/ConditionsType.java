//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.15 at 10:37:30 AM CEST 
//


package org.lsc.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conditionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conditionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="create" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="update" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="delete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="changeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conditionsType", propOrder = {
    "create",
    "update",
    "delete",
    "changeId"
})
public class ConditionsType {

    protected String create;
    protected String update;
    protected String delete;
    protected String changeId;

    /**
     * Gets the value of the create property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreate() {
        return create;
    }

    /**
     * Sets the value of the create property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreate(String value) {
        this.create = value;
    }

    /**
     * Gets the value of the update property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdate() {
        return update;
    }

    /**
     * Sets the value of the update property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdate(String value) {
        this.update = value;
    }

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelete(String value) {
        this.delete = value;
    }

    /**
     * Gets the value of the changeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeId() {
        return changeId;
    }

    /**
     * Sets the value of the changeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeId(String value) {
        this.changeId = value;
    }

}
