import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CloudWorld1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CloudWorld1 extends CloudWorld
{
    GreenfootSound music = new GreenfootSound("cloud-music.wav");
    
    GravityPig gPig;
    Pig pig;
    //DisappearingCloud disappearingcloud3;
    private int frameCount = 0;
    /**
     * Constructor for objects of class CloudWorld1.
     * 
     */
    public CloudWorld1()
    {
        super();
        setBackground("cloudWorld1.png");
        //setupLevel();
        music.playLoop();
        
        prepare();
    }
    public CloudWorld1(GravityPig pig)
    {

        super();
        setBackground("cloudWorld1.png");
        //setupLevel();
        music.playLoop();
        gPig = pig;
        
        prepare();
    }

    public void act() {
        frameCount++;

        //Start playing music
        
        checkPigBoundaries();
    }


    private void checkPigBoundaries() {
        if(gPig.getY() < 20){
            music.stop();
            CloudWorld2 world = new CloudWorld2(gPig);
            Greenfoot.setWorld(world);
        }
        
        if(gPig.getY() > 580) {
            //Ye died, son
            music.stop();
            hurtScreen hurt = new hurtScreen(new CloudWorld1());
            Greenfoot.setWorld(hurt);
        }
        
    }
        
    

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //disappearingcloud3 = new DisappearingCloud();
        //addObject(disappearingcloud3, 500, 100);
        cloudLedge cloudledge = new cloudLedge();
        addObject(cloudledge,73,465);
        
        cloudLedge cloudledge2 = new cloudLedge();
        addObject(cloudledge2,350,322);
        cloudLedge cloudledge3 = new cloudLedge();
        addObject(cloudledge3,555,270);
        cloudLedge cloudledge4 = new cloudLedge();
        addObject(cloudledge4,616,100);
        cloudLedge cloudledge5 = new cloudLedge();
        addObject(cloudledge5,734,102);
        cloudLedge cloudledge6 = new cloudLedge();
        addObject(cloudledge6,195,110);

        Cloud cloud = new Cloud();
        addObject(cloud,70,461);
        DisappearingCloud disappearingcloud = new DisappearingCloud();
        addObject(disappearingcloud,194,102);

        DisappearingCloud disappearingcloud2 = new DisappearingCloud();
        addObject(disappearingcloud2,350,315);
        DisappearingCloud disappearingcloud3 = new DisappearingCloud();
        addObject(disappearingcloud3,553,261);

        Cloud cloud2 = new Cloud();
        addObject(cloud2,728,96);
        Cloud cloud3 = new Cloud();
        addObject(cloud3,608,97);

        //disappearingcloud.setLocation(503,395);
        //disappearingcloud.setLocation(503,454);
        //disappearingcloud.setLocation(449,172);
        //disappearingcloud.setLocation(194,102);
        //disappearingcloud2.setLocation(425,216);

        //disappearingcloud2.setLocation(350,315);

        //disappearingcloud3.setLocation(323,276);
        //disappearingcloud3.setLocation(553,261);
        gPig = new GravityPig(3);
        addObject(gPig, 50, 400);

        MagicDust magicdust = new MagicDust(true);
        addObject(magicdust,738,47);
        magicdust.setLocation(731,54);
        
    }
}





