import java.util.Scanner;
public class RightRotateArrayByOne {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int temp = arr[n-1];
        for(int i =0; i<n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
        System.out.println("Array after right rotation by one position: ");
        for(int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    
}
