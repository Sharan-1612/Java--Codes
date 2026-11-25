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
        int temp = arr[n-1]; //epo nama array oda last element eh temp la store panrom
        for(int i=n-1; i>0; i--){ //enga i oda value va n-1 va iruka mothu apro nama 0 value eh reach agum like 5 -1 = 4 so epo i oda value 4
            arr[i] = arr[i-1];//arr[4] = arr[3]etha pana mothu namaku oru element right la poi store agum athuku apro i eh decrement pandrom for example 4-1 = 3 so i oda value 3 apo 40 vanthu array oda 3rd index athu epo 4th index ku poidum 
        }
        arr[0] = temp;//again nama temp oda value eh store panrom
        System.out.println("Array after right rotation by one position: ");
        for(int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    
}
