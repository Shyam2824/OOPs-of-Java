/****it is the inheriting the properties of parents class into child class. 
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
