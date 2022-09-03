public class Main {
    
    public static void main(String[] args) {
        Complex nb = new Complex();
        nb.real = 5;
        nb.im = 1;

        Complex nb2 = new Complex();
        nb2.real = -22;
        nb2.im = -1;

        Complex nb3 = nb.mult(nb2);
        Complex nb4 = nb.mult(6);
        System.out.println(String.format("( %s ) x ( %s ) = %s", nb, nb2, nb3));
        System.out.println(String.format("( %s ) x 6 = %s", nb, nb4));
    }
}
