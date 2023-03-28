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
public class QueueList <T> {
    
    private Element head, foot;
    
    private int size = 0;
    
    public QueueList(){
        head = foot = null;
    }
    
    public int getSize(){
        return size;
    }
    
    public void push(T t){
        
        Element e = new Element(t);
        
        if(head == null){
            head = foot = e;
        }else{
            foot.next = e;
            foot = e;
        }
        
        size++;
    }
    
    public T pop(){
        T value = head.value;
        head = head.next;
        
        size--;
        
        return value;
    }
    
    public T get(int id){
        
        Element e = head;
        
        if(head == null) return null;
        
        for(int i = 0;i < id; i++){
            e = e.next;
            if(e == null) return null;
        }
        
        return e.value;
    }
    
    private class Element{
        
        Element(T value){
            this.value = value;
        }
        
        T value;
        Element next;
    }
}
