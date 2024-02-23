import java.util.Scanner;

abstract class Marks{
    int [] marks;

    Marks(int...marks){
        this.marks=marks;
    }
    abstract double getPercentage();
}
class A extends Marks{
    A(int sub1, int sub2, int sub3){
        super(sub1, sub2, sub3);
    }
    double getPercentage(){
        int totalMarks= marks[0]+marks[1]+marks[2];
        double percent= (totalMarks/3);
        return percent;
    }
}
class B extends Marks{
    B(int sub1, int sub2, int sub3, int sub4, int sub5){
        super(sub1, sub2, sub3, sub4, sub5);
    }
    double getPercentage(){
        int totalMarks= marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
        double percent= (totalMarks/5);
        return percent;
    }
}
public class abstractpercentage {
    public static void main(String[] args) {
        
        A studentA= new A(57, 65, 89);
        B studentB= new B(95,  96, 36, 86, 53);
        System.out.println("Marks of A: "+ studentA.getPercentage());
        System.out.println("Marks of B: "+ studentB.getPercentage());
    
    }
    
}
