import java.util.Scanner;

public class CompareStrings {
    public static void main (String[] args) {
        // Initialize the scanner and get our input strings
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String string_one = sc.nextLine();
        System.out.print("Enter the second string: ");
        String string_two = sc.nextLine();
        
        // Case when exact match
        if(string_one.equals(string_two)){
            System.out.println("The two strings are equals");
        }
        // Case when case insensitive match 
        else if (string_one.toLowerCase().equals(string_two.toLowerCase())){
            System.out.println("The two strings are not equal");
            System.out.println("But the two strings are equal, ignoring case");
        } 
        // Case when no match
        else {
            System.out.println("The two strings are not equal");
            System.out.println("The two strings are not equal, even ignoring case");
        };
    }
}