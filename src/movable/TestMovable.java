package movable;

import shape.Circle;

public class TestMovable {
    public static void main (String[] args){
        Movable m1= new MovableCircle(0,0,1,2,5);
        String circle=m1.toString();
        System.out.println(circle);
        m1.moveDown();
        circle=m1.toString();
        System.out.println(circle);
        Movable m2= new MoveRectangle(0,0,3,4,1,5);
        String rectangle=m2.toString();
        System.out.println(rectangle);
    }
}
