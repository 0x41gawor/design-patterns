package com.gawor.tutorials.designpatterns.handlers;

//---// B A S E   H A N D L E R
public abstract class BaseHandler implements IHandler
{
    private IHandler next;

    //---//  S E T  N E X T ( H :  H A N D L E R )
    @Override
    public IHandler setNext(IHandler handler) {
        this.next = handler;
        return next;
    }
    /**
     * Subclasses will implement this method with concrete checks.
     */
    //---//  H A N D L E  ( R E Q U E S T )
    @Override
    public abstract boolean handle(String email, String password);

    /**
     * Runs check on the next object in chain or ends traversing if we're in
     * last object in chain.
     */
    protected boolean handleNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.handle(email, password);
    }
}
