import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Forest3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forest3 extends World
{
    //Pig pig3;
    GravityPig gPig;
    GreenfootSound music = new GreenfootSound("forest-melody.mp3");
    Lake lake = new Lake();
    /**
     * Constructor for objects of class Forest3.
     * 
     */
    public Forest3()
    {
        super(800, 600, 1); 
        setup();
        //pig3 = new Pig();
        gPig = new GravityPig(1);
        addObject(gPig, 45, 550);
        //addObject(new Lake(), 480, 428);
        //addObject(lake, 480, 428);
        addObject(lake, 595, 560);
        addObject(new DirtPile(), 475, 98);
        addObject(new DirtPile(), 84, 57);
    }
    public Forest3(boolean returning, int acc)
    {
        super(800, 600, 1); 
        setup();
        //pig3 = new Pig(acc);
        gPig = new GravityPig(acc);
        if (returning)
        {
            gPig.setImage("pigSprites/standingLeft.png");
            addObject(gPig, 755, 540);
        }
        else
        {
            addObject(gPig, 45, 550);
            //addObject(new Lake(), 480, 428);
            addObject(lake, 595, 560);
            addObject(new DirtPile(), 475, 98);
            addObject(new DirtPile(), 84, 57);
        }
    }
    private void setup()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels. 
        music.playLoop();
        setBackground(new GreenfootImage("gradient.png"));
        GreenfootImage grassImg = new GreenfootImage("Grass_small.png");
        
        int grassH = grassImg.getHeight()/2;
        int grassW = grassImg.getWidth()/2;
        int worldH = getHeight();
        int worldW = getWidth();
        Grass grass = new Grass();
        
        /* addObject(new Grass(), worldW - grassW+13, worldH - grassH-40);
        addObject(new Grass(), worldW - grassW*3+10, worldH - grassH-40);
        addObject(new Grass(), worldW - grassW*5+15, worldH - grassH-40);
        addObject(new Grass(), worldW - grassW*7+10, worldH - grassH-40);
        addObject(new Grass(), worldW - grassW+26, worldH - grassH-20);
        addObject(new Grass(), worldW - grassW*3+28, worldH - grassH-20);
        addObject(new Grass(), worldW - grassW*5+26, worldH - grassH-20);
        addObject(new Grass(), worldW - grassW*7+28, worldH - grassH-20);*/
        addObject(grass, worldW - grassW, worldH - grassH);
        addObject(new Grass(), worldW - grassW*3, worldH - grassH);
        addObject(new Grass(), worldW - grassW*5, worldH - grassH);
        addObject(new Grass(), worldW - grassW*7, worldH - grassH);
        
        addObject(new Cloud(), 315, 266);
        addObject(new Cloud(), 95, 339);
        addObject(new Cloud(), 203, 450);
        addObject(new Cloud(), 439, 132);
        addObject(new Cloud(), 359, 132);
        addObject(new Cloud(), 31, 90);
        addObject(new Cloud(), 141, 90);
        
        
        
        //addObject(pig3, 45, 550);
    }
    public void act()
    {
       if (gPig.getX() < 10 && gPig.getY() > 400)
       {
           music.stop();
           Greenfoot.setWorld(new Forest2(true, gPig.numacc()));
            // fix pig placement
       }
       if (gPig.getX() > 760 && gPig.getY() > 530)
       {
           music.stop();
           Greenfoot.setWorld(new Forest4(false, gPig.numacc()));
       }
    }
}
