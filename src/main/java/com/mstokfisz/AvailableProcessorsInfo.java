package com.mstokfisz;

public class AvailableProcessorsInfo implements JVMRuntimeInfo{
    @Override
    public long getCurrentInfo() {
        // Your code here
        return Runtime.getRuntime().availableProcessors();
    }
}
