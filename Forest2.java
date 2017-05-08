import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Forest2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forest2 extends World
{
    //Pig pig2;
    GreenfootSound music = new GreenfootSound("forest-melody.mp3");
    GravityPig gPig;
    /**
     * Constructor for objects of class Forest2.
     * 
     */
    public Forest2()
    {
        super(800, 600, 1); 
        //pig2 = new Pig();
        gPig = new GravityPig(1);
        setup();
        
        addObject(gPig, 45, 80);
    }
    /* public Forest2(int acc)
    {
        super(800, 600, 1); 
        setup();
        pig2.setacc(acc);
        addObject(pig2, 45, 80);
    }*/
    public Forest2(boolean returning, int acc)
    {
        super(800, 600, 1); 
        setup();
        //pig2 = new Pig(acc);
        gPig = new GravityPig(acc);
        if (returning)
        {
            gPig.setImage("pigSprites/standingLeft.png");
            addObject(gPig, 760, 545);
        }
        else
        {
            addObject(gPig, 45, 80);
        }
    }
    private void setup()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        music.playLoop();
        setBackground(new GreenfootImage("gradient.png"));
        GreenfootImage grassImg = new GreenfootImage("Grass_small.png");
        
        int grassH = grassImg.getHeight()/2;
        int grassW = grassImg.getWidth()/2;
        int worldH = getHeight();
        int worldW = getWidth();
        Grass grass = new Grass();
        
        addObject(grass, worldW - grassW, worldH - grassH);
        addObject(new Grass(), worldW - grassW*3, worldH - grassH);
        addObject(new Grass(), worldW - grassW*5, worldH - grassH);
        addObject(new Grass(), worldW - grassW*7, worldH - grassH);
        
        addObject(new GreenLedge(), 33, 118);
        addObject(new GreenLedge(), 105, 118);
        addObject(new GreenLedge(), 106, 111);
        addObject(new GreenLedge(), 179, 110);
        addObject(new GreenLedge(), 296, 211);
        addObject(new GreenLedge(), 237, 206);
        addObject(new GreenLedge(), 165, 206);
        addObject(new GreenLedge(), 540, 323);
        addObject(new GreenLedge(), 473, 321);
        addObject(new GreenLedge(), 418, 325);
        addObject(new GreenLedge(), 369, 333);
        addObject(new GreenLedge(), 442, 333);
        addObject(new GreenLedge(), 515, 333);
        addObject(new GreenLedge(), 670, 446);
        addObject(new GreenLedge(), 600, 447);
        addObject(new GreenLedge(), 640, 456);
        addObject(new GreenLedge(), 567, 456);
        
        addObject(new Branch(), 93, 385);
        
        addObject(new Foliage(), 100, 149);
        addObject(new Foliage(), 100, 184);
        addObject(new FoliageSmall(), 234, 241);
        
        addObject(new SmallTrunk(),510, 460);
        addObject(new Foliage(), 460, 360);
        addObject(new FoliageTiny(), 622, 473);
        
        //addObject(pig2, 45, 80);
    }
    public void act()
    {
       if (gPig.getX() < 18 && gPig.getY() < 185)
       {
           music.stop();
           Greenfoot.setWorld(new Forest1(true, gPig.numacc()));
           
            // fix pig placement
       }
       if (gPig.getX() > 760)
       {
           music.stop();
           Greenfoot.setWorld(new Forest3(false, gPig.numacc()));
           
        }
    }
}
