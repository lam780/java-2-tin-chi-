/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Admin
 */
public class bai_4 {
    public static void main(String[] args) {
        int a,b,c;
        float delta;
        Scanner sc = new Scanner(System.in);
        System.out.print(" hệ số a: ");
        a = sc.nextInt();
        System.out.print(" hệ số b: ");
        b = sc.nextInt();
        System.out.print(" hệ số c: ");
        c = sc.nextInt();
        delta = (b * b) - (4 * a * c);
        System.out.print("\ndelta = " + delta);
        System.out.print("\ncăn bậc 2 delta = " + Math.sqrt(delta));
        System.out.print("source:lam");
    }
}
