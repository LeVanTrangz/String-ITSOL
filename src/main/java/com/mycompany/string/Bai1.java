/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.string;

/**
 *
 * @author Admin
 */
public class Bai1 {

    public static void checkThuanNghich() {
        String s, s1;

        for (int i = 100000; i < 1000000; i++) {
            s = "";
            StringBuilder sb = new StringBuilder(String.valueOf(i));
            s += i;
            s1 = sb.reverse().toString();
            if (s.compareTo(s1) == 0) {
                System.out.printf("%d\n", i);
            }
        }
    }

    public static void main(String[] args) {
        checkThuanNghich();
    }
}
