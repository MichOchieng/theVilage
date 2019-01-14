/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package michOchiengLab2;

/**
 *
 * @author MichO
 */
public class PersonTester {    
    
    public static void main(String[] args){
       String name = "Mich";
       Person momo = new Person(name);   
       getLiving();
    }
    
    public static void getLiving(){
       int popAlive = Person.numberLiving();
       System.out.println("Current living population: " + popAlive);
    }
    
    public static void getDead(){
       int popDead = Person.numberDead();
       System.out.println("Current dead population: " + popDead);
    }
}
