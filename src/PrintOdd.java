
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.*;

class PrintOdd {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of the input file:");
            String inputFile = sc.nextLine();

            System.out.println("Enter the name of the output file:");
            String outputFile = sc.nextLine();

            Scanner inputStream = null;
            inputStream = new Scanner(new File(inputFile));

            PrintWriter outputStream = null;
            outputStream = new PrintWriter(new File(outputFile));

            while (inputStream.hasNextLine()) {

                String curLine = inputStream.nextLine();
                String[] arr = curLine.split(" ");

                for (int i = 1; i < arr.length; i++)
                    outputStream.write(arr[i] + " ");
                outputStream.println();

            }

            inputStream.close();
            outputStream.close();
            sc.close();

        }

        catch (IOException e) {
            System.out.println("Some exceptions");
        }
    }
}