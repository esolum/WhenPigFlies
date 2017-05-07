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
    GreenfootSound music = new GreenfootSound("forest-melody.mp3");
    
    /**
     * Constructor for objects of class Forest1.
     * 
     */
    public Forest1()
    {
        super(800, 600, 1); 
        setup();
        pig1 = new Pig();
        addObject(pig1, 55, 550); 
    }
    public Forest1(boolean returning, int acc)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        setup();
        pig1 = new Pig(acc);
        if (returning)
        {
            pig1.setImage("pigSprites/standingLeft.png");
            addObject(pig1, 755, 82);
        }
        else
        {
            addObject(pig1, 55, 550); 
        }
        
        
    }
    
    private void setup()
    {
        
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
        
    }
     public void act()
    {
        if (pig1.getX() < 20)
        {
            Greenfoot.setWorld(new Industrial2(true, pig1.numacc(), pig1.getY()));
        }
        if (pig1.getX() > 760 && pig1.getY() < 120)
        {
            //World world = new Forest2();
            Greenfoot.setWorld(new Forest2(false, pig1.numacc()));
        }
        if(!music.isPlaying()) {
            music.playLoop();
        }
    } 
}
