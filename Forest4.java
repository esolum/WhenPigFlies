import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Forest4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forest4 extends World
{
    Pig pig4;
    GravityPig gPig;
    /**
     * Constructor for objects of class Forest4.
     * 
     */
    public Forest4()
    {
        super(800, 600, 1); 
        setup();
        //pig4 = new Pig();
        gPig = new GravityPig(1);
        //addObject(pig4, 45, 545);
        addObject(gPig, 45, 545);
        addObject(new PassableForest(), 670, 380);
        addObject(new Forest(), 670, 380);
        addObject(new Mushroom(), 42, 74);
    }
    public Forest4(boolean returning, int acc)
    {
        super(800, 600, 1); 
        setup();
        //pig4 = new Pig(acc);
        gPig = new GravityPig(acc);
        
        if (returning)
        {
            gPig.setImage("pigSprites/standingLeft.png");
            pig4.setImage("pigSprites/standingLeft.png");
            //addObject(pig4, 750, 540);
            addObject(gPig, 750, 540);
            addObject(new PassableForest(), 670, 380);
        }
        else
        {
            addObject(gPig, 45, 545);
            addObject(new PassableForest(), 670, 380);
            addObject(new Forest(), 670, 380);
            addObject(new Mushroom(), 42, 74);
        }
    }
    private void setup()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        setBackground(new GreenfootImage("gradient.png"));
        
        GreenfootImage grassImg = new GreenfootImage("Grass_small.png");
        int grassH = grassImg.getHeight()/2;
        int grassW = grassImg.getWidth()/2;
        int worldH = getHeight();
        int worldW = getWidth();
        Grass grass = new Grass();
        addObject(grass, worldW - grassW, worldH - grassH);
        addObject(new Grass(), worldW - grassW*3, worldH - grassH);
        addObject(new Grass(), worldW - grassW*5, worldH - grassH);
        addObject(new Grass(), worldW - grassW*7, worldH - grassH);
        
        addObject(new Cloud(), 99, 447);
        addObject(new Cloud(), 276, 354);
        addObject(new Cloud(), 49, 267);
        addObject(new Cloud(), 313, 185);
        addObject(new Cloud(), 71, 103);
        
    }
    public void act()
    {
       if (gPig.getX() < 10 && gPig.getY() > 400)
       {
           Greenfoot.setWorld(new Forest3(true, gPig.numacc()));
           
       }
       if (gPig.getX() > 760)
       {
           //Greenfoot.setWorld(new Forest5(gPig.numacc()));
           Greenfoot.setWorld(new Forest5(gPig.numacc()));
       }
       
    }
}
