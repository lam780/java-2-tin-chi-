
package buoi1;

import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int masv,tuoi,namsinh;
        float tb;
    
        System.out.print("mã sinh viên: ");
        masv = in.nextInt();
        
        System.out.print("họ tên sinh viên: ");
        String ht = in.nextLine();
        
        System.out.print("tuổi: ");
        tuoi = in.nextInt();
        
        System.out.print("năm sinh: ");
        namsinh = in.nextInt();
        
        System.out.print("điểm trung bình : ");
        tb = in.nextFloat();
        
        System.out.print("-----------------------------");
        System.out.print("\n mã sinh viên: " + masv);
        System.out.print("\n họ tên sinh viên: " + ht);
        System.out.print("\n tuổi: " + tuoi);
        System.out.print("\n năm sinh: " + namsinh);
        System.out.print("\n iểm trung bình: " + tb);
        System.out.print("source:lâm")
    }
}
