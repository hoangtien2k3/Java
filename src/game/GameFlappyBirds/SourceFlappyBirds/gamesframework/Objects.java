/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.game.GameFlappyBirds.SourceFlappyBirds.gamesframework;

/**
 *
 * @author hoangtien2k3qx1
 */
public class Objects {
    
    private float posX, posY;
    private float w, h;
    
    public Objects(){
         posX = posY = w = h = 0;
    }
    
    public Objects(float x, float y, float w, float h){
        this.posX = x;
        this.posY = y;
        this.w = w;
        this.h = h;
    }
    
    public boolean isCollisionHappenWith(float x, float y){
        if(x > posX && x < posX + w && y > posY && y < posY + h) 
            return true;
        return false;
    }
    public boolean isCollisionHappenWith(float x, float y, float w, float h){
        if(x < posX + this.w && x + w > posX && y < posY + this.h && h + y > posY)
            return true;
        return false;
    }
    public void setPos(float x, float y){
        posX = x;
        posY = y;
    }
    public void setPosX(float x){
        posX = x;
    }
    public void setPosY(float y){
        posY = y;
    }
    public float getPosX(){
        return posX;
    }
    public float getPosY(){
        return posY;
    }
    public float getW(){
        return w;
    }
    public float getH(){
        return h;
    }
    public void increasePosX(float m){
        posX+=m;
    }
    public void increasePosY(float m){
        posY+=m;
    }
}
