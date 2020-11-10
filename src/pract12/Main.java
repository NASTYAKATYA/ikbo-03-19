package pract12;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Person person1 = new Person("Бирюкова");
        System.out.println(person1);
        Person person2 = new Person("Бирюкова", "Екатерина", "Витальевна");
        System.out.println(person2);

        try {
            Address address = new Address("Россия, Брянская область, Брянск, улица Шоссейная, дом 43, корпус 1, квартира 1",", ");
            System.out.println(address);

            address = new Address("Россия, Брянская область, Брянск, улица Шоссейная, дом 43, корпус 1, квартира 1");
            System.out.println(address);

        } catch (Exception e) {
            e.printStackTrace();
        }

        String[] strings = new String[11];
        strings[0] = "S001,Black Polo Shirt,Black,XL";
        strings[1] = "S002,Black Polo Shirt,Black,L";
        strings[2] = "S003,Blue Polo Shirt,Blue,XL";
        strings[3] = "S004,Blue Polo Shirt,Blue,M";
        strings[4] = "S005,Tan Polo Shirt,Tan,XL";
        strings[5] = "S006,Black T-Shirt,Black,XL";
        strings[6] = "S007,White T-Shirt,White,XL";
        strings[7] = "S008,White T-Shirt,White,L";
        strings[8] = "S009,Green T-Shirt,Green,S";
        strings[9] = "S010,Orange T-Shirt,Orange,S";
        strings[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirt[] shirts = new Shirt().stringToShirt(strings);
        for (Shirt shirt : shirts)
            System.out.println(shirt);
        Phone phone = new Phone("88005553535");
        System.out.println("\n"+phone);

        File file=new File();
        file.main();
        System.out.println(file.getLine());
    }
}
