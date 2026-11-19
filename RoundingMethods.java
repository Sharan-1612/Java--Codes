public class RoundingMethods {
    public static void main(String[] args) {
        double n1 = 3.7;
        double n2 = 4.3;

        // Rounding using Math.round()
        long rounded1 = Math.round(n1);
        long rounded2 = Math.round(n2);

        System.out.println("Rounded value of " + n1 + " is: " + rounded1); // Outputs 4
        System.out.println("Rounded value of " + n2 + " is: " + rounded2); // Outputs 4

        // Rounding using Math.floor()
        double floorValue1 = Math.floor(n1);
        double floorValue2 = Math.floor(n2);
             
        System.out.println("Floor value of " + n1 + " is: " + floorValue1); // Outputs 3.0
        System.out.println("Floor value of " + n2 + " is: " + floorValue2); // Outputs 4.0

        // Rounding using Math.ceil()
        double ceilValue1 = Math.ceil(n1);
        double ceilValue2 = Math.ceil(n2);

        System.out.println("Ceil value of " + n1 + " is: " + ceilValue1); // Outputs 4.0
        System.out.println("Ceil value of " + n2 + " is: " + ceilValue2); // Outputs 5.0
    }
}

