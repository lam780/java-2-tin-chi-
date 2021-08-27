/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai_7 {
    public static void main(String[] args) {
        int toan,ly,hoa;
        Scanner sc = new Scanner(System.in);
        System.out.print(" toán: ");
        toan = sc.nextInt();
        System.out.print("lý: ");
        ly = sc.nextInt();
        System.out.print("hóa: ");
        hoa = sc.nextInt();
        float tb = (toan * 3 + ly * 2 + hoa) /6;
        System.out.print("---------------");
        System.out.print("\ntrung binh he so: " + tb);
    }
}
