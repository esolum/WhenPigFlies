import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pig here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pig extends Moveable
{
    private int hSpeed = 7;
    private double vSpeed = 5.0;
    private double moveSpeed = 2.0;
    private double acceleration = 2.0;
    private double jumpStrength = 20;
    private boolean canMove = true;
    private int accessories = 0; // 1 -- wings, 2 -- feathers?, 3 -- …
    
    MushBubble bubble = new MushBubble();
    public boolean message = false;
    GreenfootImage headbuttStandingLeft;// = new GreenfootImage("pigSprites/headbuttStandingLeft.png");
    GreenfootImage headbuttStandingRight;// = new GreenfootImage("pigSprites/headbuttStandingRight.png");
    GreenfootImage headbuttWalkLeft1;// = new GreenfootImage("pigSprites/headbuttWalkLeft1.png");
    GreenfootImage headbuttWalkLeft2;// = new GreenfootImage("pigSprites/headbuttWalkLeft2.png");
    GreenfootImage headbuttWalkRight1;// = new GreenfootImage("pigSprites/headbuttWalkRight1.png");
    GreenfootImage headbuttWalkRight2;// = new GreenfootImage("pigSprites/headbuttWalkRight2.png");
    GreenfootImage jumpLeft1;// = new GreenfootImage("pigSprites/jumpLeft1.png");
    GreenfootImage jumpLeft2;// = new GreenfootImage("pigSprites/jumpLeft2.png");
    GreenfootImage jumpRight1;// = new GreenfootImage("pigSprites/jumpRight1.png");
    GreenfootImage jumpRight2;// = new GreenfootImage("pigSprites/jumpRight2.png");
    GreenfootImage standingLeft;// = new GreenfootImage("pigSprites/standingLeft.png");
    GreenfootImage standingRight;// = new GreenfootImage("pigSprites/standingRight.png");
    GreenfootImage walkLeft1;// = new GreenfootImage("pigSprites/walkLeft1.png");
    GreenfootImage walkLeft2;// = new GreenfootImage("pigSprites/walkLeft2.png");
    GreenfootImage walkRight1;// = new GreenfootImage("pigSprites/walkRight1.png");
    GreenfootImage walkRight2;// = new GreenfootImage("pigSprites/walkRight2.png");
    
    public Pig()
    {
        
        
            headbuttStandingLeft = new GreenfootImage("pigSprites/headbuttStandingLeft.png");
            headbuttStandingRight = new GreenfootImage("pigSprites/headbuttStandingRight.png");
            headbuttWalkLeft1 = new GreenfootImage("pigSprites/headbuttWalkLeft1.png");
            headbuttWalkLeft2 = new GreenfootImage("pigSprites/headbuttWalkLeft2.png");
            headbuttWalkRight1 = new GreenfootImage("pigSprites/headbuttWalkRight1.png");
            headbuttWalkRight2 = new GreenfootImage("pigSprites/headbuttWalkRight2.png");
            jumpLeft1 = new GreenfootImage("pigSprites/jumpLeft1.png");
            jumpLeft2 = new GreenfootImage("pigSprites/jumpLeft2.png");
            jumpRight1 = new GreenfootImage("pigSprites/jumpRight1.png");
            jumpRight2 = new GreenfootImage("pigSprites/jumpRight2.png");
            standingLeft = new GreenfootImage("pigSprites/standingLeft.png");
            standingRight = new GreenfootImage("pigSprites/standingRight.png");
            walkLeft1 = new GreenfootImage("pigSprites/walkLeft1.png");
            walkLeft2 = new GreenfootImage("pigSprites/walkLeft2.png");
            walkRight1 = new GreenfootImage("pigSprites/walkRight1.png");
            walkRight2 = new GreenfootImage("pigSprites/walkRight2.png");
            setImage(standingRight);
    }
    public Pig(int acc)
    {
        
        if (acc == 0)
        {
            headbuttStandingLeft = new GreenfootImage("pigSprites/headbuttStandingLeft.png");
            headbuttStandingRight = new GreenfootImage("pigSprites/headbuttStandingRight.png");
            headbuttWalkLeft1 = new GreenfootImage("pigSprites/headbuttWalkLeft1.png");
            headbuttWalkLeft2 = new GreenfootImage("pigSprites/headbuttWalkLeft2.png");
            headbuttWalkRight1 = new GreenfootImage("pigSprites/headbuttWalkRight1.png");
            headbuttWalkRight2 = new GreenfootImage("pigSprites/headbuttWalkRight2.png");
            jumpLeft1 = new GreenfootImage("pigSprites/jumpLeft1.png");
            jumpLeft2 = new GreenfootImage("pigSprites/jumpLeft2.png");
            jumpRight1 = new GreenfootImage("pigSprites/jumpRight1.png");
            jumpRight2 = new GreenfootImage("pigSprites/jumpRight2.png");
            standingLeft = new GreenfootImage("pigSprites/standingLeft.png");
            standingRight = new GreenfootImage("pigSprites/standingRight.png");
            walkLeft1 = new GreenfootImage("pigSprites/walkLeft1.png");
            walkLeft2 = new GreenfootImage("pigSprites/walkLeft2.png");
            walkRight1 = new GreenfootImage("pigSprites/walkRight1.png");
            walkRight2 = new GreenfootImage("pigSprites/walkRight2.png");
        }
        else if (acc == 1)
        {
                headbuttStandingLeft = new GreenfootImage("pigSprites/headbuttStandingWingsLeft.png");
                headbuttStandingRight = new GreenfootImage("pigSprites/headbuttStandingWingsRight.png");
                headbuttWalkLeft1 = new GreenfootImage("pigSprites/headbuttWalkWingsLeft1.png");
                headbuttWalkLeft2 = new GreenfootImage("pigSprites/headbuttWalkWingsLeft2.png");
                headbuttWalkRight1 = new GreenfootImage("pigSprites/headbuttWalkWingsRight1.png");
                headbuttWalkRight2 = new GreenfootImage("pigSprites/headbuttWalkWingsRight2.png");
                jumpLeft1 = new GreenfootImage("pigSprites/jumpWingsLeft1.png");
                jumpLeft2 = new GreenfootImage("pigSprites/jumpWingsLeft2.png");
                jumpRight1 = new GreenfootImage("pigSprites/jumpWingsRight1.png");
                jumpRight2 = new GreenfootImage("pigSprites/jumpWingsRight2.png");
                standingLeft = new GreenfootImage("pigSprites/standingWingsLeft.png");
                standingRight = new GreenfootImage("pigSprites/standingWingsRight.png");
                walkLeft1 = new GreenfootImage("pigSprites/walkWingsLeft1.png");
                walkLeft2 = new GreenfootImage("pigSprites/walkWingsLeft2.png");
                walkRight1 = new GreenfootImage("pigSprites/walkWingsRight1.png");
                walkRight2 = new GreenfootImage("pigSprites/walkWingsRight2.png");
        }
        else if (acc == 2)
        {
            headbuttStandingLeft = new GreenfootImage("pigSprites/headbuttStandingFeathersLeft.png");
                headbuttStandingRight = new GreenfootImage("pigSprites/headbuttStandingFeathersRight.png");
                headbuttWalkLeft1 = new GreenfootImage("pigSprites/headbuttWalkWingsLeft1.png");
                headbuttWalkLeft2 = new GreenfootImage("pigSprites/headbuttWalkFeathersLeft2.png");
                headbuttWalkRight1 = new GreenfootImage("pigSprites/headbuttWalkWingsRight1.png");
                headbuttWalkRight2 = new GreenfootImage("pigSprites/headbuttWalkFeathersRight2.png");
                jumpLeft1 = new GreenfootImage("pigSprites/jumpFeathersLeft1.png");
                jumpLeft2 = new GreenfootImage("pigSprites/jumpFeathersLeft2.png");
                jumpRight1 = new GreenfootImage("pigSprites/jumpFeathersRight1.png");
                jumpRight2 = new GreenfootImage("pigSprites/jumpFeathersRight2.png");
                standingLeft = new GreenfootImage("pigSprites/standingFeathersLeft.png");
                standingRight = new GreenfootImage("pigSprites/standingFeathersRight.png");
                walkLeft1 = new GreenfootImage("pigSprites/walkWingsLeft1.png");
                walkLeft2 = new GreenfootImage("pigSprites/walkWingsLeft2.png");
                walkRight1 = new GreenfootImage("pigSprites/walkWingsRight1.png");
                walkRight2 = new GreenfootImage("pigSprites/walkWingsRight2.png");
        }
        setImage(standingRight);
        accessories = acc;
        
    }
    public int numacc()
    {
        return accessories;
    } 
    public void setacc(int acc)
    {
        accessories = acc;
    }
    public void act() 
    {
        // Add your action code here.
        if(canMove) {
            checkKeys();
        }
        
        checkFall();
        checkKeys();
        checkLake();
        checkMush();
        checkWearing();
    }
    
    private void checkKeys()
    {
        
       if (getOneObjectAtOffset(-getImage().getWidth()/2, 0, ImpassibleScenery.class) == null)
        {
            if (Greenfoot.isKeyDown("left"))
            {
                if (!Greenfoot.isKeyDown("up"))
                {
                    if (getImage() == standingLeft)
                    {
                        setImage(walkLeft1);
                    }
                    else if (getImage() == walkLeft1)
                    {
                        setImage(walkLeft2);
                    } 
                    else
                    {
                        setImage(standingLeft);
                    }
                }
                moveLeft();
            }
        }
        if (getOneIntersectingObject(ImpassibleScenery.class) == null)
        {
            if (Greenfoot.isKeyDown("right"))
            {
                if (!Greenfoot.isKeyDown("up"))
                {
            
                    if (getImage() == standingRight)
                    {
                        setImage(walkRight1);
                    }
                    else if (getImage() == walkRight1)
                    {
                        setImage(walkRight2);
                    } 
                    else
                    {
                        setImage(standingRight);
                    }
                }
                moveRight();
            }
        }
        if (Greenfoot.isKeyDown("up") && onGround() && vSpeed == 0)
        {
            jump();
        }
        if (Greenfoot.isKeyDown("space"))
        {
            headbutt();
        }
        if (Greenfoot.isKeyDown("e"))
        {
            Actor food = getOneIntersectingObject(Edible.class);
            if (food != null)
            {
                getWorld().removeObjects(getWorld().getObjects(Forest.class));
                getWorld().removeObject(food);
                // NEW IMAGE
            }
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
        
        //while (isTouching(Ground.class)) setLocation(getX(), getY() - (int)vSpeed);
        
        //if (isTouching(Ground.class))
        //{
            //setLocation(getX(), getY()-(int)vSpeed);
        //}
        //else
        //{
            vSpeed = vSpeed + acceleration;
        //}
        if (vSpeed > 0) //is 0 the best value to check this for?
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
            //Actor under = getOneObjectAtOffset(0, getImage().getHeight() /2, Ground.class);
            //setLocation(getX(), under.getY()+under.getImage().getHeight());
            /* Actor under = getOneObjectAtOffset(0, getImage().getHeight() /2, Ground.class);
            while(intersects(under))
            {
                setLocation(getX(), getY() - 1);
            }
            setLocation(getX(), getY() + 1);  */
            if (getImage() == jumpLeft2 || getImage() == jumpLeft1)
            {
                setImage(standingLeft);
            }
            else if (getImage() == jumpRight2 || getImage() == jumpRight1)
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
        /* Actor under = getOneObjectAtOffset(0, getImage().getHeight() /2, Ground.class);
        if (under != null)
        {
            while(intersects(under))
            {
                setLocation(getX(), getY() - 1);
            }
        } */
        fall();
    }
    public void headbutt()
    {
        Actor moveable = getOneObjectAtOffset(getImage().getWidth()/2, 0, Moveable.class);
        if (moveable == null)
        {
            moveable = getOneObjectAtOffset(-getImage().getWidth()/2, 0, Moveable.class);
            //setImage
        }
        if (moveable != null)
        {
            if (getImage() == walkLeft1 || getImage() == walkLeft2 || getImage() == standingLeft)
            {
                
                setImage(headbuttStandingLeft);
                moveable.setLocation(moveable.getX() - (int)moveSpeed, moveable.getY());
            }
            else if (getImage() == walkRight1 || getImage() == walkRight2 || getImage() == standingRight)
            {
                setImage(headbuttStandingRight);
                moveable.setLocation(moveable.getX() + (int)moveSpeed, moveable.getY());
            } 
            
        }
    }   
    
    public void enableMovement() {
        canMove = true;
    }
    
    public void disableMovement() {
        canMove = false;
    } 
    public void checkWearing() {
        Actor wearable = getOneObjectAtOffset(getImage().getWidth() / 2, getImage().getHeight() / 2, Wearable.class);
        if (wearable != null){
            if (wearable instanceof Wings){
                accessories = 1;
                //setImage(standingWingsRight);
                //setImage(standingWingsRight);
                headbuttStandingLeft = new GreenfootImage("pigSprites/headbuttStandingWingsLeft.png");
                headbuttStandingRight = new GreenfootImage("pigSprites/headbuttStandingWingsRight.png");
                headbuttWalkLeft1 = new GreenfootImage("pigSprites/headbuttWalkWingsLeft1.png");
                headbuttWalkLeft2 = new GreenfootImage("pigSprites/headbuttWalkWingsLeft2.png");
                headbuttWalkRight1 = new GreenfootImage("pigSprites/headbuttWalkWingsRight1.png");
                headbuttWalkRight2 = new GreenfootImage("pigSprites/headbuttWalkWingsRight2.png");
                jumpLeft1 = new GreenfootImage("pigSprites/jumpWingsLeft1.png");
                jumpLeft2 = new GreenfootImage("pigSprites/jumpWingsLeft2.png");
                jumpRight1 = new GreenfootImage("pigSprites/jumpWingsRight1.png");
                jumpRight2 = new GreenfootImage("pigSprites/jumpWingsRight2.png");
                standingLeft = new GreenfootImage("pigSprites/standingWingsLeft.png");
                standingRight = new GreenfootImage("pigSprites/standingWingsRight.png");
                walkLeft1 = new GreenfootImage("pigSprites/walkWingsLeft1.png");
                walkLeft2 = new GreenfootImage("pigSprites/walkWingsLeft2.png");
                walkRight1 = new GreenfootImage("pigSprites/walkWingsRight1.png");
                walkRight2 = new GreenfootImage("pigSprites/walkWingsRight2.png");
                getWorld().removeObject(wearable);
            }
            else if (wearable instanceof Feathers)
            {
                accessories = 2;
                headbuttStandingLeft = new GreenfootImage("pigSprites/headbuttStandingFeathersLeft.png");
                headbuttStandingRight = new GreenfootImage("pigSprites/headbuttStandingFeathersRight.png");
                headbuttWalkLeft1 = new GreenfootImage("pigSprites/headbuttWalkWingsLeft1.png");
                headbuttWalkLeft2 = new GreenfootImage("pigSprites/headbuttWalkFeathersLeft2.png");
                headbuttWalkRight1 = new GreenfootImage("pigSprites/headbuttWalkWingsRight1.png");
                headbuttWalkRight2 = new GreenfootImage("pigSprites/headbuttWalkFeathersRight2.png");
                jumpLeft1 = new GreenfootImage("pigSprites/jumpFeathersLeft1.png");
                jumpLeft2 = new GreenfootImage("pigSprites/jumpFeathersLeft2.png");
                jumpRight1 = new GreenfootImage("pigSprites/jumpFeathersRight1.png");
                jumpRight2 = new GreenfootImage("pigSprites/jumpFeathersRight2.png");
                standingLeft = new GreenfootImage("pigSprites/standingFeathersLeft.png");
                standingRight = new GreenfootImage("pigSprites/standingFeathersRight.png");
                walkLeft1 = new GreenfootImage("pigSprites/walkWingsLeft1.png");
                walkLeft2 = new GreenfootImage("pigSprites/walkWingsLeft2.png");
                walkRight1 = new GreenfootImage("pigSprites/walkWingsRight1.png");
                walkRight2 = new GreenfootImage("pigSprites/walkWingsRight2.png");
                getWorld().removeObject(wearable);
            }
        }
    }  
    public void checkLake()
    {
        if (getOneObjectAtOffset(0, 0, Lake.class) != null)
        {
            Greenfoot.setWorld(new Forest1());
        }
    }
    public void checkMush()
    {
        Actor mush = getOneIntersectingObject(Mushroom.class);
        if ((mush != null) && (message == false))
        {
            getWorld().addObject(bubble, 125, 35);
            message = true;
        }
        else if (mush == null)
        {
            if (message == true)
            {
                getWorld().removeObject(bubble);
                message = false;
            }
        }
    }
}
