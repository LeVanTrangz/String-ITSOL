/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.string;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class Bai6 {

    public static void main(String[] args) {
        System.out.print("Moi ban nhap xau can sap xep: ");
        String str = new Scanner(System.in).nextLine();
        if (check(str) == true) {
            System.out.println("Cau sau khi sap xep theo Alphabet la: ");
            sapxepAlphabet(str);
        } else {
            System.out.println("Cau khong duoc qua 20 tu, moi tu khong duoc qua 10 ki tu. Moi ban nhap lai!");
        }
        ;
    }

    public static boolean check(String s) {
        StringTokenizer s1 = new StringTokenizer(s);
        int n = s1.countTokens();
        boolean soTu = false;
        if (n < 20) {
            soTu = true;
        }

        boolean soKiTu = false;
        while (s1.hasMoreTokens()) {
            if (s1.nextToken().length() > 10) {
                soKiTu = false;
            } else {
                soKiTu = true;
            }
        }

        return soTu && soKiTu;

    }

    public static void sapxepAlphabet(String s) {
        String tg;
        StringTokenizer s1 = new StringTokenizer(s);
        int n = s1.countTokens();
        String arr[] = new String[n];
        int i = 0;
        while (s1.hasMoreTokens()) {
            arr[i] = s1.nextToken();
            i++;

        }
        for (int k = 0; k < n - 1; k++) {
            for (int j = k + 1; j < n; j++) {
                if (arr[k].compareTo(arr[j]) > 0) {
                    tg = arr[k];
                    arr[k] = arr[j];
                    arr[j] = tg;
                }
            }
        }

        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + "  ");
        }
        System.out.println("");

    }
}
