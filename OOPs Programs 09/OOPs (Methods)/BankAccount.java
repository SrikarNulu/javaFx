class BankAccount 
{   
    double currentBalance;
  
    void deposit(double amount){
		currentBalance += amount;
    }

    void withdraw(double amount){
		currentBalance -= amount;
    }

	public static void main(String[] args) 
	{
		BankAccount acc1 = new BankAccount();
        System.out.println(acc1.currentBalance);
        acc1.currentBalance = 50000;
        acc1.deposit(21000);
        System.out.println(acc1.currentBalance);
	}
}
