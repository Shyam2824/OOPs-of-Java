/****it is the inheriting the properties of parents class into child class.  it acheived  "extends" keyword
 * it has tit bond
 * blood relation
 *  Advantage: Code reusability and achieved polymorphism
 * 
 * Types of inheritance: 1. Single inheritance A-->B
 * 2. Multilevel inheritance A-->B-->C then A-->C
 * 3. Hierarical inheritance A-->B and A-->C B & C has no relation  one class properties in  multiple class
 * 4. Multiple Hierarical inheritance B-->A   & C-->A  multiple class properties in one class
 * 5. Hybrid inheritance : that is connect to all class 
 *  in java only 3 inheritance : Single , Multiple , Hierical inheritance
 * ++++++++ Constructor  and private access modifier cant inherit to other class
 * 
 ++++++++++ Type of relationship b/w class 
  1. inheritance (IS-A) Adv:- Code reusability , cost cutting ,reduce redundancy
  2. Association (HAS-A)--->1. Aggregation (Weak bond) 2. Composition (strong bond)    
  Association has not titly bond, non blood relation
  ref variable new
 * 
 */
class Animal{
    Animal(){// constructor
        String name = "xyz";
    }
    void eat(){
        System.out.println("Animal is eating");
    }
    void sleep(){
        System.out.println("Animal is sleeping");
    }
}
class Dog extends Animal{

}
class cat extends Animal{

}
public class inheritance1 {
    public static void main(String[] args) {
        Dog d= new Dog();
        cat c= new cat();
        c.eat();
        c.sleep();
        d.eat();
       

    }
}
