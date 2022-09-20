import java.util.Scanner;

public class ManipulateDNA {
    public static void main (String[] args) {
        // Initialize the scanner and the input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the DNA Sequence: ");

        // Get our DNA sequence
        String sequence = sc.next();
        // Create an empty string and character - we'll be using these later!
        String reversed = "";
        char c;
        // Loop through the input, extract the character, and add it to our reversed string
        for (int i=0; i<sequence.length(); i++){
            c = sequence.charAt(i); //extracts each character
            reversed = c +reversed; //adds each character in front of the existing string
        }

        System.out.println("Length of the input sequence is: " + sequence.length());
        System.out.println("Reverse sequence is: " + reversed);
    }
}