package oo.Shape;

import java.util.Scanner;

public class ShapeTestDrive {
    public static void main(String[] args) {
        //hình vuông
        Square square = new Square();
        System.out.println("Square...");

        //hình tròn
        Circle circle = new Circle();
        System.out.println("Circle...");

        //hình tam giác
        Triangle triangle = new Triangle();
        System.out.println("Triangle...");

        //hàng động và âm thanh
        int menu;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");
        System.out.print("Chọn Shape: ");
        menu = sc.nextInt();
        switch(menu){
            case 1: 
                square.action_sound();
                break;
            case 2:
                circle.action_sound();
                break;
            case 3:
                triangle.action_sound();
                break;
        }
            
    }
}
