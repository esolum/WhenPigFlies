import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Industrial2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Industrial2 extends World
{
    Pig pig = new Pig();
    /**
     * Constructor for objects of class Industrial2.
     * 
     */
    public Industrial2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        setBackground("industrialBG.png");
        
        addObject(new IndustrialRoad(), 400, 560);
        
        addObject(new BlueBldg1(), 100, 400);
        addObject(new BlueBldg2(), 360, 345);
        addObject(new BlueLedge(), 500, 240);
        addObject(new TallBldg(), 750, 280);
        addObject(new Ledge(), 700, 100);
        addObject(new Ledge(), 680, 520);
        
        addObject(new Trashcan(), 540, 490);
        addObject(new MoveableBox(), 660, 460);
        
        addObject(new Wings(), 690, 50);
        
        addObject(pig, 55, 200); 
    }
    public Industrial2(boolean returning)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        setBackground("industrialBG.png");
        
        addObject(new IndustrialRoad(), 400, 560);
        
        addObject(new BlueBldg1(), 100, 400);
        addObject(new BlueBldg2(), 360, 345);
        addObject(new BlueLedge(), 500, 240);
        addObject(new TallBldg(), 750, 280);
        addObject(new Ledge(), 700, 100);
        addObject(new Ledge(), 680, 520);
        
        addObject(new Trashcan(), 540, 490);
        addObject(new MoveableBox(), 660, 460);
        
        addObject(new Wings(), 690, 50);
        
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
        if (pig.getX() < 40 && pig.getY() < 400)
        {
            Greenfoot.setWorld(new Industrial1(true));
        }
        else if (pig.getX() > 760)
        {
            Greenfoot.setWorld(new Forest1());
        }
    }
}
