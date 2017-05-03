import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Industrial1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Industrial1 extends World
{

    /**
     * Constructor for objects of class Industrial1.
     * 
     */
    public Industrial1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        setBackground("industrialBG.png");
        
        addObject(new Pig(), 200, 500);
        addObject(new Wings(), 50, 200);
    }
}
