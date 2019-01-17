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
       beginStory();
    }     
    
    public static void beginStory(){
       Person johnny = new Person("Johnny"); 
       Person mark = new Person("Mark");
       Person lisa = new Person("Lisa");
       johnnyFig();
       johnny.sayHi();
       story1();       
       story2();
       Person.allSayHi();
       story3();
       allDialogue();
       johnny.murder(mark);
       story4();
       lisa.die();
       story5();
       mark.murder(johnny);
       story6();
       mark.isAlive();       
       System.out.println(johnny.name() + " feels indifferent about the death of his " + Person.numberDead() + " 'friends'. He decides to take a nap as you leave the crime scene.");
    }
    
//    Narration
    
    public static void story1(){
        System.out.println("This is Jonny. He wears a viking helmet.");
    }
    
    public static void story2(){
        System.out.println("Johnny has two friends, Mark and Lisa. They all greet you as you enter their village of " + Person.numberLiving() + " people.");
    }
    
    public static void story3(){
        System.out.println("You overhear Mark acknowledging Jonny's helmet, this causes Johnny to kill him.");
    }
    
    public static void story4(){
        System.out.println("Johnny stabbed mark with the horns of his helmet, it was very effective. This caused Lisa to have a heart attack and die.");
    }
    
    public static void story5(){
        System.out.println("Marks confused and angry ghost attempted to kill Johnny.");
    }
    
    public static void story6(){
        System.out.println("Johhny checks to see if Mark is alive by poking him with his horns.");
    }  
    
    
//   Dialogue
    
    public static void allDialogue(){
        dialogue1();
        dialogue2();
        dialogue3();        
    }
    
    public static void dialogue1(){
        System.out.println("Mark: Your helmet looks pretty cool.");
    }
    
    public static void dialogue2(){
        System.out.println("Johnny: I'm going to kill you now.");
    }
    
    public static void dialogue3(){
        System.out.println("Mark: What?");
    }
    
//    Charecter illustration
       
    public static void johnnyFig(){
        
        System.out.println("{_}");
        System.out.println(" 0");
        System.out.println("/|\\");
        System.out.println(" |");        
    }
}

