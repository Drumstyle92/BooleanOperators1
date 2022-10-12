/**
 * @author Drumstyle92
 * Test class that contains the heart of the program.
 */
public class Test {
    /**
     *
     * @param args main parameter.
     * main method where we find booleans and prints.
     */
    public static void main(String[] args){

        System.out.println("---------------resultA---------------------");
        boolean a = (2 <= 2) && (!true);
        System.out.println("A: " + a);

        System.out.println("---------------resultB---------------------");
        boolean b = !false && 3 > 2;
        System.out.println("B: " + b);
        boolean t = false;
        boolean f = true;

        System.out.println("---------------resultC---------------------");
        System.out.println("C: " + !(!t || f));

        System.out.println("---------------resultD----------------------");
        boolean d = (6 > 6) ^ (true && true);
        System.out.println("D: " + d);
    }
}
