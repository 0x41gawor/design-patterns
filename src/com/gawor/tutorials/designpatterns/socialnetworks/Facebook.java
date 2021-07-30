package com.gawor.tutorials.designpatterns.socialnetworks;

//---// C O N C R E T E   C L A S S   1
public class Facebook extends SocialNetwork{

    public Facebook(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    //--// S T E P 1 ( )
    @Override
    boolean logIn(String userName, String password) {
        System.out.println("\nFacebook is checking your credentials:");
        System.out.println("-   Name:" + userName);
        System.out.print("-   Password: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }
        System.out.println("\n\nLogIn Success. Mark Zuckerberg welcomes you");
        return true;
    }

    //--// S T E P 2 ( )
    @Override
    boolean sendData(byte[] data) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Message: '" + new String(data) + "' was posted on Facebook");
            return true;
        } else {
            return false;
        }
    }

    //--// S T E P 3 ( )
    @Override
    void logOut() {
        System.out.println("User: '" + userName + "' was logged out from Facebook");
    }
}
