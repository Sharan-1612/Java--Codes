import java.util.Scanner;
class SquareOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int square = n * n; // Calculate the square

        System.out.println("The square of " + n + " is: " + square);
        sc.close();
    }
}