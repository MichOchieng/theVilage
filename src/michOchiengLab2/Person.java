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
    private static ArrayList<String> theLiving;
    private static ArrayList<String> theDead;
    
    
    public Person(String n){
        name = n;
        isDead = false;
        murderedBy = null;        
        populationAlive++;
    }
    
//    public void allSayHi(){
//        for(int i = 0; i<theLiving.length;i++){
//            System.out.println(theLiving.get(i) + " says hello!");
//        }
//    }    
    
    public String murderer(){
        if(isDead){
            return murderedBy;
        }
        else
            return name + " is still alive.";
    }
    
    public String name(){
        if(isDead){
            return name + "-dececed";
        }
        else
            return name;
    }
    
    public boolean isAlive(){
        if(isDead){
            return false;
        }
        else 
            return true;
    }
    
    public void die(){
        if(isDead){
            System.out.println(name + " is already dead.");
        }
        else{
            isDead = true;
//            ADD - remove from theLiving list and removal from theDead list
            System.out.println(name + ": oof!");
            populationAlive--;
            populationDead++;
        }
    }    
    
    public void sayHi(){
        System.out.println(name + " says hello to you.");
    }
    
    public static int numberLiving(){
        return populationAlive;
    }
    
    public static int numberDead(){
        return populationDead;
    }
    
    public static void main(String[] args){
        Person momo = new Person("Mich"); 
        momo.sayHi();
    }
    
}
