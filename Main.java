public class Main {
    
    public static void main(String[] args) {
        Complex nb = new Complex(5, 1);

        Complex nb2 = new Complex(-22, -1);

        Complex nb3 = nb.mult(nb2);
        Complex nb4 = nb2.sub(nb);
        System.out.println(String.format("( %s ) x ( %s ) = %s", nb, nb2, nb3));
        System.out.println(String.format("( %s ) - ( %s ) = %s", nb2, nb, nb4));
    }
}
