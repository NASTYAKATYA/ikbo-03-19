package lab2_1;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle=new Circle(5,"blue");
        circle.setRadius(10);
        System.out.println("Новый радиус: "+circle.getRadius());
    }
}
