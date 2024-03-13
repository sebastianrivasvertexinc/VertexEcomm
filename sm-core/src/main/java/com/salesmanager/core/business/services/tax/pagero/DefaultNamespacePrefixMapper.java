package com.salesmanager.core.business.services.tax.pagero;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

import java.util.HashMap;
import java.util.Map;

public class DefaultNamespacePrefixMapper extends NamespacePrefixMapper {

    private Map<String, String> namespaceMap = new HashMap<>();

    /**
     * Create mappings.
     */
    public DefaultNamespacePrefixMapper() {
        namespaceMap.put("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "cbc");
        namespaceMap.put("urn:pagero:CommonAggregateComponents:1.0", "cac");
        namespaceMap.put("urn:pagero:ExtensionComponent:1.0", "puf");
        namespaceMap.put("urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", "ext");
        namespaceMap.put("urn:pagero:PageroUniversalFormat:Invoice:1.0", "");
    }

    /* (non-Javadoc)
     * Returning null when not found based on spec.
     * @see com.sun.xml.bind.marshaller.NamespacePrefixMapper#getPreferredPrefix(java.lang.String, java.lang.String, boolean)
     */
    @Override
    public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
        return namespaceMap.getOrDefault(namespaceUri, suggestion);
    }
}