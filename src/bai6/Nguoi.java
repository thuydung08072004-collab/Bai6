/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6;




import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private String ngaySinh;
    private String soCMND;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhap so CMND: ");
        soCMND = sc.nextLine();
    }

    public void hienThi() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("So CMND: " + soCMND);
    }

    public String getSoCMND() {
        return soCMND;
    }
}
