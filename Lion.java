
package vu.javaoop_coursework;

//Subclass Lion inherits fields and methods from class Animal
public class Lion extends Animal{
    
    public Lion(String name,int age){
        super(name,age);
    
    }
    @Override
   public void makeSound(){
    System.out.println("Roar");
    
    }
    @Override
   public void eat(){
    System.out.println("Eating meat\n");
    }
}
