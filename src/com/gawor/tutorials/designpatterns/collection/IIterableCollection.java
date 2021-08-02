package com.gawor.tutorials.designpatterns.collection;

import com.gawor.tutorials.designpatterns.iterators.IIterator;

//---// I T E R A B L E   C O L L E C T I O N
public interface IIterableCollection {
    public IIterator createIterator(String type);
}
