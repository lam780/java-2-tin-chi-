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
public class bai_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap năm: ");
        int nam = sc.nextInt();
        if (nam % 4 == 0){
            System.out.print("năm nhuận");
        }else{
            System.out.print("không nghuận");
        }
            
    }
}
