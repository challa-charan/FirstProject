import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int i = input.nextInt();
        System.out.print("Enter second number: ");
        int j = input.nextInt();
        System.out.println("Addition: " + (i + j));
        System.out.println("Subtraction: " + (i - j));
        System.out.println("Multiplication: " + (i * j));
        System.out.println("Division: " + (i / j));
        System.out.println("Modulus: " + (i % j));
        input.close();
    }
}