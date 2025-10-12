
import java.io.IOException;
class  Addition02
{
	public static void main(String[] args) 
	throws IOException{
		
        System.out.print("Enter First number: ");
        /** int value = System.in.read();    
           -> System.in.read() only reads one value and provides ascii value (ex: for a =97, 0 = 48, A=65)
            and should also we have to write exception (throws) for reporting 
            -> if you want to read two values you have to write read() method two times, same for any no of times
         -> there are many problems with the System.in.read() method so we don't use this method for reading runtime values */
        int a = System.in.read();
        int b = System.in.read();
      
      System.out.println(a);
      System.out.println(b);
     

	}
}
