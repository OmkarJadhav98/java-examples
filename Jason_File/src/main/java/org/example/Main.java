package org.example;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Read data from a JSON file
        try (FileReader reader = new FileReader("data.json")) {
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

            String name = (String) jsonObject.get("name");
            long age = (long) jsonObject.get("age"); // Assuming age is stored as a number
            System.out.println("Name: " + name + ", Age: " + age);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        // Write data to a JSON file
        JSONObject newData = new JSONObject();
        newData.put("name", "John Doe");
        newData.put("age", 30);
        try (FileWriter writer = new FileWriter("new_data.json")) {
            writer.write(newData.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
