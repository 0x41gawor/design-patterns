package com.gawor.tutorials.designpatterns.handlers;

import com.gawor.tutorials.designpatterns.Server;

//---// C O N C R E T E   H A N D L E R   2nd
public class UserExistsHandler extends BaseHandler{

    public Server server;

    public UserExistsHandler(Server server) {
        this.server = server;
    }

    //---//  H A N D L E  ( R E Q U E S T )
    @Override
    public boolean handle(String email, String password) {
        System.out.println("UserExistsHandler says hello");
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return handleNext(email, password);
    }
}
