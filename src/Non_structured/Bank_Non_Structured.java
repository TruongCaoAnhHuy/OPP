package Non_structured;

import java.util.Scanner;

public class Bank_Non_Structured {
    public static void main(String[] args) {
        //data
        //khai báo 2 biến
        int account_number = 12345;
        int account_banlance = 0;

        Scanner sc = new Scanner(System.in);

        //gửi tiền: deposit
        System.out.println();

        System.out.print("Nhập tien gui: ");
        int deposit = 0;
        deposit = sc.nextInt();
        account_banlance += deposit; //account_banlance = account_banlance + deposit;

        //show
        System.out.println("Thong tin tai khoan: ");
        System.out.println("Account number: "+account_number);
        System.out.println("Account banlance: "+account_banlance);

        //withdraw
        System.out.print("Nhap tien rut: ");
        int withdraw = 0;
        withdraw = sc.nextInt();
        account_banlance -= withdraw; // account_banlance = account_banlance - withdraw;

        //show
        System.out.println("Thong tin tai khoan: ");
        System.out.println("Account number: "+account_number);
        System.out.println("Account banlance: "+account_banlance);
    }
    
}
