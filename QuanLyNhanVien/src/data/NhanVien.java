package data;

import java.util.Scanner;

public class NhanVien {

    protected String ten;
    protected int tuoi;
    protected double luongCoBan;
    public static Scanner sc = new Scanner(System.in);

    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, double luongCoBan) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.luongCoBan = luongCoBan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public void nhapInfo() {
        System.out.print("Nhap ten: ");
        ten = sc.nextLine();
        while (true) {
            System.out.print("Nhap tuoi: ");
            try {
                tuoi = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Sai input, nhap lai!");
            }
        }
        while (true) {
            System.out.print("Nhap luong co ban: ");
            try {
                luongCoBan = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Sai input, nhap lai!");
            }
        }
    }

    public void xuatInfo() {
        System.out.printf("|%-10s|%-10d|%-10.3f|\n", ten, tuoi, luongCoBan);
    }

    public double tinhLuong() {
        return luongCoBan;
    }
}
