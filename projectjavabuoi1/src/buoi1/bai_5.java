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
public class bai_5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sl;
        float dg,thue;
        
        System.out.print("\ntên sản phẩm: ");
        String tenp = in.nextLine();
        
        System.out.print("\nđơn giá: ");
        dg = in.nextFloat();
        
        System.out.print("source:lam");
        System.out.print("\nsố lượng: ");
        sl = in.nextInt();
        
        thue = ((dg * sl) / 100) * 10;
        
        System.out.print("-------------------");
        System.out.print("\nsản phẩm tên là: " + tenp);
        System.out.print("\nđơn giá à: " + dg);
        System.out.print("\nsố lượng: " + sl);
        System.out.print("\ngiá trị đơn hàng sau khi đã tính thuế 10%:" + thue);
        }
}
