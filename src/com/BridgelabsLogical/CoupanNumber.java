package com.BridgelabsLogical;

import java.util.Scanner;

public class CoupanNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the coupan values: ");
        int n= sc.nextInt();
        char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
        int max=1000000;
        int random=(int) (Math.random()*max);
        StringBuffer sb=new StringBuffer();
        while (random>0){
            sb.append(chars[random % chars.length]);
            random/= chars.length;
        }
        String coupanCode= sb.toString();
        System.out.println("CoupanCode " +coupanCode);
    }
}
