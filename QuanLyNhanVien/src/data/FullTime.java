package data;

public class FullTime extends NhanVien {

    private double thuong;

    public FullTime() {
    }

    public FullTime(String ten, int tuoi, double luongCoBan, double thuong) {
        super(ten, tuoi, luongCoBan);
        this.thuong = thuong;
    }

    public double getThuong() {
        return thuong;
    }

    public void setThuong(double thuong) {
        this.thuong = thuong;
    }


    @Override
    public void nhapInfo() {
        super.nhapInfo();
        while (true) {
            System.out.print("Nhap thuong (FT): ");
            try {
                thuong = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Sai input, nhap lai!");
            }
        }
    }
    
    @Override
    public void xuatInfo() {
        System.out.printf("|%-10s|%-10d|%-10