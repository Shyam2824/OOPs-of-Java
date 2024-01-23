// Question 1:
// Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a
//  method with the same name 'message' that prints "This is first subclass" and 
// "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.

abstract class Parent{
    abstract void message();
}
// first sub class
class First extends Parent{
    void message(){
        System.out.println("This is the first sub class");
    }
}
class Second extends Parent{
    void message(){
        System.out.println("This is the second sub class");
    }
}

public class Abstract_1 {
    public static void main(String[] args) {
        First f=new First();
        Second s= new Second();
        f.message();
        s.message();
    }
}
