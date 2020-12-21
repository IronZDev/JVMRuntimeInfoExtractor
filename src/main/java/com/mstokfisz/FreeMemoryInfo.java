package com.mstokfisz;

public class FreeMemoryInfo implements JVMRuntimeInfo{
    @Override
    public long getCurrentInfo() {
        // Your code here
        return Runtime.getRuntime().freeMemory()/(1024 * 1024);
    }
}
