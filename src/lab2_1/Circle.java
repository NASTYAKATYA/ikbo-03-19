package lab2_1;

public class Circle {
    private float radius;
    private String color;
    public Circle(float r, String c) {
        radius=r;
        color=c;
    }

    public float getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


