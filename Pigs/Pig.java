package Pigs;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pig here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pig extends Actor
{
    private int counter = 0;
    private int switchImg = 0;
    private int walkDir = 1; // 1 = right, 2 = left
    private boolean isUp = false;
    
    private int startingY = 0;
    
    // Right
    // Walk
    private GreenfootImage standingRight = new GreenfootImage("standingRight.png");
    private GreenfootImage walkRight1 = new GreenfootImage("walkRight1.png");
    private GreenfootImage walkRight2 = new GreenfootImage("walkRight2.png");
    // Jump
    private GreenfootImage jumpRight1 = new GreenfootImage("jumpRight1.png");
    private GreenfootImage jumpRight2 = new GreenfootImage("jumpRight2.png");
    
    // Left
    // Walk
    private GreenfootImage standingLeft = new GreenfootImage("standingLeft.png");
    private GreenfootImage walkLeft1 = new GreenfootImage("walkLeft1.png");
    private GreenfootImage walkLeft2 = new GreenfootImage("walkLeft2.png");
    // Jump
    private GreenfootImage jumpLeft1 = new GreenfootImage("jumpLeft1.png");
    private GreenfootImage jumpLeft2 = new GreenfootImage("jumpLeft2.png");
    
    
    /**
     * Act - do whatever the myPig wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("right")){
            if (counter % 9 == 0){
                switchImg += 1;
                if (switchImg % 2 == 0){
                    setImage(walkRight1);
                    setRotation(2);
                }
                else {
                    setImage(walkRight2);
                    setRotation(-2);
                }
                walkDir = 1;
            }
            setLocation(getX() + 1, getY());
        }  
        else if (Greenfoot.isKeyDown("left")){
            if (counter % 9 == 0){
                switchImg += 1;
                if (switchImg % 2 == 0){
                    setImage(walkLeft1);
                    setRotation(2);
                }
                else {
                    setImage(walkLeft2);
                    setRotation(-2);
                }
                walkDir = 2;
            }
            setLocation(getX() - 1, getY());
        } 
        else if (Greenfoot.isKeyDown("space")){
            if (!isUp){
                startingY = getY();
            }
            if (walkDir == 1){
                setImage(jumpRight1);
            }
            else if (walkDir == 2){
                setImage(jumpLeft1);
            }
            setLocation(getX(), startingY - 55);
            isUp = true;
        }
        else {
            if (isUp) {
                if (walkDir == 1){
                    setImage(jumpRight2);
                }
                else if (walkDir == 2){
                    setImage(jumpLeft2);
                }
                setLocation(getX(), startingY);
                isUp = false;
            }
            if (walkDir == 1){
                setImage(standingRight);
            }
            else if (walkDir == 2){
                setImage(standingLeft);
            }
        }
        counter += 1;
    }
}
