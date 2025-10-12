class BankAccount
{
   static String bankName;
   private String accName;
   private long accNum;
   private boolean isActive;

   void setaccNum(long accNum){
	   this.accNum = accNum;
   }
   
   long getaccNum(){
	   return accNum;
   }

   void setaccName(String accName){
	   this.accName = accName;
   }
   
   String getaccName(){
	   return accName;
   }

   void setisActive(boolean isActive){
	   this.isActive  = isActive ;
   }

   boolean getisActive(){
	   return isActive;
   }

   void display(){
       System.out.println("Bank Name\t:"+ bankName);
	   System.out.println("Account Name\t:"+accName);
	   System.out.println("Account Number\t:"+accNum);
       if (isActive)
       {
           System.out.println("Your Account is Active now.." );
       }else if (accName!=null)
       {
		   System.out.println("Your Account is Deactivated due to no activity...." );
       }
       
   }
}

class Bank
{ 
  public static void main (String args[]){
  BankAccount.bankName = "Union Bank";
  BankAccount b1 = new BankAccount();
   // b1.display();
  
   b1.setaccName("Nulu Bindhu Madhava Srikhar");
   b1.setaccNum(123610100178195l);
   b1.setisActive(true);

   b1.display();
  }
}


