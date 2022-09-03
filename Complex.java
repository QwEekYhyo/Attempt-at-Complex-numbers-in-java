public class Complex {

    public int real;
    public int im;

    @Override
    public String toString() {
        String right = "";
        if (im == 1) {right = " + i";}
        else if (im == -1) {right = " - i";}
        else if (im < 0) {right = String.format(" - %si",-im);}
        else if (im > 0) {right = String.format(" + %si", im);} 
        return String.valueOf(real) + right;
    }

    public Complex add(Complex other) {
        Complex result = new Complex();
        result.real = this.real + other.real;
        result.im = this.im + other.im;
        return result;
    }

    public Complex mult(int other) {
        Complex result = new Complex();
        result.real = this.real * other;
        result.im = this.im * other;
        return result;
    }
    public Complex mult(Complex other) {
        Complex result = new Complex();
        result.real = this.real * other.real - this.im * other.im;
        result.im = this.real * other.im + this.im * other.real;
        return result;
    }

    public static void sub(Complex a, Complex b) {
    }
}
