import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends Actor
{
    private int frameCount = 0;
    private boolean flying = false;
    private boolean talking = false;
    private GreenfootImage flyImg1;
    private GreenfootImage flyImg2;
    private GreenfootImage flyImgTalking;
    private GreenfootImage standingSilent;
    private GreenfootImage standingTalking;
    private int x; // Velocity in x direction
    private int y; // Velocity in y direction
    private double delta;
    private int phase = 1;
    
    MushBubble bubble = new MushBubble();
    
    public Bird(int x, int y) {
        flyImg1 = new GreenfootImage("bird/flying1.png");
        flyImg2 = new GreenfootImage("bird/flying2.png");
        standingSilent = new GreenfootImage("bird/standingSilent.png");
        standingTalking = new GreenfootImage("bird/standingTalking.png");
        flyImgTalking = new GreenfootImage("bird/flyingTalking.png");
        this.setImage(flyImg1);
        
        
        this.x = x;
        this.y = y;
        
    }
    /**
     * Act - do whatever the Bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        frameCount++;
        
        switch(phase) {
            case 1: 
                flyIn();
                break;
            case 2:
                if (getWorld() instanceof FarmWorld)
                {
                    talkToPig();
                }
                else if (getWorld() instanceof hurtScreen)
                {
                    tellPigHurt();
                }
                break;
        }
        
    }
    
    public void animateFlying() {
        if(frameCount % 15 == 0) {
            GreenfootImage curImg = getImage();
            if(curImg == flyImg1 ) {
                this.setImage(flyImg2);
            }
            else {
                setImage(flyImg1);
            }
            
        }
    }
    public void animateTalking() {
        if(frameCount % 25 == 0) {
            GreenfootImage curImg = getImage();
            if(curImg == standingTalking) {
                this.setImage(standingSilent);
            }
            else {
                this.setImage(standingTalking);
            }
            
        }
    }
    
    public void flyIn() {
        animateFlying();
        
        if(x > 550) {
            x--;  
            setLocation(x, getY());
        }
        else {
            phase++;
        }
        
        
    }
    
    public void talkToPig() {
        talking = true;
        if (frameCount >= 400 && frameCount < 550)
        {
            animateTalking();
            bubble.setImage("farmSpeech4.png");
            getWorld().addObject(bubble, 420, 100);
        }
        else if (frameCount >= 700 && frameCount < 850)
        {
            animateTalking();
            bubble.setImage("farmSpeech6.png");
            getWorld().addObject(bubble, 420, 100);
        }
        else if (frameCount >= 1000 && frameCount < 1150)
        {
            animateTalking();
            bubble.setImage("farmSpeech8.png");
            getWorld().addObject(bubble, 420, 100);
        }
        else if (frameCount >= 1150 && frameCount < 1130)
        {
            animateTalking();
            bubble.setImage("farmSpeech9.png");
            getWorld().addObject(bubble, 420, 100);
        }
        else if (frameCount >= 1130)
        {
            getWorld().removeObject(bubble);
            talking = false;
            x--;
            animateFlying();
            setLocation(x, getY());
        }
        
    }  
    public void tellPigHurt()
    {
        talking = true;
        if (frameCount >= 400 && frameCount < 550)
        {
            animateTalking();
            bubble.setImage("hurtSpeech1.png");
            getWorld().addObject(bubble, 420, 100);
        }
        else if (frameCount >= 700 && frameCount < 850)
        {
            animateTalking();
            bubble.setImage("hurtSpeech2.png");
            //getWorld().addObject(bubble, 420, 100);
        }
        else if (frameCount >= 1000 && frameCount < 1150)
        {
            animateTalking();
            bubble.setImage("hurtSpeech3.png");
            //getWorld().addObject(bubble, 420, 100);
        }
        else if (frameCount >= 1150 && frameCount < 1130)
        {
            //animateTalking();
            //bubble.setImage("farmSpeech9.png");
            //getWorld().addObject(bubble, 420, 100);
        }
        else if (frameCount >= 1130)
        {
            getWorld().removeObject(bubble);
            talking = false;
            x--;
            animateFlying();
            setLocation(x, getY());
        }
    }
}
