package com.gawor.tutorials.designpatterns;

//---// C O N C R E T E   P R O T O T Y P E
public abstract class Shape implements ICloneable{

    //---// F I E L D  1 etc..
    private int x;
    private int y;
    private String color;


    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    //---// C O N C R E T E   P R O T O T Y P E (  P R O T O T Y P E  )
    // we use this method to implement cloning
    // it is called the copy constructor
    protected Shape(Shape source) {
        if (source != null) {
            this.x = source.x;
            this.y = source.y;
            this.color = source.color;
        }
    }

    //---// C L O N E ( )
    public abstract Shape clone();

    // In Java we need to override `equals` method to have correct `equals` method for our class
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)) return false;
        Shape shape2 = (Shape) object2;
        return shape2.x == x && shape2.y == y && shape2.color.equals(color);
    }
}
