/*
 * An XML document type.
 * Localname: oval
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: com.microsoft.schemas.vml.OvalDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.vml.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * A document containing one oval(@urn:schemas-microsoft-com:vml) element.
 *
 * This is a complex type.
 */
public class OvalDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.microsoft.schemas.vml.OvalDocument {
    private static final long serialVersionUID = 1L;

    public OvalDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("urn:schemas-microsoft-com:vml", "oval"),
    };


    /**
     * Gets the "oval" element
     */
    @Override
    public com.microsoft.schemas.vml.CTOval getOval() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTOval target = null;
            target = (com.microsoft.schemas.vml.CTOval)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "oval" element
     */
    @Override
    public void setOval(com.microsoft.schemas.vml.CTOval oval) {
        generatedSetterHelperImpl(oval, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "oval" element
     */
    @Override
    public com.microsoft.schemas.vml.CTOval addNewOval() {
        synchronized (monitor()) {
            check_orphaned();
            com.microsoft.schemas.vml.CTOval target = null;
            target = (com.microsoft.schemas.vml.CTOval)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
