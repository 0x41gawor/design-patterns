package com.gawor.tutorials.designpatterns;

import com.gawor.tutorials.designpatterns.collection.Friends;
import com.gawor.tutorials.designpatterns.iterators.BuddyIterator;
import com.gawor.tutorials.designpatterns.iterators.FamilyIterator;
import com.gawor.tutorials.designpatterns.iterators.IIterator;
import com.gawor.tutorials.designpatterns.iterators.WorkIterator;

public class Profile {
    String name;
    // Single object
    Friends friendList;
    IIterator iterator;

    public Profile(String name) {
        friendList = new Friends();
        this.name = name;
    }

    public void proposeForCoworker() {
        iterator = new WorkIterator(friendList);
        System.out.println("---CoWorkers---");
        System.out.print("[ ");
        while (iterator.hasMore()) {
            System.out.print(iterator.getNext() + "; ");
        }System.out.println("]");
        System.out.println("---------------");
    }

    public void proposeForFamily() {
        iterator = new FamilyIterator(friendList);
        System.out.println("----Family-----");
        System.out.print("[ ");
        while (iterator.hasMore()) {
            System.out.print(iterator.getNext() + "; ");
        }System.out.println("]");
        System.out.println("---------------");
    }

    public void proposeForBuddy() {
        iterator = new BuddyIterator(friendList);
        System.out.println("-----Buddy-----");
        System.out.print("[ ");
        while (iterator.hasMore()) {
            System.out.print(iterator.getNext() + "; ");
        }System.out.println("]");
        System.out.println("---------------");
    }
}
