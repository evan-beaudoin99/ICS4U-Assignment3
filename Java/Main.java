/*
* This is the main triangle
* program
*
* @author   Evan Beaudoin
* @version 1.0
* @since   2024-04-24
*/

import java.util.Scanner;
/**
 * This is the main Triangle Class.
 * Class Main
 */

final class Main {

    /**
     * This is 3.
     */
    public static final int THREE = 3;

    /**
     * This is %.4f.
     */
    public static final String POINTMM = "%.4f cm²";

    /**
     * This is another.
     */
    public static final String RAD = "%.4f rad";

    /**
     * This is another.
     */
    public static final String CM = "%.4f cm";

    /**
     * This is cm.
     */
    public static final String CENI = " cm";

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException if called
    *
    */

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");

    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {

        final Scanner firstInput = new Scanner(System.in);
        final Scanner secondInput = new Scanner(System.in);
        final Scanner thirdInput = new Scanner(System.in);

        try {

            System.out.println("Enter your triangles sides(cm)");
            System.out.print("Enter your first side: ");
            final double sideA = firstInput.nextInt();
            System.out.print("Enter your second side: ");
            final double sideB = secondInput.nextInt();
            System.out.print("Enter your third side: ");
            final double sideC = thirdInput.nextInt();

            if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
                System.out.println("Invalid Input, Number to small!");
            } else {

                // this is a triangle program
                final Triangle triangle = new Triangle(sideA, sideB, sideC);

                triangle.status();

                System.out.println("\nThe three sides were");
                System.out.println("Side A ---> " + triangle.getSideA() + CENI);
                System.out.println("Side B ---> " + triangle.getSideB() + CENI);
                System.out.println("Side C ---> " + triangle.getSideC() + CENI);

                System.out.println("The shape is a " + triangle.triangleName());

                System.out.println("The semiperimeter is "
                                + triangle.semiperimeter() + CENI);

                System.out.println("The area is " + String.format(POINTMM,
                                        triangle.area()));

                System.out.println("Angle A is " + String.format(RAD,
                                        triangle.angles(2)));
                System.out.println("Angle B is " + String.format(RAD,
                                        triangle.angles(THREE)));
                System.out.println("Angle C is " + String.format(RAD,
                                        triangle.angles(1)));

                System.out.println("The height of side A is "
                                + String.format(CM,
                                        triangle.height(1)));
                System.out.println("The height of side B is "
                                + String.format(CM,
                                        triangle.height(2)));
                System.out.println("The height of side C is "
                                + String.format(CM,
                                        triangle.height(THREE)));

                System.out.println("The inner circle radius is "
                                + String.format(CM,
                                        triangle.innerCircleRadius()));

                System.out.println("The circum circle radius is "
                                + String.format(CM,
                                        triangle.circumRadiusTriangle()));

            }
        } catch (java.util.InputMismatchException ex) {
            System.out.println("Invalid Input");
        }
        System.out.println("\nDone");
    }
}
