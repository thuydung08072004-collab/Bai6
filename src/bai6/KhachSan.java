/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6;

/**
 *
 * @author tnfb0
 */




import java.util.Scanner;

public class KhachSan {
    private Nguoi nguoi;
    private int soNgayTro;
    private String loaiPhong;
    private double giaPhong;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        nguoi = new Nguoi();
        nguoi.nhap();
        System.out.print("Nhap so ngay tro: ");
        soNgayTro = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap loai phong: ");
        loaiPhong = sc.nextLine();
        System.out.print("Nhap gia phong: ");
        giaPhong = sc.nextDouble();
    }

    public void hienThiThongTin() {
        nguoi.hienThi();
        System.out.println("So ngay tro: " + soNgayTro);
        System.out.println("Loai phong: " + loaiPhong);
        System.out.println("Gia phong: " + giaPhong);
        System.out.println("Thanh tien: " + (soNgayTro * giaPhong));
    }

    public String getSoCMND() {
        return nguoi.getSoCMND();
    }

    public double tinhTien() {
        return soNgayTro * giaPhong;
    }
}
