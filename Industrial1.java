import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Industrial1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Industrial1 extends World
{

    /**
     * Constructor for objects of class Industrial1.
     * 
     */
    public Industrial1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        setBackground("industrialBG.png");
        
        addObject(new Ground(), 774, 577);
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
        addObject(new Ground(), 774 - 15*51, 577);
        
        addObject(new Ground(), 292, 483);
        addObject(new Ground(), 292 - 51, 483);
        
        addObject(new Ground(), 292 + 2*51, 483 - 51);
        addObject(new Ground(), 292 + 3*51, 483 - 51);
        
        addObject(new Ground(), 292 - 51*2, 483 - 80);
        addObject(new Ground(), 292 - 51*3, 483 - 80);
        
        addObject(new Ground(), 292 - 51*4, 483 - 51*3);
        
        addObject(new Ground(), 292 - 51*5, 483 - 80*3);
        
        //addObject(new Pig(), 200, 500);
        addObject(new Pig(), 45, 530);
        addObject(new Wings(), 50, 200);
    }
}
