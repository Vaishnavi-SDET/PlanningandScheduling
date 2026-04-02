package utils;

import org.json.JSONObject;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SchedulingJsonReader {

    private static JSONObject jsonObject;

    static {
        try {
            InputStream is = SchedulingJsonReader.class
                    .getClassLoader()
                    .getResourceAsStream("SchedulingData/SchedulingTest.json");

            if (is == null) {
                throw new RuntimeException("JSON file not found in resources folder");
            }

            String content = new Scanner(is, StandardCharsets.UTF_8)
                    .useDelimiter("\\A")
                    .next();

            jsonObject = new JSONObject(content);

            System.out.println("JSON Loaded Successfully ✅");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getValue(String section, String key) {
        return jsonObject.getJSONObject(section).getString(key);
    }
}