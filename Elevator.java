import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elevator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elevator extends Ground
{
    private int frameCount = 0;
    private int y = 0;
    private boolean rise = true;
    /**
     * Act - do whatever the Elevator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //if (frameCount % 2 == 0){
            if (y == 0){
                y = getY();
            }
            if (rise){
                if (y > 105){
                    y--;
                }
                else{
                    rise = false;
                }
            }
            else{
                if (y < 475){
                    y++;
                }
                else{
                    rise = true;
                }
            }
            setLocation(getX(), y);
        //}
        frameCount++;
    }
    
    public boolean getRise()
    {
        return rise;
    }
}