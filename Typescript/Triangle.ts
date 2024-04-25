/**
* The HelloWorld program implements an application that
* simply displays "Hello World!" to the standard output.
*
* By:      Mr. Coxall
* Version: 1.0
* Since:   2020-01-01
*/ 

export class Triangle {
  private sideA: number;
  private sideB: number;
  private sideC: number;

  constructor(sideA: number, sideB: number, sideC: number) {
      this.sideA = sideA;
      this.sideB = sideB;
      this.sideC = sideC;
  }

  public getSideA(): number {
      return this.sideA;
  }

  public getSideB(): number {
      return this.sideB;
  }

  public getSideC(): number {
      return this.sideC;
  }

  private perimeter(): number {
      return this.sideA + this.sideB + this.sideC;
  }

  public isValid(): boolean {
      return (
          this.sideA + this.sideB > this.sideC &&
          this.sideB + this.sideC > this.sideA &&
          this.sideA + this.sideC > this.sideB
      );
  }

  public semiPerimeter(): number {
      return this.perimeter() / 2;
  }

  public area(): number {
      const s = this.semiPerimeter();
      return Math.sqrt(s * (s - this.sideA) * (s - this.sideB) * (s - this.sideC));
  }

  public getType(): string {
      if (!this.isValid()) {
          return "Invalid triangle";
      }

      if (this.sideA === this.sideB && this.sideB === this.sideC) {
          return "Equilateral triangle";
      }

      if (this.sideA * this.sideA + this.sideB * this.sideB === this.sideC * this.sideC ||
          this.sideB * this.sideB + this.sideC * this.sideC === this.sideA * this.sideA ||
          this.sideA * this.sideA + this.sideC * this.sideC === this.sideB * this.sideB) {
          return "Right angle triangle";
      }

      if (this.sideA === this.sideB || this.sideB === this.sideC || this.sideA === this.sideC) {
          return "Isosceles triangle";
      }

      return "Scalene triangle";
  }

  public angle(angleNumber: number): number {
      if (angleNumber === 1) {
          return Math.acos((this.sideB * this.sideB + this.sideC * this.sideC - this.sideA * this.sideA) /
              (2 * this.sideB * this.sideC));
      } else if (angleNumber === 2) {
          return Math.acos((this.sideA * this.sideA + this.sideC * this.sideC - this.sideB * this.sideB) /
              (2 * this.sideA * this.sideC));
      } else if (angleNumber === 3) {
          return Math.acos((this.sideA * this.sideA + this.sideB * this.sideB - this.sideC * this.sideC) /
              (2 * this.sideA * this.sideB));
      } else {
          throw new Error("Invalid angle number. Angle number must be 1, 2, or 3.");
      }
  }
}


