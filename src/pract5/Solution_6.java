package pract5;

import java.util.Scanner;

public class Solution_6 {
    public static int recursion(int n,int d,int k) {
        if (d!=1) {
            if(n%d==0)
                k++;
            return recursion(n,d-1,k);
        }

        return k;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if(recursion(n,n-1,0)==0)
            System.out.println("YES");
        else System.out.println("NO");// вызов рекурсивной функции
    }
}
