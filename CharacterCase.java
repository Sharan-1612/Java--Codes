import java.util.Scanner;
class CharacterCase {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String a = sc.nextLine();
        char ch = a.charAt(0);
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Uppercase");
        } else if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        } else {
            System.out.println("Not an alphabet");
        }
        sc.close();
    }   
}