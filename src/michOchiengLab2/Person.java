/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package michOchiengLab2;

import java.util.ArrayList;

/**
 *
 * @author MichO
 */
public class Person {
    private final String name;
    private String murderedBy;
    private boolean isDead;
    private static int populationAlive;
    private static int populationDead;
    private static final ArrayList<Person> theLiving = new ArrayList();
    
    
    public Person(String n){
        name = n;
        isDead = false;
        murderedBy = null;        
        populationAlive++;
        theLiving.add(this);
    }
    
    public String murderer(){
        if(isDead){
            return name + " was murdered by " + murderedBy;
        }
        else
            return name + " is still alive, for now.";
    }
    
    public String name(){
        if(isDead){
            return name + "-deceased";
        }
        else
            return name;
    }
    
    public boolean isAlive(){
        if(isDead){
            System.out.println(name + " is dead.");
            return false;
        }
        else{
            System.out.println(name + " is alive for now.");
            return true;
        }
    }
    
    public void die(){
        if(isDead){
            System.out.println(name + " is already dead.");
        }
        else{
            isDead = true;
            theLiving.remove(this);            
            System.out.println(name + ": oof!");
            populationAlive--;
            populationDead++;
        }
    }    
    
    public void sayHi(){
        if(isDead){
            System.out.println("...");
        }else{
            System.out.println("Hello my name is " + name);
        }
    }
    
    public static int numberLiving(){
        return populationAlive;
    }
    
    public static int numberDead(){
        return populationDead;
    }
    
    public static void allSayHi(){
        for(int i = 0;i<theLiving.size();i++){
           theLiving.get(i).sayHi();
        }
    }
    
    public void murder(Person x){
        if(!isDead){
          x.murderedBy = name;
          x.die();
        }else{
            System.out.println("Ghosts cannot kill people in this story.");
        }
            
    }   
     
}