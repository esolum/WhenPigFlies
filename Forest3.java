import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Forest3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forest3 extends World
{
    Pig pig3;
    Lake lake = new Lake();
    /**
     * Constructor for objects of class Forest3.
     * 
     */
    public Forest3()
    {
        super(800, 600, 1); 
        setup();
        pig3 = new Pig();
        addObject(pig3, 45, 550);
        //addObject(new Lake(), 480, 428);
        //addObject(lake, 480, 428);
        addObject(lake, 480, 560);
        addObject(new DirtPile(), 475, 98);
        addObject(new DirtPile(), 84, 57);
    }
    public Forest3(boolean returning, int acc)
    {
        super(800, 600, 1); 
        setup();
        pig3 = new Pig(acc);
        if (returning)
        {
            pig3.setImage("pigSprites/standingLeft.png");
            addObject(pig3, 755, 540);
        }
        else
        {
            addObject(pig3, 45, 550);
            //addObject(new Lake(), 480, 428);
            addObject(lake, 480, 560);
            addObject(new DirtPile(), 475, 98);
            addObject(new DirtPile(), 84, 57);
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
        
        addObject(new Cloud(), 275, 246);
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
       if (pig3.getX() < 10 && pig3.getY() > 400)
       {
           Greenfoot.setWorld(new Forest2(true, pig3.numacc()));
            // fix pig placement
       }
       if (pig3.getX() > 760)
       {
           Greenfoot.setWorld(new Forest4(false, pig3.numacc()));
       }
    }
}
