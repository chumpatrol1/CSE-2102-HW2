import java.util.Scanner;
import java.lang.*;
import java.util.Arrays;

public class TriangleTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Side A: ");
        double a_side = sc.nextDouble();
        System.out.print("Side B: ");
        double b_side = sc.nextDouble();
        System.out.print("Side C: ");
        double c_side = sc.nextDouble();

        // Determine if we pass the triangle inequality theorem
        if(a_side + b_side > c_side && b_side + c_side > a_side && a_side + c_side > b_side){
            System.out.println("These lengths can form a triangle");

            // Order the sides from shortest to longest - this helps us determine if a triangle is acute, right or obtuse
            double a_squared = a_side * a_side;
            double b_squared = b_side * b_side;
            double c_squared = c_side * c_side;
            double ordered_by_size[] = new double[]{a_squared, b_squared, c_squared};
            Arrays.sort(ordered_by_size);
            
            // Determine what kind of triangle we have
            if(a_squared + b_squared == c_squared || a_squared + c_squared == b_squared || b_squared + c_squared == a_squared){
                System.out.println("It is a right triangle");
            } else if (ordered_by_size[0] + ordered_by_size[1] < ordered_by_size[2]){
                System.out.println("It is an obtuse triangle");
            } else {
                System.out.println("It is an acute triangle");
            }


        } else {
            System.out.println("These lengths cannot form a triangle");
        }
    }
}