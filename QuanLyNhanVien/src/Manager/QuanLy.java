package Manager;

import data.FullTime;
import data.NhanVien;
import data.PartTime;
import java.util.ArrayList;
import java.util.List;

public class QuanLy {

    List<NhanVien> staff = new ArrayList<>();

    public static void main(String[] args) {
        QuanLy ql = new QuanLy();
        int choice;
        do {
            menu();
            System.out.print("Choice: ");
            choice = Integer.parseInt(NhanVien.sc.nextLine());
            switch (choice) {
                case 1:
                    ql.nhapNhanVien();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }

    public static void menu() {
        System.out.println("========== STAFF MANAGER ==========");
        System.out.println("1. Them nhan vien");
        System.out.println("2. Display all");
        System.out.println("3. xuatFullTime();");
        System.out.println("4. Tong luong cua tat ca nhan vien");
        System.out.println("5. Tim theo ten");
        System.out.println("6. Nguoi luong cao nhat");
        System.out.println("7. sortLuongGiamDan()");
        System.out.println("8. xoaTheoIndex");
        System.out.println("0. Exit");
    }

    public void nhapNhanVien() {
        System.out.println("Fulltime (Y/N)?:");
        String isFulltime = NhanVien.sc.nextLine();
        NhanVien nv;

        if (isFulltime.trim().equalsIgnoreCase("Y")) {
            nv = new FullTime();
        } else {
            nv = new PartTime();
        }
        nv.nhapInfo();
        staff.add(nv);
        System.out.println("Add thanh cong!");
    }
}
