package oops;

class Account {
    private String accountNo;
    private String name;
    private String address;
    private String phoneNo;
    private double balance;

   public Account(String accountNo, String name, String address, String phoneNo, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.balance = balance;

    }
    public String getAccountNo(){
        return accountNo;
    }
    public void setAccountNo(String accountNo){
        this.accountNo = accountNo;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String address(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getPhoneNo(){
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void closeAccount(){
        balance = 0;
        phoneNo = null;
        address =  null;
        name = null;
        accountNo = null;
        System.out.println("Account has been closed...");
    }

}
class SavingsAccount extends Account{
    SavingsAccount(String accountNo, String name, String address, String phoneNo, double balance){
        super(accountNo, name, address, phoneNo, balance);
    }
    public void withDraw(double amount){
        if(getBalance() < 0){
            System.out.println("Not enough balance...");
        }else{
            setBalance(getBalance() - amount);
        }
    }
    public void deposit(double amount){
        setBalance(getBalance() + amount);
    }
    public void fixedDeposit(double amount, double rate, int years){
       double extraAmount = amount * Math.pow((1+(rate/100)),years);
       setBalance(getBalance() + extraAmount);
    }
}
class LoanAccount extends Account{
    LoanAccount(String accountNo, String name, String address, String phoneNo, double balance){
        super(accountNo, name, address, phoneNo, balance);
    }
    public void payEMI(double amount){
        setBalance(getBalance() - amount);
    }
    public void topUpLoan(double amount){
        setBalance(getBalance() + amount);
    }
    public void repayment(){}
}

public class Inheritance {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("2435475", "Anas", "123 street - 456", "45678990", 10.67);
        System.out.println(s1.getAccountNo());
        System.out.println(s1.getBalance());
        s1.withDraw(2.00);
        System.out.println(s1.getBalance());
}
}
