package lab4;
public class Planets implements Nameable {
    private String name;
    private int radius;
    public Planets(String n, int r){
        this.name=n;
        this.radius=r;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Planet name: "+name+" radius: "+radius+" km";
    }
}
