import java.util.Scanner;
class PersonalDetails{
    String name;
    int age;
    String address;
    long phoneNumber;
}
class collegeDetails{
    String collegeName;
    String branch;
    int yearOfPassing;
}
class StudentDetails{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    PersonalDetails pd = new PersonalDetails();
    System.out.print("Enter your name: ");
    pd.name = sc.nextLine();
    System.out.print("Enter your age: ");
    pd.age = sc.nextInt();

    sc.nextLine(); // Consume the newline character
    
    System.out.print("Enter your address: ");
    pd.address = sc.nextLine();
    System.out.print("Enter your phone number: ");
    pd.phoneNumber = sc.nextLong();

    collegeDetails cd = new collegeDetails();
    sc.nextLine(); // Consume the newline character
    System.out.print("Enter your college name: ");
    cd.collegeName = sc.nextLine();
    System.out.print("Enter your branch: ");
    cd.branch = sc.nextLine();
    System.out.print("Enter your year of passing: ");
    cd.yearOfPassing = sc.nextInt();

    sc.close();
    
    System.out.println("\n--- Student Details ---");
    System.out.println("Student name : " + pd.name);
    System.out.println("Student age : " + pd.age);
    System.out.println("Student college name : " + cd.collegeName);
    System.out.println("Branch : " + cd.branch);
    System.out.println("Year of Passing : " + cd.yearOfPassing);
} 
}