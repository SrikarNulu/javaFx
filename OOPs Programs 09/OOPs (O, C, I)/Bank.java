class Bank 
{
	public static void main(String[] args) 
	{
		//creating two instances for creating two bank accounts
        // for objects HK and BK 
         
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();
        
      //initializing acc1 instance with the objet HK values
        acc1.bankName ="HDFC";
        acc1.branchName ="Ameerpet";
        acc1.ifsc ="HD1234";
        acc1.accNum = 23610100178195l;
        acc1.accName ="Nulu Bindhu Madhava Srikhar";
        acc1.balance =387;

     //initializing acc1 instance with the objet BK values
        acc2.bankName ="ICICI";
        acc2.branchName ="Ameerpet";
        acc2.ifsc ="IC1234";
        acc2.accNum = 236101001781952l;
        acc2.accName ="Nulu Karthikeya";
        acc2.balance =458;
        
		System.out.println("-----acc1 object values------");
		System.out.println(acc1.bankName);
		System.out.println(acc1.branchName);
		System.out.println(acc1.ifsc);
		System.out.println(acc1.accNum);
		System.out.println(acc1.accName);
		System.out.println(acc1.balance);

         
        System.out.println("-----acc2 object values------");
		System.out.println(acc2.bankName);
		System.out.println(acc2.branchName);
		System.out.println(acc2.ifsc);
		System.out.println(acc2.accNum);
		System.out.println(acc2.accName);
		System.out.println(acc2.balance);
	} 
}
