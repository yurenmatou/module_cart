package com.vincent.commonlibrary;

import java.util.UUID;

public class VincentUtils {


    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static void main(String[] args) {
        System.out.println(getUUID());
    }
}
