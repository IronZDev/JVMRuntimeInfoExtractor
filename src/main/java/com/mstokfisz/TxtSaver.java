package com.mstokfisz;

import java.io.FileWriter;
import java.io.IOException;

public class TxtSaver implements InfoSaver {
    @Override
    public void saveInformation(long freeMemory, long availableMemory, long availableProcessors) {
        // Your code here
        try {
            FileWriter file = new FileWriter("systemInfo.txt");
            file.write("Free Memory: " + freeMemory + " MB\n");
            file.write("Available Memory: " + availableMemory + " MB\n");
            file.write("Available Processors: " + availableProcessors + "\n");
            file.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
