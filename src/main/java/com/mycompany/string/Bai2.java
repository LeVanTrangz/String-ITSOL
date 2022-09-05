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
    
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Moi ban nhap mot chuoi ki tu bat ki: ");
        String str = new Scanner(System.in).nextLine();
        chuyenDoi(str);
    }
    
    public static void chuyenDoi(String s) {
        String s1 = s.toLowerCase();
        char[] arr = s1.toCharArray();
        String[] arr2 = new String[100];
        
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = String.valueOf(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr2[i] = arr2[i].toUpperCase();
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr2[j]);
        }
    }
}
