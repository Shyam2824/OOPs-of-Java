/*Polymorphism : many forms
ex: sound :  dog, cat,man....
water: liquid, solid, gas.
 * ** Types of polymorphism :
 * 1. Compile time: Static polymorphism, Method Overloading (Handle Compiler)
 * 2. Run time : Dynamic polymorphism , Method Overriding (handle JVM) 
 * 
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * Method overloading: Same name , same class, different argnments (no. of arg, type of arg, sequence of arg)
 * Method overriding: same name, different class,same argnments  (no. of arg, type of arg, sequence of arg), Inheritance concept
 */

 // method overloading
 // when return type change then method overloading cant work
 // main method also be overload
 // use also Automatic promotion
class test{
    void sh(){
        System.out.println("Shyam");
    }
    void sh(int a){
        System.out.println(a);
    }
}
public class Polymorphism1 {
    public static void main(String[] args) {
        test t= new test();
        t.sh();
    }
}
