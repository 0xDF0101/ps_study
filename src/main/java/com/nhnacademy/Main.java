package com.nhnacademy;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int x1, x2, y1, y2, r1, r2;
        int result = 0;

        for(int k=0; k<T; k++) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            r1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            r2 = sc.nextInt();

            double radius = r1 + r2;
            double distance = distance(x1, y1, x2, y2);
            if(distance == 0 && r1 == r2) { // 중심이 같고 반지름도 같아서 무한대의 경우가 나오는 경우
                result = -1;
            } else if(distance == 0 && r1 != r2) { // 중심이 같지만 반지름은 달라서 아예 안만나는 경우
                result = 0;
            } else if(distance + r1 < r2 || distance + r2 < r1) { // 한 원이 다른 원에 완전히 포함되어 만나지 않는 경우
                result = 0;
            } else if(distance + r1 == r2 || distance + r2 == r1) { // 한 원이 다른 원에 포함되어 있는데 한 점에서 만나는 경우
                result = 1;
            } else {
                if(distance > radius) { // 두 원이 아예 떨어져 있어서 안만나는 경우
                    result = 0;
                } else if(distance == radius) { // 두원이 정확하게 접하는 경우
                    result = 1;
                } else { // 두 원이 적당히 겹쳐서 두 점에서 만나는 경우
                    result = 2;
                }
            }
            System.out.println(result);
        }
    }
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }
}