// Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and
//  $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are 
//  subclasses of class 'Bank', each having a method named
//  'getBalance'. Call this method by creating an object of each of the three classes.

abstract class Bank {
 abstract int getBalance();
}
class BankA extends Bank{
    public int  getBalance(){
        return 100;
    }
}
class BankB extends Bank{
    public int getBalance(){
        return 150;
    }
}
class BankC extends Bank{
    public int getBalance(){
        return 200;
    }
}


public class Abstract_2 {
    public static void main(String[] args) {
        BankA bA= new BankA();
        BankB bB= new BankB();
        BankC bC= new BankC();

        System.out.println("Bank A balanced: " + bA.getBalance());
        System.out.println("Bank B balanced: " + bB.getBalance());
        System.out.println("Bank C balanced: " + bC.getBalance());
    }
}
