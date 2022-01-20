package oo;

public class StudentTestDrive {
    public static void main(String[] args) {
        
        Student huyStu = new Student(true, 20, "Anh Huy", "CNTT", 8.5, null);
        Student aStu = new Student(false, 19, "Thị B", "KT", 9.0, null);
        Student bStu = new Student(true, 21, "Văn A", "VH", 7.5, null);


        huyStu.show();
        aStu.show();
        bStu.show();
    }
}
