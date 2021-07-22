package com.gawor.tutorials.designpatterns;

//--// S T A T E  I N T E R F A C E
public interface IState {
    //--// D O  T H I S ( ),   D O  T H A T ( )
    public void insertCard();
    public void ejectCard();
    public void enterPin();
    public void requestCash();

    //--// Also common for all concrete states but no included on the image
    public void setContext(ATMMachine context);
}
