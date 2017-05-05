import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MushBubble here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MushBubble extends Scenery
{
    /**
     * Act - do whatever the MushBubble wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public MushBubble()
    {
        setImage("mushbubble.png");
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 170, image.getHeight() - 170);
        setImage(image);
    }
}
