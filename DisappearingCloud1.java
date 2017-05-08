import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class DisappearingCloud1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisappearingCloud1 extends Cloud
{ 
    GreenfootImage img = new GreenfootImage("cloud7.png");
    private int disCount = 0;
    private double maxDisFrames = 200.0;
    private double rate = 255.0/maxDisFrames;
    private int curTrans = 255;
    
    private boolean disappearing = false;
    private boolean hasDisappeared = false;
    public cloudLedge ledge;
    private int x;
    private int y;
    
    public DisappearingCloud1(int x, int y, cloudLedge ledge) {
        setImage(img);
        this.ledge = ledge;
        this.x = x;
        this.y = y;
        
    }
    public void act() 
    {
        /*if(ledge == null) {
            ledge = new cloudLedge();
            getWorld().addObject(ledge,x,y);
        }*/
        
        ArrayList<GravityPig> pig = (ArrayList<GravityPig>)getObjectsInRange(50, GravityPig.class);
        if(!pig.isEmpty()) {
            disappearing = true;
        }
        
        // Add your action code here.
        if(disappearing && disCount < maxDisFrames) {
            
            if(disCount < maxDisFrames) {
                disCount++;
                animateDisappearing();
            }
            else {
                hasDisappeared = true;
                
            }
        }
    }
    
    public void startDisappearing() {
        disappearing = true;
    }
    
    public boolean hasDisappeared() {
        return hasDisappeared;
    }
    
    
    private void animateDisappearing() {
        if(curTrans-rate >= 0) {
            curTrans -= rate; 
        }
        else {
            curTrans = 0;
            getWorld().removeObject(ledge);
            getWorld().removeObject(this);
            
        }
        img.setTransparency(curTrans);
        //ledge.getImage().setTransparency(curTrans);
        
    }
}
