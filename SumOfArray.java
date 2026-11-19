import java.util.Scanner;
public class SumOfArray {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int sum=0;

        int[] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        for(int i=0; i<n; i++)
            sum = sum + arr[i];
        System.out.println("Sum of the array is: " + sum);
sc.close();
    }
    
}
