package com.nhnacademy;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Deque<Integer> stack = new ArrayDeque<>();

        String command;
        int num = 0;
        for(int i=0; i<N; i++) {
            command = sc.next();
            if(command.equals("push")) {
                num = sc.nextInt();
                stack.addFirst(num);
            } else {
                switch (command) {
                    case "top" -> {
                        if(!stack.isEmpty()) {
                            System.out.println(stack.getFirst());
                        } else {
                            System.out.println(-1);
                        }
                    }
                    case "pop" -> {
                        if(!stack.isEmpty()) {
                            System.out.println(stack.getFirst());
                            stack.removeFirst();
                        } else {
                            System.out.println(-1);
                        }
                    }
                    case "empty" -> {
                        if(stack.isEmpty()) System.out.println(1);
                        else  System.out.println(0);
                    }
                    case "size" -> {
                        System.out.println(stack.size());
                    }
                }
            }
        }
    }
}