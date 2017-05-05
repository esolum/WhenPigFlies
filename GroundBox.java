import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GroundBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GroundBox extends Ground
{
    /**
     * Act - do whatever the GroundBox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        checkNeighbors();
    }    
    public void checkNeighbors()
    {
        Actor neighbor = getOneIntersectingObject(MoveableBox.class);
        if (neighbor != null)
        {
            setLocation(neighbor.getX(), neighbor.getY());
        }
    }
}
