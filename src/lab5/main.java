package lab5;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

class TestShape extends JFrame {
    static int x0=50;
    static int y0=50;
    public static Shape getRandomShape() {
        Random random = new Random();
        int width = random.nextInt(50) + 50;
        int height = random.nextInt(50) + 50;
        int x = x0;
        int y = y0;
        if (x0 <= 850) {
            x0 +=150;
        } else {
            x0= 50;
            y0 += 150;
        }
        Color color =new Color((int) (Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255));
        switch (random.nextInt(3)) {
            case 0:
                return new Circle(x, y, color,  width / 2);
            case 1:
                return new Rectangle(x, y, color, width, height);
            case 2:
                return new Square(x, y, color, width);
        }
        return new Circle(x, y, color, width / 2);
    }

    public TestShape(){
        super("Test Shape");
        setSize(1200, 1200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane();
        for (int i = 0; i < 20; i++) {
            Shape figure = getRandomShape();
            figure.setBounds(0, 0,1200, 1200);
            lp.add(figure);
        }

    }

    public static void main(String[]args)
    {
        new TestShape().setVisible(true);;
    }
}


