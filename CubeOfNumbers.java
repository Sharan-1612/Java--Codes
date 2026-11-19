import java.util.Scanner;
class CubeOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int cube = n * n * n; // Calculate the cube

        System.out.println("The cube of " + n + " is: " + cube);
        sc.close();
    }
    
}