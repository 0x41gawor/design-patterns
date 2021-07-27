package com.gawor.tutorials.designpatterns;

/*
Comments in this case:
//---// T H I S   C A S E
refer to image in `doc.md/Structure`
 */

/*
 Note:
 Middleware refers to the cloud in the first image in `doc.md/problem`.
 */

import com.gawor.tutorials.designpatterns.handlers.BaseHandler;
import com.gawor.tutorials.designpatterns.handlers.DdosHandler;
import com.gawor.tutorials.designpatterns.handlers.RoleCheckHandle;
import com.gawor.tutorials.designpatterns.handlers.UserExistsHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//---// C L I E N T   C O D E
public class Main {

    private static Server server;

    private static void init() {
        server = new Server();

        server.register("admin@example.com", "admin");
        server.register("user@example.com", "user_password");

        // Here we are creating the Chain of Responsibility
        // (All checks are linked. Client can build various chains using the same components.
        BaseHandler middleware = new DdosHandler(2);
        middleware.setNext(new UserExistsHandler(server)).setNext(new RoleCheckHandle());

        // server gets a chain from client code
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {

        init();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
