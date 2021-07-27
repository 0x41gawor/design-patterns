package com.gawor.tutorials.designpatterns;

/*
Comments in this case:
//---// T H I S   C A S E
refer to image in `doc.md/Structure`
 */

/*
 In this example we have a various ways in which GUI layer can request some Business layer action.

 */

//---// C L I E N T   C O D E
public class Main {

    public static void main(String[] args) {

        Editor editor = new Editor();
        editor.init();
    }
}
