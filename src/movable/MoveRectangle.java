package movable;

public class MoveRectangle implements Movable {
    private  MovablePoint topLeft;
    private MovablePoint bottomRight;
    public  MoveRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        this.topLeft=new MovablePoint(x1,y1,xSpeed,ySpeed);
        this.bottomRight=new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    @Override
    public String toString() {
        return "Rectangle topLeft = " + topLeft + ", bottomRight = " + bottomRight ;
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();;
        bottomRight.moveDown();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
}
