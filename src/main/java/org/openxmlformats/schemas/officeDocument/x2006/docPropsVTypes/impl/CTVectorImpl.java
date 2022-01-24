/*
 * XML Type:  CT_Vector
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;

/**
 * An XML CT_Vector(@http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes).
 *
 * This is a complex type.
 */
public class CTVectorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector {
    private static final long serialVersionUID = 1L;

    public CTVectorImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "variant"),
        new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "i1"),
        new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "i2"),
        new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "i4"),
        new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "i8"),
        new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ui1"),
        new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ui2"),
        new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ui4"),
        new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "ui8"),
        new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "r4"),
        new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "r8"),
        new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "lpstr"),
        new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "lpwstr"),
        new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "bstr"),
        new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "date"),
        new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "filetime"),
        new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "bool"),
        new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "cy"),
        new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "error"),
        new QName("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "clsid"),
        new QName("", "baseType"),
        new QName("", "size"),
    };


    /**
     * Gets a List of "variant" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant> getVariantList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::getVariantArray,
                this::setVariantArray,
                this::insertNewVariant,
                this::removeVariant,
                this::sizeOfVariantArray
            );
        }
    }

    /**
     * Gets array of all "variant" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant[] getVariantArray() {
        return getXmlObjectArray(PROPERTY_QNAME[0], new org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant[0]);
    }

    /**
     * Gets ith "variant" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant getVariantArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant)get_store().find_element_user(PROPERTY_QNAME[0], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "variant" element
     */
    @Override
    public int sizeOfVariantArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[0]);
        }
    }

    /**
     * Sets array of all "variant" element  WARNING: This method is not atomicaly synchronized.
     */
    @Override
    public void setVariantArray(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant[] variantArray) {
        check_orphaned();
        arraySetterHelper(variantArray, PROPERTY_QNAME[0]);
    }

    /**
     * Sets ith "variant" element
     */
    @Override
    public void setVariantArray(int i, org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant variant) {
        generatedSetterHelperImpl(variant, PROPERTY_QNAME[0], i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "variant" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant insertNewVariant(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant)get_store().insert_element_user(PROPERTY_QNAME[0], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "variant" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant addNewVariant() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }

    /**
     * Removes the ith "variant" element
     */
    @Override
    public void removeVariant(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[0], i);
        }
    }

    /**
     * Gets a List of "i1" elements
     */
    @Override
    public java.util.List<java.lang.Byte> getI1List() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getI1Array,
                this::setI1Array,
                this::insertI1,
                this::removeI1,
                this::sizeOfI1Array
            );
        }
    }

    /**
     * Gets array of all "i1" elements
     */
    @Override
    public byte[] getI1Array() {
        return getByteArray(PROPERTY_QNAME[1]);
    }

    /**
     * Gets ith "i1" element
     */
    @Override
    public byte getI1Array(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getByteValue();
        }
    }

    /**
     * Gets (as xml) a List of "i1" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlByte> xgetI1List() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetI1Array,
                this::xsetI1Array,
                this::insertNewI1,
                this::removeI1,
                this::sizeOfI1Array
            );
        }
    }

    /**
     * Gets (as xml) array of all "i1" elements
     */
    @Override
    public org.apache.xmlbeans.XmlByte[] xgetI1Array() {
        return xgetArray(PROPERTY_QNAME[1], org.apache.xmlbeans.XmlByte[]::new);
    }

    /**
     * Gets (as xml) ith "i1" element
     */
    @Override
    public org.apache.xmlbeans.XmlByte xgetI1Array(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "i1" element
     */
    @Override
    public int sizeOfI1Array() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets array of all "i1" element
     */
    @Override
    public void setI1Array(byte[] i1Array) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(i1Array, PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets ith "i1" element
     */
    @Override
    public void setI1Array(int i, byte i1) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setByteValue(i1);
        }
    }

    /**
     * Sets (as xml) array of all "i1" element
     */
    @Override
    public void xsetI1Array(org.apache.xmlbeans.XmlByte[]i1Array) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(i1Array, PROPERTY_QNAME[1]);
        }
    }

    /**
     * Sets (as xml) ith "i1" element
     */
    @Override
    public void xsetI1Array(int i, org.apache.xmlbeans.XmlByte i1) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().find_element_user(PROPERTY_QNAME[1], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(i1);
        }
    }

    /**
     * Inserts the value as the ith "i1" element
     */
    @Override
    public void insertI1(int i, byte i1) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            target.setByteValue(i1);
        }
    }

    /**
     * Appends the value as the last "i1" element
     */
    @Override
    public void addI1(byte i1) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[1]);
            target.setByteValue(i1);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "i1" element
     */
    @Override
    public org.apache.xmlbeans.XmlByte insertNewI1(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().insert_element_user(PROPERTY_QNAME[1], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "i1" element
     */
    @Override
    public org.apache.xmlbeans.XmlByte addNewI1() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().add_element_user(PROPERTY_QNAME[1]);
            return target;
        }
    }

    /**
     * Removes the ith "i1" element
     */
    @Override
    public void removeI1(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[1], i);
        }
    }

    /**
     * Gets a List of "i2" elements
     */
    @Override
    public java.util.List<java.lang.Short> getI2List() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getI2Array,
                this::setI2Array,
                this::insertI2,
                this::removeI2,
                this::sizeOfI2Array
            );
        }
    }

    /**
     * Gets array of all "i2" elements
     */
    @Override
    public short[] getI2Array() {
        return getShortArray(PROPERTY_QNAME[2]);
    }

    /**
     * Gets ith "i2" element
     */
    @Override
    public short getI2Array(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getShortValue();
        }
    }

    /**
     * Gets (as xml) a List of "i2" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlShort> xgetI2List() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetI2Array,
                this::xsetI2Array,
                this::insertNewI2,
                this::removeI2,
                this::sizeOfI2Array
            );
        }
    }

    /**
     * Gets (as xml) array of all "i2" elements
     */
    @Override
    public org.apache.xmlbeans.XmlShort[] xgetI2Array() {
        return xgetArray(PROPERTY_QNAME[2], org.apache.xmlbeans.XmlShort[]::new);
    }

    /**
     * Gets (as xml) ith "i2" element
     */
    @Override
    public org.apache.xmlbeans.XmlShort xgetI2Array(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "i2" element
     */
    @Override
    public int sizeOfI2Array() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets array of all "i2" element
     */
    @Override
    public void setI2Array(short[] i2Array) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(i2Array, PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets ith "i2" element
     */
    @Override
    public void setI2Array(int i, short i2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setShortValue(i2);
        }
    }

    /**
     * Sets (as xml) array of all "i2" element
     */
    @Override
    public void xsetI2Array(org.apache.xmlbeans.XmlShort[]i2Array) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(i2Array, PROPERTY_QNAME[2]);
        }
    }

    /**
     * Sets (as xml) ith "i2" element
     */
    @Override
    public void xsetI2Array(int i, org.apache.xmlbeans.XmlShort i2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(PROPERTY_QNAME[2], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(i2);
        }
    }

    /**
     * Inserts the value as the ith "i2" element
     */
    @Override
    public void insertI2(int i, short i2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            target.setShortValue(i2);
        }
    }

    /**
     * Appends the value as the last "i2" element
     */
    @Override
    public void addI2(short i2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[2]);
            target.setShortValue(i2);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "i2" element
     */
    @Override
    public org.apache.xmlbeans.XmlShort insertNewI2(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().insert_element_user(PROPERTY_QNAME[2], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "i2" element
     */
    @Override
    public org.apache.xmlbeans.XmlShort addNewI2() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(PROPERTY_QNAME[2]);
            return target;
        }
    }

    /**
     * Removes the ith "i2" element
     */
    @Override
    public void removeI2(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[2], i);
        }
    }

    /**
     * Gets a List of "i4" elements
     */
    @Override
    public java.util.List<java.lang.Integer> getI4List() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getI4Array,
                this::setI4Array,
                this::insertI4,
                this::removeI4,
                this::sizeOfI4Array
            );
        }
    }

    /**
     * Gets array of all "i4" elements
     */
    @Override
    public int[] getI4Array() {
        return getIntArray(PROPERTY_QNAME[3]);
    }

    /**
     * Gets ith "i4" element
     */
    @Override
    public int getI4Array(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getIntValue();
        }
    }

    /**
     * Gets (as xml) a List of "i4" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlInt> xgetI4List() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetI4Array,
                this::xsetI4Array,
                this::insertNewI4,
                this::removeI4,
                this::sizeOfI4Array
            );
        }
    }

    /**
     * Gets (as xml) array of all "i4" elements
     */
    @Override
    public org.apache.xmlbeans.XmlInt[] xgetI4Array() {
        return xgetArray(PROPERTY_QNAME[3], org.apache.xmlbeans.XmlInt[]::new);
    }

    /**
     * Gets (as xml) ith "i4" element
     */
    @Override
    public org.apache.xmlbeans.XmlInt xgetI4Array(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "i4" element
     */
    @Override
    public int sizeOfI4Array() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets array of all "i4" element
     */
    @Override
    public void setI4Array(int[] i4Array) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(i4Array, PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets ith "i4" element
     */
    @Override
    public void setI4Array(int i, int i4) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setIntValue(i4);
        }
    }

    /**
     * Sets (as xml) array of all "i4" element
     */
    @Override
    public void xsetI4Array(org.apache.xmlbeans.XmlInt[]i4Array) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(i4Array, PROPERTY_QNAME[3]);
        }
    }

    /**
     * Sets (as xml) ith "i4" element
     */
    @Override
    public void xsetI4Array(int i, org.apache.xmlbeans.XmlInt i4) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PROPERTY_QNAME[3], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(i4);
        }
    }

    /**
     * Inserts the value as the ith "i4" element
     */
    @Override
    public void insertI4(int i, int i4) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            target.setIntValue(i4);
        }
    }

    /**
     * Appends the value as the last "i4" element
     */
    @Override
    public void addI4(int i4) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[3]);
            target.setIntValue(i4);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "i4" element
     */
    @Override
    public org.apache.xmlbeans.XmlInt insertNewI4(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().insert_element_user(PROPERTY_QNAME[3], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "i4" element
     */
    @Override
    public org.apache.xmlbeans.XmlInt addNewI4() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PROPERTY_QNAME[3]);
            return target;
        }
    }

    /**
     * Removes the ith "i4" element
     */
    @Override
    public void removeI4(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[3], i);
        }
    }

    /**
     * Gets a List of "i8" elements
     */
    @Override
    public java.util.List<java.lang.Long> getI8List() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getI8Array,
                this::setI8Array,
                this::insertI8,
                this::removeI8,
                this::sizeOfI8Array
            );
        }
    }

    /**
     * Gets array of all "i8" elements
     */
    @Override
    public long[] getI8Array() {
        return getLongArray(PROPERTY_QNAME[4]);
    }

    /**
     * Gets ith "i8" element
     */
    @Override
    public long getI8Array(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getLongValue();
        }
    }

    /**
     * Gets (as xml) a List of "i8" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlLong> xgetI8List() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetI8Array,
                this::xsetI8Array,
                this::insertNewI8,
                this::removeI8,
                this::sizeOfI8Array
            );
        }
    }

    /**
     * Gets (as xml) array of all "i8" elements
     */
    @Override
    public org.apache.xmlbeans.XmlLong[] xgetI8Array() {
        return xgetArray(PROPERTY_QNAME[4], org.apache.xmlbeans.XmlLong[]::new);
    }

    /**
     * Gets (as xml) ith "i8" element
     */
    @Override
    public org.apache.xmlbeans.XmlLong xgetI8Array(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "i8" element
     */
    @Override
    public int sizeOfI8Array() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets array of all "i8" element
     */
    @Override
    public void setI8Array(long[] i8Array) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(i8Array, PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets ith "i8" element
     */
    @Override
    public void setI8Array(int i, long i8) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setLongValue(i8);
        }
    }

    /**
     * Sets (as xml) array of all "i8" element
     */
    @Override
    public void xsetI8Array(org.apache.xmlbeans.XmlLong[]i8Array) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(i8Array, PROPERTY_QNAME[4]);
        }
    }

    /**
     * Sets (as xml) ith "i8" element
     */
    @Override
    public void xsetI8Array(int i, org.apache.xmlbeans.XmlLong i8) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(PROPERTY_QNAME[4], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(i8);
        }
    }

    /**
     * Inserts the value as the ith "i8" element
     */
    @Override
    public void insertI8(int i, long i8) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            target.setLongValue(i8);
        }
    }

    /**
     * Appends the value as the last "i8" element
     */
    @Override
    public void addI8(long i8) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[4]);
            target.setLongValue(i8);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "i8" element
     */
    @Override
    public org.apache.xmlbeans.XmlLong insertNewI8(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().insert_element_user(PROPERTY_QNAME[4], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "i8" element
     */
    @Override
    public org.apache.xmlbeans.XmlLong addNewI8() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(PROPERTY_QNAME[4]);
            return target;
        }
    }

    /**
     * Removes the ith "i8" element
     */
    @Override
    public void removeI8(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[4], i);
        }
    }

    /**
     * Gets a List of "ui1" elements
     */
    @Override
    public java.util.List<java.lang.Short> getUi1List() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getUi1Array,
                this::setUi1Array,
                this::insertUi1,
                this::removeUi1,
                this::sizeOfUi1Array
            );
        }
    }

    /**
     * Gets array of all "ui1" elements
     */
    @Override
    public short[] getUi1Array() {
        return getShortArray(PROPERTY_QNAME[5]);
    }

    /**
     * Gets ith "ui1" element
     */
    @Override
    public short getUi1Array(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getShortValue();
        }
    }

    /**
     * Gets (as xml) a List of "ui1" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlUnsignedByte> xgetUi1List() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetUi1Array,
                this::xsetUi1Array,
                this::insertNewUi1,
                this::removeUi1,
                this::sizeOfUi1Array
            );
        }
    }

    /**
     * Gets (as xml) array of all "ui1" elements
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedByte[] xgetUi1Array() {
        return xgetArray(PROPERTY_QNAME[5], org.apache.xmlbeans.XmlUnsignedByte[]::new);
    }

    /**
     * Gets (as xml) ith "ui1" element
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedByte xgetUi1Array(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ui1" element
     */
    @Override
    public int sizeOfUi1Array() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets array of all "ui1" element
     */
    @Override
    public void setUi1Array(short[] ui1Array) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(ui1Array, PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets ith "ui1" element
     */
    @Override
    public void setUi1Array(int i, short ui1) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setShortValue(ui1);
        }
    }

    /**
     * Sets (as xml) array of all "ui1" element
     */
    @Override
    public void xsetUi1Array(org.apache.xmlbeans.XmlUnsignedByte[]ui1Array) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(ui1Array, PROPERTY_QNAME[5]);
        }
    }

    /**
     * Sets (as xml) ith "ui1" element
     */
    @Override
    public void xsetUi1Array(int i, org.apache.xmlbeans.XmlUnsignedByte ui1) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().find_element_user(PROPERTY_QNAME[5], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(ui1);
        }
    }

    /**
     * Inserts the value as the ith "ui1" element
     */
    @Override
    public void insertUi1(int i, short ui1) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[5], i);
            target.setShortValue(ui1);
        }
    }

    /**
     * Appends the value as the last "ui1" element
     */
    @Override
    public void addUi1(short ui1) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[5]);
            target.setShortValue(ui1);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ui1" element
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedByte insertNewUi1(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().insert_element_user(PROPERTY_QNAME[5], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ui1" element
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedByte addNewUi1() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedByte target = null;
            target = (org.apache.xmlbeans.XmlUnsignedByte)get_store().add_element_user(PROPERTY_QNAME[5]);
            return target;
        }
    }

    /**
     * Removes the ith "ui1" element
     */
    @Override
    public void removeUi1(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[5], i);
        }
    }

    /**
     * Gets a List of "ui2" elements
     */
    @Override
    public java.util.List<java.lang.Integer> getUi2List() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getUi2Array,
                this::setUi2Array,
                this::insertUi2,
                this::removeUi2,
                this::sizeOfUi2Array
            );
        }
    }

    /**
     * Gets array of all "ui2" elements
     */
    @Override
    public int[] getUi2Array() {
        return getIntArray(PROPERTY_QNAME[6]);
    }

    /**
     * Gets ith "ui2" element
     */
    @Override
    public int getUi2Array(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getIntValue();
        }
    }

    /**
     * Gets (as xml) a List of "ui2" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlUnsignedShort> xgetUi2List() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetUi2Array,
                this::xsetUi2Array,
                this::insertNewUi2,
                this::removeUi2,
                this::sizeOfUi2Array
            );
        }
    }

    /**
     * Gets (as xml) array of all "ui2" elements
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedShort[] xgetUi2Array() {
        return xgetArray(PROPERTY_QNAME[6], org.apache.xmlbeans.XmlUnsignedShort[]::new);
    }

    /**
     * Gets (as xml) ith "ui2" element
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedShort xgetUi2Array(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ui2" element
     */
    @Override
    public int sizeOfUi2Array() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets array of all "ui2" element
     */
    @Override
    public void setUi2Array(int[] ui2Array) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(ui2Array, PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets ith "ui2" element
     */
    @Override
    public void setUi2Array(int i, int ui2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setIntValue(ui2);
        }
    }

    /**
     * Sets (as xml) array of all "ui2" element
     */
    @Override
    public void xsetUi2Array(org.apache.xmlbeans.XmlUnsignedShort[]ui2Array) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(ui2Array, PROPERTY_QNAME[6]);
        }
    }

    /**
     * Sets (as xml) ith "ui2" element
     */
    @Override
    public void xsetUi2Array(int i, org.apache.xmlbeans.XmlUnsignedShort ui2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().find_element_user(PROPERTY_QNAME[6], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(ui2);
        }
    }

    /**
     * Inserts the value as the ith "ui2" element
     */
    @Override
    public void insertUi2(int i, int ui2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[6], i);
            target.setIntValue(ui2);
        }
    }

    /**
     * Appends the value as the last "ui2" element
     */
    @Override
    public void addUi2(int ui2) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[6]);
            target.setIntValue(ui2);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ui2" element
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedShort insertNewUi2(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().insert_element_user(PROPERTY_QNAME[6], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ui2" element
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedShort addNewUi2() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedShort target = null;
            target = (org.apache.xmlbeans.XmlUnsignedShort)get_store().add_element_user(PROPERTY_QNAME[6]);
            return target;
        }
    }

    /**
     * Removes the ith "ui2" element
     */
    @Override
    public void removeUi2(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[6], i);
        }
    }

    /**
     * Gets a List of "ui4" elements
     */
    @Override
    public java.util.List<java.lang.Long> getUi4List() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getUi4Array,
                this::setUi4Array,
                this::insertUi4,
                this::removeUi4,
                this::sizeOfUi4Array
            );
        }
    }

    /**
     * Gets array of all "ui4" elements
     */
    @Override
    public long[] getUi4Array() {
        return getLongArray(PROPERTY_QNAME[7]);
    }

    /**
     * Gets ith "ui4" element
     */
    @Override
    public long getUi4Array(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[7], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getLongValue();
        }
    }

    /**
     * Gets (as xml) a List of "ui4" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlUnsignedInt> xgetUi4List() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetUi4Array,
                this::xsetUi4Array,
                this::insertNewUi4,
                this::removeUi4,
                this::sizeOfUi4Array
            );
        }
    }

    /**
     * Gets (as xml) array of all "ui4" elements
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt[] xgetUi4Array() {
        return xgetArray(PROPERTY_QNAME[7], org.apache.xmlbeans.XmlUnsignedInt[]::new);
    }

    /**
     * Gets (as xml) ith "ui4" element
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetUi4Array(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(PROPERTY_QNAME[7], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ui4" element
     */
    @Override
    public int sizeOfUi4Array() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[7]);
        }
    }

    /**
     * Sets array of all "ui4" element
     */
    @Override
    public void setUi4Array(long[] ui4Array) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(ui4Array, PROPERTY_QNAME[7]);
        }
    }

    /**
     * Sets ith "ui4" element
     */
    @Override
    public void setUi4Array(int i, long ui4) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[7], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setLongValue(ui4);
        }
    }

    /**
     * Sets (as xml) array of all "ui4" element
     */
    @Override
    public void xsetUi4Array(org.apache.xmlbeans.XmlUnsignedInt[]ui4Array) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(ui4Array, PROPERTY_QNAME[7]);
        }
    }

    /**
     * Sets (as xml) ith "ui4" element
     */
    @Override
    public void xsetUi4Array(int i, org.apache.xmlbeans.XmlUnsignedInt ui4) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_element_user(PROPERTY_QNAME[7], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(ui4);
        }
    }

    /**
     * Inserts the value as the ith "ui4" element
     */
    @Override
    public void insertUi4(int i, long ui4) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[7], i);
            target.setLongValue(ui4);
        }
    }

    /**
     * Appends the value as the last "ui4" element
     */
    @Override
    public void addUi4(long ui4) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[7]);
            target.setLongValue(ui4);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ui4" element
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt insertNewUi4(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().insert_element_user(PROPERTY_QNAME[7], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ui4" element
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt addNewUi4() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_element_user(PROPERTY_QNAME[7]);
            return target;
        }
    }

    /**
     * Removes the ith "ui4" element
     */
    @Override
    public void removeUi4(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[7], i);
        }
    }

    /**
     * Gets a List of "ui8" elements
     */
    @Override
    public java.util.List<java.math.BigInteger> getUi8List() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getUi8Array,
                this::setUi8Array,
                this::insertUi8,
                this::removeUi8,
                this::sizeOfUi8Array
            );
        }
    }

    /**
     * Gets array of all "ui8" elements
     */
    @Override
    public java.math.BigInteger[] getUi8Array() {
        return getObjectArray(PROPERTY_QNAME[8], org.apache.xmlbeans.SimpleValue::getBigIntegerValue, java.math.BigInteger[]::new);
    }

    /**
     * Gets ith "ui8" element
     */
    @Override
    public java.math.BigInteger getUi8Array(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigIntegerValue();
        }
    }

    /**
     * Gets (as xml) a List of "ui8" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlUnsignedLong> xgetUi8List() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetUi8Array,
                this::xsetUi8Array,
                this::insertNewUi8,
                this::removeUi8,
                this::sizeOfUi8Array
            );
        }
    }

    /**
     * Gets (as xml) array of all "ui8" elements
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedLong[] xgetUi8Array() {
        return xgetArray(PROPERTY_QNAME[8], org.apache.xmlbeans.XmlUnsignedLong[]::new);
    }

    /**
     * Gets (as xml) ith "ui8" element
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedLong xgetUi8Array(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedLong target = null;
            target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "ui8" element
     */
    @Override
    public int sizeOfUi8Array() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[8]);
        }
    }

    /**
     * Sets array of all "ui8" element
     */
    @Override
    public void setUi8Array(java.math.BigInteger[] ui8Array) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(ui8Array, PROPERTY_QNAME[8]);
        }
    }

    /**
     * Sets ith "ui8" element
     */
    @Override
    public void setUi8Array(int i, java.math.BigInteger ui8) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setBigIntegerValue(ui8);
        }
    }

    /**
     * Sets (as xml) array of all "ui8" element
     */
    @Override
    public void xsetUi8Array(org.apache.xmlbeans.XmlUnsignedLong[]ui8Array) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(ui8Array, PROPERTY_QNAME[8]);
        }
    }

    /**
     * Sets (as xml) ith "ui8" element
     */
    @Override
    public void xsetUi8Array(int i, org.apache.xmlbeans.XmlUnsignedLong ui8) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedLong target = null;
            target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().find_element_user(PROPERTY_QNAME[8], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(ui8);
        }
    }

    /**
     * Inserts the value as the ith "ui8" element
     */
    @Override
    public void insertUi8(int i, java.math.BigInteger ui8) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[8], i);
            target.setBigIntegerValue(ui8);
        }
    }

    /**
     * Appends the value as the last "ui8" element
     */
    @Override
    public void addUi8(java.math.BigInteger ui8) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[8]);
            target.setBigIntegerValue(ui8);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "ui8" element
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedLong insertNewUi8(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedLong target = null;
            target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().insert_element_user(PROPERTY_QNAME[8], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "ui8" element
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedLong addNewUi8() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedLong target = null;
            target = (org.apache.xmlbeans.XmlUnsignedLong)get_store().add_element_user(PROPERTY_QNAME[8]);
            return target;
        }
    }

    /**
     * Removes the ith "ui8" element
     */
    @Override
    public void removeUi8(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[8], i);
        }
    }

    /**
     * Gets a List of "r4" elements
     */
    @Override
    public java.util.List<java.lang.Float> getR4List() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getR4Array,
                this::setR4Array,
                this::insertR4,
                this::removeR4,
                this::sizeOfR4Array
            );
        }
    }

    /**
     * Gets array of all "r4" elements
     */
    @Override
    public float[] getR4Array() {
        return getFloatArray(PROPERTY_QNAME[9]);
    }

    /**
     * Gets ith "r4" element
     */
    @Override
    public float getR4Array(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[9], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getFloatValue();
        }
    }

    /**
     * Gets (as xml) a List of "r4" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlFloat> xgetR4List() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetR4Array,
                this::xsetR4Array,
                this::insertNewR4,
                this::removeR4,
                this::sizeOfR4Array
            );
        }
    }

    /**
     * Gets (as xml) array of all "r4" elements
     */
    @Override
    public org.apache.xmlbeans.XmlFloat[] xgetR4Array() {
        return xgetArray(PROPERTY_QNAME[9], org.apache.xmlbeans.XmlFloat[]::new);
    }

    /**
     * Gets (as xml) ith "r4" element
     */
    @Override
    public org.apache.xmlbeans.XmlFloat xgetR4Array(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PROPERTY_QNAME[9], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "r4" element
     */
    @Override
    public int sizeOfR4Array() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[9]);
        }
    }

    /**
     * Sets array of all "r4" element
     */
    @Override
    public void setR4Array(float[] r4Array) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(r4Array, PROPERTY_QNAME[9]);
        }
    }

    /**
     * Sets ith "r4" element
     */
    @Override
    public void setR4Array(int i, float r4) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[9], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setFloatValue(r4);
        }
    }

    /**
     * Sets (as xml) array of all "r4" element
     */
    @Override
    public void xsetR4Array(org.apache.xmlbeans.XmlFloat[]r4Array) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(r4Array, PROPERTY_QNAME[9]);
        }
    }

    /**
     * Sets (as xml) ith "r4" element
     */
    @Override
    public void xsetR4Array(int i, org.apache.xmlbeans.XmlFloat r4) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().find_element_user(PROPERTY_QNAME[9], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(r4);
        }
    }

    /**
     * Inserts the value as the ith "r4" element
     */
    @Override
    public void insertR4(int i, float r4) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[9], i);
            target.setFloatValue(r4);
        }
    }

    /**
     * Appends the value as the last "r4" element
     */
    @Override
    public void addR4(float r4) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[9]);
            target.setFloatValue(r4);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "r4" element
     */
    @Override
    public org.apache.xmlbeans.XmlFloat insertNewR4(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().insert_element_user(PROPERTY_QNAME[9], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "r4" element
     */
    @Override
    public org.apache.xmlbeans.XmlFloat addNewR4() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlFloat target = null;
            target = (org.apache.xmlbeans.XmlFloat)get_store().add_element_user(PROPERTY_QNAME[9]);
            return target;
        }
    }

    /**
     * Removes the ith "r4" element
     */
    @Override
    public void removeR4(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[9], i);
        }
    }

    /**
     * Gets a List of "r8" elements
     */
    @Override
    public java.util.List<java.lang.Double> getR8List() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getR8Array,
                this::setR8Array,
                this::insertR8,
                this::removeR8,
                this::sizeOfR8Array
            );
        }
    }

    /**
     * Gets array of all "r8" elements
     */
    @Override
    public double[] getR8Array() {
        return getDoubleArray(PROPERTY_QNAME[10]);
    }

    /**
     * Gets ith "r8" element
     */
    @Override
    public double getR8Array(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[10], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getDoubleValue();
        }
    }

    /**
     * Gets (as xml) a List of "r8" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlDouble> xgetR8List() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetR8Array,
                this::xsetR8Array,
                this::insertNewR8,
                this::removeR8,
                this::sizeOfR8Array
            );
        }
    }

    /**
     * Gets (as xml) array of all "r8" elements
     */
    @Override
    public org.apache.xmlbeans.XmlDouble[] xgetR8Array() {
        return xgetArray(PROPERTY_QNAME[10], org.apache.xmlbeans.XmlDouble[]::new);
    }

    /**
     * Gets (as xml) ith "r8" element
     */
    @Override
    public org.apache.xmlbeans.XmlDouble xgetR8Array(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PROPERTY_QNAME[10], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "r8" element
     */
    @Override
    public int sizeOfR8Array() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[10]);
        }
    }

    /**
     * Sets array of all "r8" element
     */
    @Override
    public void setR8Array(double[] r8Array) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(r8Array, PROPERTY_QNAME[10]);
        }
    }

    /**
     * Sets ith "r8" element
     */
    @Override
    public void setR8Array(int i, double r8) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[10], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setDoubleValue(r8);
        }
    }

    /**
     * Sets (as xml) array of all "r8" element
     */
    @Override
    public void xsetR8Array(org.apache.xmlbeans.XmlDouble[]r8Array) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(r8Array, PROPERTY_QNAME[10]);
        }
    }

    /**
     * Sets (as xml) ith "r8" element
     */
    @Override
    public void xsetR8Array(int i, org.apache.xmlbeans.XmlDouble r8) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PROPERTY_QNAME[10], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(r8);
        }
    }

    /**
     * Inserts the value as the ith "r8" element
     */
    @Override
    public void insertR8(int i, double r8) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[10], i);
            target.setDoubleValue(r8);
        }
    }

    /**
     * Appends the value as the last "r8" element
     */
    @Override
    public void addR8(double r8) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[10]);
            target.setDoubleValue(r8);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "r8" element
     */
    @Override
    public org.apache.xmlbeans.XmlDouble insertNewR8(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().insert_element_user(PROPERTY_QNAME[10], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "r8" element
     */
    @Override
    public org.apache.xmlbeans.XmlDouble addNewR8() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(PROPERTY_QNAME[10]);
            return target;
        }
    }

    /**
     * Removes the ith "r8" element
     */
    @Override
    public void removeR8(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[10], i);
        }
    }

    /**
     * Gets a List of "lpstr" elements
     */
    @Override
    public java.util.List<java.lang.String> getLpstrList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getLpstrArray,
                this::setLpstrArray,
                this::insertLpstr,
                this::removeLpstr,
                this::sizeOfLpstrArray
            );
        }
    }

    /**
     * Gets array of all "lpstr" elements
     */
    @Override
    public java.lang.String[] getLpstrArray() {
        return getObjectArray(PROPERTY_QNAME[11], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "lpstr" element
     */
    @Override
    public java.lang.String getLpstrArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[11], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "lpstr" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetLpstrList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetLpstrArray,
                this::xsetLpstrArray,
                this::insertNewLpstr,
                this::removeLpstr,
                this::sizeOfLpstrArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "lpstr" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetLpstrArray() {
        return xgetArray(PROPERTY_QNAME[11], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "lpstr" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetLpstrArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[11], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "lpstr" element
     */
    @Override
    public int sizeOfLpstrArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[11]);
        }
    }

    /**
     * Sets array of all "lpstr" element
     */
    @Override
    public void setLpstrArray(java.lang.String[] lpstrArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(lpstrArray, PROPERTY_QNAME[11]);
        }
    }

    /**
     * Sets ith "lpstr" element
     */
    @Override
    public void setLpstrArray(int i, java.lang.String lpstr) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[11], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(lpstr);
        }
    }

    /**
     * Sets (as xml) array of all "lpstr" element
     */
    @Override
    public void xsetLpstrArray(org.apache.xmlbeans.XmlString[]lpstrArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(lpstrArray, PROPERTY_QNAME[11]);
        }
    }

    /**
     * Sets (as xml) ith "lpstr" element
     */
    @Override
    public void xsetLpstrArray(int i, org.apache.xmlbeans.XmlString lpstr) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[11], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(lpstr);
        }
    }

    /**
     * Inserts the value as the ith "lpstr" element
     */
    @Override
    public void insertLpstr(int i, java.lang.String lpstr) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[11], i);
            target.setStringValue(lpstr);
        }
    }

    /**
     * Appends the value as the last "lpstr" element
     */
    @Override
    public void addLpstr(java.lang.String lpstr) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[11]);
            target.setStringValue(lpstr);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "lpstr" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewLpstr(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[11], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "lpstr" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewLpstr() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[11]);
            return target;
        }
    }

    /**
     * Removes the ith "lpstr" element
     */
    @Override
    public void removeLpstr(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[11], i);
        }
    }

    /**
     * Gets a List of "lpwstr" elements
     */
    @Override
    public java.util.List<java.lang.String> getLpwstrList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getLpwstrArray,
                this::setLpwstrArray,
                this::insertLpwstr,
                this::removeLpwstr,
                this::sizeOfLpwstrArray
            );
        }
    }

    /**
     * Gets array of all "lpwstr" elements
     */
    @Override
    public java.lang.String[] getLpwstrArray() {
        return getObjectArray(PROPERTY_QNAME[12], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "lpwstr" element
     */
    @Override
    public java.lang.String getLpwstrArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[12], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "lpwstr" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetLpwstrList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetLpwstrArray,
                this::xsetLpwstrArray,
                this::insertNewLpwstr,
                this::removeLpwstr,
                this::sizeOfLpwstrArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "lpwstr" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetLpwstrArray() {
        return xgetArray(PROPERTY_QNAME[12], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "lpwstr" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetLpwstrArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[12], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "lpwstr" element
     */
    @Override
    public int sizeOfLpwstrArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[12]);
        }
    }

    /**
     * Sets array of all "lpwstr" element
     */
    @Override
    public void setLpwstrArray(java.lang.String[] lpwstrArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(lpwstrArray, PROPERTY_QNAME[12]);
        }
    }

    /**
     * Sets ith "lpwstr" element
     */
    @Override
    public void setLpwstrArray(int i, java.lang.String lpwstr) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[12], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(lpwstr);
        }
    }

    /**
     * Sets (as xml) array of all "lpwstr" element
     */
    @Override
    public void xsetLpwstrArray(org.apache.xmlbeans.XmlString[]lpwstrArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(lpwstrArray, PROPERTY_QNAME[12]);
        }
    }

    /**
     * Sets (as xml) ith "lpwstr" element
     */
    @Override
    public void xsetLpwstrArray(int i, org.apache.xmlbeans.XmlString lpwstr) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[12], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(lpwstr);
        }
    }

    /**
     * Inserts the value as the ith "lpwstr" element
     */
    @Override
    public void insertLpwstr(int i, java.lang.String lpwstr) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[12], i);
            target.setStringValue(lpwstr);
        }
    }

    /**
     * Appends the value as the last "lpwstr" element
     */
    @Override
    public void addLpwstr(java.lang.String lpwstr) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[12]);
            target.setStringValue(lpwstr);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "lpwstr" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewLpwstr(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[12], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "lpwstr" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewLpwstr() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[12]);
            return target;
        }
    }

    /**
     * Removes the ith "lpwstr" element
     */
    @Override
    public void removeLpwstr(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[12], i);
        }
    }

    /**
     * Gets a List of "bstr" elements
     */
    @Override
    public java.util.List<java.lang.String> getBstrList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getBstrArray,
                this::setBstrArray,
                this::insertBstr,
                this::removeBstr,
                this::sizeOfBstrArray
            );
        }
    }

    /**
     * Gets array of all "bstr" elements
     */
    @Override
    public java.lang.String[] getBstrArray() {
        return getObjectArray(PROPERTY_QNAME[13], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "bstr" element
     */
    @Override
    public java.lang.String getBstrArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[13], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "bstr" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlString> xgetBstrList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetBstrArray,
                this::xsetBstrArray,
                this::insertNewBstr,
                this::removeBstr,
                this::sizeOfBstrArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "bstr" elements
     */
    @Override
    public org.apache.xmlbeans.XmlString[] xgetBstrArray() {
        return xgetArray(PROPERTY_QNAME[13], org.apache.xmlbeans.XmlString[]::new);
    }

    /**
     * Gets (as xml) ith "bstr" element
     */
    @Override
    public org.apache.xmlbeans.XmlString xgetBstrArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[13], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "bstr" element
     */
    @Override
    public int sizeOfBstrArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[13]);
        }
    }

    /**
     * Sets array of all "bstr" element
     */
    @Override
    public void setBstrArray(java.lang.String[] bstrArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(bstrArray, PROPERTY_QNAME[13]);
        }
    }

    /**
     * Sets ith "bstr" element
     */
    @Override
    public void setBstrArray(int i, java.lang.String bstr) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[13], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(bstr);
        }
    }

    /**
     * Sets (as xml) array of all "bstr" element
     */
    @Override
    public void xsetBstrArray(org.apache.xmlbeans.XmlString[]bstrArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(bstrArray, PROPERTY_QNAME[13]);
        }
    }

    /**
     * Sets (as xml) ith "bstr" element
     */
    @Override
    public void xsetBstrArray(int i, org.apache.xmlbeans.XmlString bstr) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY_QNAME[13], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(bstr);
        }
    }

    /**
     * Inserts the value as the ith "bstr" element
     */
    @Override
    public void insertBstr(int i, java.lang.String bstr) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[13], i);
            target.setStringValue(bstr);
        }
    }

    /**
     * Appends the value as the last "bstr" element
     */
    @Override
    public void addBstr(java.lang.String bstr) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[13]);
            target.setStringValue(bstr);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "bstr" element
     */
    @Override
    public org.apache.xmlbeans.XmlString insertNewBstr(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY_QNAME[13], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "bstr" element
     */
    @Override
    public org.apache.xmlbeans.XmlString addNewBstr() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY_QNAME[13]);
            return target;
        }
    }

    /**
     * Removes the ith "bstr" element
     */
    @Override
    public void removeBstr(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[13], i);
        }
    }

    /**
     * Gets a List of "date" elements
     */
    @Override
    public java.util.List<java.util.Calendar> getDateList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getDateArray,
                this::setDateArray,
                this::insertDate,
                this::removeDate,
                this::sizeOfDateArray
            );
        }
    }

    /**
     * Gets array of all "date" elements
     */
    @Override
    public java.util.Calendar[] getDateArray() {
        return getObjectArray(PROPERTY_QNAME[14], org.apache.xmlbeans.SimpleValue::getCalendarValue, java.util.Calendar[]::new);
    }

    /**
     * Gets ith "date" element
     */
    @Override
    public java.util.Calendar getDateArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[14], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) a List of "date" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlDateTime> xgetDateList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetDateArray,
                this::xsetDateArray,
                this::insertNewDate,
                this::removeDate,
                this::sizeOfDateArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "date" elements
     */
    @Override
    public org.apache.xmlbeans.XmlDateTime[] xgetDateArray() {
        return xgetArray(PROPERTY_QNAME[14], org.apache.xmlbeans.XmlDateTime[]::new);
    }

    /**
     * Gets (as xml) ith "date" element
     */
    @Override
    public org.apache.xmlbeans.XmlDateTime xgetDateArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(PROPERTY_QNAME[14], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "date" element
     */
    @Override
    public int sizeOfDateArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[14]);
        }
    }

    /**
     * Sets array of all "date" element
     */
    @Override
    public void setDateArray(java.util.Calendar[] dateArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(dateArray, PROPERTY_QNAME[14]);
        }
    }

    /**
     * Sets ith "date" element
     */
    @Override
    public void setDateArray(int i, java.util.Calendar date) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[14], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setCalendarValue(date);
        }
    }

    /**
     * Sets (as xml) array of all "date" element
     */
    @Override
    public void xsetDateArray(org.apache.xmlbeans.XmlDateTime[]dateArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(dateArray, PROPERTY_QNAME[14]);
        }
    }

    /**
     * Sets (as xml) ith "date" element
     */
    @Override
    public void xsetDateArray(int i, org.apache.xmlbeans.XmlDateTime date) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(PROPERTY_QNAME[14], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(date);
        }
    }

    /**
     * Inserts the value as the ith "date" element
     */
    @Override
    public void insertDate(int i, java.util.Calendar date) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[14], i);
            target.setCalendarValue(date);
        }
    }

    /**
     * Appends the value as the last "date" element
     */
    @Override
    public void addDate(java.util.Calendar date) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[14]);
            target.setCalendarValue(date);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "date" element
     */
    @Override
    public org.apache.xmlbeans.XmlDateTime insertNewDate(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().insert_element_user(PROPERTY_QNAME[14], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "date" element
     */
    @Override
    public org.apache.xmlbeans.XmlDateTime addNewDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(PROPERTY_QNAME[14]);
            return target;
        }
    }

    /**
     * Removes the ith "date" element
     */
    @Override
    public void removeDate(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[14], i);
        }
    }

    /**
     * Gets a List of "filetime" elements
     */
    @Override
    public java.util.List<java.util.Calendar> getFiletimeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getFiletimeArray,
                this::setFiletimeArray,
                this::insertFiletime,
                this::removeFiletime,
                this::sizeOfFiletimeArray
            );
        }
    }

    /**
     * Gets array of all "filetime" elements
     */
    @Override
    public java.util.Calendar[] getFiletimeArray() {
        return getObjectArray(PROPERTY_QNAME[15], org.apache.xmlbeans.SimpleValue::getCalendarValue, java.util.Calendar[]::new);
    }

    /**
     * Gets ith "filetime" element
     */
    @Override
    public java.util.Calendar getFiletimeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[15], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getCalendarValue();
        }
    }

    /**
     * Gets (as xml) a List of "filetime" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlDateTime> xgetFiletimeList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetFiletimeArray,
                this::xsetFiletimeArray,
                this::insertNewFiletime,
                this::removeFiletime,
                this::sizeOfFiletimeArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "filetime" elements
     */
    @Override
    public org.apache.xmlbeans.XmlDateTime[] xgetFiletimeArray() {
        return xgetArray(PROPERTY_QNAME[15], org.apache.xmlbeans.XmlDateTime[]::new);
    }

    /**
     * Gets (as xml) ith "filetime" element
     */
    @Override
    public org.apache.xmlbeans.XmlDateTime xgetFiletimeArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(PROPERTY_QNAME[15], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "filetime" element
     */
    @Override
    public int sizeOfFiletimeArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[15]);
        }
    }

    /**
     * Sets array of all "filetime" element
     */
    @Override
    public void setFiletimeArray(java.util.Calendar[] filetimeArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(filetimeArray, PROPERTY_QNAME[15]);
        }
    }

    /**
     * Sets ith "filetime" element
     */
    @Override
    public void setFiletimeArray(int i, java.util.Calendar filetime) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[15], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setCalendarValue(filetime);
        }
    }

    /**
     * Sets (as xml) array of all "filetime" element
     */
    @Override
    public void xsetFiletimeArray(org.apache.xmlbeans.XmlDateTime[]filetimeArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(filetimeArray, PROPERTY_QNAME[15]);
        }
    }

    /**
     * Sets (as xml) ith "filetime" element
     */
    @Override
    public void xsetFiletimeArray(int i, org.apache.xmlbeans.XmlDateTime filetime) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(PROPERTY_QNAME[15], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(filetime);
        }
    }

    /**
     * Inserts the value as the ith "filetime" element
     */
    @Override
    public void insertFiletime(int i, java.util.Calendar filetime) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[15], i);
            target.setCalendarValue(filetime);
        }
    }

    /**
     * Appends the value as the last "filetime" element
     */
    @Override
    public void addFiletime(java.util.Calendar filetime) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[15]);
            target.setCalendarValue(filetime);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "filetime" element
     */
    @Override
    public org.apache.xmlbeans.XmlDateTime insertNewFiletime(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().insert_element_user(PROPERTY_QNAME[15], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "filetime" element
     */
    @Override
    public org.apache.xmlbeans.XmlDateTime addNewFiletime() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(PROPERTY_QNAME[15]);
            return target;
        }
    }

    /**
     * Removes the ith "filetime" element
     */
    @Override
    public void removeFiletime(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[15], i);
        }
    }

    /**
     * Gets a List of "bool" elements
     */
    @Override
    public java.util.List<java.lang.Boolean> getBoolList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getBoolArray,
                this::setBoolArray,
                this::insertBool,
                this::removeBool,
                this::sizeOfBoolArray
            );
        }
    }

    /**
     * Gets array of all "bool" elements
     */
    @Override
    public boolean[] getBoolArray() {
        return getBooleanArray(PROPERTY_QNAME[16]);
    }

    /**
     * Gets ith "bool" element
     */
    @Override
    public boolean getBoolArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[16], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getBooleanValue();
        }
    }

    /**
     * Gets (as xml) a List of "bool" elements
     */
    @Override
    public java.util.List<org.apache.xmlbeans.XmlBoolean> xgetBoolList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetBoolArray,
                this::xsetBoolArray,
                this::insertNewBool,
                this::removeBool,
                this::sizeOfBoolArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "bool" elements
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean[] xgetBoolArray() {
        return xgetArray(PROPERTY_QNAME[16], org.apache.xmlbeans.XmlBoolean[]::new);
    }

    /**
     * Gets (as xml) ith "bool" element
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean xgetBoolArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[16], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "bool" element
     */
    @Override
    public int sizeOfBoolArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[16]);
        }
    }

    /**
     * Sets array of all "bool" element
     */
    @Override
    public void setBoolArray(boolean[] boolArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(boolArray, PROPERTY_QNAME[16]);
        }
    }

    /**
     * Sets ith "bool" element
     */
    @Override
    public void setBoolArray(int i, boolean bool) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[16], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setBooleanValue(bool);
        }
    }

    /**
     * Sets (as xml) array of all "bool" element
     */
    @Override
    public void xsetBoolArray(org.apache.xmlbeans.XmlBoolean[]boolArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(boolArray, PROPERTY_QNAME[16]);
        }
    }

    /**
     * Sets (as xml) ith "bool" element
     */
    @Override
    public void xsetBoolArray(int i, org.apache.xmlbeans.XmlBoolean bool) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROPERTY_QNAME[16], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(bool);
        }
    }

    /**
     * Inserts the value as the ith "bool" element
     */
    @Override
    public void insertBool(int i, boolean bool) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[16], i);
            target.setBooleanValue(bool);
        }
    }

    /**
     * Appends the value as the last "bool" element
     */
    @Override
    public void addBool(boolean bool) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[16]);
            target.setBooleanValue(bool);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "bool" element
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean insertNewBool(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().insert_element_user(PROPERTY_QNAME[16], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "bool" element
     */
    @Override
    public org.apache.xmlbeans.XmlBoolean addNewBool() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROPERTY_QNAME[16]);
            return target;
        }
    }

    /**
     * Removes the ith "bool" element
     */
    @Override
    public void removeBool(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[16], i);
        }
    }

    /**
     * Gets a List of "cy" elements
     */
    @Override
    public java.util.List<java.lang.String> getCyList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getCyArray,
                this::setCyArray,
                this::insertCy,
                this::removeCy,
                this::sizeOfCyArray
            );
        }
    }

    /**
     * Gets array of all "cy" elements
     */
    @Override
    public java.lang.String[] getCyArray() {
        return getObjectArray(PROPERTY_QNAME[17], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "cy" element
     */
    @Override
    public java.lang.String getCyArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[17], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "cy" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy> xgetCyList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetCyArray,
                this::xsetCyArray,
                this::insertNewCy,
                this::removeCy,
                this::sizeOfCyArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "cy" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy[] xgetCyArray() {
        return xgetArray(PROPERTY_QNAME[17], org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy[]::new);
    }

    /**
     * Gets (as xml) ith "cy" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy xgetCyArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy)get_store().find_element_user(PROPERTY_QNAME[17], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "cy" element
     */
    @Override
    public int sizeOfCyArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[17]);
        }
    }

    /**
     * Sets array of all "cy" element
     */
    @Override
    public void setCyArray(java.lang.String[] cyArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(cyArray, PROPERTY_QNAME[17]);
        }
    }

    /**
     * Sets ith "cy" element
     */
    @Override
    public void setCyArray(int i, java.lang.String cy) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[17], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(cy);
        }
    }

    /**
     * Sets (as xml) array of all "cy" element
     */
    @Override
    public void xsetCyArray(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy[]cyArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(cyArray, PROPERTY_QNAME[17]);
        }
    }

    /**
     * Sets (as xml) ith "cy" element
     */
    @Override
    public void xsetCyArray(int i, org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy cy) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy)get_store().find_element_user(PROPERTY_QNAME[17], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(cy);
        }
    }

    /**
     * Inserts the value as the ith "cy" element
     */
    @Override
    public void insertCy(int i, java.lang.String cy) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[17], i);
            target.setStringValue(cy);
        }
    }

    /**
     * Appends the value as the last "cy" element
     */
    @Override
    public void addCy(java.lang.String cy) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[17]);
            target.setStringValue(cy);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "cy" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy insertNewCy(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy)get_store().insert_element_user(PROPERTY_QNAME[17], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "cy" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy addNewCy() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy)get_store().add_element_user(PROPERTY_QNAME[17]);
            return target;
        }
    }

    /**
     * Removes the ith "cy" element
     */
    @Override
    public void removeCy(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[17], i);
        }
    }

    /**
     * Gets a List of "error" elements
     */
    @Override
    public java.util.List<java.lang.String> getErrorList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getErrorArray,
                this::setErrorArray,
                this::insertError,
                this::removeError,
                this::sizeOfErrorArray
            );
        }
    }

    /**
     * Gets array of all "error" elements
     */
    @Override
    public java.lang.String[] getErrorArray() {
        return getObjectArray(PROPERTY_QNAME[18], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "error" element
     */
    @Override
    public java.lang.String getErrorArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[18], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "error" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError> xgetErrorList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetErrorArray,
                this::xsetErrorArray,
                this::insertNewError,
                this::removeError,
                this::sizeOfErrorArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "error" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError[] xgetErrorArray() {
        return xgetArray(PROPERTY_QNAME[18], org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError[]::new);
    }

    /**
     * Gets (as xml) ith "error" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError xgetErrorArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError)get_store().find_element_user(PROPERTY_QNAME[18], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "error" element
     */
    @Override
    public int sizeOfErrorArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[18]);
        }
    }

    /**
     * Sets array of all "error" element
     */
    @Override
    public void setErrorArray(java.lang.String[] errorArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(errorArray, PROPERTY_QNAME[18]);
        }
    }

    /**
     * Sets ith "error" element
     */
    @Override
    public void setErrorArray(int i, java.lang.String error) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[18], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(error);
        }
    }

    /**
     * Sets (as xml) array of all "error" element
     */
    @Override
    public void xsetErrorArray(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError[]errorArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(errorArray, PROPERTY_QNAME[18]);
        }
    }

    /**
     * Sets (as xml) ith "error" element
     */
    @Override
    public void xsetErrorArray(int i, org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError error) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError)get_store().find_element_user(PROPERTY_QNAME[18], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(error);
        }
    }

    /**
     * Inserts the value as the ith "error" element
     */
    @Override
    public void insertError(int i, java.lang.String error) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[18], i);
            target.setStringValue(error);
        }
    }

    /**
     * Appends the value as the last "error" element
     */
    @Override
    public void addError(java.lang.String error) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[18]);
            target.setStringValue(error);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "error" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError insertNewError(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError)get_store().insert_element_user(PROPERTY_QNAME[18], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "error" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError addNewError() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError)get_store().add_element_user(PROPERTY_QNAME[18]);
            return target;
        }
    }

    /**
     * Removes the ith "error" element
     */
    @Override
    public void removeError(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[18], i);
        }
    }

    /**
     * Gets a List of "clsid" elements
     */
    @Override
    public java.util.List<java.lang.String> getClsidList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListObject<>(
                this::getClsidArray,
                this::setClsidArray,
                this::insertClsid,
                this::removeClsid,
                this::sizeOfClsidArray
            );
        }
    }

    /**
     * Gets array of all "clsid" elements
     */
    @Override
    public java.lang.String[] getClsidArray() {
        return getObjectArray(PROPERTY_QNAME[19], org.apache.xmlbeans.SimpleValue::getStringValue, String[]::new);
    }

    /**
     * Gets ith "clsid" element
     */
    @Override
    public java.lang.String getClsidArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[19], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) a List of "clsid" elements
     */
    @Override
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid> xgetClsidList() {
        synchronized (monitor()) {
            check_orphaned();
            return new org.apache.xmlbeans.impl.values.JavaListXmlObject<>(
                this::xgetClsidArray,
                this::xsetClsidArray,
                this::insertNewClsid,
                this::removeClsid,
                this::sizeOfClsidArray
            );
        }
    }

    /**
     * Gets (as xml) array of all "clsid" elements
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid[] xgetClsidArray() {
        return xgetArray(PROPERTY_QNAME[19], org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid[]::new);
    }

    /**
     * Gets (as xml) ith "clsid" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid xgetClsidArray(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid)get_store().find_element_user(PROPERTY_QNAME[19], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "clsid" element
     */
    @Override
    public int sizeOfClsidArray() {
        synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(PROPERTY_QNAME[19]);
        }
    }

    /**
     * Sets array of all "clsid" element
     */
    @Override
    public void setClsidArray(java.lang.String[] clsidArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(clsidArray, PROPERTY_QNAME[19]);
        }
    }

    /**
     * Sets ith "clsid" element
     */
    @Override
    public void setClsidArray(int i, java.lang.String clsid) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY_QNAME[19], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(clsid);
        }
    }

    /**
     * Sets (as xml) array of all "clsid" element
     */
    @Override
    public void xsetClsidArray(org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid[]clsidArray) {
        synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(clsidArray, PROPERTY_QNAME[19]);
        }
    }

    /**
     * Sets (as xml) ith "clsid" element
     */
    @Override
    public void xsetClsidArray(int i, org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid clsid) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid)get_store().find_element_user(PROPERTY_QNAME[19], i);
            if (target == null) {
                throw new IndexOutOfBoundsException();
            }
            target.set(clsid);
        }
    }

    /**
     * Inserts the value as the ith "clsid" element
     */
    @Override
    public void insertClsid(int i, java.lang.String clsid) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target =
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY_QNAME[19], i);
            target.setStringValue(clsid);
        }
    }

    /**
     * Appends the value as the last "clsid" element
     */
    @Override
    public void addClsid(java.lang.String clsid) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY_QNAME[19]);
            target.setStringValue(clsid);
        }
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "clsid" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid insertNewClsid(int i) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid)get_store().insert_element_user(PROPERTY_QNAME[19], i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "clsid" element
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid addNewClsid() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.sharedTypes.STGuid)get_store().add_element_user(PROPERTY_QNAME[19]);
            return target;
        }
    }

    /**
     * Removes the ith "clsid" element
     */
    @Override
    public void removeClsid(int i) {
        synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(PROPERTY_QNAME[19], i);
        }
    }

    /**
     * Gets the "baseType" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STVectorBaseType.Enum getBaseType() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[20]);
            return (target == null) ? null : (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STVectorBaseType.Enum)target.getEnumValue();
        }
    }

    /**
     * Gets (as xml) the "baseType" attribute
     */
    @Override
    public org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STVectorBaseType xgetBaseType() {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STVectorBaseType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STVectorBaseType)get_store().find_attribute_user(PROPERTY_QNAME[20]);
            return target;
        }
    }

    /**
     * Sets the "baseType" attribute
     */
    @Override
    public void setBaseType(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STVectorBaseType.Enum baseType) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[20]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[20]);
            }
            target.setEnumValue(baseType);
        }
    }

    /**
     * Sets (as xml) the "baseType" attribute
     */
    @Override
    public void xsetBaseType(org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STVectorBaseType baseType) {
        synchronized (monitor()) {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STVectorBaseType target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STVectorBaseType)get_store().find_attribute_user(PROPERTY_QNAME[20]);
            if (target == null) {
                target = (org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STVectorBaseType)get_store().add_attribute_user(PROPERTY_QNAME[20]);
            }
            target.set(baseType);
        }
    }

    /**
     * Gets the "size" attribute
     */
    @Override
    public long getSize() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[21]);
            return (target == null) ? 0L : target.getLongValue();
        }
    }

    /**
     * Gets (as xml) the "size" attribute
     */
    @Override
    public org.apache.xmlbeans.XmlUnsignedInt xgetSize() {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[21]);
            return target;
        }
    }

    /**
     * Sets the "size" attribute
     */
    @Override
    public void setSize(long size) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY_QNAME[21]);
            if (target == null) {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY_QNAME[21]);
            }
            target.setLongValue(size);
        }
    }

    /**
     * Sets (as xml) the "size" attribute
     */
    @Override
    public void xsetSize(org.apache.xmlbeans.XmlUnsignedInt size) {
        synchronized (monitor()) {
            check_orphaned();
            org.apache.xmlbeans.XmlUnsignedInt target = null;
            target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().find_attribute_user(PROPERTY_QNAME[21]);
            if (target == null) {
                target = (org.apache.xmlbeans.XmlUnsignedInt)get_store().add_attribute_user(PROPERTY_QNAME[21]);
            }
            target.set(size);
        }
    }
}
