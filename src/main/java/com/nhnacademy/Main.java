package com.nhnacademy;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
//        sc.next();
        int bonus = 0;
        int score = 0;
        String str;
        for(int j=0; j<T; j++) {
            str = sc.next();
            for(int i=0; i<str.length(); i++) {
                char ch = str.charAt(i);
                if(ch == 'O') {
                    score++;
                    score += bonus++;
                } else if(ch == 'X') {
                    bonus = 0;
                }
            }
            System.out.println(score);
            score=0;
            bonus=0;
        }
    }
}