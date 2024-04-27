/*
* This is the main triangle
* program
*
* @author   Evan Beaudoin
* @version 1.0
* @since   2024-04-24
*/


/**
* This is the main Triangle Class.
*/
final class Main {
    /**
     * Constants.
     */
    public static final int THREE = 3;

    /**
     * Constants.
     */
    public static final String POINTMM = "%.4f cm²";

     /**
     * Constants.
     */
    public static final String RAD = "%.4f rad";

     /**
     * Constants.
     */
    public static final String CM = "%.4f cm";

    /**
     * Constants.
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

       // Test Triangle 1
        Triangle testTriangle1 = new Triangle(3, 4, 5);
        System.out.println("Created a 3 mm by 4 mm by 5 mm triangle.");
        System.out.println(" → Is the triangle valid: " + testTriangle1.isValid());
        System.out.println(" → Semiperimeter: " + String.format("%.4f", testTriangle1.semiPerimeter()) + " mm");
        System.out.println(" → Area: " + String.format("%.4f", testTriangle1.area()) + " mm²");
        System.out.println(" → Type: " + testTriangle1.getType());
        System.out.println(" → Angle 1: " + String.format("%.4f", testTriangle1.angle(1)) + " rad");
        System.out.println(" → Angle 2: " + String.format("%.4f", testTriangle1.angle(2)) + " rad");
        System.out.println(" → Angle 3: " + String.format("%.4f", testTriangle1.angle(3)) + " rad");
        System.out.println(" → Height 1: " + String.format("%.4f", testTriangle1.height(1)) + " mm");
        System.out.println(" → Height 2: " + String.format("%.4f", testTriangle1.height(2)) + " mm");
        System.out.println(" → Height 3: " + String.format("%.4f", testTriangle1.height(3)) + " mm");
        System.out.println(" → Inner circle radius: " + String.format("%.4f", testTriangle1.innerCircleRadius()) + " mm");
        System.out.println(" → Circumcircle radius: " + String.format("%.4f", testTriangle1.circumsicleRadius()) + " mm");
        System.out.println();

        // Test Triangle 2
        Triangle testTriangle2 = new Triangle(3, 3, 3);
        System.out.println("Created a 3 mm by 3 mm by 3 mm triangle.");
        System.out.println(" → Is the triangle valid: " + testTriangle2.isValid());
        System.out.println(" → Semiperimeter: " + String.format("%.4f", testTriangle2.semiPerimeter()) + " mm");
        System.out.println(" → Area: " + String.format("%.4f", testTriangle2.area()) + " mm²");
        System.out.println(" → Type: " + testTriangle2.getType());
        System.out.println(" → Angle 1: " + String.format("%.4f", testTriangle2.angle(1)) + " rad");
        System.out.println(" → Angle 2: " + String.format("%.4f", testTriangle2.angle(2)) + " rad");
        System.out.println(" → Angle 3: " + String.format("%.4f", testTriangle2.angle(3)) + " rad");
        System.out.println(" → Height 1: " + String.format("%.4f", testTriangle2.height(1)) + " mm");
        System.out.println(" → Height 2: " + String.format("%.4f", testTriangle2.height(2)) + " mm");
        System.out.println(" → Height 3: " + String.format("%.4f", testTriangle2.height(3)) + " mm");
        System.out.println(" → Inner circle radius: " + String.format("%.4f", testTriangle2.innerCircleRadius()) + " mm");
        System.out.println(" → Circumcircle radius: " + String.format("%.4f", testTriangle2.circumsicleRadius()) + " mm");
        System.out.println();

        // Test Triangle 3
        Triangle testTriangle3 = new Triangle(3, 4, 4);
        System.out.println("Created a 3 mm by 4 mm by 4 mm triangle.");
        System.out.println(" → Is the triangle valid: " + testTriangle3.isValid());
        System.out.println(" → Semiperimeter: " + String.format("%.4f", testTriangle3.semiPerimeter()) + " mm");
        System.out.println(" → Area: " + String.format("%.4f", testTriangle3.area()) + " mm²");
        System.out.println(" → Type: " + testTriangle3.getType());
        System.out.println(" → Angle 1: " + String.format("%.4f", testTriangle3.angle(1)) + " rad");
        System.out.println(" → Angle 2: " + String.format("%.4f", testTriangle3.angle(2)) + " rad");
        System.out.println(" → Angle 3: " + String.format("%.4f", testTriangle3.angle(3)) + " rad");
        System.out.println(" → Height 1: " + String.format("%.4f", testTriangle3.height(1)) + " mm");
        System.out.println(" → Height 2: " + String.format("%.4f", testTriangle3.height(2)) + " mm");
        System.out.println(" → Height 3: " + String.format("%.4f", testTriangle3.height(3)) + " mm");
        System.out.println(" → Inner circle radius: " + String.format("%.4f", testTriangle3.innerCircleRadius()) + " mm");
        System.out.println(" → Circumcircle radius: " + String.format("%.4f", testTriangle3.circumsicleRadius()) + " mm");
        System.out.println();

         // Test Triangle 4
        Triangle testTriangle4 = new Triangle(2, 3, 4);
        System.out.println("Created a 2 mm by 3 mm by 4 mm triangle.");
        System.out.println(" → Is the triangle valid: " + testTriangle3.isValid());
        System.out.println(" → Semiperimeter: " + String.format("%.4f", testTriangle3.semiPerimeter()) + " mm");
        System.out.println(" → Area: " + String.format("%.4f", testTriangle3.area()) + " mm²");
        System.out.println(" → Type: " + testTriangle3.getType());
        System.out.println(" → Angle 1: " + String.format("%.4f", testTriangle3.angle(1)) + " rad");
        System.out.println(" → Angle 2: " + String.format("%.4f", testTriangle3.angle(2)) + " rad");
        System.out.println(" → Angle 3: " + String.format("%.4f", testTriangle3.angle(3)) + " rad");
        System.out.println(" → Height 1: " + String.format("%.4f", testTriangle3.height(1)) + " mm");
        System.out.println(" → Height 2: " + String.format("%.4f", testTriangle3.height(2)) + " mm");
        System.out.println(" → Height 3: " + String.format("%.4f", testTriangle3.height(3)) + " mm");
        System.out.println(" → Inner circle radius: " + String.format("%.4f", testTriangle3.innerCircleRadius()) + " mm");
        System.out.println(" → Circumcircle radius: " + String.format("%.4f", testTriangle3.circumsicleRadius()) + " mm");
        System.out.println();

         // Test Triangle 5
        Triangle testTriangle5 = new Triangle(23, 3, 4);
        System.out.println("Created a 23 mm by 3 mm by 4 mm triangle.");
        System.out.println(" → Is the triangle valid: " + testTriangle3.isValid());
        System.out.println(" → Semiperimeter: " + String.format("%.4f", testTriangle3.semiPerimeter()) + " mm");
        System.out.println(" → Area: " + String.format("%.4f", testTriangle3.area()) + " mm²");
        System.out.println(" → Type: " + testTriangle3.getType());
        System.out.println(" → Angle 1: " + String.format("%.4f", testTriangle3.angle(1)) + " rad");
        System.out.println(" → Angle 2: " + String.format("%.4f", testTriangle3.angle(2)) + " rad");
        System.out.println(" → Angle 3: " + String.format("%.4f", testTriangle3.angle(3)) + " rad");
        System.out.println(" → Height 1: " + String.format("%.4f", testTriangle3.height(1)) + " mm");
        System.out.println(" → Height 2: " + String.format("%.4f", testTriangle3.height(2)) + " mm");
        System.out.println(" → Height 3: " + String.format("%.4f", testTriangle3.height(3)) + " mm");
        System.out.println(" → Inner circle radius: " + String.format("%.4f", testTriangle3.innerCircleRadius()) + " mm");
        System.out.println(" → Circumcircle radius: " + String.format("%.4f", testTriangle3.circumsicleRadius()) + " mm");
        System.out.println();

        System.out.println(Done);
}
