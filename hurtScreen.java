import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DrownScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hurtScreen extends World
{

    /**
     * Constructor for objects of class DrownScreen.
     * 
     */
    private int frameCount = 0;
    Bird bird = new Bird(700, 200);
    World prevWorld;
    public hurtScreen(World previousWorld)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(bird, 700, 200);
        setBackground(new GreenfootImage("gradient.png"));
        prevWorld = previousWorld;
    }
    public void act()
    {
        frameCount++;
        
        if(Greenfoot.mouseClicked(this))
        {
            //Industrial1 industrial = new Industrial1();
            if (prevWorld instanceof Forest3)
            {
                Greenfoot.setWorld(new Forest1(false, 1));
            }
            //MouseInfo mouse=Greenfoot.getMouseInfo();
            //int mX=mouse.getX(), mY=mouse.getY();
            // with text top at 80, bottom at 100, left at 350, and right at 450
            //if(mX>=350 && mX<=450 && mY>=80 && mY<=100) methodName();
        }
        
        if (bird.getX() < 20)
        {
            removeObject(bird);
        }
    }
}
