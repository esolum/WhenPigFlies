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
    
    MushBubble bubble = new MushBubble();
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
        dream();
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
    public void dream()
    {
        if (frameCount > 100 && frameCount < 250)
        {
            bubble.setImage("dreamSpeech1.png");
            getWorld().addObject(bubble, 650, 200);
        }
        else if (frameCount >= 250 && frameCount < 400)
        {
            bubble.setImage("dreamSpeech2.png");
            getWorld().addObject(bubble, 650, 200);
        }
        else if (frameCount >= 500 && frameCount < 650)
        {
            getWorld().setBackground("dream-world-75.png");
            if (frameCount > 550)
            {
                bubble.setImage("dreamSpeech3.png");
                getWorld().addObject(bubble, 650, 200);
            }
        }
        else if (frameCount >= 650 && frameCount < 700)
        {
            getWorld().setBackground("dream-world-85.png");
        }
        else if (frameCount >= 700 && frameCount < 750)
        {
            getWorld().setBackground("dream-world-95.png");
            getImage().setTransparency(50);
        }
        else if (frameCount >= 750 && frameCount < 800)
        {
            getWorld().setBackground("dream-world-100.png");
            getImage().setTransparency(100);
            
            DreamWorld world = (DreamWorld) getWorld();
            world.music.pause();
            Greenfoot.setWorld(new FarmWorld());
        }
        
        
    }
}
