package com.BridgelabsLogical;

import java.util.Scanner;
//perfect number
public class PerfectNumber {
    public static void main(String[] args) {
        long n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n= sc.nextLong();
        int i=1; //executes until the condition become false
        while (i<=n/2){
            if (n%i==0) {
                sum = sum + i; //calculates the sum of factors
            }// end of if
            //after each iteration, increments the value of variable i by
            i++;
        }//end of while
        //compares sum with the number
        if (sum==n){
            System.out.println(n+"is a perfect number.");//prints if sum and n are equal
        }else {
            System.out.println(n + "is a not perfect number"); //prints if sum and n are not equal
        }
    }
}
