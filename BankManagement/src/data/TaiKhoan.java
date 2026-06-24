package data;

import java.util.Scanner;

public class TaiKhoan {

    protected String chuTaiKhoan;
    protected String soTaiKhoan;
    protected double soDu;
    public static Scanner sc = new Scanner(System.in);

    public TaiKhoan() {
    }

    public TaiKhoan(String chuTaiKhoan, String soTaiKhoan, double soDu) {
        this.chuTaiKhoan = chuTaiKhoan;
        this.soTaiKhoan = soTaiKhoan;
        this.soDu = soDu;
    }

    public String getChuTaiKhoan() {
        return chuTaiKhoan;
    }

    public void setChuTaiKhoan(String chuTaiKhoan) {
        this.chuTaiKhoan = chuTaiKhoan;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        TaiKhoan.sc = sc;
    }

    public void nhapInfo() {
        System.out.print("Nhap chu tai khoan: ");
        chuTaiKhoan = sc.nextLine();
        System.out.print("Nhap so tai khoan: ");
        soTaiKhoan = sc.nextLine();
        while (true) {
            System.out.print("Nhap soDu:");
            try {
                soDu = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Phai la chu so! Nhap lai");
            }
        }
    }

    public void xuatInfo() {
        System.out.printf("|%-10s|%-10s|%-10.3f|\n", chuTaiKhoan, soTaiKhoan, soDu);
    }

    public double tinhLaiHangThang() {
        
        return 0;
    }
}
