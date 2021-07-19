package com.gawor.tutorials.designpatterns;

//---// C O N C R E T E   C O M P O N E N T
public class Notifier implements INotifier {
    // This class defines the basic behavior

    //---// E X E C U T E ( )
    @Override
    public void send(String message) {
        System.out.println("Notifier: sending e-mails with message {" + message + "}");
    }
}
