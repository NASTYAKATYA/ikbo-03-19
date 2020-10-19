package pract10.pract10_1;

public class Complex {
    private int real;
    private int image;

    Complex(){}

    Complex(int real, int image){
        this.real = real;
        this.image = image;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "real = " + real + " image = " + image;
    }
}
