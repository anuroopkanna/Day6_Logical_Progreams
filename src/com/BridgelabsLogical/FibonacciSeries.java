package com.BridgelabsLogical;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n,a=0,b=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value: ");
         n= sc.nextInt();
        for (int i=1;i<=n;++i){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
        }
    }
}