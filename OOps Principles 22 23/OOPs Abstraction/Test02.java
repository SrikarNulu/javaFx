abstract class Shapes
{
   abstract void findArea(int l, int b);
}


class Rectangles extends Shapes
 {
     void findArea(int l, int b){
		 System.out.println("Area of Rectangle is: "+ (l*b));
     }
 }

class Square extends Shapes
 {
     void findArea(int a, int b){
		 System.out.println("Area of Square is: "+ (a*a));
     }
 }

class Triangle extends Shapes
 {
     void findArea(int h, int b){
		 System.out.println("Area of Triangle is: "+ (b*h)/2);
     }
 }

// BankATM class


 abstract class BankATM
 {  
     abstract void depositAmount();
 }

class Kotak extends BankATM
{
     void depositAmount(){
		  System.out.println("Amount Deposited in Kotak Bank");
     }
}

class ICICI extends BankATM
{
     void depositAmount(){
		  System.out.println("Amount Deposited in ICICI Bank");
     }
}

class Axis extends BankATM
{
     void depositAmount(){
		  System.out.println("Amount Deposited in Axis Bank");
     }
}




class Test02 
{
	public static void main(String[] args) 
	{
		 //Shapes s1 = new Square();
         //s1.findArea(10,10);

      /* BankATM b1;
       b1 = new Kotak();
       b1.depositAmount();
       System.out.println();
       b1 = new ICICI();
       b1.depositAmount();*/
     //  System.out.println();
     ///  b1 = new Axis();
     //  b1.depositAmount();

     Honda h1 = new bike();
     h1.drive();

    System.out.println("\n");
   
    Honda h2 = new car();
     h2.drive();


	}
}


abstract class Honda
{
  abstract void drive();
}

class car extends Honda
{
   public void drive(){
	  System.out.println("Car is driving....");
   }
}

class bike extends Honda
{
   public void drive(){
	  System.out.println("bike is driving....");
   }
}



