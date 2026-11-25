import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();//creation of an array and storing the values in an array
        }
        System.out.println("Enter the target sum: ");
        int target = sc.nextInt();
        for(int i=0; i<n; i++){//looping through the array to find the two numbers whose sum is equal to the target value
            for(int j=i+1; j<n; j++){//looping through the array to find the two numbers whose sum is equal to the target value
                if(arr[i] + arr[j] == target){//checking if the sum of two numbers is equal to the target value
                    System.out.println("The two numbers whose sum is equal to the target value are: " + arr[i] + " and " + arr[j]);
                    System.out.println("Indices: " + i + ", " + j);
                }
            }
        }
        sc.close();
    }

    
}
