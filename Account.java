public class Account {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    

    public static void main(String[] args){
        Account Bob = new Account(12345,12500.99,"joshua","joshua@gmaul.com","404-404-4044");
        System.out.println(Bob.getBalance());
        Account def = new Account();
    }
    public Account(){
        this(0000, 0, "def", "def@gmaul", "333-333-3333");
        System.out.println("empty constructor is called");
    }
    public Account(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Constructur called with params");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email; 
        this.phoneNumber = phoneNumber;
     }

    public int getAccountNumber(){
        System.out.println("Your account number is: " + this.accountNumber);
        return this.accountNumber;
    }
    public void setAccountNumber(int accountNumber){
        System.out.println("Your new account number is: " + this.accountNumber);
        this.accountNumber = accountNumber;
    }


    public double getBalance(){
        System.out.println("Your balance is: " + this.balance);
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
        System.out.println("Your new balance is: " + this.balance);
    }


    public void depositFunds(double cash){
        double newBalance = this.balance; 
        newBalance += cash;
        System.out.println("You have deposited: "+ cash);
        setBalance(newBalance);
    }

    public void withdrawFunds(double withdrawal){
        if(this.balance - withdrawal < 0){
            System.out.println("not enough funds");
            return;
        }
        double newBalance = this.balance; 
        newBalance -= withdrawal;
        System.out.println("You have withdrawed: "+ withdrawal);
        setBalance(newBalance);
    }
    public String getCustomerName(){
        System.out.println("Your name is: " + this.customerName);
        return this.customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getEmail(){
        System.out.println("Your email is: " + this.email);
        return this.email;
    }
    public void setEmail(String email){
        this.email= email;
    }

    public String getPhoneNumber(){
        System.out.println("Your phone number is: " + this.phoneNumber);
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber= phoneNumber;
    }


}
