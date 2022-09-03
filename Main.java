public class Main {
    
    public static void main(String[] args) {
        Complex nb = new Complex();
        nb.real = 5;
        nb.im = 1;

        Complex nb2 = new Complex();
        nb2.real = -22;
        nb2.im = -1;

        Complex nb3 = Complex.add(nb, nb2);
        System.out.println(String.format("( %s ) + ( %s ) = %s", nb, nb2, nb3));
    }
}
