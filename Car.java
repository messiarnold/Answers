import java.util.Scanner;

public class Car{
    int model;
    String company;
    String color;


    public void get_car(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the car model:");
        int model = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the car company:");
        String company = scanner.nextLine();
        System.out.println("Enter the car color:");
        String color = scanner.nextLine();
        this.company = company;
        this.color = color;
    }
}