import java.util.Scanner;
import java.lang.*;

public class ChocolateBars {
    public static void main(String[] args) {
        // Initialize the scanner and get the params
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight in pounds: ");
        int weight = sc.nextInt();
        System.out.print("Enter the height in inches: ");
        int height = sc.nextInt();
        System.out.print("Enter the age in years: ");
        int age = sc.nextInt();

        char sex = '0';
        while (sex != 'm' && sex != 'w'){
            System.out.print("Enter M if Male, W if Female: ");
            sex = Character.toLowerCase(sc.next().charAt(0));
        }
        

        char activity = 'z';
        while (activity != 's' && activity != 'o' && activity != 'a' && activity != 'h'){
            System.out.print("Enter Activity Level (S if Sedentary, O if exercise occasionally, A if active, H if highly active): ");
            activity = Character.toLowerCase(sc.next().charAt(0));
        }
        // Calculate the chocolate bars

        double bmr = 0;
        
        if(sex == 'w'){
            bmr = (655 + (4.3 * weight) + (4.7 * height) - (4.7 * age));
        } else if (sex == 'm'){
            bmr = (66 + (6.3 * weight) + (12.9 * height) - (6.8 * age));
        }
         
        if(activity == 's'){
            bmr = bmr * 1.2;
        } else if (activity == 'o'){
            bmr = bmr * 1.3;
        } else if (activity == 'a'){
            bmr = bmr * 1.4;
        } else if (activity == 'h'){
            bmr = bmr * 1.5;
        }

        // Cast to int
        int chocolate = (int) Math.floor(bmr/230);

        double shown_bmr = Math.round(bmr*100);

        System.out.println("BMR Adjusted for gender and lifestyle: " + shown_bmr/100);
        System.out.println("Number of chocolate bars: " + chocolate);

        sc.close();
    }
}