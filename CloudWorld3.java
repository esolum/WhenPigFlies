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
        prepare();
        addObject(gPig, gPig.getX(), 580);
        setBackground("cloudWorld3.png");
    }
    
    public void act() {
        frameCount++;
        
        checkPigBoundaries();
    }
    
    private void checkPigBoundaries() {
        if(gPig.getY() > 580){ 
            music.stop();
            System.out.println("Yellow");
            CloudWorld2 world = new CloudWorld2(gPig);
            Greenfoot.setWorld(world);
        }
        
        
    }
    
    public void prepare() {
        cloudLedge ledge = new cloudLedge();
        addObject(ledge, 181, 595);
        Cloud cloud1 = new Cloud();
        addObject(cloud1, 181, 595);
        
        cloudLedge ledge2 = new cloudLedge();
        addObject(ledge2, 363, 455);
        Cloud cloud2 = new Cloud();
        addObject(cloud2, 363, 455);
        
        cloudLedge ledge3 = new cloudLedge();
        addObject(ledge3, 478, 576);
        Cloud cloud3 = new Cloud();
        addObject(cloud3, 478, 576);
        
        cloudLedge ledge4 = new cloudLedge();
        addObject(ledge4, 201, 120);
        Cloud cloud4 = new Cloud();
        addObject(cloud4, 201, 120);
        
        cloudLedge ledge5 = new cloudLedge();
        addObject(ledge5, 228, 341);
        Cloud cloud5 = new Cloud();
        addObject(cloud5, 228, 341);
        
        cloudLedge ledge6 = new cloudLedge();
        addObject(ledge6, 81, 218);
        Cloud cloud6 = new Cloud();
        addObject(cloud6, 81, 218);
        
        cloudLedge ledge7 = new cloudLedge();
        addObject(ledge7, 424, 211);
        Cloud cloud7 = new Cloud();
        addObject(cloud7, 424, 211);
        
        cloudLedge ledge8 = new cloudLedge();
        addObject(ledge8, 623, 122);
        Cloud cloud8 = new Cloud();
        addObject(cloud8, 623, 122);
        
        cloudLedge ledge9 = new cloudLedge();
        addObject(ledge9, 724, 122);
        Cloud cloud9 = new Cloud();
        addObject(cloud9, 724, 122);
       
        
        MagicDust magicdust = new MagicDust(true);
        addObject(magicdust,738,60);
        magicdust.setLocation(738,60);
    }
}
