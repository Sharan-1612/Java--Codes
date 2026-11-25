import java.util.Scanner;
public class FindLeadersInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Leaders in the array are : ");
        for(int i=0; i<n; i++){ 
            boolean isLeader = true;// assume the current element is a leader
            for(int j=i+1; j<n; j++){// check if there is any element greater than the current element 
                if(arr[j] > arr[i]){// if there is any element greater than the current element, then it is not a leader
                    isLeader = false;
                    break; 
                }
            }
            if(isLeader){
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}