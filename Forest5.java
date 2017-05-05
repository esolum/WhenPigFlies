import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Forest5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forest5 extends World
{
    Pig pig5;
    /**
     * Constructor for objects of class Forest5.
     * 
     */
    public Forest5()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        
        pig5 = new Pig();
        
        setBackground(new GreenfootImage("magic.jpeg"));
        
        addObject(new SMushroom(), 693, 509);
        addObject(new SMushroom(),352, 527);
        addObject(new SMushroom(), 238, 502);
        addObject(new SMedMushroom(), 311, 500);
        addObject(new SMedMushroom(), 550, 487);
        addObject(new SMedMushroom(), 662, 482);
        addObject(new MedMushroom(), 597, 456);
        addObject(new LMushroom(), 428, 537);
        addObject(new LMushroom(), 723, 435);
        addObject(new SMedMushroom(), 180, 564);
        
        addObject(new Dirt(), 400, 578);
        
        addObject(new Feathers(), 726, 239);
        
        addObject(pig5, 45, 545);
        
    }
    public Forest5(int acc)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        
        pig5 = new Pig(acc);
        
        setBackground(new GreenfootImage("magic.jpeg"));
        
        addObject(new SMushroom(), 693, 509);
        addObject(new SMushroom(),352, 527);
        addObject(new SMushroom(), 238, 502);
        addObject(new SMedMushroom(), 311, 500);
        addObject(new SMedMushroom(), 550, 487);
        addObject(new SMedMushroom(), 662, 482);
        addObject(new MedMushroom(), 597, 456);
        addObject(new LMushroom(), 428, 537);
        addObject(new LMushroom(), 723, 435);
        addObject(new SMedMushroom(), 180, 564);
        
        addObject(new Dirt(), 400, 578);
        
        addObject(new Feathers(), 726, 239);
        
        addObject(pig5, 45, 545);
        
    }
    public void act()
    {
       if (pig5.getX() < 10)
       {
           Greenfoot.setWorld(new Forest4(true, pig5.numacc()));
            // fix pig placement
       }
       if (pig5.getX() > 760)
       {
           //Greenfoot.setWorld();
        }
    }
}
