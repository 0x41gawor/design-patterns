package com.gawor.tutorials.designpatterns.handlers;

/*
    Check if this request is not a ddos attack
 */
//---// C O N C R E T E   H A N D L E R   1st
public class DdosHandler extends BaseHandler{
    private int requestPerMinute;
    private int request;
    private long currentTime;

    public DdosHandler(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    //---//  H A N D L E  ( R E Q U E S T )
    @Override
    public boolean handle(String email, String password) {
        System.out.println("DdosHandler says hello");
        if (System.currentTimeMillis() > currentTime + 60_000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }

        request++;

        if (request > requestPerMinute) {
            System.out.println("Request limit exceeded!");
            Thread.currentThread().stop();
        }
        return handleNext(email, password);
    }
}
