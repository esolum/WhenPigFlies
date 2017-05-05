import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Industrial1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Industrial1 extends World
{
    Pig pig = new Pig();
    /**
     * Constructor for objects of class Industrial1.
     * 
     */
    public Industrial1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        setBackground("industrialBG.png");
        
        addObject(new IndustrialRoad(), 400, 560);
        addObject(new RedBldg(), 100, 400);
        addObject(new MoveableBox(), 200, 200);
        addObject(new MoveableBox(), 150, 200);
        addObject(new BlueBldg1(), 700, 400);
        addObject(new MoveableBox(), 500, 420);
        addObject(new Dumpster(), 500, 490);
        
        addObject(pig, 55, 200);
    }
    public Industrial1(boolean returning)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        setBackground("industrialBG.png");
        
        addObject(new IndustrialRoad(), 400, 560);
        addObject(new RedBldg(), 100, 400);
        addObject(new MoveableBox(), 200, 200);
        addObject(new MoveableBox(), 150, 200);
        addObject(new BlueBldg1(), 700, 400);
        addObject(new MoveableBox(), 500, 420);
        addObject(new Dumpster(), 500, 490);
        
        if (!returning)
        {
            addObject(pig, 55, 200); 
        }
        else 
        {
            addObject(pig, 745, 200);
        }

    }
    public void act(){
        if (pig.getX() > 760 && pig.getY() < 400)
        {
            Greenfoot.setWorld(new Industrial2());
        }
    }
}
