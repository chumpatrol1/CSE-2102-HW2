import java.util.Scanner;

public class ExamAverager {
    public static void main(String[] args) {
        // starter message to let user know the purpose of the program
        // create scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("This program computes the average of a list of (nonnegative) exam scores.");
        System.out.println("Enter all the scores to be averaged.");
        System.out.println("Enter a negative number after you have entered all the scores.");

        // initializing an array to store exam value
        double floatArray[];
        floatArray = new double[100];
        // need to keep track of total exams to get an average
        int count = 0;
        double newValue;
        double tempTotal = 0;
        double examAverage = 0;

        // need to change array to -1 because what if someone scores 0
        for (int i = 0; i < floatArray.length; i++) {
            floatArray[i] = -1;
        }

        // getting our first average
        while (true) {
            // keep going until a negative input
            newValue = (sc.nextDouble());
            if (newValue < 0) {
                break;
            } else {
                // if not negative change array and incease count
                floatArray[count] = newValue;
                count += 1;
                tempTotal += newValue;

            }

        }
        // calculating average
        examAverage = (double) tempTotal / (double) count;
        System.out.println("The average is " + examAverage);

        // cur keeps track of where we are in the array
        int cur = 0;
        while (true) {
            // if array gets to -1 then that is the end of what was inputted
            if (floatArray[cur] <= -1) {
                break;
            } else {
                // formatting output based on score
                if (floatArray[cur] < examAverage) {
                    System.out.print("Score #" + (cur + 1) + ": ");
                    System.out.printf("%6f", floatArray[cur]);
                    System.out.println(" -- Below average");
                } else if (floatArray[cur] > examAverage) {
                    System.out.print("Score #" + (cur + 1) + ": ");
                    System.out.printf("%6f", floatArray[cur]);
                    System.out.println(" -- Above average");
                } else {
                    System.out.print("Score #" + (cur + 1));
                    System.out.printf("%6f", floatArray[cur]);
                    System.out.println(" -- Below average");
                }

                cur += 1;

            }
        }
        System.out.println("");
        String yesOrNo;

        // This keeps repeating until user no longer wants to average exams
        while (true) {
            System.out.println("Want to average another exam?");
            // must use print so it wont skip to next line
            System.out.print("Enter yes or no: ");
            yesOrNo = sc.next();

            // String comparision to check what was entered

            // if user wants to stop program ends
            if (yesOrNo.equals("N") || yesOrNo.equals("n")) {
                break;
            } else if (yesOrNo.equals("Y") || yesOrNo.equals("y")) {

                // Same method to get average
                System.out.println("Enter all the scores to be averaged.");
                System.out.println("Enter a negative number after you have entered all the scores.");

                // reinitialzing count and total
                count = 0;
                tempTotal = 0;

                // need to reset array
                for (int i = 0; i < floatArray.length; i++) {
                    floatArray[i] = -1;
                }
                while (true) {
                    // keep going until a negative input
                    newValue = (sc.nextInt());
                    if (newValue < 0) {
                        break;
                    } else {
                        // if not negative change array and incease count
                        floatArray[count] = newValue;
                        count += 1;
                        tempTotal += newValue;

                    }
                }
                // calculating average
                examAverage = (float) tempTotal / count;
                System.out.println("The average is " + examAverage);

                // cur keeps track of what number exam is being printed
                cur = 0;
                while (true) {
                    if (floatArray[cur] <= -1) {
                        break;
                    } else {
                        if (floatArray[cur] < examAverage) {
                            System.out.print("Score #" + (cur + 1) + ": ");
                            System.out.printf("%6f", floatArray[cur]);
                            System.out.println(" -- Below average");
                        } else if (floatArray[cur] > examAverage) {
                            System.out.print("Score #" + (cur + 1) + ": ");
                            System.out.printf("%6f", floatArray[cur]);
                            System.out.println(" -- Above average");
                        } else {
                            System.out.print("Score #" + (cur + 1) + ": ");
                            System.out.printf("%6f", floatArray[cur]);
                            System.out.println(" -- Average");
                        }
                        // update cur to go to the next exam
                        cur += 1;

                    }
                }
                System.out.println("");

            }
            // someone may misread prompt
            else {
                System.out.println("Incorrect input please restart program.");
                break;
            }

        }
        // closing scanner tool
        sc.close();
    }
}
