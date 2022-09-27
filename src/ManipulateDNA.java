import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.*;

public class ManipulateDNA {
    public static void main (String[] args) {
        // Initialize the scanner and the input
        int sequence_number = 1;
        try {
            // Prompting user for input and output files
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the name of the input file: ");
            String inputFile = sc.nextLine();

            // creating scanner object to read file
            Scanner inputStream = null;
            inputStream = new Scanner(new File(inputFile));

            // looping line by line in inputFile
            while (inputStream.hasNextLine()) {

                print("SEQUENCE NUMBER ", sequence_number);
                sequence_number += 1;

                String curLine = inputStream.nextLine();
                System.out.print("INPUT SEQUENCE: ");
                System.out.println(curLine);

                // Create an empty string and character - we'll be using these later!
                String reversed = "";
                char c;
                // Loop through the input, extract the character, and add it to our reversed string
                for (int i=0; i<curLine.length(); i++){
                    c = curLine.charAt(i); //extracts each character
                    reversed = c +reversed; //adds each character in front of the existing string
                }

                System.out.print("REVERSE SEQUENCE: ");
                System.out.println(reversed);

                char d;
                String complement = "";
                // Loop through the input, extract the character, and add it to our reversed string
                for (int i=0; i<curLine.length(); i++){
                    c = curLine.charAt(i); //extracts each character

                    if(c == 'A'){
                        d = 'T';
                    } else if (c == 'T'){
                        d = 'A';
                    } else if (c == 'C'){
                        d = 'G';
                    } else {
                        d = 'C';
                    }

                    complement = d + complement; //adds each character in front of the existing string
                }

                System.out.print("COMPLEMENT SEQUENCE: ");
                System.out.println(complement);

                reversed = "";
                for (int i=0; i<complement.length(); i++){
                    c = complement.charAt(i); //extracts each character
                    reversed = c + reversed; //adds each character in front of the existing string
                }
                System.out.print("REVERSE COMPLEMENT: ");
                System.out.println(reversed);

                System.out.println();

            }
            // closing
            inputStream.close();
            sc.close();

        }
        // check for errors
        catch (IOException e) {
            System.out.println("Some exceptions");
            e.printStackTrace();
        }
        /**
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
        **/
    }
}