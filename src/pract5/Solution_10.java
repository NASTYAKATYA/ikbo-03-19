package pract5;

import java.util.Scanner;

public class Solution_10 {

        public static int recursion(int n) {
            if (n !=0) {
                System.out.print(n%10);
                return recursion(n/10);
            }

            return n;

        }
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int n = sc.nextInt();
            recursion(n); // вызов рекурсивной функции
        }
    }


