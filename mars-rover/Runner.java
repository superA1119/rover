
/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Runner
{
    /**
     * 
     */
    public static void main(String[] args) {
        Rover r1 = new Rover("Abbey", 0, 5, 4);
        Rover r2 = new Rover("Zaylin", 0, -5, 0);
        Rover r3 = new Rover("Julie", 3, 4, 5);
        Rover r4 = new Rover("Molly", -3, 4, 3);
        Rover r5 = new Rover("Sensei", -5, 0, 2);
        Rover r6 = new Rover("louis", -4, -3, 1);
        Rover r7 = new Rover("AJ", 4, -3, 7);
        Rover r8 = new Rover("Connor", 5, 0, 6);
        
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
        System.out.println(r4.toString());
        System.out.println(r5.toString());
        System.out.println(r6.toString());
        System.out.println(r7.toString());
        System.out.println(r8.toString());
        r1.teleportsTo(0,0);
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
        
        r1.goHome();        
        System.out.println(r1);
    }
}
