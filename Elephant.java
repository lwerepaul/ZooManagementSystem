
package vu.javaoop_coursework;
 //Subclass Elephant inherits fields and methods from class Animal

public class Elephant extends Animal  {
  
    public Elephant(String name,int age){
        super(name,age);
    
    }
    @Override
   public void makeSound(){
    System.out.println("Trumpet");
    }
   
    @Override
   public void eat(){
    System.out.println("Eating grass\n");
    }
}
