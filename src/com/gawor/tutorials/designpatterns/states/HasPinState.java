package com.gawor.tutorials.designpatterns.states;

import com.gawor.tutorials.designpatterns.ATMMachine;
import com.gawor.tutorials.designpatterns.IState;

import java.util.Scanner;

//---// C O N C R E T E   S T A T E  C
public class HasPinState implements IState {

    //---// C O N T E X T
    ATMMachine context;
    //---// S E T  C O N T E X T ( )
    public void setContext(ATMMachine context) {
        this.context = context;
    }

    //--// D O  T H I S ( ),   D O  T H A T ( )
    @Override
    public void insertCard() {
        System.out.print("HasPinState::insertCard   || ");
        System.out.println("Cannot insert second card");
    }
    //--// D O  T H I S ( ),   D O  T H A T ( )
    @Override
    public void ejectCard() {
        System.out.print("HasPinState::ejectCard    || ");
        System.out.println("Ejecting card");
        IState state = new NoCardState();
        context.changeState(state);
    }
    //--// D O  T H I S ( ),   D O  T H A T ( )
    @Override
    public void enterPin() {
        System.out.print("HasPinState::enterPin     || ");
        System.out.println("Pin already entered");
    }
    //--// D O  T H I S ( ),   D O  T H A T ( )
    @Override
    public void requestCash() {
        System.out.print("HasPinState::requestCash  || ");
        System.out.print("How much money: ");
        Scanner in = new Scanner(System.in);
        int requestedCash = in.nextInt();
        int newAmount = context.getMoney() - requestedCash;
        if (newAmount < 0) {
            System.out.print("HasPinState::requestCash  || ");
            System.out.println("You can withdraw money in amount of maximum: " + context.getMoney());
        }
        else if (newAmount == 0){
            System.out.print("HasPinState::requestCash  || ");
            System.out.println("Money Withdrawn");
            context.setMoney(newAmount);
            IState state = new NoCashState();
            context.changeState(state);
        }
        else {
            System.out.print("HasPinState::requestCash  || ");
            System.out.println("Money Withdrawn");
            context.setMoney(newAmount);
        }
        System.out.print("HasPinState::requestCash  || ");
        System.out.print("Do you want to logout or next request?\t Type 'y' for next request or anything to logout: ");
        in.nextLine(); // need to do this to throw away '\n' not consumed by `in.nextInt()` before
        String sel =  in.nextLine();
        if (sel.equals("y")) {
            IState state = new HasPinState();
            context.changeState(state);
            context.requestCash();
        }
        else {
            System.out.print("HasPinState::requestCash  || ");
            System.out.println("Logging out, Ejecting card");
            IState state = new NoCardState();
            context.changeState(state);
        }
    }
}
