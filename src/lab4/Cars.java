package lab4;

public class Cars implements Nameable {
    private String name;
    private String year;
    public Cars(String n, String y){
        this.name=n;
        this.year=y;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car name: "+name+" year: "+year;
    }
}
