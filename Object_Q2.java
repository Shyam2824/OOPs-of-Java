/* ** Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' 
and that of name as "John" by creating an object of the class Student.
 */

import java.util.Scanner;

class Student{
    String name;
    int roll_no;
}
public class Object_Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Student s= new Student();
        s.name= sc.nextLine();
        s.roll_no=sc.nextInt();
        System.out.println("Name of the student"+ s.name + "and roll no is"+ s.roll_no);
    }
}
