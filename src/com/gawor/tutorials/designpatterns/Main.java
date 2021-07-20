package com.gawor.tutorials.designpatterns;

/*
No need for Comments in this case:
//---// T H I S   C A S E
because everything is named with a design pattern naming conventions
 */

//---// C L I E N T   C O D E
public class Main {

    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
