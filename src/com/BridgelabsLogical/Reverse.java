package com.BridgelabsLogical;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int num,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number; ");
        num= sc.nextInt();
        while (num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        System.out.println("Reverse num: " + rev);
    }
}
