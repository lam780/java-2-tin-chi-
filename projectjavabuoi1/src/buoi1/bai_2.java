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
public class bai_2 {
    public static void main(String[] args) {
        int a, b, tong,hieu,tich;
        float thuong,du;
        
        Scanner sc = new Scanner(System.in);
        System.out.print(" a: ");
        a = sc.nextInt();
 
        System.out.print(" b: ");
        b = sc.nextInt();
 
        tong = a + b;
        hieu = a - b;
        tich = a * b;
        thuong = a / b;
        du = a % b;
        System.out.print("---------------------");
        System.out.print("\n tong " + tong);
        System.out.print("\n hieu " + hieu);
        System.out.print("\n tich " + tich);
        System.out.print("\n thuong " + thuong);
        System.out.print("\n du " + du);
        System.out.print("source:lâm");
    }
}
