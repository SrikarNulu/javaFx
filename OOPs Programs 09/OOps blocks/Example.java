import java.util.Scanner;
class Example
{    
	static int a;
    static int b;
    Scanner sc = new Scanner(System.in);

    static{	 
      int a;
         System.out.print("Enter the value of Static variable a: ");
         a = new Scanner(System.in).nextInt();
    } 

   public static void main(String [] args){
	   System.out.println("value of a: "+a);
	   System.out.println("value of b: "+b);
   }

   static {
        System.out.print("Enter the value of Static variable b: ");
        b = new Scanner(System.in).nextInt();
   }
} 
