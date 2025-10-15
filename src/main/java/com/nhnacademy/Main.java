package com.nhnacademy;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c;
        boolean isRight = false;
        while(true) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if(a==0 && b==0 && c==0) break;
            if(a>=b && b>=c || a>=c && c>=b) isRight = isRight(a, b, c);
            else if(c>=a && a>=b || c>=b && b>=a) isRight = isRight(c, b, a);
            else if(b>=a && a>=c || b>=c && c>=a) isRight = isRight(b, a, c);
            if(isRight) System.out.println("right");
            else System.out.println("wrong");
        }




    }
    static boolean isRight(int max, int min1, int min2) {
        return (Math.pow(max, 2) == Math.pow(min1, 2) + Math.pow(min2, 2));
    }
}