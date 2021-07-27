package com.gawor.tutorials.designpatterns.handlers;



//---// C O N C R E T E   H A N D L E R   3rd
public class RoleCheckHandle extends BaseHandler {

    // it's not first element in the chain, so it does not need `server` field

    //---//  H A N D L E  ( R E Q U E S T )
    @Override
    public boolean handle(String email, String password) {
        System.out.println("RoleCheckHandler says hello");
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return handleNext(email, password);
    }
}
