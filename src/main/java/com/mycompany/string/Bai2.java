/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.string;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap 1 chuoi bat ki: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                str.indexOf(str);
                str.toUpperCase();
            } else {
                str.indexOf(str);
                str.toLowerCase();
            }
        }
    }

    public static void getIndex(String str) {
        for (int i = 0; i < str.length(); i++) {
            str.indexOf(i);
        }
    }
}
