package com.mstokfisz;

public class AvailableProcessorsInfo implements JVMRuntimeInfo{
    @Override
    public long getCurrentInfo() {
        return Runtime.getRuntime().availableProcessors();
    }
}
