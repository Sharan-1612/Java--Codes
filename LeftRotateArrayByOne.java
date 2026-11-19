import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n]; //array eh create paniachu 
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); //array la input vangiachu 
        }
        int temp = arr[0];  //nama temp la array oda first element save panrom athan nama arr[0] oda value
        for(int i =0; i<n-1; i++){// enga epo i oda value va 0 nu sollitu apro nama n value eh minus pandrom like 5 -1 = 4 so epo i oda value 4
            arr[i] = arr[i+1]; //
        }
        arr[n-1] = temp;

        // Perform left rotation by one position
    }
}