package com.gawor.tutorials.designpatterns;

/*
Comments in this case:
//---// T H I S   C A S E
refer to image in `doc.md/Structure`
 */

import com.gawor.tutorials.designpatterns.states.NoCardState;
//---// C L I E N T   C O D E
public class Main {

    public static void main(String[] args) {

        IState initialState = new NoCardState();
        ATMMachine atm = new ATMMachine(initialState);

        atm.insertCard();
        atm.enterPin();
        atm.requestCash();

        atm.insertCard();
        atm.ejectCard();
    }
}
