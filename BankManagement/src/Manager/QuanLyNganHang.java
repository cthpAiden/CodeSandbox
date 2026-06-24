package Manager;

import data.TaiKhoan;
import static data.TaiKhoan.sc;
import data.TaiKhoanThanhToan;
import data.TaiKhoanTietKiem;
import java.util.ArrayList;
import java.util.List;

public class QuanLyNganHang {

    List<TaiKhoan> list = new ArrayList<>();

    public static void main(String[] args) {
        QuanLyNganHang ql = new QuanLyNganHang();
        int choice = 0;
        do {
            ql.menu();
            System.out.print("Choice: ");
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice! Enter a number.");
                continue;
            }
            switch (choice) {
                case 1:
                    ql.themTK();
                    break;
                case 2:
                    ql.displayAll();
                    break;
                case 3:
                    ql.onlyTietKiem();
                    break;
                case 4:
                    ql.tongSoDuAll();
                    break;
                case 5:
                    ql.timTheoTen();
                    break;
                case 6:
                    if (ql.list.isEmpty()) {
                        System.out.println("No records.");
                    } else {
                        System.out.printf("Highest balance: %.3f%n", ql.highestBalance());
                    }
                    break;
                case 7:
                    ql.BalanceDescending();
                    break;
                case 8:
                    ql.xoaTheoIndex();
                    break;
                case 9:
                    ql.tongLaiHangThangAll();
                    break;
                case 10:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again");
                    break;
            }
        } while (choice != 10);
    }

    public void menu() {
        System.out.println("========== BANK MANAGEMENT SYSTEM ==========");
        System.out.println("1. Them tai khoan");
        System.out.println("2. Display all");
        System.out.println("3. Only display tai khoan tiet kiem");
        System.out.println("4. Tong so du tat ca tai khoan");
        System.out.println("5. Tim theo ten chu TK");
        System.out.println("6. Highest balance");
        System.out.println("7. Sap xep balance descending");
        System.out.println("8. Xoa theo index");
        System.out.println("9. Tinh tong lai hang thang cua all tai khoan");
        System.out.println("10. Exit");
        System.out.println("============================================");
    }

    public void themTK() {
        System.out.print("1. Tiet Kiem or 2. Thanh Toan? (1 or 2): ");
        String choice = sc.nextLine();
        TaiKhoan tk;
        if (choice.trim().equals("1")) {
            tk = new TaiKhoanTietKiem();
        } else {
            tk = new TaiKhoanThanhToan();
        }
        tk.nhapInfo();
        list.add(tk);
        System.out.println("Da them thanh cong.");
    }

    public void displayAll() {
        if (list.isEmpty()) {
            System.out.println("No records.");
            return;
        }
        for (TaiKhoan taiKhoan : list) {
            taiKhoan.xuatInfo();
        }
    }

    public void onlyTietKiem() {
        for (TaiKhoan taiKhoan : list) {
            if (taiKhoan instanceof TaiKhoanTietKiem) {
                taiKhoan.xuatInfo();
            }
        }
    }

    public void tongSoDuAll() {
        double sum = 0;
        for (TaiKhoan taiKhoan : list) {
            sum += taiKhoan.getSoDu();
        }
        System.out.printf("Tong so du tat ca la: %.3f\n", sum);
    }

    public void timTheoTen() {
        System.out.print("Nhap ten can tim: ");
        String ten = sc.nextLine();
        for (TaiKhoan taiKhoan : list) {
            if (ten.equalsIgnoreCase(taiKhoan.getChuTaiKhoan())) {
                taiKhoan.xuatInfo();
            }
        }
    }

    public double highestBalance() {
        double max = list.get(0).getSoDu();
        for (TaiKhoan taiKhoan : list) {
            if (max < taiKhoan.getSoDu()) {
                max = taiKhoan.getSoDu();
            }
        }
        return max;
    }

    public void BalanceDescending() {
        list.sort((a, b) -> Double.compare(b.getSoDu(), a.getSoDu()));
        System.out.println("Balance Descending: ");
        displayAll();
    }

    public void xoaTheoIndex() {
        if (list.isEmpty()) {
            System.out.println("No records.");
            return;
        }
        displayAll();
        System.out.print("Enter index to delete (0 to " + (list.size() - 1) + "): ");
        int index = Integer.parseInt(sc.nextLine());
        if (index < 0 || index >= list.size()) {
            System.out.println("Invalid index!");
            return;
        }
        list.remove(index);
        System.out.println("Da xoa thanh cong.");
    }

    public void tongLaiHangThangAll() {
        double sum = 0;
        for (TaiKhoan taiKhoan : list) {
            sum += taiKhoan.tinhLaiHangThang();
        }
        System.out.printf("Tong lai hang thang cua tat ca tai khoan: %.3f%n", sum);
    }
}
