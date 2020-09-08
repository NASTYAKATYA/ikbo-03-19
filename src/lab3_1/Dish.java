package lab3_1;

public abstract class Dish {
    private String color;
    private int count;

    public String getColor() {
        return color;
    }

    public int getCount() {
        return count;
    }

    public Dish(String color, int count){


        this.color=color;
        this.count=count;
    }

    public abstract void displayInfo();
}

