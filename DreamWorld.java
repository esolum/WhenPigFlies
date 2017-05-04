import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DreamWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DreamWorld extends World
{

    private int frameCount = 0;
    /**
     * Constructor for objects of class DreamWorld.
     * 
     */
    public DreamWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    }
    
    public void act() {
        frameCount++;
        
        if(Greenfoot.mouseClicked(this))
        {
            FarmWorld farm = new FarmWorld();
            Greenfoot.setWorld(farm);
            //MouseInfo mouse=Greenfoot.getMouseInfo();
            //int mX=mouse.getX(), mY=mouse.getY();
            // with text top at 80, bottom at 100, left at 350, and right at 450
            //if(mX>=350 && mX<=450 && mY>=80 && mY<=100) methodName();
        }
    }
}
