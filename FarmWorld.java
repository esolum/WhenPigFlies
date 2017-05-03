import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IntroWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FarmWorld extends World
{
    private int frameCount = 0;
    
    /**
     * Constructor for objects of class IntroWorld.
     * 
     */
    public FarmWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setBackground("intro-farm-pig.png");
        
        Bird bird = new Bird(700, 200);
        addObject(bird, 700, 200);
        
        
    }
    
    public void act() {
        frameCount++;
        
        if(Greenfoot.mouseClicked(this))
        {
            Level3 level3 = new Level3();
            Greenfoot.setWorld(level3);
            //MouseInfo mouse=Greenfoot.getMouseInfo();
            //int mX=mouse.getX(), mY=mouse.getY();
            // with text top at 80, bottom at 100, left at 350, and right at 450
            //if(mX>=350 && mX<=450 && mY>=80 && mY<=100) methodName();
        }
    }
   
    
}
