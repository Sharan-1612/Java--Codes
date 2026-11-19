import java.util.Scanner;
public class EvenOrOddInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        
            if(arr[i]%2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("The number of even elements in the array is: " + even);
        System.out.println("The number of odd elements in the array is: " + odd);
        sc.close();
    }
    
}
