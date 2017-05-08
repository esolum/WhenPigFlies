import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Forest1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forest1 extends World
{
    GravityPig gPig;
    //Pig pig1 = new Pig();
    GreenfootSound music = new GreenfootSound("forest-melody.mp3");
    
    /**
     * Constructor for objects of class Forest1.
     * 
     */
    public Forest1()
    {
        super(800, 600, 1); 
        setup();
        music.playLoop();
        //pig1 = new Pig();
        gPig = new GravityPig(1);
        //addObject(pig1, 55, 550); 
        addObject(gPig, 55, 525); 
    }
    public Forest1(boolean returning, int acc)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        setup();
        //pig1 = new Pig(acc);
        gPig = new GravityPig(acc);
        music.playLoop();
        if (returning)
        {
            //pig1.setImage("pigSprites/standingLeft.png");
            gPig.setImage("pigSprites/standingLeft.png");
            addObject(gPig, 755, 82); 
            //addObject(pig1, 755, 82);
        }
        else
        {
            addObject(gPig, 55, 525);
            //addObject(pig1, 55, 550); 
        }
        
        
    }
    
    private void setup()
    {
        
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
        
        addObject(new GreenLedge(), 181, 472);
        addObject(new GreenLedge(), 163, 476);
        addObject(new GreenLedge(), 122, 306);
        addObject(new GreenLedge(), 135, 302);
        addObject(new GreenLedge(), 286, 389);
        addObject(new GreenLedge(), 271, 393);
        addObject(new GreenLedge(), 451, 238);
        addObject(new GreenLedge(), 383, 238);
        addObject(new GreenLedge(), 364, 241);
        addObject(new GreenLedge(), 343, 250);
        addObject(new GreenLedge(), 350, 246);
        addObject(new GreenLedge(), 633, 250);
        addObject(new GreenLedge(), 684, 254);
        addObject(new GreenLedge(), 590, 254);
        addObject(new GreenLedge(), 543, 265);
        addObject(new GreenLedge(), 567, 260);
        addObject(new GreenLedge(), 576, 257);
        addObject(new GreenLedge(), 550, 263);
        addObject(new GreenLedge(), 686, 144);
        addObject(new GreenLedge(), 644, 254);
        addObject(new GreenLedge(), 768, 132);
        addObject(new GreenLedge(), 726, 136);
        addObject(new GreenLedge(), 709, 140);
        addObject(new GreenLedge(), 181, 306);
        addObject(new GreenLedge(), 421, 246);
        
        addObject(new Trunk(), 350, 465);
        addObject(new HalfTrunk(), 675, 390);
        
        addObject(new Bush(), 167, 493);
        addObject(new Bush(), 275, 412);
        addObject(new MedBush(), 147, 334);
        addObject(new LargerBush(), 393, 285);
        
        addObject(new FoliageSmall(), 619, 284);
        addObject(new Foliage(), 778, 194);
        addObject(new Foliage(), 782, 170);
        
        addObject(new Tree(), 724, 510);
        
    }
     public void act()
    {
        if (gPig.getX() < 20)
        {
            Greenfoot.setWorld(new Industrial2(true, gPig.numacc(), gPig.getY()));
            music.stop();
        }
        if (gPig.getX() > 760 && gPig.getY() < 120)
        {
            //World world = new Forest2();
            Greenfoot.setWorld(new Forest2(false, gPig.numacc()));
            music.stop();
        }
        /*
        if (pig1.getX() < 20)
        {
            Greenfoot.setWorld(new Industrial2(true, pig1.numacc(), pig1.getY()));
        }
        if (pig1.getX() > 760 && pig1.getY() < 120)
        {
            //World world = new Forest2();
            Greenfoot.setWorld(new Forest2(false, pig1.numacc()));
        }*/
        if(!music.isPlaying()) {
            music.playLoop();
        }
    } 
}
