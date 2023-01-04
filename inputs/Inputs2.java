package inputs;

import java.util.Scanner;

class Main2 {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = obj.nextLine();

        System.out.print("Enter your age: ");
        int age = obj.nextInt();

        System.out.print("Enter your salary: ");        
        Double salary = obj.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}