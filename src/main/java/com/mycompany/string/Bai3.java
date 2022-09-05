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
public class Bai3 {
    
    public static void main(String[] args) {
        input();
    }
    
    public static void input() {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Moi ban nhap 1 chuoi bat ki: ");
        str = sc.nextLine();
        chuyenDoi(str);
    }
    
    public static void chuyenDoi(String s) {
        s = s.toLowerCase();
        String[] ss;
        String s2 = "";
        ss = s.split(" ");
        for (int i = 0; i < ss.length; i++) {
            String s1 = "";
            if (ss[i].length() != 0) {
                s1 += Character.toLowerCase(ss[i].charAt(0));
                if (ss[i].length() > 1) {
                    s1 += ss[i].substring(1);
                    s2 += s1;
                    if (i < ss.length) {
                        s2 += "";
                    }
                }
                if (s2.charAt(s2.length() - 1) == ' ') {
                    s2 += "\b";
                    System.out.print("Chuoi sau khi chuyen doi la: " + s2);
                }
            }
        }
    }
}
