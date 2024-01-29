/**** Method overriding
 * 
 */
class Test{
    void show(int a){
        System.out.println("1");
    }
}
class Test2 extends Test{
    void show(String  a){
        System.out.println("5");
    }
}
public class polymorphism2 {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.show(5);
        Test2 t2= new Test2();
        t2.show("ab");
    }
}
