import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MagicDust here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MagicDust extends Wearable
{
    private boolean sparkling = true;
    private int animationDelta = 5;
    private int frameCount = 0;
    private int glitterCount = 0;
    GreenfootImage dust0 = new GreenfootImage("magic-dust/0.png");
    GreenfootImage dust1 = new GreenfootImage("magic-dust/1.png");
    GreenfootImage dust2 = new GreenfootImage("magic-dust/2.png");
    GreenfootImage dust3 = new GreenfootImage("magic-dust/3.png");
    GreenfootImage dust4 = new GreenfootImage("magic-dust/4.png");
    GreenfootImage dust5 = new GreenfootImage("magic-dust/5.png");
    GreenfootImage dust6 = new GreenfootImage("magic-dust/6.png");
    GreenfootImage dust7 = new GreenfootImage("magic-dust/7.png");
    GreenfootImage dust8 = new GreenfootImage("magic-dust/8.png");
    GreenfootImage dust9 = new GreenfootImage("magic-dust/9.png");
    GreenfootImage dust10 = new GreenfootImage("magic-dust/10.png");
    GreenfootImage dust11 = new GreenfootImage("magic-dust/11.png");
    GreenfootImage dust12 = new GreenfootImage("magic-dust/12.png");
    GreenfootImage dust13 = new GreenfootImage("magic-dust/13.png");
    GreenfootImage dust14 = new GreenfootImage("magic-dust/14.png");
    GreenfootImage dust15 = new GreenfootImage("magic-dust/15.png");
    GreenfootImage dust16 = new GreenfootImage("magic-dust/16.png");
    GreenfootImage dust17 = new GreenfootImage("magic-dust/17.png");
    GreenfootImage dust18 = new GreenfootImage("magic-dust/18.png");
    GreenfootImage dust19 = new GreenfootImage("magic-dust/19.png");
    GreenfootImage dust20 = new GreenfootImage("magic-dust/20.png");
    GreenfootImage dust21 = new GreenfootImage("magic-dust/21.png");
    GreenfootImage dust22 = new GreenfootImage("magic-dust/22.png");
    GreenfootImage dust23 = new GreenfootImage("magic-dust/23.png");
    GreenfootImage dust24 = new GreenfootImage("magic-dust/24.png");
    GreenfootImage dust25 = new GreenfootImage("magic-dust/25.png");
    

    
    public MagicDust(boolean sparkling) {
        setImage(dust0);
        this.sparkling = sparkling;
        
    }
    /**
     * Act - do whatever the MagicDust wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        frameCount++;
        if(sparkling) {
            //Only increase glitter count every few frames
            if(frameCount%animationDelta == 0) {glitterCount++;}
            animateGlitter();
        }
        // Add your action code here.
    }    
    
    public void animateGlitter() {
        int frame = glitterCount%(25);
        switch (frame) {
            case 1:  setImage(dust1);
                     break;
            case 2:  setImage(dust2);
                     break;
            case 3:  setImage(dust3);
                     break;
            case 4:  setImage(dust4);
                     break;
            case 5:  setImage(dust5);
                     break;
            case 6:  setImage(dust6);
                     break;
            case 7:  setImage(dust7);
                     break;
            case 8:  setImage(dust8);
                     break;
            case 9:  setImage(dust9);
                     break;
            case 10: setImage(dust10);
                     break;
            case 11: setImage(dust11);
                     break;
            case 12: setImage(dust12);
                     break;
            case 13: setImage(dust13);
                     break;
            case 14: setImage(dust14);
                     break;
            case 15: setImage(dust15);
                     break;
            case 16: setImage(dust16);
                     break;
            case 17: setImage(dust17);
                     break;
            case 18: setImage(dust18);
                     break;
            case 19: setImage(dust19);
                     break;
            case 20: setImage(dust20);
                     break;
            case 21:  setImage(dust21);
                     break;
            case 22:  setImage(dust22);
                     break;
            case 23:  setImage(dust23);
                     break;
            case 24:  setImage(dust24);
                     break;
            default: setImage(dust25);
                     break;
        }
    }
}
