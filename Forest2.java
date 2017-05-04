import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Forest2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forest2 extends World
{
    Pig pig2 = new Pig();
    /**
     * Constructor for objects of class Forest2.
     * 
     */
    public Forest2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
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
        
        addObject(new Branch(), 93, 385);
        
        addObject(new Foliage(), 100, 149);
        addObject(new Foliage(), 100, 184);
        addObject(new FoliageSmall(), 234, 241);
        
        addObject(new SmallTrunk(),510, 460);
        addObject(new Foliage(), 460, 360);
        addObject(new FoliageTiny(), 622, 473);
        
        addObject(pig2, 45, 80);
    }
    public void act()
    {
       if (pig2.getX() < 18 && pig2.getY() < 185)
       {
           Greenfoot.setWorld(new Forest1());
            // fix pig placement
       }
       if (pig2.getX() > 760)
       {
           Greenfoot.setWorld(new Forest3());
        }
    }
}
