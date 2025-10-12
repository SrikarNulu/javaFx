import java.util.Scanner;

class EvenOdd 
{
    // Develop a program with user defined method to take a number as an argument 
    // find weather it is even or odd, and return result
    // if even return true else false 
    // In calling method print message to user
    // The given number <number> is even
    // The given number <number> is odd

    public static boolean isEven(int num){
		/*if(num%2==0){
			return true;
		}else{
			return false;
		}*/
         
		   /* if(num%2==0)
				return true;
			else
				return false; */
       
       // return num%2==0? true : false;

      return num%2==0;
    }
}



class Test
{
	public static void main(String[] args) 
	{   
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if(num<=0){
			System.out.println("Number numst be greater than 0...");
        }else{

		boolean result = EvenOdd.isEven(num);
        
         if(result){
            System.out.println("The given number "+ num + " is even.");
         }else{
			System.out.println("The given number "+ num + " is odd.");
         }
        }
	}
}
