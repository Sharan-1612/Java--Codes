import java.util.Scanner;
public class EvenOddZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println(number + " is positive and even.");
            } else {
                System.out.println(number + " is positive and odd.");
            }
        } else if (number < 0) {
            if (number % 2 == 0) {
                System.out.println(number + " is negative and even.");
            } else {
                System.out.println(number + " is negative and odd.");
            }
        } else {
            System.out.println(number + " is zero.");
        }
    }
}
