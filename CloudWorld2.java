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
        prepare();
        if(gPig.getVY() > 0) {
            addObject(gPig, gPig.getX(), 21);
        }
        else if(gPig.getVY() < 0) {
            addObject(gPig, gPig.getX(), 580);
        }
        
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
        if(gPig.getY() > 580 && gPig.getVY() > 0){ 
            music.stop();
            CloudWorld1 world = new CloudWorld1(gPig);
            Greenfoot.setWorld(world);
        }
        
    }
    
    public void prepare() {
        cloudLedge cloudledge = new cloudLedge();
        addObject(cloudledge,146,592);
        Cloud cloud1 = new Cloud();
        addObject(cloud1, 146, 592);
        
        
        
        cloudLedge cloudledge2 = new cloudLedge();
        cloudledge2.getImage().setTransparency(0);
        addObject(cloudledge2,293,464);
        DisappearingCloud1 disCloud2 = new DisappearingCloud1(283, 460, cloudledge2);
        //Cloud cloud5 = new Cloud();
        addObject(disCloud2, 283, 460);
        
        cloudLedge cloudledge3 = new cloudLedge();
        addObject(cloudledge3,290,364);
        Cloud cloud3 = new Cloud();
        addObject(cloud3, 290, 364);
        
        cloudLedge cloudledge4 = new cloudLedge();
        addObject(cloudledge4,152,246);
        Cloud cloud4 = new Cloud();
        addObject(cloud4, 152, 246);
        
        //Dis
        
        cloudLedge cloudledge5 = new cloudLedge();
        addObject(cloudledge5,247,134);
        cloudledge5.getImage().setTransparency(0);
        DisappearingCloud1 disCloud1 = new DisappearingCloud1(247,134, cloudledge5);
        //Cloud cloud5 = new Cloud();
        addObject(disCloud1, 247, 134);
        
        cloudLedge cloudledge6 = new cloudLedge();
        addObject(cloudledge6,603,129);
        Cloud cloud6 = new Cloud();
        addObject(cloud6, 603, 129);
        
        cloudLedge cloudledge7 = new cloudLedge();
        addObject(cloudledge7,720,38);
        Cloud cloud7 = new Cloud();
        addObject(cloud7, 720, 38);
        
        
    }
}
