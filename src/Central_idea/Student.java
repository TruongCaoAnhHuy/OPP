package Central_idea;

import java.util.Scanner;

public class Student {
    int ms;
    String hoten;
    double diemTB, dT, dH, dL;

    Scanner sc = new Scanner(System.in);

    public void Student(){}

    public void Student(int ms, String hoten, double diemTB, double dT, double dL, double dH){
        this.ms = ms;
        this.hoten = hoten;
        this.diemTB = diemTB;
        this.dT = dT;
        this.dH = dH;
        this.dL = dL;
    }

    public void Nhap(){
        System.out.print("Mã số: ");
        ms = sc.nextInt();
        sc.nextLine();
        System.out.print("Họ tên: ");
        hoten = sc.nextLine();
        System.out.print("Nhập điểm 3 môn: ");
        dT = sc.nextDouble();
        dH = sc.nextDouble();
        dL = sc.nextDouble();
        sc.nextLine();

        diemTB = (dT+dH+dL)/3;
    }

    public void Xuat(){
        System.out.println("Mã số: "+ms);
        System.out.println("Họ tên: "+hoten);
        System.out.println("Điểm 3 môn: "+dT+" "+dH+" "+ dL);
        System.out.println("Điểm TB: "+diemTB);
    }
}


;