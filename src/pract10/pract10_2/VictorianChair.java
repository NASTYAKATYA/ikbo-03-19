package pract10.pract10_2;

public class VictorianChair implements Chair{
    private int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Викторианский стул  возраст = " + age;
    }
}