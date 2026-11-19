import java.util.Scanner;
class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        boolean a = true;
        if (num <= 1) {
            a = false;
        } 
        else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    a   = false;
                    break;
                }
            }
        }
        if (a) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
    
}
