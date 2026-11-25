import java.util.Scanner;
public class MergeTwoArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the first array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the second array : ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int j=0; j<m; j++){
            arr2[j] = sc.nextInt();
        }
        int[] merge = new int[n+m];
        for(int i=0; i<n; i++){
            merge[i] = arr[i];
        }
        for(int j=0; j<m; j++){
            merge[n+j] = arr2[j];
        }
        System.out.println("Merged array:");
        for(int x : merge){
            System.out.print(x + " ");
        }
        sc.close();
    }
}
