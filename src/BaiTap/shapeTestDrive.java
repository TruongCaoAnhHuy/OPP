package BaiTap;

import java.util.Scanner;

public class shapeTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        do{
            System.out.println("1. Square");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            System.out.println("4. Amoeba");
            System.out.print("Chọn Shape: ");
            menu = sc.nextInt();
            switch(menu){
                case 1: 
                    Square square = new Square("Square_music.aif ");
                    square.rotate();
                    System.out.println();
                    break;
                case 2:
                    Circle circle = new Circle("Circle_music.aif ");
                    circle.rotate();
                    System.out.println();
                    break;
                case 3:
                    Triangle triangle = new Triangle("Triangle_music.aif ");
                    triangle.rotate();
                    System.out.println();
                    break;
                case 4:
                    Amoeba amoeba = new Amoeba("Amoeba_music.hif");
                    amoeba.rotate();
                    System.out.println();
                    break;
            }
        }while (menu!=0);
    }
}
