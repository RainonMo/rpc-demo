package com.yu.rpc.registry;

import com.yu.rpc.spi.SpiLoader;

public class RegistryFactory {
    static{
        SpiLoader.load(Registry.class);
    }

    private static final Registry DEFAULT_REGISTRY = new EtcdRegistry();

    public static Registry getInstance(String key){
        return SpiLoader.getInstance(Registry.class,key);
    }
}
