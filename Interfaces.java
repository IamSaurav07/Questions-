Interface Animal{
    void walk(); //we can't make constructors in interface
    /*
    void eat(){    //method is by-default public and abstract
                   //we can't make non-abstract functions
    }

    int eye = 2   //it means eye for each class that will extend eye will be same as 2 only
     */
}

//Multiple interitence can be implemented using interface
//as we implement herbivore in Horse class
Interface Herbivore{

}

class Horse implements Animal, Herbivore{  //not extend it's implement
    public void walk(){
        System.out.println("walks 4 legs");
    }
}


public class Interfaces {   //kind of classes with fix properties
    public static void main(String[] args) {
        Horse h1 = new Horse();

    }
}
 