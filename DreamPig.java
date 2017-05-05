import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DreamPig here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DreamPig extends Actor
{
    private int frameCount = 0;
    GreenfootImage flyingUp = new GreenfootImage("pigSprites/flying-up.png");
    GreenfootImage flyingDown = new GreenfootImage("pigSprites/flying-down.png");
    
    public DreamPig() {
        setImage(flyingUp);
    }
    /**
     * Act - do whatever the DreamPig wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        frameCount++;
        animateFlying();
    }    
    
    public void animateFlying() {
        if(frameCount % 15 == 0) {
            GreenfootImage curImg = getImage();
            if(curImg == flyingUp) {
                this.setImage(flyingDown);
                this.setLocation(getX(), getY()-5);
            }
            else {
                this.setImage(flyingUp);
                this.setLocation(getX(), getY()+5);
            }
            
        }
    }
}
