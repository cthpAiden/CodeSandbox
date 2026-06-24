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
                    ql.displayAll();
                    break;
                case 3:
                    ql.xuatFullTime();
                    break;
                case 4:
                    ql.tongLuong();
                    break;
                case 5:
                    ql.timTheoTen();
                    break;
                case 6:
                    ql.luongCaoNhat();
                    break;
                case 7:
                    ql.sortLuongGiamDan();
                    break;
                case 8:
                    ql.xoaTheoIndex();
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

    public void displayAll() {
        if (staff.isEmpty()) {
            System.out.println("No records.");
            return;
        }
        for (NhanVien nhanVien : staff) {
            nhanVien.xuatInfo();
        }
    }

    public void xuatFullTime() {
        boolean found = false;
        for (NhanVien nhanVien : staff) {
            if (nhanVien instanceof FullTime) {
                nhanVien.xuatInfo();
                found = true;
            }
        }
        if (found == false) {
            System.out.println("No full-time employee");
        }
    }

    public void tongLuong() {
        double total = 0;
        for (NhanVien nhanVien : staff) {
            total += nhanVien.tinhLuong();
        }
        System.out.printf("Total salary: %.3f\n", total);
    }

    public void timTheoTen() {
        System.out.print("Enter name to search: ");
        String name = NhanVien.sc.nextLine();
        boolean found = false;
        for (NhanVien nhanVien : staff) {
            if (nhanVien.getTen().equalsIgnoreCase(name)) {
                nhanVien.xuatInfo();
                found = true;
            }
        }
        if (found != true) {
            System.out.println("Not found.");
        }
    }

    public void luongCaoNhat() {
        if (staff.isEmpty()) {
            System.out.println("No employee(s).");
            return;
        }
        NhanVien maxNV = staff.get(0);
        for (int i = 0; i < staff.size(); i++) {
            if (staff.get(i).tinhLuong() > maxNV.tinhLuong()) {
                maxNV = staff.get(i);
            }
        }
        System.out.println("Highest paid: ");
        maxNV.xuatInfo();
    }

    public void sortLuongGiamDan() {
        staff.sort((a,b) -> Double.compare(b.tinhLuong(),a.tinhLuong()));
        System.out.println("Descending order: ");
        displayAll();
    }
    
    public void xoaTheoIndex() {
        if (staff.isEmpty()) {
            System.out.println("No records.");
            return;
        }
        System.out.print("Enter index to delete (0 to " + (staff.size() - 1) + "): ");
        try {
            int index = Integer.parseInt(NhanVien.sc.nextLine());
            if (index < 0 || index >= staff.size()) {
                System.out.println("Invalid index!");
                return;
            }
            staff.remove(index);
            System.out.println("Deleted successfully!");
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }
}
