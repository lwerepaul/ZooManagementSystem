
package vu.javaoop_coursework;


public class Zoo {
    
    public static void main (String [] args ){
              //objects creation
              Lion lion=new Lion ("Name unknown",0);
              Elephant elephant=new Elephant ("Name unknown",0);
              Monkey monkey=new Monkey ("Name unknown",0);
              
              
              //call different methods as attached to objects
              System.out.println("Lion sound and food below:");
                lion.makeSound();
                lion.eat();
               
                System.out.println("Elephant sound and food below:");
                elephant.makeSound();
                elephant.eat();
                
                 System.out.println("Monkey sound and food below:");
                monkey.makeSound();
                monkey.eat();
                
            //Polymorphism use case
    System.out.println("Polymorphism demostrated on subclass Lion as follows:");
              lion.makeSound(5);
               lion.eat("meat");
    }
}

