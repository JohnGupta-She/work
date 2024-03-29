/*
Jason Zhou (Roster: Nina, John Duckies: Miss Alpaca, Tiggy, )
APCS
HW18: CPA-One (Codified BankAccount.java)
2021/10/14
DISCO: N/A
Q: N/A
Q2: Constructors are used whenever you create an instance of an object. 
    Hence, it Java did not create a constructor for you, BigSib.java
    would not work. 
    
Q3: An easy test that we can do is create an instance of a class, say 
    BankAccount and run instanceOfBankAccount.toString(); This will
    return ClassName@hashcode. This isn't really useful besides for
    debugging and other things. The superclass to all classes is object 
    class. Class Object has a method toString() which converts an object
    into a string. Since every class is a subclass of Object, we can
    do @Override and override the method in our subclass.
*/


public class BankAccount {
    //vars
    private double balance;
    private String accPin;
    private String accName;
    private String accPss;
    private String accId;

    //constructor
    public BankAccount() {

    }
    //overloaded constructor
    public BankAccount(String name, String pss, String id, String pinnum, double setBalance) {
        balance = setBalance;
        accPin = pinnum;
        accName = name;
        accPss = pss;

        //Randomize?
        accId = id;
    }
    
    //methods
    public void getInfo(String pss, String pin) {
    //.equals/compareTo
        if (pss == accPss && pin == accPin) {
            System.out.println("Name: " + accName + "\nAccount Id: " + accId + "\nBalance: " + balance + "\n");
        } else {
            System.out.println("Access Denied/Account Doesn't Exist");
        }
    }
    /*
    public String getInfo(String name, String pss, String pin) {
    return
    }
    */

    public void changePin(String oldPin, String newPin) {
    //add superuser
        if (oldPin == accPin && newPin.length() == 4) {
            accPin = newPin;
        } else {
            System.out.println("Wrong Pin");
        }
    }

    public void changeName(String newName, String pss) {
        if (pss == accPss) {
            accName = newName;
        } else {
            System.out.println("Wrong Password");
        }

    }

    public void changePsswrd(String oldPss, String newPss, String newPssRepeat) {
        if (oldPss == accPss && newPss == newPssRepeat) {
            accPss = newPss;
        } else {
            System.out.println("Wrong Password");
        }
    }

    public void deposit(String pin, double amount) {
        if (pin == accPin && amount > 0) {
            balance += amount;
        } else {
            System.out.println("Wrong Pin");
        }
    }

    public void withdraw(String pin, double amount) {
        if (pin == accPin && amount > 0) {
            balance -= amount;
        } else {
            System.out.println("Wrong Pin");
        }
    }
    public static void main(String[] args) {
        BankAccount elmo = new BankAccount("elmo", "e", "101101101", "1011", 69);
        elmo.getInfo("e", "1011");
        elmo.changePin("1011", "1111");
        elmo.getInfo("e", "1111");
        elmo.changeName("elmoson", "e");
        elmo.getInfo("e", "1111");
        elmo.changePsswrd("e", "ee", "ee");
        elmo.getInfo("ee", "1111");
        elmo.deposit("1111", 69);
        elmo.getInfo("ee", "1111");
        elmo.withdraw("1111", 20);
        elmo.getInfo("ee", "1111");
        System.out.println(elmo.toString());
        //correct outputs will have no errors
    }

}
