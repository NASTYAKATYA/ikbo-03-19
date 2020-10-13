package pract9.pract9_1;

import java.util.Scanner;

public class OrderRegistration {
    String fio;
    String inn;
    OrderRegistration(String fio, String inn) throws BadINNException {
        this.fio=fio;
        if(!inn.matches("[0-9]+")){
            throw new BadINNException("нельзя вводить буквы");
        }
        if (inn.length()!=12){
            throw  new BadINNException("не 12 цифр");
        }

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        try {
            OrderRegistration or=new OrderRegistration(sc.next(),sc.next());
        } catch (BadINNException e) {
            e.printStackTrace();
        }

    }
}
