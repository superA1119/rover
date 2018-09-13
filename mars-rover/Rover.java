
/**
 * Write a description of class Rover here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rover
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int dir;
    private String name;
    private boolean isAlive;
    
    /** 
     * This is where the rover starts out.
     * 
     * @param this.x  is the x coordinate where the rover starts
     * @param this.y  is the y coordinate where the rover starts
     * @param this.dir  is the diretion the rover will be facing
     * @param this.name  is the name of the rover 
     * @param this.isAlive  is the current state of the rover whenit starts
     */
    public Rover(String name)
    {
        this.x = 0;
        this.y = 0;
        this.dir = 0;
        this.name = name;
        this.isAlive = true;
    }

    /**
     * Placement of a rover somewhere that isn't at the beginning.
     */
    public Rover (String name, int x, int y, int dir)
    {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.name = name;
        this.isAlive = true;
    }
    
    /** 
     * This is the goHome which uses the moveTo() so the rover can return to the location where it was instantiated.
     */
    public void goHome() {
        isAlive = false;
         
 
        System.out.println(this.name + " goes home" + ",x=" +  + ",y=0" +  + ",dir=" +  + ",isAlive=" + isAlive + ".");
    }
    
    /**
     * Teleports the rover to the specific x and y coordinates that you give it.
     * 
     * Keeps the direction the rover was facing the same.
     */
    public void teleportsTo(int x, int y) {
        System.out.println(this.name + " teleported to" + " x=" + x + ", y=" + y + ", dir=" + dir + ".");
    }
    
    /**
     * Moves the rover in a way that can change the direction the rover is facing.
     * 
     * The direction the rover is facing is determined by the movement of the rover in a direction.
     */
    public void moveTo(int x, int y) {
        
    }    
    
    /**
     * Rotation of the rover to the right.
     * 
     * make the rover 8-directional
     */
    public void rotateRight()
    {
        dir = dir + 2;
    
        if (dir == 8) {
            dir = 0;
        }
        
        System.out.println(this.name + " turned to the right");
    }   
    
    /**
     * Rotation of the rover is partially to the right.
     * 
     * In this case partially to the right would be to the Northeast and farther to the right.
     */
    public void rotatePartialright()
    { 
        dir = dir + 1;
        
        if (dir == 8){
            dir= 0;
        }
        
    }    
    
    /**
     * Rotaion of the rover to the left.
     * 
     * left is the number 6, which is west in this instance.
     * Make the rover 8-directional
     */
    public void rotateLeft()
    {
        dir = dir - 2;
    
        if (dir <= -1) {
            dir = 7;
    
        }   
        
        System.out.println(this.name + " turned to the left");
    }
    
    /**
     * Rotation of the rover partially to the left.
     * 
     * In this case partially to the left would be northwest and farther to the left.
     */
    public void rotatePartialleft()
    {
        dir = dir - 1;
        
        if (dir <= -1) {
            dir = 7;
        }
    }
    
    /**
     * Shows how the rover will move and the direction at the time they will move in an instance.
     * 
     * @param y  the movement of the rover north and south in the direction the rover is facing.
     * @param x  the movement of the rover east and west in the edirection the rover is facing.
     * @param dir  the direction the rover is facing before it moves.
     */
    public void move()
    {
        if (isAlive) {
            if (dir == 0) {
                y = y + 1;
            }
            else if (dir == 2) {
                x = x + 1;
            }
            else if (dir == 4) {
                y = y - 1;
            }
            else if (dir == 6){
                x = x - 1;
            }
            else if (dir == 1) {
                x = x + 1; 
            }
            else if (dir == 3) {
                y = y + 1;
            }
            else if (dir == 5) {
                x = x + 1;
            }
            else if (dir == 7) {
                y = y + 1;
            }
            
            System.out.println("The rover moved forward");
        }
        else {
            System.out.println(this.name + " can't move. It's dead.");
        }
    }
    
    /**
     * The output if one rover kills another.
     */
    public void kill(Rover other) {
        System.out.println(this.name + " shoots " + other.name + " with space lasers.");
        System.out.println(other.name + " goes 'beep beep aaaaaaakkkkkk!' and dies");
        
        other.isAlive = false;
    }
    
    /**
     * Gives the output of the code and tells the story and where the rover is.
     */
    public String toString() {
        return "Rover[name=" + name + ",x=" + x + ",y=" + y + 
               ",dir=" + dir + ",isAlive=" + isAlive + "]";
        }
    }   

