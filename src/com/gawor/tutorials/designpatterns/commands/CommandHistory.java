package com.gawor.tutorials.designpatterns.commands;

import java.util.Stack;

public class CommandHistory {
    private Stack<Command> stack = new Stack<>();

    public void push(Command c) {
        stack.push(c);
    }

    public Command pop() {
        return stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
