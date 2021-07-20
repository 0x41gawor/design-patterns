package com.gawor.tutorials.designpatterns;

//---// C O N C R E T E   S U B S C R I B E R
public class CustomerB implements ISubscriber {
    String name;

    public CustomerB(String name) {
        this.name = name;
    }

    //---// U P D A T E
    @Override
    public void update(String context) {
        if (context != "IPhone 12") {
            System.out.println(name + ": Naaah, this product is not interesting for me");
        }
        else {
            System.out.println(name + ": Finally i can buy" + context + " for my little daughter");
        }
    }
}
