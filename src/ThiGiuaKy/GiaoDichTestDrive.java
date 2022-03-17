package ThiGiuaKy;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class GiaoDichTestDrive {
    public static void main(String[] args) {
        ArrayList<GiaoDichDat> arrGDD = new ArrayList<>();
        ArrayList<GiaoDichNha> arrGDN = new ArrayList<>();

        int choose;
        double tongTienGiaoDichDat = 0, trungBinhThanhTien = 0;
        Scanner sc = new Scanner(System.in);
        
        //nhập xuất ds giao dịch
        do{
            System.out.println("1. Giao dịch đất");
            System.out.println("2. Giao dịch nhà");
            System.out.println("0. Thoát");
            System.out.print("Chọn giao dịch: ");
            choose = sc.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Nhập thông tin giao dịch đất:");
                    GiaoDichDat giaoDichDat = new GiaoDichDat();
                    giaoDichDat.nhap();
                    arrGDD.add(giaoDichDat);
                    break;
                case 2:
                    System.out.println("Nhập thông tin giao dịch nhà:");
                    GiaoDichNha giaoDichNha = new GiaoDichNha();
                    giaoDichNha.nhap();
                    arrGDN.add(giaoDichNha);
                    break;
                default:
                    System.out.println("Không hợp lệ");
                    break;
            }
        }while (choose !=0);

        //tính tổng từng loại
        System.out.println("---Thông tin các giao dịch đất---");
        for (int i = 0; i < arrGDD.size(); i++) {
            System.out.println(arrGDD.get(i).toString());
        }
        System.out.println("Tổng số giao dịch đất: "+arrGDD.size()+" giao dịch");
        
        System.out.println("---Thông tin các giao dịch nhà---");
        for (int i = 0; i < arrGDN.size(); i++) {
            System.out.println(arrGDN.get(i).toString());
        }
        System.out.println("Tổng số giao dịch nhà: "+arrGDN.size()+" giao dịch");

        for (int i = 0; i < arrGDD.size(); i++) {
            if (arrGDD.get(i).getLoaiDat().equalsIgnoreCase("A")) {
                tongTienGiaoDichDat += arrGDD.get(i).getDientich() * 
                    arrGDD.get(i).getDongia() * 1.5;
            } else if (arrGDD.get(i).getLoaiDat().equalsIgnoreCase("B") || 
                    arrGDD.get(i).getLoaiDat().equalsIgnoreCase("C")) {
                tongTienGiaoDichDat += arrGDD.get(i).getDientich() * 
                    arrGDD.get(i).getDongia();
            }
        }

        trungBinhThanhTien = tongTienGiaoDichDat / (arrGDD.size());

        Locale localeVN = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
        String str = numberFormat.format(trungBinhThanhTien);

        System.out.println("Trung bình thành tiền của giao dịch đất = " + str);

        System.out.println("Các giao dịch nhà của tháng 9 năm 2013: ");
        for (int i = 0; i < arrGDN.size(); i++) {
            String[] dateGiaoDichNha = arrGDN.get(i).getNgayGD().split("/");
            if (dateGiaoDichNha[1].equals("9") && dateGiaoDichNha[2].equals("2013")) {
                System.out.println(arrGDN.get(i).toString());
            }
        }
    }
}
