package pract5;

import java.util.Scanner;

public class Solution_4 {

    public static int recursion(int k,int s,int sum,int num,int res) {
        if(num<(int)Math.pow(10,k)){
            int n=num;
        while(num!=0){
          sum+=num%10;
          num=num/10;
      }
      if(sum==s){
       res++;
      }
      num=n;
        return recursion(k,s,0,num+1,res);
    }
        return  res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int k = sc.nextInt();
        int s=sc.nextInt();
        System.out.println( recursion(k,s,0, (int) Math.pow(10,k-1),0));// вызов рекурсивной функции
    }
}
