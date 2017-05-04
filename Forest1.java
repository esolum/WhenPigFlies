import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Forest1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forest1 extends World
{
    Pig pig1 = new Pig();
    /**
     * Constructor for objects of class Forest1.
     * 
     */
    public Forest1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        //Ground ground = new Ground();
        //addObject(ground, getWidth() - (ground.getImage().getWidth()/2), getHeight() - (ground.getImage().getHeight()/2));
        setBackground(new GreenfootImage("gradient.png"));
        
        /* addObject(new Ground(), 774, 577);
        addObject(new Ground(), 774 - 51, 577);
        addObject(new Ground(), 774 - 2*51, 577);
        addObject(new Ground(), 774 - 3*51, 577);
        addObject(new Ground(), 774 - 4*51, 577);
        addObject(new Ground(), 774 - 5*51, 577);
        addObject(new Ground(), 774 - 6*51, 577);
        addObject(new Ground(), 774 - 7*51, 577);
        addObject(new Ground(), 774 - 8*51, 577);
        addObject(new Ground(), 774 - 9*51, 577);
        addObject(new Ground(), 774 - 10*51, 577);
        addObject(new Ground(), 774 - 11*51, 577);
        addObject(new Ground(), 774 - 12*51, 577);
        addObject(new Ground(), 774 - 13*51, 577);
        addObject(new Ground(), 774 - 14*51, 577);
        addObject(new Ground(), 774 - 15*51, 577); */
        
        Grass grass = new Grass();
        int grassH = grass.getImage().getHeight()/2;
        int grassW = grass.getImage().getWidth()/2;
        int worldH = getHeight();
        int worldW = getWidth();
        
        addObject(grass, worldW - grassW, worldH - grassH);
        addObject(new Grass(), worldW - grassW*3, worldH - grassH);
        addObject(new Grass(), worldW - grassW*5, worldH - grassH);
        addObject(new Grass(), worldW - grassW*7, worldH - grassH);
        
        addObject(new Trunk(), 350, 465);
        addObject(new HalfTrunk(), 675, 390);
        
        addObject(new Bush(), 167, 493);
        addObject(new Bush(), 275, 412);
        addObject(new MedBush(), 147, 334);
        addObject(new LargerBush(), 393, 285);
        
        addObject(new FoliageSmall(), 619, 284);
        addObject(new Foliage(), 784, 149);
        addObject(new Foliage(), 762, 184);
        
        addObject(new Tree(), 724, 510);
        
        //addObject(new Moveable(), 476, 539);
        
        //addObject(new Pig(), 45, 545);
        addObject(pig1, 45, 545);
    }
     public void act()
    {
       if (pig1.getX() > 760 && pig1.getY() < 120)
        {
            Greenfoot.setWorld(new Forest2());
        }
    } 
}
