package data;

public class TaiKhoanTietKiem extends TaiKhoan {

    private double laiSuatNam;

    public TaiKhoanTietKiem() {
    }

    public TaiKhoanTietKiem(String chuTaiKhoan, String soTaiKhoan, double soDu, double laiSuatNam) {
        super(chuTaiKhoan, soTaiKhoan, soDu);
        this.laiSuatNam = laiSuatNam;
    }

    public double getLaiSuatNam() {
        return laiSuatNam;
    }

    public void setLaiSuatNam(double laiSuatNam) {
        this.laiSuatNam = laiSuatNam;
    }

    @Override
    public void nhapInfo() {
        super.nhapInfo();

        while (true) {
            System.out.print("Nhap laiSuatNam:");
            try {
                laiSuatNam = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Phai la chu so! Nhap lai");
            }
        }
    }
    @Override
    public void xuatInfo() {
        super.xuatInfo();
        System.out.printf("|%-10.2f|\n", laiSuatNam);
    }
    
    @Override
    public double tinhLaiHangThang() {
        double result = soDu * laiSuatNam / 12;
        return result;
    }

}
