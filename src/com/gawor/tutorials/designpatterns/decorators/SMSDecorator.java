package com.gawor.tutorials.designpatterns.decorators;

import com.gawor.tutorials.designpatterns.BaseDecorator;
import com.gawor.tutorials.designpatterns.INotifier;

//---// C O N C R E T E   D E C O R A T O R   A
public class SMSDecorator extends BaseDecorator {

    public SMSDecorator(INotifier notifier) {
        super(notifier);
    }

    //---// E X E C U T E ( )
    @Override
    public void send(String message) {
        super.send(message);
        extra(message);
    }
    //---// E X T R A ( )
    private void extra(String message) {
        System.out.println("SMSDecorator: sending SMSes with message {" + message + "}");
    }
}
