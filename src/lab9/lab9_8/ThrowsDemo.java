package lab9.lab9_8;

import java.util.Scanner;
public class ThrowsDemo {
    public void getKey()  {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter Key ");
        while (myScanner.hasNextLine()) {
            try {
                String key = myScanner.nextLine();
                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println("is empty, try again");
            }
        }
    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message ); }
    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
    public static void main(String[] args) {

        ThrowsDemo td = new ThrowsDemo();
        td.getKey();
    }
}

