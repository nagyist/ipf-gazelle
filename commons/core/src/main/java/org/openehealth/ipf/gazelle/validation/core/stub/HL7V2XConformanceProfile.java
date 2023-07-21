//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.16 at 02:41:04 PM CEST 
//


package org.openehealth.ipf.gazelle.validation.core.stub;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="MetaData" type="{}MetaDataType"/>
 *         &lt;element name="ImpNote" type="{}ImpNoteType" minOccurs="0"/>
 *         &lt;element name="UseCase">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Purpose" type="{}NonEmptyStringType" minOccurs="0"/>
 *                   &lt;element name="Description" type="{}NonEmptyStringType" minOccurs="0"/>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element name="Actor" type="{}UseCaseElementType"/>
 *                     &lt;element name="PreCondition" type="{}UseCaseElementType"/>
 *                     &lt;element name="PostCondition" type="{}UseCaseElementType"/>
 *                     &lt;element name="EventFlow" type="{}UseCaseElementType"/>
 *                     &lt;element name="DerivedEvent" type="{}UseCaseElementType"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Encodings">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Encoding" maxOccurs="unbounded">
 *                     &lt;simpleType>
 *                       &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                             &lt;enumeration value="ER7"/>
 *                             &lt;enumeration value="XML"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/union>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;sequence maxOccurs="unbounded">
 *           &lt;element name="DynamicDef">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="AccAck" type="{}AcknowledgmentType" default="NE" />
 *                   &lt;attribute name="AppAck" type="{}AcknowledgmentType" default="AL" />
 *                   &lt;attribute name="MsgAckMode" default="Deferred">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         &lt;enumeration value="Immediate"/>
 *                         &lt;enumeration value="Deferred"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                   &lt;attribute name="QueryMessageType" default="NonQuery">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         &lt;enumeration value="NonQuery"/>
 *                         &lt;enumeration value="Query"/>
 *                         &lt;enumeration value="Response"/>
 *                         &lt;enumeration value="Publish"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                   &lt;attribute name="QueryMode" default="RealTime">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                         &lt;enumeration value="Batch"/>
 *                         &lt;enumeration value="RealTime"/>
 *                         &lt;enumeration value="Both"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{}HL7v2xStaticDef"/>
 *             &lt;element name="HL7v2xStaticDefRef">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;attribute name="Identifier" use="required" type="{}IdentifierType" />
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/choice>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="HL7Version" use="required">
 *         &lt;simpleType>
 *           &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                 &lt;enumeration value="2.0"/>
 *                 &lt;enumeration value="2.0D"/>
 *                 &lt;enumeration value="2.1"/>
 *                 &lt;enumeration value="2.2"/>
 *                 &lt;enumeration value="2.3"/>
 *                 &lt;enumeration value="2.3.1"/>
 *                 &lt;enumeration value="2.4"/>
 *                 &lt;enumeration value="2.5"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ProfileType" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="HL7"/>
 *             &lt;enumeration value="Implementation"/>
 *             &lt;enumeration value="Constrainable"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Identiifer" type="{}IdentifierType" />
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
    "useCase",
    "encodings",
    "dynamicDevesAndHL7V2XStaticDevesAndHL7V2XStaticDefReves"
})
@XmlRootElement(name = "HL7v2xConformanceProfile")
public class HL7V2XConformanceProfile {

    @XmlElement(name = "MetaData", required = true)
    protected MetaDataType metaData;
    @XmlElement(name = "ImpNote")
    protected String impNote;
    @XmlElement(name = "UseCase", required = true)
    protected HL7V2XConformanceProfile.UseCase useCase;
    @XmlElement(name = "Encodings", required = true)
    protected HL7V2XConformanceProfile.Encodings encodings;
    @XmlElements({
        @XmlElement(name = "DynamicDef", required = true, type = HL7V2XConformanceProfile.DynamicDef.class),
        @XmlElement(name = "HL7v2xStaticDef", required = true, type = HL7V2XStaticDef.class),
        @XmlElement(name = "HL7v2xStaticDefRef", required = true, type = HL7V2XConformanceProfile.HL7V2XStaticDefRef.class)
    })
    protected List<Object> dynamicDevesAndHL7V2XStaticDevesAndHL7V2XStaticDefReves;
    @XmlAttribute(name = "HL7Version", required = true)
    protected String hl7Version;
    @XmlAttribute(name = "ProfileType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String profileType;
    @XmlAttribute(name = "Identiifer")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String identiifer;

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
     * Gets the value of the useCase property.
     * 
     * @return
     *     possible object is
     *     {@link HL7V2XConformanceProfile.UseCase }
     *     
     */
    public HL7V2XConformanceProfile.UseCase getUseCase() {
        return useCase;
    }

    /**
     * Sets the value of the useCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link HL7V2XConformanceProfile.UseCase }
     *     
     */
    public void setUseCase(HL7V2XConformanceProfile.UseCase value) {
        this.useCase = value;
    }

    /**
     * Gets the value of the encodings property.
     * 
     * @return
     *     possible object is
     *     {@link HL7V2XConformanceProfile.Encodings }
     *     
     */
    public HL7V2XConformanceProfile.Encodings getEncodings() {
        return encodings;
    }

    /**
     * Sets the value of the encodings property.
     * 
     * @param value
     *     allowed object is
     *     {@link HL7V2XConformanceProfile.Encodings }
     *     
     */
    public void setEncodings(HL7V2XConformanceProfile.Encodings value) {
        this.encodings = value;
    }

    /**
     * Gets the value of the dynamicDevesAndHL7V2XStaticDevesAndHL7V2XStaticDefReves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dynamicDevesAndHL7V2XStaticDevesAndHL7V2XStaticDefReves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDynamicDevesAndHL7V2XStaticDevesAndHL7V2XStaticDefReves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HL7V2XConformanceProfile.DynamicDef }
     * {@link HL7V2XStaticDef }
     * {@link HL7V2XConformanceProfile.HL7V2XStaticDefRef }
     * 
     * 
     */
    public List<Object> getDynamicDevesAndHL7V2XStaticDevesAndHL7V2XStaticDefReves() {
        if (dynamicDevesAndHL7V2XStaticDevesAndHL7V2XStaticDefReves == null) {
            dynamicDevesAndHL7V2XStaticDevesAndHL7V2XStaticDefReves = new ArrayList<>();
        }
        return this.dynamicDevesAndHL7V2XStaticDevesAndHL7V2XStaticDefReves;
    }

    /**
     * Gets the value of the hl7Version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHL7Version() {
        return hl7Version;
    }

    /**
     * Sets the value of the hl7Version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHL7Version(String value) {
        this.hl7Version = value;
    }

    /**
     * Gets the value of the profileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileType() {
        return profileType;
    }

    /**
     * Sets the value of the profileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileType(String value) {
        this.profileType = value;
    }

    /**
     * Gets the value of the identiifer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentiifer() {
        return identiifer;
    }

    /**
     * Sets the value of the identiifer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentiifer(String value) {
        this.identiifer = value;
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
     *       &lt;attribute name="AccAck" type="{}AcknowledgmentType" default="NE" />
     *       &lt;attribute name="AppAck" type="{}AcknowledgmentType" default="AL" />
     *       &lt;attribute name="MsgAckMode" default="Deferred">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="Immediate"/>
     *             &lt;enumeration value="Deferred"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="QueryMessageType" default="NonQuery">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="NonQuery"/>
     *             &lt;enumeration value="Query"/>
     *             &lt;enumeration value="Response"/>
     *             &lt;enumeration value="Publish"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="QueryMode" default="RealTime">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="Batch"/>
     *             &lt;enumeration value="RealTime"/>
     *             &lt;enumeration value="Both"/>
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
    @XmlType(name = "")
    public static class DynamicDef {

        @XmlAttribute(name = "AccAck")
        protected AcknowledgmentType accAck;
        @XmlAttribute(name = "AppAck")
        protected AcknowledgmentType appAck;
        @XmlAttribute(name = "MsgAckMode")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String msgAckMode;
        @XmlAttribute(name = "QueryMessageType")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String queryMessageType;
        @XmlAttribute(name = "QueryMode")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String queryMode;

        /**
         * Gets the value of the accAck property.
         * 
         * @return
         *     possible object is
         *     {@link AcknowledgmentType }
         *     
         */
        public AcknowledgmentType getAccAck() {
            return Objects.requireNonNullElse(accAck, AcknowledgmentType.NE);
        }

        /**
         * Sets the value of the accAck property.
         * 
         * @param value
         *     allowed object is
         *     {@link AcknowledgmentType }
         *     
         */
        public void setAccAck(AcknowledgmentType value) {
            this.accAck = value;
        }

        /**
         * Gets the value of the appAck property.
         * 
         * @return
         *     possible object is
         *     {@link AcknowledgmentType }
         *     
         */
        public AcknowledgmentType getAppAck() {
            return Objects.requireNonNullElse(appAck, AcknowledgmentType.AL);
        }

        /**
         * Sets the value of the appAck property.
         * 
         * @param value
         *     allowed object is
         *     {@link AcknowledgmentType }
         *     
         */
        public void setAppAck(AcknowledgmentType value) {
            this.appAck = value;
        }

        /**
         * Gets the value of the msgAckMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMsgAckMode() {
            return Objects.requireNonNullElse(msgAckMode, "Deferred");
        }

        /**
         * Sets the value of the msgAckMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMsgAckMode(String value) {
            this.msgAckMode = value;
        }

        /**
         * Gets the value of the queryMessageType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueryMessageType() {
            return Objects.requireNonNullElse(queryMessageType, "NonQuery");
        }

        /**
         * Sets the value of the queryMessageType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueryMessageType(String value) {
            this.queryMessageType = value;
        }

        /**
         * Gets the value of the queryMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueryMode() {
            return Objects.requireNonNullElse(queryMode, "RealTime");
        }

        /**
         * Sets the value of the queryMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueryMode(String value) {
            this.queryMode = value;
        }

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
     *         &lt;element name="Encoding" maxOccurs="unbounded">
     *           &lt;simpleType>
     *             &lt;union memberTypes=" {http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                   &lt;enumeration value="ER7"/>
     *                   &lt;enumeration value="XML"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/union>
     *           &lt;/simpleType>
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
    @XmlType(name = "", propOrder = {
        "encodings"
    })
    public static class Encodings {

        @XmlElement(name = "Encoding", required = true)
        protected List<String> encodings;

        /**
         * Gets the value of the encodings property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the encodings property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEncodings().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEncodings() {
            if (encodings == null) {
                encodings = new ArrayList<>();
            }
            return this.encodings;
        }

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
     *       &lt;attribute name="Identifier" use="required" type="{}IdentifierType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HL7V2XStaticDefRef {

        @XmlAttribute(name = "Identifier", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String identifier;

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
     *         &lt;element name="Purpose" type="{}NonEmptyStringType" minOccurs="0"/>
     *         &lt;element name="Description" type="{}NonEmptyStringType" minOccurs="0"/>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element name="Actor" type="{}UseCaseElementType"/>
     *           &lt;element name="PreCondition" type="{}UseCaseElementType"/>
     *           &lt;element name="PostCondition" type="{}UseCaseElementType"/>
     *           &lt;element name="EventFlow" type="{}UseCaseElementType"/>
     *           &lt;element name="DerivedEvent" type="{}UseCaseElementType"/>
     *         &lt;/choice>
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
        "purpose",
        "description",
        "actorsAndPreConditionsAndPostConditions"
    })
    public static class UseCase {

        @XmlElement(name = "Purpose")
        protected String purpose;
        @XmlElement(name = "Description")
        protected String description;
        @XmlElementRefs({
            @XmlElementRef(name = "PostCondition", type = JAXBElement.class),
            @XmlElementRef(name = "Actor", type = JAXBElement.class),
            @XmlElementRef(name = "DerivedEvent", type = JAXBElement.class),
            @XmlElementRef(name = "PreCondition", type = JAXBElement.class),
            @XmlElementRef(name = "EventFlow", type = JAXBElement.class)
        })
        protected List<JAXBElement<UseCaseElementType>> actorsAndPreConditionsAndPostConditions;

        /**
         * Gets the value of the purpose property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPurpose() {
            return purpose;
        }

        /**
         * Sets the value of the purpose property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPurpose(String value) {
            this.purpose = value;
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
         * Gets the value of the actorsAndPreConditionsAndPostConditions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actorsAndPreConditionsAndPostConditions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActorsAndPreConditionsAndPostConditions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link UseCaseElementType }{@code >}
         * {@link JAXBElement }{@code <}{@link UseCaseElementType }{@code >}
         * {@link JAXBElement }{@code <}{@link UseCaseElementType }{@code >}
         * {@link JAXBElement }{@code <}{@link UseCaseElementType }{@code >}
         * {@link JAXBElement }{@code <}{@link UseCaseElementType }{@code >}
         * 
         * 
         */
        public List<JAXBElement<UseCaseElementType>> getActorsAndPreConditionsAndPostConditions() {
            if (actorsAndPreConditionsAndPostConditions == null) {
                actorsAndPreConditionsAndPostConditions = new ArrayList<>();
            }
            return this.actorsAndPreConditionsAndPostConditions;
        }

    }

}
