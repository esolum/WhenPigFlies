import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class CloudWorld1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CloudWorld1 extends CloudWorld
{
    GreenfootSound music = new GreenfootSound("cloud-music.wav");
    
    GravityPig gPig;
    Pig pig;
    //DisappearingCloud disappearingcloud3;
    private int frameCount = 0;
    private int bubbleCounter = 0;
    private boolean displayBubble = true;
    /**
     * Constructor for objects of class CloudWorld1.
     * 
     */
    public CloudWorld1()
    {
        super();
        setBackground("cloudWorld1.png");
        //setupLevel();
        music.playLoop();
        gPig = new GravityPig(3);
        addObject(gPig, 50, 400);
        prepare();
    }
    public CloudWorld1(GravityPig pig)
    {

        super();
        setBackground("cloudWorld1.png");
        //setupLevel();
        music.playLoop();
        gPig = pig;
        addObject(gPig, gPig.getX(), 20);
        
        prepare();
    }

    public void act() {
        frameCount++;
        if(displayBubble) {
            bubbleCounter++;
            if(bubbleCounter <= 375) {
                gPig.showCloudHint();
            }
            else {
              bubbleCounter =0;
              displayBubble = false;
              gPig.removeCloudHint();
            }
        }
        
        //Start playing music
        
        checkPigBoundaries();
    }


    private void checkPigBoundaries() {
        if(gPig.getY() < 20 && gPig.isJumping()){
            music.stop();
            CloudWorld2 world = new CloudWorld2(gPig);
            Greenfoot.setWorld(world);
        }
        else if(gPig.getY() > 580) {
            //Ye died, son
            music.stop();
            hurtScreen hurt = new hurtScreen(new CloudWorld1());
            Greenfoot.setWorld(hurt);
        }
        
    }
        
    

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //disappearingcloud3 = new DisappearingCloud();
        //addObject(disappearingcloud3, 500, 100);
        cloudLedge cloudledge = new cloudLedge();
        addObject(cloudledge,73,465);
        
        cloudLedge cloudledge2 = new cloudLedge();
        addObject(cloudledge2,235,346);
        cloudLedge cloudledge3 = new cloudLedge();
        addObject(cloudledge3,555,270);
        cloudLedge cloudledge4 = new cloudLedge();
        addObject(cloudledge4,616,100);
        cloudLedge cloudledge5 = new cloudLedge();
        addObject(cloudledge5,734,102);
        cloudLedge cloudledge6 = new cloudLedge();
        addObject(cloudledge6,217,212);
        cloudLedge cloudledge7 = new cloudLedge();
        addObject(cloudledge7,87,99);
        cloudledge.getImage().setTransparency(0);
        cloudledge2.getImage().setTransparency(0);
        cloudledge3.getImage().setTransparency(0);
        cloudledge4.getImage().setTransparency(0);
        cloudledge5.getImage().setTransparency(0);
        cloudledge6.getImage().setTransparency(0);
        cloudledge7.getImage().setTransparency(0);
        

        Cloud cloud = new Cloud();
        addObject(cloud,70,461);
        DisappearingCloud1 disappearingcloud = new DisappearingCloud1(217,206, cloudledge6);
        addObject(disappearingcloud,217,206);

        DisappearingCloud1 disappearingcloud2 = new DisappearingCloud1(235,338, cloudledge2);
        addObject(disappearingcloud2,235,338);
        DisappearingCloud1 disappearingcloud3 = new DisappearingCloud1(553,261, cloudledge3);
        addObject(disappearingcloud3,553,261);
        DisappearingCloud1 disappearingcloud4 = new DisappearingCloud1(86,92, cloudledge7);
        addObject(disappearingcloud4,86,92);

        Cloud cloud2 = new Cloud();
        addObject(cloud2,728,96);
        Cloud cloud3 = new Cloud();
        addObject(cloud3,608,97);

        //disappearingcloud.setLocation(503,395);
        //disappearingcloud.setLocation(503,454);
        //disappearingcloud.setLocation(449,172);
        //disappearingcloud.setLocation(194,102);
        //disappearingcloud2.setLocation(425,216);

        //disappearingcloud2.setLocation(350,315);

        //disappearingcloud3.setLocation(323,276);
        //disappearingcloud3.setLocation(553,261);
        

        
        
    }
    
    public void setBubbleLocation() {
        ArrayList<MushBubble> bubbles = (ArrayList<MushBubble>)getObjects(MushBubble.class);
        if(!bubbles.isEmpty()) {
            bubbles.get(0).setLocation(gPig.getX()+150, gPig.getY() - 100);
        }

    }
}





