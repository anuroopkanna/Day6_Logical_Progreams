package com.BridgelabsLogical;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
     double diff;
     Scanner sw=new Scanner(System.in);
        System.out.println("Start");
        double start = sw.nextDouble();
        start=System.currentTimeMillis();
        System.out.println("Stop");
        double stop= sw.nextDouble();
        stop=System.currentTimeMillis();
        if (stop==0){
            double now=System.currentTimeMillis();
            diff=now-start;
            }else {
            diff=stop-start;
        }
        double mils=diff % 1000;
        System.out.println("elapsed timeis: "+ mils+ "msec");
        }
    }

