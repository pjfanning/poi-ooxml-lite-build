/*
 * XML Type:  CT_SignatureInfoV1
 * Namespace: http://schemas.microsoft.com/office/2006/digsig
 * Java type: com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.office.x2006.digsig;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML CT_SignatureInfoV1(@http://schemas.microsoft.com/office/2006/digsig).
 *
 * This is a complex type.
 */
public interface CTSignatureInfoV1 extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1> Factory = new DocumentFactory<>(org.apache.poi.schemas.ooxml.system.ooxml.TypeSystemHolder.typeSystem, "ctsignatureinfov13a5ftype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "SetupID" element
     */
    java.lang.String getSetupID();

    /**
     * Gets (as xml) the "SetupID" element
     */
    com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces xgetSetupID();

    /**
     * Sets the "SetupID" element
     */
    void setSetupID(java.lang.String setupID);

    /**
     * Sets (as xml) the "SetupID" element
     */
    void xsetSetupID(com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces setupID);

    /**
     * Gets the "SignatureText" element
     */
    java.lang.String getSignatureText();

    /**
     * Gets (as xml) the "SignatureText" element
     */
    com.microsoft.schemas.office.x2006.digsig.STSignatureText xgetSignatureText();

    /**
     * Sets the "SignatureText" element
     */
    void setSignatureText(java.lang.String signatureText);

    /**
     * Sets (as xml) the "SignatureText" element
     */
    void xsetSignatureText(com.microsoft.schemas.office.x2006.digsig.STSignatureText signatureText);

    /**
     * Gets the "SignatureImage" element
     */
    byte[] getSignatureImage();

    /**
     * Gets (as xml) the "SignatureImage" element
     */
    org.apache.xmlbeans.XmlBase64Binary xgetSignatureImage();

    /**
     * Sets the "SignatureImage" element
     */
    void setSignatureImage(byte[] signatureImage);

    /**
     * Sets (as xml) the "SignatureImage" element
     */
    void xsetSignatureImage(org.apache.xmlbeans.XmlBase64Binary signatureImage);

    /**
     * Gets the "SignatureComments" element
     */
    java.lang.String getSignatureComments();

    /**
     * Gets (as xml) the "SignatureComments" element
     */
    com.microsoft.schemas.office.x2006.digsig.STSignatureComments xgetSignatureComments();

    /**
     * Sets the "SignatureComments" element
     */
    void setSignatureComments(java.lang.String signatureComments);

    /**
     * Sets (as xml) the "SignatureComments" element
     */
    void xsetSignatureComments(com.microsoft.schemas.office.x2006.digsig.STSignatureComments signatureComments);

    /**
     * Gets the "WindowsVersion" element
     */
    java.lang.String getWindowsVersion();

    /**
     * Gets (as xml) the "WindowsVersion" element
     */
    com.microsoft.schemas.office.x2006.digsig.STVersion xgetWindowsVersion();

    /**
     * Sets the "WindowsVersion" element
     */
    void setWindowsVersion(java.lang.String windowsVersion);

    /**
     * Sets (as xml) the "WindowsVersion" element
     */
    void xsetWindowsVersion(com.microsoft.schemas.office.x2006.digsig.STVersion windowsVersion);

    /**
     * Gets the "OfficeVersion" element
     */
    java.lang.String getOfficeVersion();

    /**
     * Gets (as xml) the "OfficeVersion" element
     */
    com.microsoft.schemas.office.x2006.digsig.STVersion xgetOfficeVersion();

    /**
     * Sets the "OfficeVersion" element
     */
    void setOfficeVersion(java.lang.String officeVersion);

    /**
     * Sets (as xml) the "OfficeVersion" element
     */
    void xsetOfficeVersion(com.microsoft.schemas.office.x2006.digsig.STVersion officeVersion);

    /**
     * Gets the "ApplicationVersion" element
     */
    java.lang.String getApplicationVersion();

    /**
     * Gets (as xml) the "ApplicationVersion" element
     */
    com.microsoft.schemas.office.x2006.digsig.STVersion xgetApplicationVersion();

    /**
     * Sets the "ApplicationVersion" element
     */
    void setApplicationVersion(java.lang.String applicationVersion);

    /**
     * Sets (as xml) the "ApplicationVersion" element
     */
    void xsetApplicationVersion(com.microsoft.schemas.office.x2006.digsig.STVersion applicationVersion);

    /**
     * Gets the "Monitors" element
     */
    int getMonitors();

    /**
     * Gets (as xml) the "Monitors" element
     */
    com.microsoft.schemas.office.x2006.digsig.STPositiveInteger xgetMonitors();

    /**
     * Sets the "Monitors" element
     */
    void setMonitors(int monitors);

    /**
     * Sets (as xml) the "Monitors" element
     */
    void xsetMonitors(com.microsoft.schemas.office.x2006.digsig.STPositiveInteger monitors);

    /**
     * Gets the "HorizontalResolution" element
     */
    int getHorizontalResolution();

    /**
     * Gets (as xml) the "HorizontalResolution" element
     */
    com.microsoft.schemas.office.x2006.digsig.STPositiveInteger xgetHorizontalResolution();

    /**
     * Sets the "HorizontalResolution" element
     */
    void setHorizontalResolution(int horizontalResolution);

    /**
     * Sets (as xml) the "HorizontalResolution" element
     */
    void xsetHorizontalResolution(com.microsoft.schemas.office.x2006.digsig.STPositiveInteger horizontalResolution);

    /**
     * Gets the "VerticalResolution" element
     */
    int getVerticalResolution();

    /**
     * Gets (as xml) the "VerticalResolution" element
     */
    com.microsoft.schemas.office.x2006.digsig.STPositiveInteger xgetVerticalResolution();

    /**
     * Sets the "VerticalResolution" element
     */
    void setVerticalResolution(int verticalResolution);

    /**
     * Sets (as xml) the "VerticalResolution" element
     */
    void xsetVerticalResolution(com.microsoft.schemas.office.x2006.digsig.STPositiveInteger verticalResolution);

    /**
     * Gets the "ColorDepth" element
     */
    int getColorDepth();

    /**
     * Gets (as xml) the "ColorDepth" element
     */
    com.microsoft.schemas.office.x2006.digsig.STPositiveInteger xgetColorDepth();

    /**
     * Sets the "ColorDepth" element
     */
    void setColorDepth(int colorDepth);

    /**
     * Sets (as xml) the "ColorDepth" element
     */
    void xsetColorDepth(com.microsoft.schemas.office.x2006.digsig.STPositiveInteger colorDepth);

    /**
     * Gets the "SignatureProviderId" element
     */
    java.lang.String getSignatureProviderId();

    /**
     * Gets (as xml) the "SignatureProviderId" element
     */
    com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces xgetSignatureProviderId();

    /**
     * Sets the "SignatureProviderId" element
     */
    void setSignatureProviderId(java.lang.String signatureProviderId);

    /**
     * Sets (as xml) the "SignatureProviderId" element
     */
    void xsetSignatureProviderId(com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces signatureProviderId);

    /**
     * Gets the "SignatureProviderUrl" element
     */
    java.lang.String getSignatureProviderUrl();

    /**
     * Gets (as xml) the "SignatureProviderUrl" element
     */
    com.microsoft.schemas.office.x2006.digsig.STSignatureProviderUrl xgetSignatureProviderUrl();

    /**
     * Sets the "SignatureProviderUrl" element
     */
    void setSignatureProviderUrl(java.lang.String signatureProviderUrl);

    /**
     * Sets (as xml) the "SignatureProviderUrl" element
     */
    void xsetSignatureProviderUrl(com.microsoft.schemas.office.x2006.digsig.STSignatureProviderUrl signatureProviderUrl);

    /**
     * Gets the "SignatureProviderDetails" element
     */
    int getSignatureProviderDetails();

    /**
     * Gets (as xml) the "SignatureProviderDetails" element
     */
    org.apache.xmlbeans.XmlInt xgetSignatureProviderDetails();

    /**
     * Sets the "SignatureProviderDetails" element
     */
    void setSignatureProviderDetails(int signatureProviderDetails);

    /**
     * Sets (as xml) the "SignatureProviderDetails" element
     */
    void xsetSignatureProviderDetails(org.apache.xmlbeans.XmlInt signatureProviderDetails);

    /**
     * Gets the "SignatureType" element
     */
    int getSignatureType();

    /**
     * Gets (as xml) the "SignatureType" element
     */
    com.microsoft.schemas.office.x2006.digsig.STSignatureType xgetSignatureType();

    /**
     * Sets the "SignatureType" element
     */
    void setSignatureType(int signatureType);

    /**
     * Sets (as xml) the "SignatureType" element
     */
    void xsetSignatureType(com.microsoft.schemas.office.x2006.digsig.STSignatureType signatureType);

    /**
     * Gets the "DelegateSuggestedSigner" element
     */
    java.lang.String getDelegateSuggestedSigner();

    /**
     * Gets (as xml) the "DelegateSuggestedSigner" element
     */
    org.apache.xmlbeans.XmlString xgetDelegateSuggestedSigner();

    /**
     * True if has "DelegateSuggestedSigner" element
     */
    boolean isSetDelegateSuggestedSigner();

    /**
     * Sets the "DelegateSuggestedSigner" element
     */
    void setDelegateSuggestedSigner(java.lang.String delegateSuggestedSigner);

    /**
     * Sets (as xml) the "DelegateSuggestedSigner" element
     */
    void xsetDelegateSuggestedSigner(org.apache.xmlbeans.XmlString delegateSuggestedSigner);

    /**
     * Unsets the "DelegateSuggestedSigner" element
     */
    void unsetDelegateSuggestedSigner();

    /**
     * Gets the "DelegateSuggestedSigner2" element
     */
    java.lang.String getDelegateSuggestedSigner2();

    /**
     * Gets (as xml) the "DelegateSuggestedSigner2" element
     */
    org.apache.xmlbeans.XmlString xgetDelegateSuggestedSigner2();

    /**
     * True if has "DelegateSuggestedSigner2" element
     */
    boolean isSetDelegateSuggestedSigner2();

    /**
     * Sets the "DelegateSuggestedSigner2" element
     */
    void setDelegateSuggestedSigner2(java.lang.String delegateSuggestedSigner2);

    /**
     * Sets (as xml) the "DelegateSuggestedSigner2" element
     */
    void xsetDelegateSuggestedSigner2(org.apache.xmlbeans.XmlString delegateSuggestedSigner2);

    /**
     * Unsets the "DelegateSuggestedSigner2" element
     */
    void unsetDelegateSuggestedSigner2();

    /**
     * Gets the "DelegateSuggestedSignerEmail" element
     */
    java.lang.String getDelegateSuggestedSignerEmail();

    /**
     * Gets (as xml) the "DelegateSuggestedSignerEmail" element
     */
    org.apache.xmlbeans.XmlString xgetDelegateSuggestedSignerEmail();

    /**
     * True if has "DelegateSuggestedSignerEmail" element
     */
    boolean isSetDelegateSuggestedSignerEmail();

    /**
     * Sets the "DelegateSuggestedSignerEmail" element
     */
    void setDelegateSuggestedSignerEmail(java.lang.String delegateSuggestedSignerEmail);

    /**
     * Sets (as xml) the "DelegateSuggestedSignerEmail" element
     */
    void xsetDelegateSuggestedSignerEmail(org.apache.xmlbeans.XmlString delegateSuggestedSignerEmail);

    /**
     * Unsets the "DelegateSuggestedSignerEmail" element
     */
    void unsetDelegateSuggestedSignerEmail();

    /**
     * Gets the "ManifestHashAlgorithm" element
     */
    java.lang.String getManifestHashAlgorithm();

    /**
     * Gets (as xml) the "ManifestHashAlgorithm" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetManifestHashAlgorithm();

    /**
     * True if has "ManifestHashAlgorithm" element
     */
    boolean isSetManifestHashAlgorithm();

    /**
     * Sets the "ManifestHashAlgorithm" element
     */
    void setManifestHashAlgorithm(java.lang.String manifestHashAlgorithm);

    /**
     * Sets (as xml) the "ManifestHashAlgorithm" element
     */
    void xsetManifestHashAlgorithm(org.apache.xmlbeans.XmlAnyURI manifestHashAlgorithm);

    /**
     * Unsets the "ManifestHashAlgorithm" element
     */
    void unsetManifestHashAlgorithm();
}
