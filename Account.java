public class Account {

    private int balance;
    private String name;
    private String branch;

    public static void main(String[] args) {
        Account myAccount= new Account();
        Account yourAccount= new Account();

        myAccount.name="Shyam Sundar Singh";
        myAccount.balance=52;
        myAccount.branch="Imamganj branch";

        yourAccount.name="Shyam Ram Singh";
        yourAccount.balance=85;
        yourAccount.branch="Gaya branch";

        System.out.println("My account Address");
       System.out.println(myAccount.name);
       System.out.println(myAccount.balance);
       System.out.println(myAccount.branch);
       System.out.println("Your account Address");
       System.out.println(yourAccount.name);
       System.out.println(yourAccount.balance);
       System.out.println(yourAccount.branch);
       
    }
}
