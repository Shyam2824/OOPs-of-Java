/* *** oops main pailers are 1. Class 2. Abstract 3. Encaplution 4. Inheritance 5.Polymorphism 6.object and method  
 * *** Class: it is the connection of object.
 * it is not a real world entity , it is just template and blueprint and prototype
 * it does not occupy memory
 * *** Method: A set of code perform a particular task
 * Advantage of Method: Code resuablility and code Optimization
 * ***Object= it is an instance of class
 * it is real world entity
 * it occupy memory
 * 
 * ** How to create an object in java
 * by using : new Keywords, newInstance()method, clone()method, deserialization, factory method
 * New keyword using: Declaration : Animal a;
 *                     instantiation: a=new
 *                      initialization=  a=new Animal(); using constructor
 * ***** Dot(.) operator to use call the behivior of class
 */



class rectangle{
    int length=8;
    int breath=9;

    public int area(){
        return length*breath;
    }
}

public class objaect_class {
    public static void main(String[] args) {
        
        rectangle r= new rectangle();
        r.area();
        System.out.println("Area of rectangle:" + r.area());

    }
}
