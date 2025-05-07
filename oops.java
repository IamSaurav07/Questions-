public class oops {
    public static void main(String[] args) {
        /*pen link = new pen();                   //Object creation of type 'pen'

        link.colour = "pink";                   //colour or type are data of object
        link.type = "gel";
        link.write();                           //while methods are the member of class

        pen cello = new pen(); 

        cello.colour = "blue";
        cello.printcolour();
        link.printcolour();
        */

        //parameterized constructor
        /* Student s1 = new Student("saurav", 22);*/

        //s1.name = "saurav";    #will not be used when parameterized constructor will be called
        //s1.age = 22;           #it will called through constructor
        
        //copy constructor
        Student s1 = new Student();
        s1.age = 45;
        s1.name = "hydf";

        Student s2 = new Student(s1); //assigning s1 properties to s2
        s2.printInfo();
    }
}


/*class pen {
    String type;
    String colour;

    public void write(){
        System.out.println("Writing somrthing");
    }

    public void printcolour(){
        System.out.println(this.colour);
    }
}*/


class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //Non-Parameterized
    //Student(){      It will be automatically called whenever a student will be created of this class
    //    System.out.println("constructor is created"); 
    //}

    //parameterized constructor
    /*Student(String name, int age){  
        this.name/*this name is variable initialized in the class *//*= name; */  /*this name is value written while creating the object i.e. name of object 
        this.age = age;
    }*/

    //copy constructor
    Student(Student s2){        //copying the info of s2 to current object
        this.name = s2.name;
        this.age = s2.age;
    }

    Student(){

    }

}




