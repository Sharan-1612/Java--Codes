import java.util.Scanner;
class GymMembership{
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1){
            System.out.println("The membership cost is: 2000");
        }
        else if(n==3){
            System.out.println("The membership cost is: 5000");
        }
        else if(n==6){
            System.out.println("The membership cost is: 9000");
        }
        else if(n==12){
            System.out.println("The membership cost is: 15000");
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();
    }

    
}
