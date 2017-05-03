import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
    
    public void act() {
        if(Greenfoot.mouseClicked(this))
        {
            startIntro();
            //MouseInfo mouse=Greenfoot.getMouseInfo();
            //int mX=mouse.getX(), mY=mouse.getY();
            // with text top at 80, bottom at 100, left at 350, and right at 450
            //if(mX>=350 && mX<=450 && mY>=80 && mY<=100) methodName();
        }
        
    }
    
    public void startIntro() {
        DreamWorld intro = new DreamWorld();
        Greenfoot.setWorld(intro);
    }
}
