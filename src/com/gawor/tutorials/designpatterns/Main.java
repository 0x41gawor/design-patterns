package com.gawor.tutorials.designpatterns;

/*
Comments in this case:
//---// T H I S   C A S E
refer to image in `doc.md/Structure`
 */


//---// C L I E N T   C O D E
public class Main {

    public static void main(String[] args)  {

        // We create a cloneable circle
        Circle circle = new Circle(10, 20, "red", 15);
        // And then we clone it into different object
        Circle anotherCircle = (Circle) circle.clone();


        if (circle != anotherCircle) {
            System.out.println("Shapes are different objects (yay!)");
            if (circle.equals(anotherCircle)) {
                System.out.println("And they are identical (yay!)");
            } else {
                System.out.println("But they are not identical (booo!)");
            }
        } else {
            System.out.println("Shape objects are the same (booo!)");
        }
    }
}
