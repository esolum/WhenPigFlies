import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Box here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoveableBox extends Moveable
{
    private double vSpeed = 5.0;
   
    private double acceleration = 2.0;

    private boolean hasBase = false;
    /**
     * Act - do whatever the DirtPile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        checkFall();
    }   
    public boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight() /2, Ground.class);
        return under != null;
    }
    public void checkFall()
    {
        if (onGround())
        {
            vSpeed = 0;
            Actor ground = getOneIntersectingObject(IndustrialRoad.class);
            if (ground != null && hasBase == false)
            {
                GroundBox solidBox = new GroundBox();
                getWorld().addObject(solidBox, getX(), getY());
                setImage("boxBaseline.png");
                hasBase = true;
            }
        }
        else
        {
            fall();
        }

    }
    public void fall()
    {
        setLocation(getX(), getY() + (int)vSpeed);
        vSpeed = vSpeed + acceleration;        
    }
}
