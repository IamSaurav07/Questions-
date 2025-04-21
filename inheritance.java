public class inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.colour = "red"; 
    }
    
}

class Shape{
    String colour;
}

class Triangle extends Shape{
    public void area(int l, int b){
        System.out.println((3.14)*l*b);
    }
}
