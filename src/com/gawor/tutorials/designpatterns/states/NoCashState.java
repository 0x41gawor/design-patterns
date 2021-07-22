package com.gawor.tutorials.designpatterns.states;

import com.gawor.tutorials.designpatterns.ATMMachine;
import com.gawor.tutorials.designpatterns.IState;

//---// C O N C R E T E   S T A T E  D
public class NoCashState implements IState {

    //---// C O N T E X T
    ATMMachine context;
    //---// S E T  C O N T E X T ( )
    public void setContext(ATMMachine context) {
        this.context = context;
    }

    //--// D O  T H I S ( ),   D O  T H A T ( )
    @Override
    public void insertCard() {
        System.out.print("NoCashState::insertCard   || ");
        System.out.println("No cash in machine, just wait for maintainer to fill it");
    }
    //--// D O  T H I S ( ),   D O  T H A T ( )
    @Override
    public void ejectCard() {
        System.out.print("NoCashState::ejectCard    || ");
        System.out.println("No cash in machine, just wait for maintainer to fill it");
    }
    //--// D O  T H I S ( ),   D O  T H A T ( )
    @Override
    public void enterPin() {
        System.out.print("NoCashState:: enterPin    || ");
        System.out.println("No cash in machine, just wait for maintainer to fill it");
    }
    //--// D O  T H I S ( ),   D O  T H A T ( )
    @Override
    public void requestCash() {
        System.out.print("NoCashState::requestCash  || ");
        System.out.println("No cash in machine, just wait for maintainer to fill it");
    }
}
