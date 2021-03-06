import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class GravityPig here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GravityPig extends Actor
{
    private double vX; // Velocity in x direction
    private double vY; // Velocity in y direction
    private int gravity = 4;
    private int mass;
    private int moveableDistance = 30;
    private int initJumpVel = 30;
    private boolean goingUp = false;
    private int forceGravity;
    private double delta;
    private int accLevel = 0;
    private boolean isWearing = false;
    private boolean jumping = false;
    private boolean animate2 = false;
    private int hSpeed = 5;
    private int jumpTimer = 0;
    private int bubbleCounter = 0;
    private int frameCount = 0;
    private Direction dir = Direction.RIGHT;
    MushBubble bubble = new MushBubble();
    public boolean message = false;
    private boolean canMove = true;
    private int headbuttCounter = 0;
    private int headbuttMax = 20;
    private boolean headbutting = false;
    private boolean displayBubble = false;
    
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
    
    public GravityPig(int accLevel) {
        this.accLevel = accLevel;
        
        delta = 0.3;
        //forceGravity = mass * gravity;
        vX = 0;
        vY = 0;
        setImages();
    }
    /**
     * Act - do whatever the GravityPig wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //Velocity equation
        //d = vi + vft 
        //double oldVY = vY;
        frameCount++;
        
        //If the frame count is < 27, use the 1st stage walking images
        //If the frame count is >= 27, use the 12nd stage walking images
        if(frameCount%40 >= 20) {
            animate2 = true;
        }
        else {
            animate2 = false;
        }
        
        if(headbutting) {
            headbuttCounter++;
            if(headbuttCounter == headbuttMax) {
                headbuttCounter = 0;
                headbutting = false;
                
                
            }
            else {
                
                if(dir == Direction.LEFT) {
                    setImage(headbuttStandingLeft); 
                    
                }
                else {
                    setImage(headbuttStandingRight); 
                    
                }
            }

        }
        else if (!headbutting && Greenfoot.isKeyDown("space") && checkForMoveableObjects())
        {
            headbutting = true;
            if(dir == Direction.LEFT) {
               setImage(headbuttStandingLeft); 
            }
            else {
               setImage(headbuttStandingRight); 
            }
            headbutt();
            
            
        }
        
        if(Greenfoot.isKeyDown("left")) {
            moveLeft();
            dir = Direction.LEFT;
            
        }
        
        if(Greenfoot.isKeyDown("right")) {
            moveRight();
            dir = Direction.RIGHT;
        }
        
        if(Greenfoot.isKeyDown("up") && vY == 0) {
            jump();
            jumping = true;
            /*if(jumpTimer < 29) {
                jumpTimer++;
                jump();
            }
            else {
                
            }*/
            
        }
        
        if (Greenfoot.isKeyDown("e"))
        {
            Actor food = getOneIntersectingObject(Edible.class);
            if (food != null)
            {
                getWorld().removeObjects(getWorld().getObjects(Forest.class));
                getWorld().removeObject(food);
                
                if (food instanceof Mushroom)
                {
                    headbuttStandingLeft = new GreenfootImage("pigSprites/smallheadbuttStandingWingsLeft.png");
                    headbuttStandingRight = new GreenfootImage("pigSprites/smallheadbuttStandingWingsRight.png");
                    headbuttWalkLeft1 = new GreenfootImage("pigSprites/smallheadbuttWalkWingsLeft1.png");
                    headbuttWalkLeft2 = new GreenfootImage("pigSprites/smallheadbuttWalkWingsLeft2.png");
                    headbuttWalkRight1 = new GreenfootImage("pigSprites/smallheadbuttWalkWingsRight1.png");
                    headbuttWalkRight2 = new GreenfootImage("pigSprites/smallheadbuttWalkWingsRight2.png");
                    jumpLeft1 = new GreenfootImage("pigSprites/smalljumpWingsLeft1.png");
                    jumpLeft2 = new GreenfootImage("pigSprites/smalljumpWingsLeft2.png");
                    jumpRight1 = new GreenfootImage("pigSprites/smalljumpWingsRight1.png");
                    jumpRight2 = new GreenfootImage("pigSprites/smalljumpWingsRight2.png");
                    standingLeft = new GreenfootImage("pigSprites/smallstandingWingsLeft.png");
                    standingRight = new GreenfootImage("pigSprites/smallstandingWingsRight.png");
                    walkLeft1 = new GreenfootImage("pigSprites/smallwalkWingsLeft1.png");
                    walkLeft2 = new GreenfootImage("pigSprites/smallwalkWingsLeft2.png");
                    walkRight1 = new GreenfootImage("pigSprites/smallwalkWingsRight1.png");
                    walkRight2 = new GreenfootImage("pigSprites/smallwalkWingsRight2.png");
                    accLevel++;
                }
                // NEW IMAGE
            }
        }
        
            
       
        vY += gravity*delta;
        
        if(vY > 0 && jumping) {
            
            if(dir == Direction.LEFT) {
                setImage(jumpLeft2);
            }
            else {
                setImage(jumpRight2);
            }
        }
        
        // Add velocity and update positon (slowing down with delta)
        //int newX = (int)(getX() + vX*delta);
        int newY = (int)(getY() + vY*delta);
        
        setLocation(getX(), newY);
        
        checkMush();
        
        
        checkForPlatform();
        checkElevator();
        checkWearing();
        checkLake();
        
        if (getWorld() instanceof FarmWorld) 
        {
            runNarration();
        }
        
        displayMessage();
    }   
    
    public void moveRight()
    {
        if (getOneIntersectingObject(ImpassibleScenery.class) == null) {
            setLocation(getX() + hSpeed, getY());
        }
        
        
        if(jumping) {
            setImage(jumpRight1);    
        }
        else {
            //System.out.println("Frame count: " + (frameCount%2));
            if(animate2) {
                setImage(walkRight2);
            }
            else {
                setImage(walkRight1);
            }
            /*if(getImage() == walkRight1) {
                setImage(walkRight2);
            }
            else {
                setImage(walkRight1);
            }*/
        }
        
        
    }
    public void moveLeft()
    {
        if (getOneObjectAtOffset(-getImage().getWidth()/2, 0, ImpassibleScenery.class) == null) {
            setLocation(getX() - hSpeed, getY());
        }
        
        
        if(jumping) {
            setImage(jumpLeft1);    
        }
        else {
            //System.out.println("Frame count: " + (frameCount%2));
            if(animate2) {
                //System.out.println("animate2: " + animate2);
                setImage(walkLeft2);
            }
            else {
                //System.out.println("animate2: " + animate2);
                setImage(walkLeft1);
            }
            /*if(getImage() == walkLeft2) {
                setImage(walkLeft1);
            }
            else {
                setImage(walkLeft2);
            }*/
        }
    }
    
    public void jump() {
        vY = -initJumpVel;
        jumping = true;
        if(dir == Direction.LEFT) {
            setImage(jumpLeft1);
        }
        else {
            setImage(jumpRight1);
        }
    }
    
    public void checkElevator()
    {
        Actor touching = getOneIntersectingObject(Elevator.class);
        int y = getY();
        if (touching != null)
        {
            Elevator elevate = (Elevator)touching;
            if (elevate.getY() <= 475 && elevate.getRise() == true) 
            {
                y = getY() - 1;
            }
            else if (elevate.getY() >= 105 && elevate.getRise() == false)
            {
                y = getY() + 1;
            }
        }
        setLocation(getX(), y);
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
    
    public void checkForPlatform() {
        //ArrayList<Ground> groundList = (ArrayList<Ground>) getObjectsInRange(70, Ground.class);
        ArrayList<Ground> groundList = (ArrayList<Ground>) getObjectsAtOffset(0, getImage().getHeight()/2, Ground.class);
        if(jumping && !groundList.isEmpty()) {
            if(!headbutting) {
                    if(dir == Direction.LEFT) {
                        
                        setImage(standingLeft);
                    }
                    else {
                        setImage(standingRight);
                    }
                }
        }
        
        if(!groundList.isEmpty()) {
           vY = 0;
           jumping = false;
                /*if(!headbutting) {
                    if(dir == Direction.LEFT) {
                        
                        setImage(standingLeft);
                    }
                    else {
                        setImage(standingRight);
                    }
                } */
        }
       
        
        /*if(!groundList.isEmpty()) {
            vY = 0;
            jumping = false;
            if(!headbutting) {
                if(dir == Direction.LEFT) {
                    setImage(standingLeft);
                }
                else {
                    setImage(standingRight);
                }
            }
            
        }*/
        
        /*if(getY() >= 500) {
            goingUp = true;
            vY = -vY*0.93;  
            Greenfoot.playSound("ball-bounce.wav");
        }
        if(isAtEdge()) {
            vX = -vX;
            Greenfoot.playSound("ball-bounce.wav");
        }*/
    }
    
    
    //Sets the right images for the accessory level
    private void setImages() {
        if (accLevel == 0)
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
        else if (accLevel == 1)
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
        else if (accLevel == 3)
        {
            headbuttStandingLeft = new GreenfootImage("pigSprites/headbuttStandingFeathersLeft.png");
                headbuttStandingRight = new GreenfootImage("pigSprites/headbuttStandingFeathersRight.png");
                headbuttWalkLeft1 = new GreenfootImage("pigSprites/headbuttWalkFeathersLeft1.png");
                headbuttWalkLeft2 = new GreenfootImage("pigSprites/headbuttWalkFeathersLeft2.png");
                headbuttWalkRight1 = new GreenfootImage("pigSprites/headbuttWalkFeathersRight1.png");
                headbuttWalkRight2 = new GreenfootImage("pigSprites/headbuttWalkFeathersRight2.png");
                jumpLeft1 = new GreenfootImage("pigSprites/jumpFeathersLeft1.png");
                jumpLeft2 = new GreenfootImage("pigSprites/jumpFeathersLeft2.png");
                jumpRight1 = new GreenfootImage("pigSprites/jumpFeathersRight1.png");
                jumpRight2 = new GreenfootImage("pigSprites/jumpFeathersRight2.png");
                standingLeft = new GreenfootImage("pigSprites/standingFeathersLeft.png");
                standingRight = new GreenfootImage("pigSprites/standingFeathersRight.png");
                walkLeft1 = new GreenfootImage("pigSprites/walkFeathersLeft1.png");
                walkLeft2 = new GreenfootImage("pigSprites/walkFeathersLeft2.png");
                walkRight1 = new GreenfootImage("pigSprites/walkFeathersRight1.png");
                walkRight2 = new GreenfootImage("pigSprites/walkFeathersRight2.png");
        }
        else if (accLevel == 2)
        {
                    headbuttStandingLeft = new GreenfootImage("pigSprites/smallheadbuttStandingWingsLeft.png");
                    headbuttStandingRight = new GreenfootImage("pigSprites/smallheadbuttStandingWingsRight.png");
                    headbuttWalkLeft1 = new GreenfootImage("pigSprites/smallheadbuttWalkWingsLeft1.png");
                    headbuttWalkLeft2 = new GreenfootImage("pigSprites/smallheadbuttWalkWingsLeft2.png");
                    headbuttWalkRight1 = new GreenfootImage("pigSprites/smallheadbuttWalkWingsRight1.png");
                    headbuttWalkRight2 = new GreenfootImage("pigSprites/smallheadbuttWalkWingsRight2.png");
                    jumpLeft1 = new GreenfootImage("pigSprites/smalljumpWingsLeft1.png");
                    jumpLeft2 = new GreenfootImage("pigSprites/smalljumpWingsLeft2.png");
                    jumpRight1 = new GreenfootImage("pigSprites/smalljumpWingsRight1.png");
                    jumpRight2 = new GreenfootImage("pigSprites/smalljumpWingsRight2.png");
                    standingLeft = new GreenfootImage("pigSprites/smallstandingWingsLeft.png");
                    standingRight = new GreenfootImage("pigSprites/smallstandingWingsRight.png");
                    walkLeft1 = new GreenfootImage("pigSprites/smallwalkWingsLeft1.png");
                    walkLeft2 = new GreenfootImage("pigSprites/smallwalkWingsLeft2.png");
                    walkRight1 = new GreenfootImage("pigSprites/smallwalkWingsRight1.png");
                    walkRight2 = new GreenfootImage("pigSprites/smallwalkWingsRight2.png");
        }
        setImage(standingRight);
    }
    
    public int numacc()
    {
        return accLevel;
    } 
    public void setacc(int acc)
    {
        accLevel = acc;
    }
    
    private boolean checkForMoveableObjects() {
        ArrayList<Moveable> moveables = (ArrayList<Moveable>)getObjectsInRange(75, Moveable.class);
        if(!moveables.isEmpty()) {
            return true;
        }
        return false;
    }
    public void headbutt()
    {
        ArrayList<Moveable> moveables = (ArrayList<Moveable>)getObjectsInRange(75, Moveable.class);
        Moveable obj = moveables.get(0);
        if(obj.getX() < getX() && dir == Direction.LEFT) {
            //Actor moveable = getOneObjectAtOffset(-getImage().getWidth()/2, 0, Moveable.class);
            /*if(moveable != null) {
                setImage(headbuttStandingLeft);
                moveable.move(-moveableDistance);
                //moveable.setLocation(moveable.getX() - (int)moveSpeed, moveable.getY());
            }*/
            setImage(headbuttStandingLeft);
            obj.move(-moveableDistance);
        }
        else if(obj.getX() > getX() && dir==Direction.RIGHT){
            Actor moveable = getOneObjectAtOffset(getImage().getWidth()/2, 0, Moveable.class);
            //if(moveable != null) {
            setImage(headbuttStandingRight);
            obj.move(moveableDistance);
                //moveable.setLocation(moveable.getX() - (int)moveSpeed, moveable.getY());
            //}
        }
        
    }  
    
    public void enableMovement() {
        canMove = true;
    }
    
    public void disableMovement() {
        canMove = false;
    }
    
    public void checkLake()
    {
        if (getOneObjectAtOffset(0, 0, Lake.class) != null)
        {
            Greenfoot.setWorld(new Forest1(false, 1));
        }
    }
    
    
    public void runNarration()
    {
        if (frameCount < 100)
        {
            setImage("pigSprites/sleepingRight.png");
            bubble.setImage("farmSpeech1.png");
            getWorld().addObject(bubble, 230, 400);
        }
        else if (frameCount >= 100 && frameCount < 250)
        {
            setImage("pigSprites/worriedRight.png");
            bubble.setImage("farmSpeech2.png");
            getWorld().addObject(bubble, 230, 400);
        }
        else if (frameCount >= 250 && frameCount < 400)
        {
            bubble.setImage("farmSpeech3.png");
            getWorld().addObject(bubble, 230, 400);
        }
        else if (frameCount >= 550 && frameCount < 700)
        {
            bubble.setImage("farmSpeech5.png");
            getWorld().addObject(bubble, 230, 400);
        }
        else if (frameCount >= 850 && frameCount < 1000)
        {
            bubble.setImage("farmSpeech7.png");
            getWorld().addObject(bubble, 230, 400);
        }
        else if (frameCount >= 1130 && frameCount < 1400)
        {
            bubble.setImage("farmSpeech10.png");
            getWorld().addObject(bubble, 230, 400);
        }
        else if (frameCount >= 1400) 
        {
            getWorld().removeObject(bubble);
            if (getX() < 760)
            {
                moveRight();
            }
            else 
            {
                Greenfoot.setWorld(new Industrial1());
            }
        }
    }
   
    public void checkWearing() {
        
        //Actor wearable = getOneObjectAtOffset(getImage().getWidth() / 2, getImage().getHeight() / 2, Wearable.class);
        ArrayList<Wearable> wearables = (ArrayList<Wearable>)getObjectsInRange(70, Wearable.class);
        if (!wearables.isEmpty()){
            accLevel++;
            setImages();
            isWearing = true;
            displayBubble = true;
            
            getWorld().removeObject(wearables.get(0));
            if (accLevel == 4)
            {
                Greenfoot.setWorld(new FinishScreen());
            }
            showLevelCompleteScreen();            
        }
        else {
            isWearing = false;
            
        }
    } 
    public boolean isJumping() {
        return jumping;
    }
    
    public boolean isWearing(boolean b) {
        return b;
    }
    
    public void displayMessage() {
        if(displayBubble == true) {
            bubbleCounter++;
            if(bubbleCounter >= 440) {
                displayBubble = false;
                bubbleCounter = 0;
                Industrial2 world = (Industrial2)getWorld();
                world.removeObject(bubble);
            }
            else {
                if (numacc() == 1) {
                    bubble.setImage("wingConfirmation.png");
                    Industrial2 world = (Industrial2)getWorld();
                    world.addObject(bubble, getX() - 100, getY()-20);
                
                    world.setBubbleLocation();
                }
                else if (numacc() == 3) {
                    bubble.setImage("featherConfirmation.png");
                    Forest5 world = (Forest5)getWorld();
                    world.addObject(bubble, getX() - 50, getY());
                    
                    world.setBubbleLocation();
                }
            }
           
        }
        /*if (isWearing == true) {
            System.out.println("Display");
            if (numacc() == 1) {
                bubble.setImage("wingConfirmation.png");
                Industrial2 world = (Industrial2)getWorld();
                world.addObject(bubble, getX() - 50, getY());
                
                world.setBubbleLocation();
            }
            else if (numacc() == 3) {
                bubble.setImage("featherConfirmation.png");
                getWorld().addObject(bubble, getX() - 50, getY());
            }
            
        }*/
    }
    public void showLevelCompleteScreen() {
        
    }
    
    public double getVY() {
        return vY;
    }
    
    public void showCloudHint() {
        bubble.setImage("cloudHint.png");
        CloudWorld1 world = (CloudWorld1)getWorld();
        world.addObject(bubble, getX()+150, getY()-20);
                
        world.setBubbleLocation();
    }
    
    public void removeCloudHint() {
        CloudWorld1 world = (CloudWorld1)getWorld();
        world.removeObject(bubble);
    }
}


