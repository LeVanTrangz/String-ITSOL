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
public class Bai7 {

    public static void main(String[] args) {
        System.out.print("Moi ban nhap xau 1: ");
        String xau1 = new Scanner(System.in).nextLine();
        System.out.print("Moi ban nhap xau 2: ");
        String xau2 = new Scanner(System.in).nextLine();
        if (xau1.indexOf(xau2) < 0) {
            System.out.print("Xau 2 khong co trong xau 1.");
        } else {
            System.out.println(xau1.replaceAll(xau2, ""));
        }
    }
}
