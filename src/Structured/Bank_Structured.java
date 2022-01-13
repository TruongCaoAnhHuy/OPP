package Structured;

import java.util.Scanner;

public class Bank_Structured {

    static int account_banlance = 0;
    static int account_number = 12345;

    //data: employee;
    static String emName; // ten
    static double salary; // luong

    //data: custom
    static String cusName;
    static String address; 

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //show
        //show();
        deposit();
        withdraw();
        show();
    }
    
    static void show(){
        System.out.println("Thong tin tai khoan: ");
        System.out.println("Account number: "+account_number);
        System.out.println("Account banlance: "+account_banlance);

    }

    static void deposit(){
        System.out.println();
        System.out.print("Nhập tien gui: ");
        int deposit = 0;
        deposit = sc.nextInt();
        account_banlance += deposit;
    }

    static void withdraw(){
        System.out.print("Nhap tien rut: ");
        int withdraw = 0;
        withdraw = sc.nextInt();
        account_banlance -= withdraw;
    }

    static void getnameEmployee(){
        emName = "";
    }

    static void getSalaryEmployee(){
        salary = 500;
    }

    static String getAddress(){
        return cusName + address;
    }
}
