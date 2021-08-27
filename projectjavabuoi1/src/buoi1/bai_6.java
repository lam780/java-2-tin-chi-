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
public class bai_6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap ban kinh duong tron: ");
        double radius = in.nextDouble();
        double chuvi = Math.PI * (radius * radius);
        System.out.println("Dien tich hinh tron la: " + chuvi);
        double dientich= Math.PI * 2*radius;
        System.out.print( "Chu vi hinh trong la: "+dientich) ;
        
        }
}
