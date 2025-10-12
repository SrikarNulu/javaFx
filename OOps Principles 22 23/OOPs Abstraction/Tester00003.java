

interface Car{
	 void start();
     void run();
}

interface Bike 
{
    void horn();
    void drive();
}

interface Cycle
{
    void bell();
    void speed();
}

 class Honda implements Car, Bike , Cycle
 {
    public void start(){System.out.println("The car is starting...");}
    public void run(){System.out.println("The car is running...");}
    public void horn(){System.out.println("The bike has horn ...");}
    public void drive(){System.out.println("The bike was driven...");}
    public void bell(){System.out.println("The Cycle has sound of bell...");}
    public void speed(){System.out.println("The Cycle was slow...");}
 }




















// Samsung  :  Mobiles TVs ACs Laptops  one class but multiple businesses

interface Mobile
{
   void size1();
}

interface TV
{
   void size2();
}

interface AC
{
   void size3();
}

interface Laptop
{
    void size4();
}


class Samsung implements Mobile, TV, AC, Laptop
{

    public void size1(){
	     System.out.println("This is mobile size 6 inch");
     }
    
   public void size2(){
	 System.out.println("This is TV size 16 inch");
  } 

 public void size3(){
	 System.out.println("This is AC size 32 inch");
  } 


public void size4(){
	 System.out.println("This is Laptop size 6 inch");
  }

    
}


/// New example


interface Fridge
{
   void cooler();
}

interface Laptops
{
   void processor();
}

interface Mobiles
{ 
   void touchScreen();
}

class LG implements Fridge, Laptops, Mobiles
{
    public void cooler(){
		 System.out.println("This is cooler for fridge...");
    }

    public void  processor(){
		 System.out.println("This is processor for laptop...");
    }
  
    public void touchScreen(){
		 System.out.println("This is touch for mobile...");
    }  
    
}



class  Tester00003
{
	public static void main(String[] args) 

	{


         Fridge f1 = new LG() ;
         f1.cooler();
         Mobiles m1 = new LG();
         m1.touchScreen();

		//System.out.println("Hello World!");
 
       /*Car c = new Honda();
       c.start();
       c.run();
       System.out.println();
      
       Bike b = new Honda();
       b.horn();
       b.drive();
       System.out.println();
      

       Cycle ce = new Honda();
       ce.bell();
       ce.speed();
       System.out.println(); 
      Laptop l1 = new Samsung();
      l1.size4();
      System.out.println("\n");

      Mobile m1 = new Samsung();
      m1.size1();
      System.out.println("\n");


     AC a1 = new Samsung();
      a1.size3();
      System.out.println("\n");

     TV t1 = new Samsung();
      t1.size2();
      System.out.println("\n"); */

  

	}
}
