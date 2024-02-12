//Interface is a blueprint of the class. It specify what a class must do and not how.
// 1.	It is used to achieved abstraction.
// 2.	It supports multiple inheritance.
// 3.	It can use to achieved loose coupling.

interface f1{
    void show();
}
interface f2{
    void display();
}
class test implements f1,f2{ // that should be used to multiple inheritance
    public void show () {
    System.out.println("That is implement class");
    }
    public void display () {
    System.out.println("That is implement  display class");
    }
}
public class Interface_1 {
    public static void main(String[] args) {
        test t= new test();
        t.show();
        t.display();
    }
}
