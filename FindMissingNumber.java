import java.util.*;
public class FindMissingNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements : ");
    int n = sc.nextInt();
    int sum = 0;

    for(int i = 0; i < n-1; i++) {
        sum = sum + sc.nextInt();
    }
    int total = n * (n + 1) / 2;
    System.out.println("The missing number is: " + (total - sum));
    sc.close();
}
}
