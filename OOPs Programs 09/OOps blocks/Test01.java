import java.util.Scanner;
class Bike  
{
private static     String brand;
       private     String model;  // same model for all bikes of a particular brand
       private     String color;
       private     int milage;
       private     int number;
       private     String owner;
     
   static {
       System.out.print("Enter the Brand of bike: ");
	   brand = new Scanner(System.in).next();
   }   

   {
	  model = "125CC";
   }   

    Bike(String color, int milage, int number, String owner){
		this.color = color;
        this.milage = milage;
        this.number = number;
        this.owner = owner;
    } 
   
    void start()
       {
         System.out.println("The bike is getting started.");
       }

    void run()
        {
          System.out.println("The bike is getting run.");
        }
    void stop()
         {
          System.out.println("The bike is getting stop.");
         }

   void display(){
	   System.out.println(brand);
	   System.out.println(model);
	   System.out.println(color);
	   System.out.println(milage);
	   System.out.println(number);
	   System.out.println(owner);
   }
}

class Test01
{ 
   public static void main (String [] args){
	  Bike b1  =  new Bike("red", 55, 12345,"ram kd");   
      b1.start();
      b1.run();
      b1.stop();

     b1.display();
   }
}
