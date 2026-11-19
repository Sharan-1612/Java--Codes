import java.util.*;
public class MoveZerosToEndArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();   
        int j =0; 
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++)
            if(arr[i] !- 0){
                arr[j++] = arr[i];
            }
            while(j<n){
                arr[j++] = 0;
            }
        System.out.println("Array after moving zeros to the end: " + Arrays.toString(arr));
        sc.close();
    }
    
}
