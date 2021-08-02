package com.gawor.tutorials.designpatterns.collection;

import com.gawor.tutorials.designpatterns.iterators.BuddyIterator;
import com.gawor.tutorials.designpatterns.iterators.FamilyIterator;
import com.gawor.tutorials.designpatterns.iterators.IIterator;
import com.gawor.tutorials.designpatterns.iterators.WorkIterator;

import java.util.ArrayList;
import java.util.List;

//---// C O N C R E T E   C O L L E C T I O N
public class Friends implements IIterableCollection {

    List<String> list;

    public Friends() {
        list = new ArrayList<>();
        list.add("John - coworker");
        list.add("Jolie - spouse");
        list.add("Adam - brother");
        list.add("Beth - sister");
        list.add("Tim - childhood best friend");
        list.add("Adam - coworker");
        list.add("Amanda - coworker");
        list.add("Carlos - amigo");
    }

    public List<String> getList() {
        return list;
    }

    @Override
    public IIterator createIterator(String type) {
        IIterator iterator = null;
        switch (type) {
            case "family":
            {
                iterator = new FamilyIterator(this);
                break;
            }
            case "work":
            {
                iterator = new WorkIterator(this);
                break;
            }
            default: //"buddy" + default
            {
                iterator = new BuddyIterator(this);
                break;
            }
        }
        return iterator;
    }
}
