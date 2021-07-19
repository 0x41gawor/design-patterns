package com.gawor.tutorials.designpatterns;

// this class has a field referencing a wrapped object and that's all
// this class is never instantiated
// Decorators extending this class add some extra behavior to wrapped object (this can be done dynamically)

//---// B A S E   D E C O R A T O R
public class BaseDecorator implements INotifier{
    //---// T Y P E: C O M P O N E N T
    INotifier wrappee;

    protected BaseDecorator(INotifier notifier) {
        wrappee = notifier;
    }

    //---// E X E C U T E ( )
    @Override
    public void send(String message) {
        wrappee.send(message);
    }
}
