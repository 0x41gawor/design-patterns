package com.gawor.tutorials.designpatterns.iterators;

import com.gawor.tutorials.designpatterns.collection.Friends;

//---// C O N C R E T E   I T E R A T O R   1
public class FamilyIterator implements IIterator {
    //---// C O N C R E T E   C O L L E C T I O N
    Friends friendList;
    //---// I T E R A T I O N   S T A T E
    int iterationState;

    public FamilyIterator(Friends friendList) {
        this.iterationState = -1;
        // Here we configure our iterator to iterate by family. Code simplified as if it was wrote by 5yo kid
        this.friendList = friendList;
        this.friendList.getList().clear();
        this.friendList.getList().add("Adam - brother");
        this.friendList.getList().add("Beth - sister");
        this.friendList.getList().add("Jolie - spouse");
        this.friendList.getList().add("Tim - childhood best friend");
        this.friendList.getList().add("Carlos - amigo");
        this.friendList.getList().add("John - coworker");
        this.friendList.getList().add("Adam - coworker");
        this.friendList.getList().add("Amanda - coworker");
    }

    @Override
    public String getNext() {
        iterationState++;
        return friendList.getList().get(iterationState);
    }

    @Override
    public boolean hasMore() {
        return iterationState < friendList.getList().size()-1;
    }
}
