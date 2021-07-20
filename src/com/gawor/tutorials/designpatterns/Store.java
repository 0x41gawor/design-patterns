package com.gawor.tutorials.designpatterns;

import java.util.LinkedList;
import java.util.List;

//---// P U B L I S H E R
public class Store {
    //---// S U B S C R I B E R S
    private List<ISubscriber> subscribers = new LinkedList<>();

    //---// S U B S C R I B E
    public void subscribe(ISubscriber s) {
        subscribers.add(s);
    }
    //---// U N S U B S C R I B E
    public void unsubscribe(ISubscriber s) {
        subscribers.remove(s);
    }
    //---// N O T I F Y  S U B S C R I B E R S
    private void notifySubscribers(String context) {
        for (ISubscriber s: subscribers) {
            s.update(context);
        }
    }
    //---// M A I N  B U S I N E S S  L O G I C
    public void mainBusinessLogic() {
        System.out.println("Store: IPhone11 arrives!!!");
        notifySubscribers("IPhone11");
    }
}
