package com.mstokfisz;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonSaver implements InfoSaver {

    @Override
    public void saveInformation(long freeMemory, long availableMemory, long availableProcessors) {
        JSONObject runtimeInfo = new JSONObject();
        runtimeInfo.put("Free Memory", freeMemory);
        runtimeInfo.put("Available Memory", availableMemory);
        runtimeInfo.put("Available Processors", availableProcessors);
        try (FileWriter file = new FileWriter("systemInfo.json")) {
            file.write(runtimeInfo.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
