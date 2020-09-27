package pract5;

import java.util.Scanner;
public class Solution_5 {

    public static int recursion(int n,int s) {
        if (n !=0) {
            s+=n%10;
            return recursion(n/10,s);
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int s=0;
        System.out.println(recursion(n,s) );// вызов рекурсивной функции
    }
}
