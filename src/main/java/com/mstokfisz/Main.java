package com.mstokfisz;

public class Main {

    public static void main(String[] args) {
        JVMRuntimeInfo availableProcessorsInfo = new AvailableProcessorsInfo();
        JVMRuntimeInfo totalMemoryAvailableInfo = new TotalMemoryAvailableInfo();
        JVMRuntimeInfo freeMemoryInfo = new FreeMemoryInfo();
        long availableProcessors = availableProcessorsInfo.getCurrentInfo();
        long totalMemoryAvailable = totalMemoryAvailableInfo.getCurrentInfo();
        long freeMemory = freeMemoryInfo.getCurrentInfo();
        InfoSaver jsonSaver = new JsonSaver();
        InfoSaver txtSaver = new TxtSaver();
        jsonSaver.saveInformation(freeMemory, totalMemoryAvailable, availableProcessors);
        txtSaver.saveInformation(freeMemory, totalMemoryAvailable, availableProcessors);
    }
}
