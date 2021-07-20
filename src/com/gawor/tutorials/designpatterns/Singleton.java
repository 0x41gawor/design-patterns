package com.gawor.tutorials.designpatterns;

public class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            // Note: if you're creating an app with multithreading, you should place a thread lock here
            // https://refactoring.guru/design-patterns/singleton/java/example#example-2
            instance = new Singleton(value);
        }
        return instance;
    }
}
