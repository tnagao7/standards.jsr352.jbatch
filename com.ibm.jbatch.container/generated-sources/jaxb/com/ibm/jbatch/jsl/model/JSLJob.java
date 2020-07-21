//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.05 at 01:05:36 PM EDT 
//


package com.ibm.jbatch.jsl.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.ibm.jbatch.container.jsl.ExecutionElement;


/**
 * 
 * 				The type of a job definition, whether concrete or
 * 				abstract. This is the type of the root element of any JSL document.
 * 			
 * 
 * <p>Java class for Job complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="properties" type="{https://jakarta.ee/xml/ns/jakartaee}Properties" minOccurs="0"/>
 *         &lt;element name="listeners" type="{https://jakarta.ee/xml/ns/jakartaee}Listeners" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="decision" type="{https://jakarta.ee/xml/ns/jakartaee}Decision"/>
 *           &lt;element name="flow" type="{https://jakarta.ee/xml/ns/jakartaee}Flow"/>
 *           &lt;element name="split" type="{https://jakarta.ee/xml/ns/jakartaee}Split"/>
 *           &lt;element name="step" type="{https://jakarta.ee/xml/ns/jakartaee}Step"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{https://jakarta.ee/xml/ns/jakartaee}batchVersionType" fixed="2.0" />
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="restartable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job", propOrder = {
    "properties",
    "listeners",
    "executionElements"
})
public class JSLJob {

    protected JSLProperties properties;
    protected Listeners listeners;
    @XmlElements({
        @XmlElement(name = "decision", type = Decision.class),
        @XmlElement(name = "flow", type = Flow.class),
        @XmlElement(name = "split", type = Split.class),
        @XmlElement(name = "step", type = Step.class)
    })
    protected List<ExecutionElement> executionElements;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "restartable")
    protected String restartable;

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link JSLProperties }
     *     
     */
    public JSLProperties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link JSLProperties }
     *     
     */
    public void setProperties(JSLProperties value) {
        this.properties = value;
    }

    /**
     * Gets the value of the listeners property.
     * 
     * @return
     *     possible object is
     *     {@link Listeners }
     *     
     */
    public Listeners getListeners() {
        return listeners;
    }

    /**
     * Sets the value of the listeners property.
     * 
     * @param value
     *     allowed object is
     *     {@link Listeners }
     *     
     */
    public void setListeners(Listeners value) {
        this.listeners = value;
    }

    /**
     * Gets the value of the executionElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the executionElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExecutionElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Decision }
     * {@link Flow }
     * {@link Split }
     * {@link Step }
     * 
     * 
     */
    public List<ExecutionElement> getExecutionElements() {
        if (executionElements == null) {
            executionElements = new ArrayList<ExecutionElement>();
        }
        return this.executionElements;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the restartable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestartable() {
        return restartable;
    }

    /**
     * Sets the value of the restartable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestartable(String value) {
        this.restartable = value;
    }

/**
 * Copyright 2013 International Business Machines Corp.
 *
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership. Licensed under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
    /*
     * Appended by build tooling.
     */ 
	public String toString() {
	    StringBuffer buf = new StringBuffer(100);
	    buf.append("Job: id=" + id);
	    buf.append(", restartable=" + restartable);
	    buf.append("\n");
	    buf.append("Properties = " + com.ibm.jbatch.jsl.util.PropertiesToStringHelper.getString(properties));
	    return buf.toString();
    }
}
