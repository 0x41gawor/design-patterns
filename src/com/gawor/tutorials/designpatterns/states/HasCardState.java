package com.gawor.tutorials.designpatterns.states;

import com.gawor.tutorials.designpatterns.ATMMachine;
import com.gawor.tutorials.designpatterns.IState;

import java.util.Scanner;

//---// C O N C R E T E   S T A T E  B
public class HasCardState implements IState {

    //---// C O N T E X T
    ATMMachine context;
    //---// S E T  C O N T E X T ( )
    public void setContext(ATMMachine context) {
        this.context = context;
    }


    //--// D O  T H I S ( ),   D O  T H A T ( )
    @Override
    public void insertCard() {
        System.out.print("HasCardState::insertCard  || ");
        System.out.println("Cannot insert second card");
    }
    //--// D O  T H I S ( ),   D O  T H A T ( )
    @Override
    public void ejectCard() {
        System.out.print("HasCardState::ejectCard   || ");
        System.out.println("Card ejected");
        IState state = new NoCardState();
        context.changeState(state);
    }
    //--// D O  T H I S ( ),   D O  T H A T ( )
    @Override
    public void enterPin() {
        System.out.print("HasCardState::enterPin    || ");
        System.out.print("Enter pin: ");
        Scanner in = new Scanner(System.in);
        String pin = in.nextLine();
        System.out.print("HasCardState::enterPin    || ");
        if (pin.equals(context.getCorrectPin())) {
            System.out.println("Correct pin");
            IState state = new HasPinState();
            context.changeState(state);
        }
        else {
            System.out.println("Wrong pin. Ejecting card");
            IState state = new NoCardState();
            context.changeState(state);
        }
    }
    //--// D O  T H I S ( ),   D O  T H A T ( )
    @Override
    public void requestCash() {
        System.out.print("HasCardState::requestCash || ");
        System.out.println("Cannot request cash, enter correct pin first");
    }
}
