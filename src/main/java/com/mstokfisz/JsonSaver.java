package com.mstokfisz;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonSaver implements InfoSaver {

    @Override
    public void saveInformation(long freeMemory, long availableMemory, long availableProcessors) {
        JSONObject information = new JSONObject();

        information.put("Free memory", freeMemory);
        information.put("Available memory", availableMemory);
        information.put("Available processors", availableProcessors);

        try (FileWriter file = new FileWriter("information.json")) {
            file.write(information.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
