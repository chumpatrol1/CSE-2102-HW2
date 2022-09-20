import java.util.Scanner;

public class ChocolateBars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight in pounds: ");
        int weight = sc.nextInt();
        System.out.print("Enter the height in inches: ");
        int height = sc.nextInt();
        System.out.print("Enter the age in years: ");
        int age = sc.nextInt();

        long woman_chocolate = Math.round((655 + (4.3 * weight) + (4.7 * height) - (4.7 * age)) / 230);
        long man_chocolate = Math.round((66 + (6.3 * weight) + (12.9 * height) - (6.8 * age)) / 230);

        System.out.println("Number of chocolate bars for woman is " + woman_chocolate);
        System.out.println("Number of chocolate bars for man is " + man_chocolate);

        sc.close();
    }
}