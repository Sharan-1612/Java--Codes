import java.util.Scanner;
public class SearrchElementInArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter the element to search in the array: ");
        int find = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        boolean found = false;
        for(int i=0; i<n; i++){
            if(arr[i] == find){
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("Element found in the array");
        else
            System.out.println("Element not found in the array");
        sc.close();
}}
