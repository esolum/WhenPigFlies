import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DreamWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DreamWorld extends World
{
    GreenfootImage background = new GreenfootImage("dream-world.png");
    GreenfootSound music = new GreenfootSound("cloud-music.wav");
    private int frameCount = 0;
    /**
     * Constructor for objects of class DreamWorld.
     * 
     */
    public DreamWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        setBackground(background);
        DreamPig pig = new DreamPig();
        addObject(pig, 400, 300);
    }
    
    public void act() {
        frameCount++;
        
        if(!music.isPlaying()) {
            music.playLoop();
        }
        
        if(Greenfoot.mouseClicked(this))
        {
            FarmWorld farm = new FarmWorld();
            Greenfoot.setWorld(farm);
            if(music.isPlaying()) {
                music.stop();
            }
            //MouseInfo mouse=Greenfoot.getMouseInfo();
            //int mX=mouse.getX(), mY=mouse.getY();
            // with text top at 80, bottom at 100, left at 350, and right at 450
            //if(mX>=350 && mX<=450 && mY>=80 && mY<=100) methodName();
        }
        
    }
    
    public void stopped() {
        if(music.isPlaying()) {
            music.pause();
        }
    }
    
}
