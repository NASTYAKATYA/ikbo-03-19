package lab5;

import java.awt.*;

public class Rectangle extends  Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y, Color color,int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.setColor(getColor());
        gr2d.fillRect(getXVar(), getYVar(), width, height);
        gr2d.setColor(Color.RED);
        gr2d.drawString("",getXVar() + width/3, getYVar() + height/3);
    }
}
