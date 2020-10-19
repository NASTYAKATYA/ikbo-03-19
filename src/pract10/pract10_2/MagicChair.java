package pract10.pract10_2;

public class MagicChair implements Chair{
    public void doMagic() {
        System.out.println("Magic");
    }

    @Override
    public String toString() {
        return "Магический стул";
    }
}
