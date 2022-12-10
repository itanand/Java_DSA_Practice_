abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("You are creating a new constructor");
    }
    public void eat() {
        System.out.println("Animal eats");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Created a Horse");
    }
    public void walk(){
        System.out.println("Walks on 4 Legs");
    }
}

class Chicken extends Animal {
    public void walk(){
        System.out.println("Walks on 2 Legs");
    }
}

public class Abstraction {
  public static void main(String args[]){
      Horse horse = new Horse();
  }
}
