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
public class Bai4 {

    public static void main(String[] args) {
        System.out.print("Moi ban nhap 1 xau bat ki: ");
        String str = new Scanner(System.in).nextLine();
        timMaxXau(str);
    }

    public static void timMaxXau(String s) {
        StringTokenizer strToken = new StringTokenizer(s);
        int max, i = 1, lengthStr;
        max = strToken.nextToken().length();
        int viTri = i;
        while (strToken.hasMoreTokens()) {

            lengthStr = strToken.nextToken().length();
            i++;

            if (max < lengthStr) {
                max = lengthStr;
                viTri = i;
            }
        }
        System.out.println("Do dai lon nhat la: " + max + " o vi tri thu " + viTri);
    }
}
