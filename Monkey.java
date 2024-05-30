
package vu.javaoop_coursework;

//Subclass Monkey inherits fields and methods from class Animal

public class Monkey extends Animal {
    
    public Monkey(String name,int age){
        super(name,age);
    
    }
    @Override
   public void makeSound(){
    System.out.println("Chatter");
    }
   
    @Override
   public void eat(){
    System.out.println("Eating bananas\n");
    }
}


