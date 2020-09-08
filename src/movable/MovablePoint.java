package movable;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    public MovablePoint(int x, int y,int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    @Override
    public String toString() {
        return "Point (" + "x = " + x + ", y = " + y + ")";
    }

    @Override
    public void moveUp() {
        this.y+=ySpeed;
    }

    @Override
    public void moveDown() {
        this.y-=ySpeed;
    }

    @Override
    public void moveRight() {
        this.x+=xSpeed;
    }

    @Override
    public void moveLeft() {
        this.x-=xSpeed;
    }
}
