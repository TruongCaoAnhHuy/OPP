package oo;

public class Student {
    //attibute - data - state
    boolean gioitinh;
    float tuoi;
    String ten, khoa, gioitinhString;
    double diemTB;

    public Student(boolean gioitinh, float tuoi, String ten, String khoa, double diemTB, String gioitinhString){
        this.gioitinh = gioitinh;
        this.tuoi = tuoi;
        this.ten = ten;
        this.khoa = khoa;
        this.diemTB = diemTB;
        this.gioitinhString = gioitinhString;
    }

    void show(){
        System.out.println("Name: "+ten);
        if(gioitinh==true){
            gioitinhString="nam";
        }
        else{
            gioitinhString = "nu";
        }
        System.out.println("Sex: "+gioitinhString);
        System.out.println("Age: "+tuoi);
        System.out.println("Department: "+khoa);
        System.out.println("Point: "+diemTB);
        System.out.println();
    }

    //method - function - behavior
    void hoc(){
        System.out.println("Học....");
    }
    void thi(){
        System.out.println("Thi....");
    }
    void dkMon(){
        System.out.println("Đăng ký");
    }
}
