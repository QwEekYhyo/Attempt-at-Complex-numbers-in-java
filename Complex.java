public class Complex {

    public int real;
    public int im;

    @Override
    public String toString() {
        String right = "";
        if (im == 1) {right = " + i";}
        else if (im == -1) {right = " - i";}
        else if (im < 0) {right = String.format(" - %si",+im);}
        else if (im > 0) {right = String.format(" + %si", im);} 
        return String.valueOf(real) + right;
    }

    public static Complex add(Complex a, Complex b) {
        Complex result = new Complex();
        result.real = a.real + b.real;
        result.im = a.im + b.im;
        return result;
    }

    public static Complex sub(Complex a, Complex b) {
    }
}

