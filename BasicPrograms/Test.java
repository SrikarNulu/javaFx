
class Addition 
{
	public static int add(int a, int b) throws IllegalArgumentException {
		 if(a<0 || b<0){
			throw new IllegalArgumentException ("Do not pass -ve numbers...");
		 }
         else{
			return a+b;
         }

	}
}


class Test
{
   public static void main(String [] args){
	   try{
		   int res = Addition.add(5,-6);
            System.out.println("result is: "+res);
	   }
       catch (IllegalArgumentException e){
		    System.out.println(e.getMessage());
       }
   }
}
