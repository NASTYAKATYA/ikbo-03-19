package lab4;

public class NameableTest {
    public static void main (String[] args){
        Nameable p1= new Planets("Earth",6371);
        String earth=p1.toString();
        System.out.println(earth);
        Nameable c1=new Cars("Volvo","2008");
        String volvo=c1.toString();
        System.out.println(volvo);

    }
}
