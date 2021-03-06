import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Forest5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forest5 extends World
{
    GravityPig gPig;
    GreenfootSound music = new GreenfootSound("forest-melody.mp3");
    /**
     * Constructor for objects of class Forest5.
     * 
     */
    public Forest5()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        music.playLoop();
        gPig = new GravityPig(2);
        setBackground(new GreenfootImage("magic.jpeg"));
        
        setup();
        
    }
    public Forest5(int acc)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        music.playLoop();
        gPig = new GravityPig(acc);
        setBackground(new GreenfootImage("magic.jpeg"));
        
        setup();
        
    }
    private void setup()
    {
        addObject(new MushGround(), 759, 271);
        addObject(new MushGround(), 722, 271);
        addObject(new MushGround(), 693, 272);
        addObject(new MushGround(), 691, 468);
        addObject(new MushGround(), 653, 418);
        addObject(new MushGround(), 670, 417);
        addObject(new MushGround(), 169, 502);
        addObject(new MushGround(), 189, 502);
        addObject(new MushGround(), 235, 461);
        addObject(new MushGround(), 318, 436);
        addObject(new MushGround(), 303, 435);
        addObject(new MushGround(), 351, 486);
        addObject(new MushGround(), 469, 378);
        addObject(new MushGround(), 457, 367);
        addObject(new MushGround(), 381, 391);
        addObject(new MushGround(), 391, 382);
        addObject(new MushGround(), 404, 372);
        addObject(new MushGround(), 421, 367);
        addObject(new MushGround(), 538, 424);
        addObject(new MushGround(), 560, 424);
        addObject(new MushGround(), 572, 333);
        addObject(new MushGround(), 562, 343);
        addObject(new MushGround(), 606, 335);
        addObject(new MushGround(), 560, 430);
        addObject(new MushGround(), 599, 333);
        addObject(new MushGround(), 606, 343);
        
        addObject(new SMushroom(), 693, 509);
        addObject(new SMushroom(),352, 527);
        addObject(new SMushroom(), 238, 502);
        addObject(new SMedMushroom(), 311, 500);
        addObject(new SMedMushroom(), 550, 487);
        addObject(new SMedMushroom(), 662, 482);
        addObject(new MedMushroom(), 597, 456);
        addObject(new LMushroom(), 428, 537);
        addObject(new LMushroom(), 723, 435);
        addObject(new SMedMushroom(), 180, 564);
        
        addObject(new Dirt(), 400, 578);
        
        addObject(new Feathers(), 726, 239);
        
        addObject(gPig, 45, 545);
        
    }
        
    public void act()
    {
       if (gPig.getX() < 10)
       {
           music.stop();
           Greenfoot.setWorld(new Forest4(true, gPig.numacc()));
       }
       if (gPig.getX() > 760)
       {
           //Greenfoot.setWorld();
           goToCloudWorld();
        }
    }
    
    public void goToCloudWorld() {
        music.stop();
        CloudWorld1 world = new CloudWorld1();
        Greenfoot.setWorld(world);
    }
    
    public void setBubbleLocation() {
        ArrayList<MushBubble> bubbles = (ArrayList<MushBubble>)getObjects(MushBubble.class);
        if(!bubbles.isEmpty()) {
            bubbles.get(0).setLocation(gPig.getX()-175, gPig.getY() - 100);
        }

    }
}
