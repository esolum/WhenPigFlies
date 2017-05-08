import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CloudWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CloudWorld2 extends CloudWorld
{
    private int frameCount = 0;
    GravityPig gPig;
    GreenfootSound music = new GreenfootSound("cloud-music.wav");
    /**
     * Constructor for objects of class CloudWorld2.
     * 
     */
    public CloudWorld2(GravityPig pig)
    {
        gPig = pig;
        setBackground("cloudWorld2.png");
        music.playLoop();
        addObject(gPig, gPig.getX(), 600);
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
        if(gPig.getY() > 580){ 
            music.stop();
            CloudWorld1 world = new CloudWorld1(gPig);
            Greenfoot.setWorld(world);
        }
        
    }
}
