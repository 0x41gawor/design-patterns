package com.gawor.tutorials.designpatterns;

//---// C O N T E X T
public class ATMMachine {

    //---// S T A T E
    IState state;

    private final String correctPin = "1234";
    private int money = 2000;

    //---// C O N T E X T ( )
    public ATMMachine(IState initialState) {
        state = initialState;
        state.setContext(this);
    }
    //---// C H A N G E  S T A T E ( )
    public void changeState(IState state) {
        this.state = state;
        state.setContext(this);
    }

    //---// D O  T H I S ( ),  D O  T H A T ( )
    public void insertCard() {
        state.insertCard();
    }

    public void ejectCard() {
        state.ejectCard();
    }

    public void enterPin() {
        state.enterPin();
    }

    public void requestCash() {
        state.requestCash();
    }

    // ATM specific methods
    public String getCorrectPin() {
        return correctPin;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
}
