import java.lang.Math;
// I will do a "cast to complex" method soon

public class Complex {

    public int real;
    public int im;
    public double modulus;

    public Complex(int x, int y) {
        this.real = x;
        this.im = y;
        this.modulus = Math.pow(Math.pow(this.real, 2) + Math.pow(this.im, 2), 0.5);
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
        int resultReal = this.real + other.real;
        int resultIm = this.im + other.im;
        return new Complex(resultReal, resultIm);
    }

    public Complex mult(int other) {
        int resultReal = this.real * other;
        int resultIm = this.im * other;
        return new Complex(resultReal, resultIm);
    }
    public Complex mult(Complex other) {
        int resultReal = this.real * other.real - this.im * other.im;
        int resultIm = this.real * other.im + this.im * other.real;
        return new Complex(resultReal, resultIm);
    }

    public Complex sub(Complex other) {
        Complex result = this.add(other.mult(-1));
        return result;
    }

    public static Complex conjugate(Complex x) {
        return new Complex(x.real, -x.im);
    }

// because I suck and I did this complex class with integers, I cannot use
// doubles, so I decided to round the div result which means it is very very
// not accurate at all 
    public Complex div(Complex other) {
        Complex num = this.mult(Complex.conjugate(other));
        int den = (int) Math.round(Math.pow(other.modulus, 2));
        return new Complex(num.real/den, num.im/den);
    }
}
