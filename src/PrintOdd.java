
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.*;

class PrintOdd {
    public static void main(String[] args) {
        try {
            // Prompting user for input and output files
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of the input file:");
            String inputFile = sc.nextLine();

            System.out.println("Enter the name of the output file:");
            String outputFile = sc.nextLine();

            // creating scanner object to read file
            Scanner inputStream = null;
            inputStream = new Scanner(new File(inputFile));

            PrintWriter outputStream = null;
            outputStream = new PrintWriter(new File(outputFile));

            // looping line by line in inputFile
            while (inputStream.hasNextLine()) {

                String curLine = inputStream.nextLine();
                String[] arr = curLine.split(" ");

                // i starts at 1 to skip first word
                for (int i = 1; i < arr.length; i++)
                    outputStream.write(arr[i] + " ");
                outputStream.println();

            }
            // closing
            inputStream.close();
            outputStream.close();
            sc.close();

        }
        // check for errors
        catch (IOException e) {
            System.out.println("Some exceptions");
            e.printStackTrace();
        }
    }
}