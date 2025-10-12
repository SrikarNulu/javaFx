class  Recursion
{  
 
     static int i = 0;

     static void meth1(){
      // if(i<=10){
         System.out.println(i);
		// i++;
         meth1();
        //}       
     }
	public static void main(String[] args) 
	{   
        meth1();
		System.out.println("--------------");
		System.out.println(i);
	}
}
