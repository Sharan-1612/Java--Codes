import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double l = sc.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double w = sc.nextDouble();

        // Calculate the area of the rectangle
        double area = l * w;

        System.out.println("Length: " + l);
        System.out.println("Width: " + w);
        System.out.println("Area of the rectangle: " + area); 
        sc.close();
    } 
}
