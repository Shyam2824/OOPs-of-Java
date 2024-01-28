/****it is the inheriting the properties of parents class into child class. 
 *  Advantage: Code reusability and achieved polymorphism
 * 
 * Types of inheritance: 1. Single inheritance A-->B
 * 2. Multilevel inheritance A-->B-->C then A-->C
 * 3. Hierarical inheritance A-->B and A-->C B & C has no relation  one class properties in  multiple class
 * 4. Multiple Hierarical inheritance B-->A   & C-->A  multiple class properties in one class
 * 5. Hybrid inheritance : that is connect to all class 
 *  in java only 3 inheritance : Single , Multiple , Hierical inheritance
 * ++++++++ Constrctor  and private access modifier cant inherit to other class
 * 
 */
class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{

}
public class inheritance1 {
    public static void main(String[] args) {
        Dog d= new Dog();
        d.eat();

    }
}
