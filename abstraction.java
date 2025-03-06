public class abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        h.eat();
    }
}

abstract class Animal{
    abstract void walk();

    public void eat(){
        System.out.println("House grass eats");
    }
    Animal(){
        System.out.println("Constructorr in Abs Animal class");
    }

}

class Horse extends Animal{
    public void walk(){
        System.out.println("4 legs");
    }

    Horse(){
        System.out.println("Constructor in horse class");
    }
}

class Chicken extends Animal {
    public void walk(){
        System.out.println("2 legs");
    }
}
