//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.06 at 07:08:07 PM WEST 
//


package xml.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for selectedFacts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="selectedFacts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="fact">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="aggr_operation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="filterBefore" type="{}filter" minOccurs="0"/>
 *                   &lt;element name="filterAfter" type="{}filter" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="factID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "selectedFacts", propOrder = {
    "fact"
})
public class SelectedFacts {

    @XmlElement(required = true)
    protected List<SelectedFacts.Fact> fact;

    /**
     * Gets the value of the fact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectedFacts.Fact }
     * 
     * 
     */
    public List<SelectedFacts.Fact> getFact() {
        if (fact == null) {
            fact = new ArrayList<SelectedFacts.Fact>();
        }
        return this.fact;
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
     *         &lt;element name="aggr_operation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="filterBefore" type="{}filter" minOccurs="0"/>
     *         &lt;element name="filterAfter" type="{}filter" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="factID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "aggrOperation",
        "filterBefore",
        "filterAfter"
    })
    public static class Fact {

        @XmlElement(name = "aggr_operation", required = true)
        protected String aggrOperation;
        protected Filter filterBefore;
        protected Filter filterAfter;
        @XmlAttribute
        protected String factID;

        /**
         * Gets the value of the aggrOperation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAggrOperation() {
            return aggrOperation;
        }

        /**
         * Sets the value of the aggrOperation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAggrOperation(String value) {
            this.aggrOperation = value;
        }

        /**
         * Gets the value of the filterBefore property.
         * 
         * @return
         *     possible object is
         *     {@link Filter }
         *     
         */
        public Filter getFilterBefore() {
            return filterBefore;
        }

        /**
         * Sets the value of the filterBefore property.
         * 
         * @param value
         *     allowed object is
         *     {@link Filter }
         *     
         */
        public void setFilterBefore(Filter value) {
            this.filterBefore = value;
        }

        /**
         * Gets the value of the filterAfter property.
         * 
         * @return
         *     possible object is
         *     {@link Filter }
         *     
         */
        public Filter getFilterAfter() {
            return filterAfter;
        }

        /**
         * Sets the value of the filterAfter property.
         * 
         * @param value
         *     allowed object is
         *     {@link Filter }
         *     
         */
        public void setFilterAfter(Filter value) {
            this.filterAfter = value;
        }

        /**
         * Gets the value of the factID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFactID() {
            return factID;
        }

        /**
         * Sets the value of the factID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFactID(String value) {
            this.factID = value;
        }

    }

}
