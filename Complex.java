import java.lang.Math;

public class Complex {

    public double real;
    public double im;
    public double modulus;

    public Complex(double x, double y) {
        this.real = x;
        this.im = y;
        this.modulus = Math.pow(Math.pow(this.real, 2) + Math.pow(this.im, 2), 0.5);
    }

    // pretty useless now that I think about it
    public static Complex castToComplex(double x) {
        return new Complex(x, 0);
    }

    @Override
    public String toString() {
        String right = "";
        if (this.im == 1) {right = " + i";}
        else if (this.im == -1) {right = " - i";}
        else if (this.im < 0) {right = String.format(" - %si",-this.im);}
        else if (this.im > 0) {right = String.format(" + %si", this.im);} 
        return String.valueOf(this.real) + right;
    }

    public Complex add(Complex other) {
        double resultReal = this.real + other.real;
        double resultIm = this.im + other.im;
        return new Complex(resultReal, resultIm);
    }

    public Complex mult(double other) {
        return new Complex(this.real * other, this.im * other);
    }
    public Complex mult(Complex other) {
        double resultReal = this.real * other.real - this.im * other.im;
        double resultIm = this.real * other.im + this.im * other.real;
        return new Complex(resultReal, resultIm);
    }

    public Complex sub(Complex other) {
        Complex result = this.add(other.mult(-1));
        return result;
    }

    public static Complex conjugate(Complex x) {
        return new Complex(x.real, -x.im);
    }

    public Complex div(double other) {
        return new Complex(this.real/other, this.im/other);
    }
    public Complex div(Complex other) {
        Complex num = this.mult(Complex.conjugate(other));
        double den = Math.pow(other.modulus, 2);
        return new Complex(num.real/den, num.im/den);
    }
}
