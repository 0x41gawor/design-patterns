package com.gawor.tutorials.designpatterns;

import com.gawor.tutorials.designpatterns.handlers.BaseHandler;

import java.util.HashMap;
import java.util.Map;

//---// Client aux class
public class Server {
    private Map<String, String> users = new HashMap<>();
    private BaseHandler middleware;

    public void setMiddleware(BaseHandler middleware) {
        this.middleware = middleware;
    }

    public boolean logIn(String email, String password) {
        if (middleware.handle(email, password)) {
            System.out.println("Authorization have been successful!");

            // Do something useful here for authorized users.

            return true;
        }
        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}
