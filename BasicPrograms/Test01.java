


class Multiply
{
   static  int mul (int a, int b) throws IllegalArgumentException{
	   if(a<0 || b<0){
		  throw new IllegalArgumentException ("Numbers must be greater than 0...");
	   }
      else{
		 return a*b;
      }
   }
}



class  Test01
{
	public static void main(String[] args) 
	{
		try
		{
			int res = Multiply.mul(-5,6);
            System.out.println(res);
		}
		catch (IllegalArgumentException e)
		{
           System.out.println(e.getMessage());
		}
	}
}
