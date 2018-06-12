package com.company.details;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by student on 6/12/2018.
 */
public class ResourceBundleDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        printTopics(new Locale("ru", "RU"));
        printTopics(new Locale("uk", "UA"));
        printTopics(Locale.ENGLISH);
    }

    public static void printTopics(Locale locale) throws UnsupportedEncodingException {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("topic", locale);
        for (String key : resourceBundle.keySet()) {
            String value = resourceBundle.getString(key);
            value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
            System.out.println(value);
        }

    }
}
