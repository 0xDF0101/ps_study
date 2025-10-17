package com.nhnacademy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        String bracket;

        for(int k=0; k<T; k++) {
            bracket = sc.next();

            if(isVps(bracket)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    public static boolean isVps(String bracket) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0; i<bracket.length(); i++) {
            char ch = bracket.charAt(i);

            if(ch=='(') {
                stack.addFirst(ch);
            } else if(ch==')') {
                if(stack.isEmpty()) {
                    return false;
                } else {
                    stack.removeFirst();
                }
            }
        }
        return stack.isEmpty();
    }
}