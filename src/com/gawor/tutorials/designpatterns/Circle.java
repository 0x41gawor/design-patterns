package com.gawor.tutorials.designpatterns;

//---// S U B C L A S S   P R O T O T Y P E
public class Circle extends Shape{

    //---// F I E L D   2
    private int radius;

    // default constructor
    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    //---// S U B C L A S S   P R O T O T Y P E (  P R O T O T Y P E  )
    public Circle(Circle source) {
        super(source);
        if (source != null) {
            this.radius = source.radius;
        }
    }

    //---// C L O N E ( )
    @Override
    public Shape clone() {
        return  new Circle(this);
    }

    // In Java we need to override `equals` method to have correct `equals` method for our class
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
        Circle shape2 = (Circle) object2;
        return shape2.radius == radius;
    }
}
