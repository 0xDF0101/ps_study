package com.nhnacademy;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        // ---> nextInt() 는 공백을 기준으로 토큰을 읽어옴
        // 그래서 '1 2(엔터)' 이렇게 입력해도 각각 변수에 대입 가능
        // 근데 그 공백이나 구분자는 버퍼에 남겨놓고 숫자만 갖고온다는거 주의하셈
        System.out.println(A+B);
    }
}