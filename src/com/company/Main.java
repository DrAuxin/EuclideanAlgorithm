package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter your first number (smaller or equal).");
        int small = user.nextInt();
        System.out.println("Enter your second number (larger or equal.");
        int big = user.nextInt();
        System.out.println(euclidean(small, big));
        while (true) {
            int c = big - small;
            if (small == big) {
                System.out.println(small);
                break;
            }
            if (c >= small) {
                big = c;
            } else if (c < small) {
                big = small;
                small = c;
            }
        }
    }
public static int euclidean(int small, int big) {
    int c = big - small;
    if (small == big) {
        return small;
    }
    if (c >= small) {
        return euclidean(small, c);
    } else if (c < small) {
        return euclidean(c, small);
    }
    else
        return 42;
}
}



