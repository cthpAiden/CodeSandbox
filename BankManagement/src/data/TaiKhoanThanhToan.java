
package data;


public class TaiKhoanThanhToan extends TaiKhoan{
    private double hanMucThauChi;

    public TaiKhoanThanhToan() {
    }


    public TaiKhoanThanhToan(String chuTaiKhoan, String soTaiKhoan, double soDu, double hanMucThauChi) {
        super(chuTaiKhoan, soTaiKhoan, soDu);
        this.hanMucThauChi = hanMucThauChi;
    }
    
    @Override
    public void nhapInfo() {
        super.nhapInfo();

        while (true) {
            System.out.print("Nhap hanMucThauChi:");
            try {
                hanMucThauChi = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Phai la chu so! Nhap lai");
            }
        }
    }
    @Override
    public void xuatInfo() {
        super.xuatInfo();
        System.out.printf("|%-10.2f|\n", hanMucThauChi);
    }
    
    @Override
    public double tinhLaiHangThang() {
        return 0;
    }

    // Allows withdrawing down to -hanMucThauChi (overdraft).
    // Returns false (and changes nothing) if the amount is invalid
    // or would push the balance below the overdraft limit.
    public boolean rutTien(double soTien) {
        if (soTien <= 0) {
            return false;
        }
        if (soDu - soTien < -hanMucThauChi) {
            return false;
        }
        soDu -= soTien;
        return true;
    }
}
