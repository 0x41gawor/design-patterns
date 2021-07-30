package com.gawor.tutorials.designpatterns;

/*
Comments in this case:
//---// T H I S   C A S E
refer to image in `doc.md/Structure`
 */

/*
    In this example the *algorithm* in `Template Method's` context is:
    - Process of posting on SocialNetwork such as Facebook or Twitter
    so...
     Template Method pattern defines an algorithm of working with a social network.
     Subclasses that match a particular social network,
     implement these steps according to the API provided by the social network.
 */

import com.gawor.tutorials.designpatterns.socialnetworks.Facebook;
import com.gawor.tutorials.designpatterns.socialnetworks.SocialNetwork;
import com.gawor.tutorials.designpatterns.socialnetworks.Twitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//---// C L I E N T   C O D E
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        // Enter the message.
        System.out.print("Input message: ");
        String message = reader.readLine();

        SocialNetwork network = null;

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        // Create proper network object and send the message.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        // Call the `Template Method`
        network.post(message);
    }
}
