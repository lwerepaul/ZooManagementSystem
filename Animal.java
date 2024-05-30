
package vu.javaoop_coursework;

public class Animal {
    //fields of class Animal with default access modifier
    String name;
    int age;
    
    //constructor of class Animal
    public Animal(String name,int age){
    this.name=name;
    this.age=age;
}
    //Methods of class Animal with public access modifier
    public void makeSound(){
    System.out.println("Anima sound not defined");
    }
    public void eat(){
    System.out.println("Animal eats not defined");
    }
    //Overloaded Methods of class Animal with public access modifier
     public void makeSound(int times){
    System.out.println("Makes sound " + times +" - times a day");
    }
    public void eat(String foodType){
    System.out.println("Eats " + foodType );  
   } 
}

