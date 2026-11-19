import java.util.Scanner;
class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double n2 = sc.nextDouble();

        // Perform basic arithmetic operations
        double addition = n1 + n2;
        double subtract = n1 - n2;
        double multiplication = n1 * n2;
        double division = n1 / n2;
        double modulus = n1 % n2;

        // Display the results
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtract);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);
        sc.close();
    }
    
}
