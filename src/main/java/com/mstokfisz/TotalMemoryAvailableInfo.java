package com.mstokfisz;

public class TotalMemoryAvailableInfo implements JVMRuntimeInfo{

    @Override
    public long getCurrentInfo() {
        // Your code here
        return Runtime.getRuntime().totalMemory() / (1024 * 1024);
    }
}
