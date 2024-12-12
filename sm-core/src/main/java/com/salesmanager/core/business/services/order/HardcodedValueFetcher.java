package com.salesmanager.core.business.services.order;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HardcodedValueFetcher {

    private static JSONObject data; // JSON object to store file contents in memory
    private static final String filePath = "eInvoicing.cfg"; // Path to the JSON file

    // Static block to load JSON data into memory
    static {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonContent.append(line);
            }
            data = new JSONObject(jsonContent.toString()); // Parse JSON data
        } catch (IOException e) {
            System.err.println("Error reading JSON file: " + e.getMessage());
            data = new JSONObject(); // Initialize empty JSON object on error
        }
    }

    /**
     * Retrieves the hardcoded value for the given code and type.
     *
     * @param code The code to look up.
     * @param type The type to look up.
     * @return The corresponding value as a String, or a default message if not found.
     */
    public static String getHardcodedValue(String code, String type) {
        if (data.has(code)) {
            JSONObject codeData = data.getJSONObject(code);
            if (codeData.has(type)) {
                return codeData.getString(type); // Return the matched value
            }
        }
        return "";
    }


}
