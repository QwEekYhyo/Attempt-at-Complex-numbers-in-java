public class Complex {

    public int real;
    public int im;

    public Complex(int x, int y) {
        this.real = x;
        this.im = y;
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

    public static void sub(Complex a, Complex b) {
    }
}
