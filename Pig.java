import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pig here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pig extends Actor
{
    private int hSpeed = 7;
    private double vSpeed = 5.0;
    private double moveSpeed = 2.0;
    private double acceleration = 2.0;
    private double jumpStrength = 20;
    GreenfootImage headbuttStandingLeft = new GreenfootImage("pigSprites/headbuttStandingLeft.png");
    GreenfootImage headbuttStandingRight = new GreenfootImage("pigSprites/headbuttStandingRight.png");
    GreenfootImage headbuttWalkLeft1 = new GreenfootImage("pigSprites/headbuttWalkLeft1.png");
    GreenfootImage headbuttWalkLeft2 = new GreenfootImage("pigSprites/headbuttWalkLeft2.png");
    GreenfootImage headbuttWalkRight1 = new GreenfootImage("pigSprites/headbuttWalkRight1.png");
    GreenfootImage headbuttWalkRight2 = new GreenfootImage("pigSprites/headbuttWalkRight2.png");
    GreenfootImage jumpLeft1 = new GreenfootImage("pigSprites/jumpLeft1.png");
    GreenfootImage jumpLeft2 = new GreenfootImage("pigSprites/jumpLeft2.png");
    GreenfootImage jumpRight1 = new GreenfootImage("pigSprites/jumpRight1.png");
    GreenfootImage jumpRight2 = new GreenfootImage("pigSprites/jumpRight2.png");
    GreenfootImage standingLeft = new GreenfootImage("pigSprites/standingLeft.png");
    GreenfootImage standingRight = new GreenfootImage("pigSprites/standingRight.png");
    GreenfootImage walkLeft1 = new GreenfootImage("pigSprites/walkLeft1.png");
    GreenfootImage walkLeft2 = new GreenfootImage("pigSprites/walkLeft2.png");
    GreenfootImage walkRight1 = new GreenfootImage("pigSprites/walkRight1.png");
    GreenfootImage walkRight2 = new GreenfootImage("pigSprites/walkRight2.png");
    public void Pig()
    {
        System.out.println("You loser");
        setImage(standingRight);
    }
    
    public void act() 
    {
        // Add your action code here.
        checkKeys();
        checkFall();
        //checkMoveable();
    }
    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            //setImage();
            /* if (getImage() == standingLeft)
            {
                setImage(walkLeft1);
            }
            else if (getImage() == walkLeft1)
            {
                setImage(walkLeft2);
            } */
            //if (!Greenfoot.isKeyDown("up"))
            //{
                setImage(walkLeft1);
            //}
            moveLeft();
        }
        if (Greenfoot.isKeyDown("right"))
        {
            //setImage();
            setImage(walkRight1);
            /* if (getImage() == standingRight)
            {
                setImage(walkRight1);
            }
            else if (getImage() == walkRight1)
            {
                setImage(walkRight2);
            } */
            moveRight();
        }
        if (Greenfoot.isKeyDown("up") && onGround())
        {
            jump();
        }
        if (Greenfoot.isKeyDown("space"))
        {
            headbutt();
        }
    }
    public void moveRight()
    {
        setLocation(getX() + hSpeed, getY());
    }
    public void moveLeft()
    {
        setLocation(getX() - hSpeed, getY());
    }
    public void fall()
    {
        setLocation(getX(), getY() + (int)vSpeed);
        vSpeed = vSpeed + acceleration;
        if (vSpeed > 0)
        {
            if (getImage() == jumpLeft1)
            {
                setImage(jumpLeft2);
            }
            else if (getImage() == jumpRight1)
            {
                setImage(jumpRight2);
            }
        }
    }
    public boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight() /2, Ground.class);
        return under != null;
    }
    public void checkFall()
    {
        if(onGround())
        {
            if (getImage() == jumpLeft2)
            {
                setImage(standingLeft);
            }
            else if (getImage() == jumpRight2)
            {
                setImage(standingRight);
            }
            vSpeed = 0;
        }
        else
        {
            fall();
        }
    }
    public void jump()
    {
        if (getImage() == walkLeft1 || getImage() == walkLeft2 || getImage() == standingLeft)
        {
            setImage(jumpLeft1);
        }
        else if (getImage() == walkRight1 || getImage() == walkRight2 || getImage() == standingRight)
        {
            setImage(jumpRight1);
        } 
        vSpeed = -jumpStrength;
        fall();
    }
    public void headbutt()
    {
        Actor moveable = getOneIntersectingObject(Moveable.class);
        if (moveable == null)
        {
            //setImage
        }
        else
        {
            
            moveable.setLocation(moveable.getX()+ (int)moveSpeed, moveable.getY());
        }
    }
}