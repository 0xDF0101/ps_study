package com.nhnacademy;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int result;
        boolean isThat = false;
        for(int i=0; i<N; i++) {
            result = i + i/1000000 + i%1000000/100000 + i%100000/10000 + i%10000/1000 + i%1000/100 + i%100/10 + i%10;
            if(result == N) {
                System.out.println(i);
                isThat = true;
                break;
            }
        }
        if(!isThat) {
            System.out.println(0);
        }

    }
}