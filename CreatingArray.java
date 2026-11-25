import java.util.Scanner;
public class CreatingArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
//vs code testing.
        for(int i =0; i<n; i++)
            System.out.print(arr[i] + " ");
            sc.close();
            //testing vs code is pushing code to git or not.
    }   
}