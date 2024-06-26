/*
* Triangle class program
*
* @author  Evan Beaudoin
* @version 1.0
* @since   2024-04-24
*/

/**
 * This is the class for Triangle.
 */
final class Triangle {
    /**
     * This is the first side.
     */
    private double sideA;

    /**
     * This is the second side.
     */
    private double sideB;

    /**
     * This is the third side.
     */
    private double sideC;

    /**
     * This is the Triangle Constructor.
     *
     * @param sideA this is sideA.
     * @param sideB this is sideB.
     * @param sideC this is sideC.
     */
    public Triangle(
        double sideA,
        double sideB,
        double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /**
     * This is sideA.
     *
     * @return returns side A.
     */
    public double getSideA() {
        return this.sideA;
    }

    /**
     * This is sideB.
     *
     * @return returns side B.
     */
    public double getSideB() {
        return this.sideB;
    }

    /**
     * This is sideC.
     *
     * @return returns side C.
     */
    public double getSideC() {
        return this.sideC;
    }

    /**
     * This is the isValid function.
     *
     * @return false this is false.
     */
    public boolean isValid() {
        final boolean valid;
        if (this.sideA + this.sideB <= this.sideC
            || this.sideB + this.sideC <= this.sideA
            || this.sideA + this.sideC <= this.sideB) {
            valid = false;
        } else {
            valid = true;
        }
        return valid;
    }

    /**
     * This is the triangleName function.
     *
     * @return this.shape Returns the shape.
     */
    public String getType() {
        final String shape;
        if (!this.isValid()) {
            shape = "-1";
        } else {
            if (sideA == sideB && sideB == sideC) {
                shape = "Equilateral Triangle";
            } else if (sideA == sideB || sideB == sideC || sideA == sideC) {
                shape = "Isoceles Triangle";
            } else if (
                    sideA * sideA + sideB * sideB == sideC * sideC
                    || sideC * sideC + sideB * sideB == sideA * sideA
                    || sideC * sideC + sideA * sideA == sideB * sideB
            ) {
                shape = "Right Angle Triangle";
            } else {
                shape = "Scalene Triangle";
            }
        }
        return shape;
    }

    /**
     * This is the trianglePerimeter.
     *
     * @return this returns the perimeter.
     */
    private double perimeter() {
        final double perimeter;
        if (!this.isValid()) {
            perimeter = -1;
        } else {
            perimeter = this.sideA + this.sideC + this.sideB;
        }
        return perimeter;
    }

    /**
     * This is the semiPerimeter.
     *
     * @return this is the semierimeter.
     */
    public double semiPerimeter() {
        final double semiPerimeter;
        if (!this.isValid()) {
            semiPerimeter = -1;
        } else {
            semiPerimeter = perimeter() / 2;
        }
        return semiPerimeter;
    }

    /**
    * This is the triangleArea.
    *
    * @return this is the area.
    */
    public double area() {
        final double semiPerimeter = semiPerimeter();
        final double area;
        if (!this.isValid()) {
            area = -1;
        } else {
            area = Math.sqrt(semiPerimeter
                        * (semiPerimeter - this.sideA)
                        * (semiPerimeter - this.sideB)
                        * (semiPerimeter - this.sideC));
        }
        return area;
    }

    /**
     * This calculates the angles.
     *
     * @param side this is the side.
     * @return this returns the angles
     */
    public double angle(int side) {
        final double radian;
        final int total = 3;
        if (!this.isValid()) {
            radian = -1;
        } else {
            final double[] angles = {
                Math.acos((Math.pow(this.sideA, 2) + Math.pow(this.sideB, 2)
                - Math.pow(this.sideC, 2)) / (2 * this.sideA * this.sideB)),
                Math.acos((Math.pow(this.sideB, 2) + Math.pow(this.sideC, 2)
                - Math.pow(this.sideA, 2)) / (2 * this.sideB * this.sideC)),
                Math.acos((Math.pow(this.sideC, 2) + Math.pow(this.sideA, 2)
                - Math.pow(this.sideB, 2)) / (2 * this.sideC * this.sideA)),
            };

            radian = angles[side - 1];
        }
        return radian;
    }

    /**
     * This calculates the height of the triangle.
     *
     * @param side the sides.
     * @return returns the height.
     */
    public double height(int side) {
        final double height;
        final int total = 3;
        final double area = area();
        if (!this.isValid()) {
            height = -1;
        } else {
            final double[] heightMeasure = {
                (2 * area) / this.sideA,
                (2 * area) / this.sideB,
                (2 * area) / this.sideC,
            };

            height = heightMeasure[side - 1];
        }
        return height;
    }

    /**
     * This calculates the inner circle radius.
     *
     * @return this returns the innerCircle.
     */
    public double innerCircleRadius() {
        final double innerCircle;
        if (!this.isValid()) {
            innerCircle = -1;
        } else {
            innerCircle = this.area() / this.semiPerimeter();
        }
        return innerCircle;
    }

    /**
     * This calculates the circumRadius.
     *
     * @return This returns the circumRadius.
     */
    public double circumsicleRadius() {
        final double circumRadius;
        if (!this.isValid()) {
            circumRadius = -1;
        } else {
            circumRadius = (this.sideA * this.sideB * this.sideC)
                   / (2 * 2 * this.area());
        }
        return circumRadius;
    }
}
