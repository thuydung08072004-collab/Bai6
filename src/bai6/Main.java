/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai6;

/**
 *
 * @author tnfb0
 */




import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<KhachSan> danhSach = new ArrayList<>();

        System.out.print("Nhap so luong khach tro: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap thong tin khach tro thu " + (i+1) + ":");
            KhachSan ks = new KhachSan();
            ks.nhapThongTin();
            danhSach.add(ks);
        }

        System.out.println("\n=== DANH SACH KHACH TRO ===");
        for (KhachSan ks : danhSach) {
            ks.hienThiThongTin();
            System.out.println("---------------------");
        }

        System.out.print("\nNhap so CMND khach muon tra phong: ");
        String cmnd = sc.nextLine();

        boolean timThay = false;
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getSoCMND().equals(cmnd)) {
                timThay = true;
                System.out.println("\nThong tin khach tra phong:");
                danhSach.get(i).hienThiThongTin();
                System.out.println("So tien phai tra: " + danhSach.get(i).tinhTien());
                danhSach.remove(i);
                break;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay khach co CMND: " + cmnd);
        }

        System.out.println("\n=== DANH SACH CON LAI ===");
        for (KhachSan ks : danhSach) {
            ks.hienThiThongTin();
            System.out.println("---------------------");
        }
    }
}
