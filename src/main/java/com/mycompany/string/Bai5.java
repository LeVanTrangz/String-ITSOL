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
public class Bai5 {

    public static void main(String[] args) {
        System.out.print("Nhap ho ten theo cau truc ho - ten dem - ten: ");
        String str = new Scanner(System.in).nextLine();
        System.out.print("Ho ten duoc sap xep theo cau truc ten - ho - ten dem la: " + sapXepHoTen(str));
    }

    public static String sapXepHoTen(String input) {
        StringTokenizer strToken = new StringTokenizer(input, " ");
        String ho = strToken.nextToken();
        String dem = strToken.nextToken();
        String ten = strToken.nextToken();
        String strOutput = ten + " " + ho + " " + dem;
        return strOutput;
    }
}
