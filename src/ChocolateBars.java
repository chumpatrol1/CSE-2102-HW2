import java.util.Scanner;
import java.lang.*;

public class ChocolateBars {
    public static void main(String[] args) {
        // Initialize the scanner and get the params
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight in pounds: ");
        double weight = sc.nextDouble();
        System.out.print("Enter the height in inches: ");
        double height = sc.nextDouble();
        System.out.print("Enter the age in years: ");
        double age = sc.nextDouble();

        // Take the first character and determine if it is m or w
        char sex = '0';
        while (sex != 'm' && sex != 'w'){
            System.out.print("Enter M if Male, W if Female: ");
            sex = Character.toLowerCase(sc.next().charAt(0));
        }
        
        // Take the first character and determine if it is a valid level of activity
        char activity = 'z';
        while (activity != 's' && activity != 'o' && activity != 'a' && activity != 'h'){
            System.out.print("Enter Activity Level (S if Sedentary, O if exercise occasionally, A if active, H if highly active): ");
            activity = Character.toLowerCase(sc.next().charAt(0));
        }
        // Calculate the chocolate bars

        double bmr = 0;
        // We use different formulas for bmr based on sex
        if(sex == 'w'){
            bmr = (655 + (4.3 * weight) + (4.7 * height) - (4.7 * age));
        } else if (sex == 'm'){
            bmr = (66 + (6.3 * weight) + (12.9 * height) - (6.8 * age));
        }
        // We apply different multipliers for bmr based on activity level
        if(activity == 's'){
            bmr = bmr * 1.2;
        } else if (activity == 'o'){
            bmr = bmr * 1.3;
        } else if (activity == 'a'){
            bmr = bmr * 1.4;
        } else if (activity == 'h'){
            bmr = bmr * 1.5;
        }

        // Divide by 230 and Cast to int to discover how many whole chocolate bars we need to eat
        int chocolate = (int) Math.floor(bmr/230);

        double shown_bmr = Math.round(bmr*100);

        System.out.println("BMR Adjusted for gender and lifestyle: " + shown_bmr/100);
        System.out.println("Number of chocolate bars: " + chocolate);

        sc.close();
    }
}