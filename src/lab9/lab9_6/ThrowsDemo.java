package lab9.lab9_6;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        try {
            printDetails( key );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );

    }
    private String getDetails(String key) throws Exception {
        if(key == "") {
                throw new Exception( "Key set to empty string" );
        }
        return "data for " + key; }
    public static void main(String[] args){

        ThrowsDemo td = new ThrowsDemo();
        td.getKey();
    }
}
