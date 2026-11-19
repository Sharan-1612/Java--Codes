import java.util.Scanner;
class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swapping: " + a + " " + b);
        // Swapping logic
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: " + a + " " + b);
        sc.close();
    }
}
