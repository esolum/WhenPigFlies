import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Forest4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forest4 extends World
{
    Pig pig4 = new Pig();
    /**
     * Constructor for objects of class Forest4.
     * 
     */
    public Forest4()
    {
        super(800, 600, 1); 
        setup();
        addObject(pig4, 45, 545);
        addObject(new PassableForest(), 670, 380);
        addObject(new Forest(), 670, 380);
        addObject(new Mushroom(), 42, 74);
    }
    public Forest4(boolean returning)
    {
        super(800, 600, 1); 
        setup();
        if (returning)
        {
            pig4.setImage("pigSprites/standingLeft.png");
            addObject(pig4, 755, 565);
            addObject(new PassableForest(), 670, 380);
        }
        else
        {
            addObject(pig4, 45, 545);
            addObject(new PassableForest(), 670, 380);
            addObject(new Forest(), 670, 380);
            addObject(new Mushroom(), 42, 74);
        }
    }
    private void setup()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        setBackground(new GreenfootImage("gradient.png"));
        
        Grass grass = new Grass();
        int grassH = grass.getImage().getHeight()/2;
        int grassW = grass.getImage().getWidth()/2;
        int worldH = getHeight();
        int worldW = getWidth();
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
       if (pig4.getX() < 10 && pig4.getY() > 400)
       {
           Greenfoot.setWorld(new Forest3(true));
            // fix pig placement
       }
       if (pig4.getX() > 760)
       {
           Greenfoot.setWorld(new Forest5());
       }
       
    }
}
