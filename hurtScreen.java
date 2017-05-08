import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DrownScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hurtScreen extends World
{
    private int frameCount = 0;
    Bird bird = new Bird(700, 200);
    World prevWorld;
    public hurtScreen(World previousWorld)
    {    
        super(800, 600, 1); 
        setBackground(new GreenfootImage("gradient.png"));
        addObject(bird, 700, 200);
        prevWorld = previousWorld;
    }
    public void act()
    {
        frameCount++;
        
        if(Greenfoot.mouseClicked(this))
        {
            if (prevWorld instanceof Forest3)
            {
                Greenfoot.setWorld(new Forest1(false, 1));
            }
        }
        
        if (bird.getX() < 20)
        {
            removeObject(bird);
            if (prevWorld instanceof Forest3)
            {
                Greenfoot.setWorld(new Forest1(false, 1));
            }
        }
    }
}
