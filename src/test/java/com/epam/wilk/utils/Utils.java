package com.epam.wilk.utils;

public class Utils {
    public static String getNewEmailAddress(){
        return System.currentTimeMillis() + Constants.NEW_EMAIL;
    }
}
