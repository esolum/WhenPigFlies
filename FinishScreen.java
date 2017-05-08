import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinishScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinishScreen extends World
{
    GreenfootImage background = new GreenfootImage("dream-world.png");
    //GreenfootSound music = new GreenfootSound("cloud-music.wav");
    Bird bird = new Bird(700, 200);
    private int frameCount = 0;
    boolean isBird = false;
    boolean isPig = false;
    DreamPig pig;
    public FinishScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        setBackground(background);
        pig = new DreamPig(true);
        addObject(pig, 400, 375);
        isPig = true;
        
    }
    public void act() 
    {
        frameCount++;
        
        /* if(!music.isPlaying()) 
        {
            music.playLoop();
        }*/
        if (frameCount == 100)
        {
            addObject(bird, 800, 200);
            isBird = true;
        }
        if (isBird && bird.getX() < 20)
        {
            removeObject(bird);
            isBird = false;
        }
        if (isPig && pig.getX() < 20)
        {
            removeObject(pig);
            isPig = false;
        }
    }
}
