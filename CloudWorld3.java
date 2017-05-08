import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CloudWorld3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CloudWorld3 extends CloudWorld
{
    private int frameCount = 0;
    GravityPig gPig;
    GreenfootSound music = new GreenfootSound("cloud-music.wav");
    /**
     * Constructor for objects of class CloudWorld3.
     * 
     */
    public CloudWorld3(GravityPig pig)
    {
        gPig = pig;
        music.playLoop();
        addObject(gPig, gPig.getX(), 600);
        setBackground("cloudWorld3.png");
    }
    
    public void act() {
        frameCount++;
        
        checkPigBoundaries();
    }
    
    private void checkPigBoundaries() {
        if(gPig.getY() < 20){
            music.stop();
            CloudWorld3 world = new CloudWorld3(gPig);
            Greenfoot.setWorld(world);
        }
        
    }
}
