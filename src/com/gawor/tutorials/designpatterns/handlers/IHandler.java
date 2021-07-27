package com.gawor.tutorials.designpatterns.handlers;

//---// I N T E R F A C E   H A N D L E R
public interface IHandler {
    //---//  S E T  N E X T ( H :  H A N D L E R )
    public IHandler setNext(IHandler handler);
    //---// H A N D L E  ( R E Q U E S T )
    public boolean handle(String email, String password);

    //NOTE setNext return IHandler so u can use multiple `.` operator.
}
