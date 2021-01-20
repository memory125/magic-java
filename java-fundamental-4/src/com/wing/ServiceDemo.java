package com.wing;

import com.wing.impl.ConfigServiceImpl;
/**
 * @author memory125
 */
public class ServiceDemo {
    public static void main(String[] args) {
        ConfigServiceImpl configService = new ConfigServiceImpl();
        configService.config("IP Addr");
        configService.load();
        configService.stop();
    }
}
