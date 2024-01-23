// abstract  only class and Method
// it means not clear meaning
// it has only declearation but not implementation child class are response to implementation
// it has no "{}" bracket that valid";"

    // 1. public abstract void m1(){};// abstract cant have body
    // 2. public  void m1();// that have method and not body
    // 3. public abstract void m1(); // that should be valid
    // 4. public  void m1(){} ; // that have no abstract method that they are valid

    // partial implement class that not complete

    /**
     * Abstract method 
     * if class contain at lest one abstract method that decleared  abstract class
     *  Abstract class cantain zero abstract method that also acceptable
    */
    // abstract class test2{
    //     public void m2(){}
    //     public void m3(){}
    //     public void m4(){}
    //     public void m5(){} // there should be no abstract method
    // }
    
    
    abstract class vehicles{

         public abstract int getNoOfWheels ();
         
    }
    class Bus extends vehicles{
        public int getNoOfWheels (){
            return 4;
        }
    }
    
    class Auto extends vehicles{
        public int getNoOfWheels (){
            return 3;
        }
    }

public class Abstract_method {
    public static void main(String[] args) {
        Bus b= new Bus();
        System.out.println(b.getNoOfWheels());
        Auto a= new Auto();
        System.out.println(a.getNoOfWheels());
    }
}
