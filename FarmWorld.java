import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FarmWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FarmWorld extends World
{
    GreenfootSound ambient = new GreenfootSound("farm-sounds.wav");
    private int frameCount = 0;
    
    Bird bird = new Bird(700, 200);
    /**
     * Constructor for objects of class IntroWorld.
     * 
     */
    public FarmWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        setBackground("farmWorld.png");
        
        addObject(bird, 700, 200);
        
        Pig pig = new Pig();
        pig.setImage(new GreenfootImage("pigSprites/standingRight.png"));
        pig.disableMovement();
        addObject(pig, 100, 500);
        ambient.playLoop();
        
        IndustrialRoad road = new IndustrialRoad();
        road.getImage().setTransparency(100);
        addObject(road, 400, 560);
        
    }
    
    public void act() {
        frameCount++;
        
        if(Greenfoot.mouseClicked(this))
        {
            Industrial1 industrial = new Industrial1();
            Greenfoot.setWorld(industrial);
            if(ambient.isPlaying()) {
            
                ambient.pause();
            }
            //MouseInfo mouse=Greenfoot.getMouseInfo();
            //int mX=mouse.getX(), mY=mouse.getY();
            // with text top at 80, bottom at 100, left at 350, and right at 450
            //if(mX>=350 && mX<=450 && mY>=80 && mY<=100) methodName();
        }
        
        if (bird.getX() < 20)
        {
            if(ambient.isPlaying()) {
            
                ambient.pause();
            }
            removeObject(bird);
        }
        
    }
    
    public void stopped() {
        if(ambient.isPlaying()) {
            
            ambient.pause();
        }
    }
        
}
