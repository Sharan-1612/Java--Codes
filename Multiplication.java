import java.util.Scanner;
 class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int total = a * b;
        System.out.println("Total: " + total);
        sc.close();
    }
    
}

    