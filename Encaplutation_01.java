// Step to achieved to encapsulation
// 1. declare the  variables of a class as private
// 2. provide public setter and getter method to modify and view the variable values
 class employee{
    private int emp_id;
     
    public void setEmployee(int Emp_id){
        emp_id= Emp_id;
    }
    public int getEmployee(){
        return emp_id;
    }

 }
public class Encaplutation_01 {
    public static void main(String[] args) {
        employee m= new employee();
        m.setEmployee(253);
        System.out.println(m.getEmployee());
    }
}
