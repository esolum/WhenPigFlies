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
        
    }
    
}
