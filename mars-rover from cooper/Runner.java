
/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Runner
{
    public static void main(String[] args) {
        Rover r1 = new Rover("Owen");
        Rover r2 = new Rover("Marcella", 10, -4, 2);
        System.out.println(r1.toString());
       
        r1.move();
        System.out.println(r1);
        r2.rotateRight();
        System.out.println(r2);
        r1.move();
        System.out.println(r1);
        r2.rotateLeft();
        System.out.println(r2);
        r2.rotateLeft();
        System.out.println(r2);
        r1.rotateRight();
        System.out.println(r1);
        
        r2.kill(r1);
        System.out.println(r1);
        System.out.println(r2);
        
        r1.move();        
        System.out.println(r1);
    }
}
