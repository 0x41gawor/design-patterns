package com.gawor.tutorials.designpatterns;

// Problem is described in `Problem` section in `doc.md`.

import com.gawor.tutorials.designpatterns.decorators.FacebookDecorator;
import com.gawor.tutorials.designpatterns.decorators.SMSDecorator;
import com.gawor.tutorials.designpatterns.decorators.SlackDecorator;

public class Main {

    public static void main(String[] args) {

        // Client Anton wants to have pure Notifier
        INotifier A = new Notifier();
        A.send("Anton - pure");

        System.out.println("----------------");

        // Client Bartek wants to have Slack Notifications also included
        INotifier B = new Notifier();
        B = new SlackDecorator(B);
        B.send("Bartek - pure + slack");

        System.out.println("----------------");

        // Client Carla wants to have Slack + Facebook + SMS and pure notifications
        INotifier C = new Notifier();
        C = new SlackDecorator(C);
        C = new FacebookDecorator(C);
        C = new SMSDecorator(C);
        C.send("Carla - pure + slack + facebook + sms");
    }
}
