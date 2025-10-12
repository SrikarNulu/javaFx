class BankATM
{ 
    void depositAmount(){
		 System.out.println("Amount Deposited");
    }
}

class Kotak extends BankATM
{
   void depositAmount(){
		 System.out.println("Amount Deposited in Kotak Bank");
    }
}


class HDFC extends BankATM
{
   void depositAmount(){
		 System.out.println("Amount Deposited in HDFC Bank");
    }
}

class ICICI extends BankATM
{
   void depositAmount(){
		 System.out.println("Amount Deposited in ICICI Bank");
    }
}



class  Tester04
{
	public static void main(String[] args) 
	{
		BankATM b1 = new Kotak();
        b1.depositAmount();

        BankATM b2 = new HDFC();
        b2.depositAmount();
	}
}
