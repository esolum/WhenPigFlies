import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Industrial1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Industrial1 extends World
{
    Controls controls;
    GravityPig gPig;
    GreenfootSound sounds = new GreenfootSound("city-sounds.wav");
    /**
     * Constructor for objects of class Industrial1.
     * 
     */
    public Industrial1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        gPig = new GravityPig(0);
        setBackground("industrialBG.png");
        
        addObject(new IndustrialRoad(), 400, 560);
        
        BlueLedge benchLedge = new BlueLedge();
        benchLedge.getImage().scale(200, 15);
        BlueLedge stopLedge = new BlueLedge();
        stopLedge.getImage().scale(420, 15);
        BlueLedge brickLedge = new BlueLedge();
        brickLedge.getImage().scale(270, 15);
        BlueLedge trashLedge = new BlueLedge();
        trashLedge.getImage().scale(50, 15);
        BlueLedge stripeLedge = new BlueLedge();
        stripeLedge.getImage().scale(260, 15);
        BlueLedge roofLedge = new BlueLedge();
        roofLedge.getImage().scale(310, 15);
        
        Lake lake = new Lake();
        lake.getImage().scale(250, 75);
        
        addObject(benchLedge, 200, 480);
        addObject(stopLedge, 250, 325);
        addObject(new BusStop(), 250, 425);
        addObject(lake, 700, 530);
        addObject(brickLedge, 655, 460);
        addObject(stripeLedge, 670, 290);
        addObject(roofLedge, 650, 217);
        addObject(new Bakery(), 720, 300);
        addObject(trashLedge, 400, 435);
        addObject(new TrashCan(), 400, 475);
        
        addObject(gPig, 55, 400);
        
        controls = new Controls();
        addObject(controls, 400, 300);

    }
    public Industrial1(boolean returning, int acc, int pigY)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        gPig = new GravityPig(acc);
        setBackground("industrialBG.png");
        
        addObject(new IndustrialRoad(), 400, 560);
        
        BlueLedge benchLedge = new BlueLedge();
        benchLedge.getImage().scale(200, 15);
        BlueLedge stopLedge = new BlueLedge();
        stopLedge.getImage().scale(420, 15);
        BlueLedge brickLedge = new BlueLedge();
        brickLedge.getImage().scale(270, 15);
        BlueLedge trashLedge = new BlueLedge();
        trashLedge.getImage().scale(50, 15);
        BlueLedge stripeLedge = new BlueLedge();
        stripeLedge.getImage().scale(260, 15);
        BlueLedge roofLedge = new BlueLedge();
        roofLedge.getImage().scale(310, 15);
        
        Lake lake = new Lake();
        lake.getImage().scale(250, 75);
        
        addObject(benchLedge, 200, 480);
        addObject(stopLedge, 250, 325);
        addObject(new BusStop(), 250, 425);
        addObject(lake, 700, 530);
        addObject(brickLedge, 655, 460);
        addObject(stripeLedge, 670, 290);
        addObject(roofLedge, 650, 217);
        addObject(new Bakery(), 720, 300);
        addObject(trashLedge, 400, 435);
        addObject(new TrashCan(), 400, 475);
        
        if (!returning)
        {
            addObject(gPig, 55, 100); 
        }
        else 
        {
            addObject(gPig, 745, pigY);
        }

    }
    public void act(){
        if (gPig.getX() > 760 && gPig.numacc() <= 1)
        {
            Greenfoot.setWorld(new Industrial2(gPig.getY()));
            if(sounds.isPlaying()) {
                sounds.stop(); 
            }
        }
        
        if(!sounds.isPlaying()) {
           sounds.playLoop(); 
        }
        
        if (Greenfoot.isKeyDown("escape"))
        {
            removeObject(controls);
        }
    }
    
    public void stopped() {
        if(sounds.isPlaying()) {
           sounds.pause();
        }
    }
}
