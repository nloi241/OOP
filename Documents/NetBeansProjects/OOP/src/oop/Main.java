package oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();
        System.out.print("Nhập id :");
        int id = sc.nextInt();
        
        System.out.print("Nhập price :");
        int price = sc.nextInt();
        System.out.print("Nhập name :");
        String name =sc.nextLine();
        sc.nextLine();
        System.out.print("Nhập count :");
      int count = sc.nextInt();
       System.out.print("Nhập materil :");
        String materil = sc.nextLine();
                sc.nextLine();

        System.out.print("Nhập weight :");
       String weight = sc.nextLine();
               sc.nextLine();
        System.out.print("Nhập color :");
        String color = sc.nextLine();
                sc.nextLine();

        
        Product Yarn = new Yarn(materil, weight, color, count, name, price, id);
        manager.addProdcut(Yarn);
        System.out.print(Yarn.toString());
        

    }

}
