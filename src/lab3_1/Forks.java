package lab3_1;

public class Forks extends Dish{
    private String manufact;

    public Forks(String color, int count, String manufact) {

        super(color, count);
        this.manufact=manufact;
    }

    public void displayInfo(){

        System.out.println("Цвет: " + super.getColor() + " Количество: "
                + super.getCount() + " Производитель: " + manufact);
    }
}
