import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DisappearingCloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisappearingCloud extends Ground
{
    GreenfootImage img = new GreenfootImage("cloud7.png");
    private int disCount = 0;
    private int rate = 255/55;
    private int curTrans = 255;
    private boolean disappearing = false;
    private boolean hasDisappeared = false;
    
    public DisappearingCloud() {
        setImage(img);
    }
    public void act() 
    {
        // Add your action code here.
        if(disappearing && disCount < 200) {
            
            if(disCount < 200) {
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
        }
        img.setTransparency(curTrans);
        
    }
}
