import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PrintOdd {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the input file: ");
        String file_in = sc.next();
        System.out.print("Enter the name of the output file: ");
        String file_out = sc.next();

        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        System.out.println(new File("midterm.txt").getAbsolutePath());

        try {
            File myObj = new File(file_in);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

        } catch (FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}