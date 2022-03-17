package ThiGiuaKy;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class GiaoDich {
    private String maGD, ngayGD;
    private long donGia;
    private float dienTich;

    Scanner sc = new Scanner(System.in);

    public GiaoDich(){
        super();
    }

    public GiaoDich(String maGD, String ngayGD, long donGia, float dienTich){
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public String getMaGD() {
        return maGD;
    }
    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }
    public String getNgayGD() {
        return ngayGD;
    }
    public void setNgayGD(String ngayGD) {
        this.ngayGD = ngayGD;
    }
    public double getDongia() {
        return donGia;
    }
    public void setDongia(long donGia) {
        this.donGia = donGia;
    }
    public float getDientich() {
        return dienTich;
    }
    public void setDientich(float dienTich) {
        this.dienTich = dienTich;
    }

    public void nhap(){
        System.out.print("Nhập mã giao dịch: ");
        maGD = sc.nextLine();
        System.out.print("Nhập ngày giao dịch (ngày/tháng/năm): ");
        ngayGD = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextLong();
        sc.nextLine();
        System.out.print("Nhập diện tích: ");
        dienTich = sc.nextFloat();
        sc.nextLine();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
        String str = numberFormat.format(this.donGia);
        return "Mã giao dịch: "+this.maGD+", Ngày giao dịch: "+this.ngayGD+", Đơn giá: "+str+", Diện tích: "+this.dienTich+"m2";
    }
}
