/* * "this" keyword is the reference variable that refers to current object.
 * 
 */
class Test{
    int i;
    void  setValues(int i){
       this.i=i;
    }
    void show(){
        System.out.println(i);
    }
}
public class this_Keyword {
    public static void main(String[] args) {
        Test t= new Test();
        t.setValues(10);
        t.show();
    }
}
