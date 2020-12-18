package com.mstokfisz;

public class FreeMemoryInfo implements JVMRuntimeInfo{
    @Override
    public long getCurrentInfo() {
        return Runtime.getRuntime().freeMemory() / (1024 * 1024);
    }
}
