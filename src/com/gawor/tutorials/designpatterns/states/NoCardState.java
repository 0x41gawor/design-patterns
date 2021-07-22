package com.gawor.tutorials.designpatterns.states;

import com.gawor.tutorials.designpatterns.ATMMachine;
import com.gawor.tutorials.designpatterns.IState;

//---// C O N C R E T E   S T A T E  A
public class NoCardState implements IState {

    //---// C O N T E X T
    ATMMachine context;
    //---// S E T  C O N T E X T ( )
    public void setContext(ATMMachine context) {
        this.context = context;
    }

    //--// D O  T H I S ( ),   D O  T H A T ( )
    @Override
    public void insertCard() {
        System.out.print("NoCardState::insertCard   || ");
        System.out.println("Card inserted");
        IState state = new HasCardState();
        context.changeState(state);
    }
    //--// D O  T H I S ( ),   D O  T H A T ( )
    @Override
    public void ejectCard() {
        System.out.print("NoCardState::ejectCard    || ");
        System.out.println("Cannot eject card from empty ATM");
    }
    //--// D O  T H I S ( ),   D O  T H A T ( )
    @Override
    public void enterPin() {
        System.out.print("NoCardState::enterPin     || ");
        System.out.println("Insert card to enter PIN");
    }
    //--// D O  T H I S ( ),   D O  T H A T ( )
    @Override
    public void requestCash() {
        System.out.print("NoCardState::requestCash  || ");
        System.out.println("Insert card first");
    }
}
