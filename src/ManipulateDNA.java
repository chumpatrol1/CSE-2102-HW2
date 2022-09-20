import java.util.Scanner;

public class ManipulateDNA {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the DNA Sequence: ");
        String sequence = sc.next();
        String reversed = "";
        char c;
        for (int i=0; i<sequence.length(); i++){
            c = sequence.charAt(i); //extracts each character
            reversed = c +reversed; //adds each character in front of the existing string
        }

        System.out.println("Length of the input sequence is: " + sequence.length());
        System.out.println("Reverse sequence is: " + reversed);
    }
}