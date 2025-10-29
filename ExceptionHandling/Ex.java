class Ex 
{
	


    public static void main(String[] args) 
	{
		 int a =10;
         int b = 0;
         int [] arr = {1,2,3};
       try{

            System.out.println("a: "+ a + " b: "+ b);
            //System.out.println(arr);
          try{
            System.out.println(arr[7]);
             }
          catch(Exception e) {//e.printStackTrace();
              System.out.println(e);
        }
            
               

          try{
           System.out.println(a/b);}
          catch (Exception e){
			  //e.printStackTrace();
               System.out.println(e);
          }
          
         //  System.out.println(a/b);   
            
          }
          
          catch(Exception e){
			 //e.printStackTrace();
            System.out.println(e); //e.toString() -> no need to call toString(), println() automatically call that
            // System.out.println(e.getMessage());
          }
      /** catch(ArithmeticException e){
		    System.out.println("Error occured: "+e.getMessage());
       }
    
       catch(ArrayIndexOutOfBoundsException e){
		   System.out.println("Error occured: "+e.getMessage()); 
       }
*/  
     finally{
		 
         System.out.println(a);
         System.out.println(a/b);
     }
	}
}
