package oo;

import java.util.Scanner;

public class Account {
    Scanner input = new Scanner(System.in);

    //data
    int account_number = 12345;
    int account_balance = 0;

    //function

    void withdraw(){
        System.out.print("Nhập vào số tiền cần rút?");
        int withdraw = input.nextInt();
        account_balance -= withdraw; //account_balance = account_balance - withdraw

    }
    
    void deposit(){
        //gửi tiền: deposit
        System.out.print("Nhập vào số tiền gửi");
        int deposit = 0;
        deposit = input.nextInt();
        account_balance += deposit; //account_balance = account_balance - deposit

    }

    void show(){
        System.out.println("thông tin tài khoản");
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_balance);
    }
}
