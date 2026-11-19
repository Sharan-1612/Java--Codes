import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");

    int n = sc.nextInt();
    int count = 0;

    for(int i =2; i<=n; i+=2){
      count += i;
    }
    System.out.println(count);
    sc.close();
  }
}