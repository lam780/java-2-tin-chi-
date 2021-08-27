
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class bai2 {
    public static void main(String[] args) {
        double canha, canhb;
        int gocab;
        // khai bao scnner de nhap du lieu vao ban phim 
        Scanner in = new Scanner(System.in);
        // nhap a
        System.out.print("canh a: ");
        canha = in.nextDouble();
        // nhap b
        System.out.print("canh b: ");
        canhb = in.nextDouble();
        // nhap goc ab
        System.out.print("goc ab: ");
        gocab = in.nextInt();
        // tinh dien tich 
        double dientich = canha * canhb * Math.sin(Math.toRadians(gocab))/ 2;
        System.out.print("dien tich tam giac =" + dientich);

        
        
    }
}
