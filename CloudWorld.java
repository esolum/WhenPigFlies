import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CloudWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CloudWorld extends World
{
    
    GreenfootImage background = new GreenfootImage("cloud-world.png");
    /**
     * Constructor for objects of class CloudWorld.
     * 
     */
    public CloudWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        setBackground(background);
        
    }
}
