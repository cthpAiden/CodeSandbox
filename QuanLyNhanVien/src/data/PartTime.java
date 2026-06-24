package data;

public class PartTime extends NhanVien {
    private int soGio;
    private double luongMotGio;

    public PartTime() {
    }


    public PartTime(String ten, int tuoi, double luongCoBan, int soGio, double luongMotGio) {
        super(ten, tuoi, luongCoBan);
        this.soGio = soGio;
        this.luongMotGio = luongMotGio;
    }

    @Override
    public void nhapInfo() {
        super.nhapInfo();
        while (true) {
            System.out.print("Nhap soGio: ");
            try {
                soGio = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Sai input, nhap lai!");
            }
        }
        while (true) {
            System.out.print("Nhap luongMotGio: ");
            try {
                luongMotGio = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Sai input, nhap lai!");
            }
        }
    }
    
    @Override
    public void xuatInfo() {
        System.out.printf("|%-10s|%-10d|%-10.3f|%-10d|%-10.3f|%-10.3f|\n", ten, tuoi, luongCoBan, soGio, luongMotGio, tinhLuong());
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + soGio * luongMotGio;
    }
}
