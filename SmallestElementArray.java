import java.util.Scanner;
public class SmallestElementArray {
    public static void main(String[] aargs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();   
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        int min = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]<min)
                min = arr[i];
        }
        System.out.println("The smallest element in the array is: " + min);
        sc.close();
    }
}
