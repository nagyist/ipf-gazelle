//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.16 at 02:41:04 PM CEST 
//


package org.openehealth.ipf.gazelle.validation.core.stub;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="MetaData" type="{}MetaDataType" minOccurs="0"/>
 *         &lt;group ref="{}MessageGroup"/>
 *         &lt;element name="Segment" type="{}SegmentType"/>
 *         &lt;group ref="{}SegGroupOrSegmentGrouping" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MsgType" use="required" type="{}MsgTypeType" />
 *       &lt;attribute name="EventType" use="required" type="{}EventTypeType" />
 *       &lt;attribute name="MsgStructID" type="{}MsgStructIDType" />
 *       &lt;attribute name="OrderControl" type="{}OrderControlType" />
 *       &lt;attribute name="EventDesc" use="required" type="{}NonEmptyStringType" />
 *       &lt;attribute name="Identifier" type="{}IdentifierType" />
 *       &lt;attribute name="Role" default="Sender">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Sender"/>
 *             &lt;enumeration value="Receiver"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "metaData",
    "impNote",
    "description",
    "reference",
    "segmentsAndSegGroups"
})
@XmlRootElement(name = "HL7v2xStaticDef")
public class HL7V2XStaticDef {

    @XmlElement(name = "MetaData")
    protected MetaDataType metaData;
    @XmlElement(name = "ImpNote")
    protected String impNote;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Reference")
    protected String reference;
    @XmlElements({
        @XmlElement(name = "Segment", required = true, type = SegmentType.class),
        @XmlElement(name = "SegGroup", required = true, type = HL7V2XStaticDef.SegGroup.class)
    })
    protected List<Object> segmentsAndSegGroups;
    @XmlAttribute(name = "MsgType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String msgType;
    @XmlAttribute(name = "EventType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String eventType;
    @XmlAttribute(name = "MsgStructID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String msgStructID;
    @XmlAttribute(name = "OrderControl")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String orderControl;
    @XmlAttribute(name = "EventDesc", required = true)
    protected String eventDesc;
    @XmlAttribute(name = "Identifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String identifier;
    @XmlAttribute(name = "Role")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String role;

    /**
     * Gets the value of the metaData property.
     * 
     * @return
     *     possible object is
     *     {@link MetaDataType }
     *     
     */
    public MetaDataType getMetaData() {
        return metaData;
    }

    /**
     * Sets the value of the metaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaDataType }
     *     
     */
    public void setMetaData(MetaDataType value) {
        this.metaData = value;
    }

    /**
     * Gets the value of the impNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpNote() {
        return impNote;
    }

    /**
     * Sets the value of the impNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpNote(String value) {
        this.impNote = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the segmentsAndSegGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentsAndSegGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentsAndSegGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentType }
     * {@link HL7V2XStaticDef.SegGroup }
     * 
     * 
     */
    public List<Object> getSegmentsAndSegGroups() {
        if (segmentsAndSegGroups == null) {
            segmentsAndSegGroups = new ArrayList<>();
        }
        return this.segmentsAndSegGroups;
    }

    /**
     * Gets the value of the msgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * Sets the value of the msgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgType(String value) {
        this.msgType = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the msgStructID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgStructID() {
        return msgStructID;
    }

    /**
     * Sets the value of the msgStructID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgStructID(String value) {
        this.msgStructID = value;
    }

    /**
     * Gets the value of the orderControl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderControl() {
        return orderControl;
    }

    /**
     * Sets the value of the orderControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderControl(String value) {
        this.orderControl = value;
    }

    /**
     * Gets the value of the eventDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventDesc() {
        return eventDesc;
    }

    /**
     * Sets the value of the eventDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventDesc(String value) {
        this.eventDesc = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        if (role == null) {
            return "Sender";
        } else {
            return role;
        }
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
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
     *         &lt;group ref="{}MessageElementsGroup"/>
     *         &lt;group ref="{}SegGroupOrSegmentGrouping" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{}RepeatableElementAttributes"/>
     *       &lt;attribute name="Name" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;pattern value="([A-Z]|_)+"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute ref="{}LongName use="required""/>
     *       &lt;attribute ref="{}Usage use="required""/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "impNote",
        "description",
        "reference",
        "predicate",
        "segGroupsAndSegments"
    })
    public static class SegGroup {

        @XmlElement(name = "ImpNote")
        protected String impNote;
        @XmlElement(name = "Description")
        protected String description;
        @XmlElement(name = "Reference")
        protected String reference;
        @XmlElement(name = "Predicate")
        protected String predicate;
        @XmlElements({
            @XmlElement(name = "SegGroup", type = HL7V2XStaticDef.SegGroup.class),
            @XmlElement(name = "Segment", type = SegmentType.class)
        })
        protected List<Object> segGroupsAndSegments;
        @XmlAttribute(name = "Name", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String name;
        @XmlAttribute(name = "LongName", required = true)
        protected String longName;
        @XmlAttribute(name = "Usage", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String usage;
        @XmlAttribute(name = "Min", required = true)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger min;
        @XmlAttribute(name = "Max", required = true)
        protected String max;

        /**
         * Gets the value of the impNote property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImpNote() {
            return impNote;
        }

        /**
         * Sets the value of the impNote property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImpNote(String value) {
            this.impNote = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the reference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReference() {
            return reference;
        }

        /**
         * Sets the value of the reference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReference(String value) {
            this.reference = value;
        }

        /**
         * Gets the value of the predicate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPredicate() {
            return predicate;
        }

        /**
         * Sets the value of the predicate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPredicate(String value) {
            this.predicate = value;
        }

        /**
         * Gets the value of the segGroupsAndSegments property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segGroupsAndSegments property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegGroupsAndSegments().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HL7V2XStaticDef.SegGroup }
         * {@link SegmentType }
         * 
         * 
         */
        public List<Object> getSegGroupsAndSegments() {
            if (segGroupsAndSegments == null) {
                segGroupsAndSegments = new ArrayList<>();
            }
            return this.segGroupsAndSegments;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the longName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLongName() {
            return longName;
        }

        /**
         * Sets the value of the longName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLongName(String value) {
            this.longName = value;
        }

        /**
         * Gets the value of the usage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsage() {
            return usage;
        }

        /**
         * Sets the value of the usage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsage(String value) {
            this.usage = value;
        }

        /**
         * Gets the value of the min property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMin() {
            return min;
        }

        /**
         * Sets the value of the min property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMin(BigInteger value) {
            this.min = value;
        }

        /**
         * Gets the value of the max property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMax() {
            return max;
        }

        /**
         * Sets the value of the max property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMax(String value) {
            this.max = value;
        }

    }

}
