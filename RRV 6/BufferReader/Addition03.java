import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
class Addition03 
{   
    
	public static void main(String [] args) throws IOException{

		 BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
         System.out.print("Enter First Number\t: ");
         int a = Integer.parseInt(br.readLine());
         System.out.print("Enter Second Number\t: ");
         int b = Integer.parseInt(br.readLine());
         System.out.println("Addition of "+a+" and "+ b + " is: "+(a+b));
      
	}	
}
  