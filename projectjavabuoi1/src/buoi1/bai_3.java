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
public class bai_3 {
    public static void main(String[] args) {
        int a, b, chuvi,dientich,canhnhonhat;
        Scanner sc = new Scanner(System.in);
        
        System.out.print(" canh A: ");
        a = sc.nextInt(); 
        System.out.print(" canh B: ");
        b = sc.nextInt();
 
        chuvi = (a + b) * 2;
        dientich = a * b;
        canhnhonhat = Math.min(a, b);
        
        System.out.print("--------------------");
        System.out.print("\n chuvi " + chuvi);
        System.out.print("\n dien tich " + dientich);
        System.out.print("\n canh nho " + canhnhonhat);
        System.out.print("source:lâm");
        
    }
}
