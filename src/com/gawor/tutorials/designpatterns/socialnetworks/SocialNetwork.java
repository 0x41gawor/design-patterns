package com.gawor.tutorials.designpatterns.socialnetworks;

//---// A B S T R A C T   C L A S S
public abstract class SocialNetwork {
    String userName;
    String password;
    SocialNetwork() {

    }

    //---// T E M P L A T E   M E T H O D  ( )
    public boolean post(String message) {
        //--// S T E P  1
        // Every network uses a different authentication method
        boolean isAuthorized = logIn(this.userName, this.password);
        if(isAuthorized) {
            //--// S T E P  2
            // Send the post data
            boolean result = sendData(message.getBytes());
            //--// S T E P  3
            // log out
            logOut();
            return result;
        }
        return false;
    }


    //--// S T E P 1 ( )
    abstract boolean logIn(String userName, String password);
    //--// S T E P 2 ( )
    abstract boolean sendData(byte[] data);
    //--// S T E P 3 ( )
    abstract void logOut();

}
