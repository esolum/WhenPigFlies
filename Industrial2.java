import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Industrial2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Industrial2 extends World
{
    Pig pig;
    GravityPig gPig;
    GreenfootSound sounds = new GreenfootSound("city-sounds.wav");
    /**
     * Constructor for objects of class Industrial2.
     * 
     */
    public Industrial2(int pigY)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.       
        super(800, 600, 1); 
        pig = new Pig();
        gPig = new GravityPig(0);
        setBackground("industrialBG.png");
        
        addObject(new IndustrialRoad(), 400, 560);

        BlueLedge roofLedge = new BlueLedge();
        roofLedge.getImage().scale(370, 15);
        BlueLedge brickLedge = new BlueLedge();
        brickLedge.getImage().scale(270, 15);
        BlueLedge signLedge = new BlueLedge();
        signLedge.getImage().scale(50, 15);
        BlueLedge coffeeLedge = new BlueLedge();
        coffeeLedge.getImage().scale(270, 10);
        Elevator elevator = new Elevator();
        elevator.getImage().scale(85, 10);
        
        addObject(roofLedge, 40, 217);
        addObject(brickLedge, 80, 460);
        addObject(new Bakery(), 0, 300);
        
        addObject(signLedge, 300, 160);
        addObject(coffeeLedge, 465, 135); 
        addObject(new Coffee(), 455, 300);       
        addObject(new Building(), 800, 260);
        addObject(elevator, 705, 105);
        
        addObject(new Wings(), 650, 50);
        
        addObject(gPig, 55, pigY); 
    }
    public Industrial2(boolean returning, int acc, int pigY)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.        
        super(800, 600, 1); 
        pig = new Pig(acc);
        gPig = new GravityPig(acc);
        setBackground("industrialBG.png");
        
        addObject(new IndustrialRoad(), 400, 560);
        
        BlueLedge roofLedge = new BlueLedge();
        roofLedge.getImage().scale(370, 15);
        BlueLedge brickLedge = new BlueLedge();
        brickLedge.getImage().scale(270, 15);
        BlueLedge signLedge = new BlueLedge();
        signLedge.getImage().scale(50, 15);
        BlueLedge coffeeLedge = new BlueLedge();
        coffeeLedge.getImage().scale(270, 10);
        Elevator elevator = new Elevator();
        elevator.getImage().scale(85, 10);
        
        addObject(roofLedge, 40, 217);
        addObject(brickLedge, 80, 460);
        addObject(new Bakery(), 0, 300);
        
        addObject(signLedge, 300, 160);
        addObject(coffeeLedge, 465, 135); 
        addObject(new Coffee(), 455, 300);       
        addObject(new Building(), 800, 260);
        addObject(elevator, 705, 105);
        
        if (!returning)
        {
            addObject(gPig, 55, 200); 
        }
        else 
        {
            addObject(gPig, 745, pigY); 
        }
    }
    public void act(){
        if(!sounds.isPlaying()) {
           sounds.playLoop(); 
        }
        
        //if (pig.getX() < 40 && pig.getY() < 300)
        if (gPig.getX() < 40 && gPig.getY() < 400)
        {
            Greenfoot.setWorld(new Industrial1(true, gPig.numacc(), gPig.getY()));
            sounds.pause();
        }
        else if (gPig.getX() > 760 && gPig.numacc() >= 1)
        {
            Greenfoot.setWorld(new Forest1(false, gPig.numacc()));
            sounds.pause();
        }
    }
}
