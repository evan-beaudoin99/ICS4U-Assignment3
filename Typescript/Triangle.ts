/**
 * This is the class for the 
 * Triangle program
 *
 * By:    Evan Beaudoin
 * Version: 1.0
 * Since:   2024-04-25
 */

export class Triangle {
  private sideA: number
  private sideB: number
  private sideC: number

  // this is a constructor for the inputs
  constructor(lengthA: number, lengthB: number, lengthC: number) {
    this.sideA = lengthA
    this.sideB = lengthB
    this.sideC = lengthC
  }
  
  getSideA(): number {
    return this.sideA
  }

  getSideB(): number {
    return this.sideB
  }

  getSideC(): number {
    return this.sideC
  }

  // This checks the validity of the triangle
  isValid(): boolean {
    if (
      this.sideA + this.sideB <= this.sideC ||
      this.sideB + this.sideC <= this.sideA ||
      this.sideA + this.sideC <= this.sideB
    ) {
      return false
    } else {
      return true
    }
  }

  // This is where the triangle name is created
  getType(): string {
    if (!this.isValid()) {
      const shape = '-1'
      return shape
    } else if (this.sideA === this.sideB && this.sideB === this.sideC) {
      const shape = 'Equilateral Triangle'
      return shape
    } else if (
      this.sideA === this.sideB ||
      this.sideB === this.sideC ||
      this.sideA === this.sideC
    ) {
      const shape = 'Isosceles Triangle'
      return shape
    } else if (
      this.sideA ** 2 + this.sideB ** 2 === this.sideC ** 2 ||
      this.sideC ** 2 + this.sideB ** 2 === this.sideA ** 2 ||
      this.sideC ** 2 + this.sideA ** 2 === this.sideB ** 2
    ) {
      const shape = 'Right angle Triangle'
      return shape
    } else {
      const shape = 'Scalene Triangle!'
      return shape
    }
  }

  // This is where the perimeter is calculated
  private perimeter(): number {
    if (!this.isValid()) {
      const perimeter = -1
      return perimeter
    } else {
      const perimeter = this.sideA + this.sideB + this.sideC
      return perimeter
    }
  }

  // This calculates the semiperimeter of the triangle
  semiPerimeter(): number {
    if (!this.isValid()) {
      const semiperimeter = -1
      return semiperimeter
    } else {
      const semiperimeter = this.perimeter() / 2
      return semiperimeter
    }
  }

  // This is where the area of the triangle is calculated
  area(): number {
    if (!this.isValid()) {
      const area = -1
      return area
    } else {
      const semiperimeterArea = this.triangleSemiperimeter()
      const area = Math.sqrt(
        semiperimeterArea *
          (semiperimeterArea - this.sideA) *
          (semiperimeterArea - this.sideB) *
          (semiperimeterArea - this.sideC)
      )
      return area
    }
  }

  // This calculates angles of the triangle
  angle(side: number): number {
    if (!this.isValid()) {
      const angle = -1
      return angle
    } else {
      let angle: number
      const topSideA = Math.pow(this.sideA, 2)
      const topSideB = Math.pow(this.sideB, 2)
      const topSideC = Math.pow(this.sideC, 2)
      if (side === 1) {
        angle = Math.acos(
          (topSideB + topSideC - topSideA) / (2 * this.sideB * this.sideC)
        )
      } else if (side === 2) {
        angle = Math.acos(
          (topSideA + topSideC - topSideB) / (2 * this.sideA * this.sideC)
        )
      } else {
        angle = Math.acos(
          (topSideA + topSideB - topSideC) / (2 * this.sideA * this.sideB)
        )
      }
      return angle
    }
  }

  // This calculates the height of the triangle
  height(side: number): number {
    if (!this.isValid()) {
      const height = -1
      return height
    } else {
      let height: number
      const area: number = this.triangleArea()
      if (side === 1) {
        height = (2 * area) / this.sideA
      } else if (side === 2) {
        height = (2 * area) / this.sideB
      } else {
        height = (2 * area) / this.sideC
      }
      return height
    }
  }

  // this calculates the innerCircle radius of the triangle
  innerCircleRadius(): number {
    if (!this.isValid()) {
      const innerCircle = -1
      return innerCircle
    } else {
      const innerCircle = this.triangleArea() / this.triangleSemiperimeter()
      return innerCircle
    }
  }

  // this calculates the circumRadius of the triangle
  circumRadiusTriangle(): number {
    if (!this.isValid()) {
      const circumRadius = -1
      return circumRadius
    } else {
      const circumRadius =
        (this.sideA * this.sideB * this.sideC) / (4 * this.triangleArea())
      return circumRadius
    }
  }
}
