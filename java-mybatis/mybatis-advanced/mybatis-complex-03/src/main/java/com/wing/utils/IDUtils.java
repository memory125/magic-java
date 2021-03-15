package com.wing.utils;

import java.util.UUID;

/**
 * @author memory125
 */
public class IDUtils {
    public static String generateID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
