package com.gawor.tutorials.designpatterns;

/*
Comments in this case:
//---// T H I S   C A S E
refer to image in `doc.md/Structure`
 */

/*
    Facebook keeps your friend in a collection called graph.
    Let's assume you've met Andrew in work and you added yourselves as friends of facebook.
    Now Facebook would like to propose some new friends for you based on this event. What Facebook will do?
    Iterate through Andrew friend list and create list based on the chance of you knowing them in real life.
    You met Andrew in work, so his coworkers will be the first ones on this list. And this is the clue!

    But it is also possible that Andrew's brother visited him in work and you met him also and we should take it into account.
    So Facebook creates list of Andrew in some order and shows you first `n` positions.

    But what if you met Andrew not in workplace, but on some party when he was with his friends?
    Facebook should iterate through Andrew's friends in different order.

    Facebook does not sort graph, it just iterates it in different manner.

    ***
    In this example we are build very bad code, to simplify the situation.
    We have Andrew profile. With hardcoded friend list sorted by how close Andrew is with them.
 */

//---// C L I E N T   C O D E
public class Main {

    public static void main(String[] args) {

        Profile Andrew = new Profile("Andrew");
        // You can see the same list, but iterated in different way
        Andrew.proposeForCoworker();
        Andrew.proposeForFamily();
        Andrew.proposeForBuddy();
    }
}
