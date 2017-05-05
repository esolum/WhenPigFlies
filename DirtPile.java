import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DirtPile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DirtPile extends Moveable
{
    private double vSpeed = 5.0;
   
    private double acceleration = 2.0;
    /**
     * Act - do whatever the DirtPile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public DirtPile()
    {
        setImage("dirtpile.png");
    }
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
        if(onGround())
        {
            vSpeed = 0;
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
