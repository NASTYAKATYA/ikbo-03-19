package pract10.pract10_1;

public class TestComplexAbstractFactory {
    public static void main(String[] args) {
        Complex complex1 = new Complex(5,0);
        Complex complex2 = new ConcreteFactory().createComplex();
        complex2.setReal(3);
        complex2.setImage(-1);
        System.out.println(complex1);
        System.out.println(complex2);

    }
}
