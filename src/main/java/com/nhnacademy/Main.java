package com.nhnacademy;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        M += H * 60; // 분으로 환산후 M에 합산
        M -= 45; // 45분 빼기
        if(M < 0) { // 만약 날짜가 넘어간다면?
            M = 1440 + M; // M이 음수니까 더하는게 맞음
        }

        H = M/60;
        M %= 60;

        System.out.printf("%d %d\n", H, M);
    }
}