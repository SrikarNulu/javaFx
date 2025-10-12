class Example
{
	public static void main(String[] args) 
	{
		/*int a =10;
        int b =20;
        System.out.println(b=a=5);
        System.out.println(b - a=10); // CE: unexpected type , variable required, value found 
        System.out.println(new Example() + "--------" + new Example()); */
		

     // System.out.println(0/0);  //R.E  Arithmetic Exception
     // System.out.println(1/0);  //R.E     ''''
      System.out.println(0.0/0);   //o/p:  NaN(not a number)
      System.out.println(0f/0);    //o/p:  NaN(not a number)
      System.out.println(-0.0/0); // o/p:  NaN(not a number)
      System.out.println(-0f/0);  // o/p:  NaN(not a number)
    
    //  System.out.println(22.0/7 * 10 *10);
      System.out.println(2.0/0);
      System.out.println(2f/0);
      System.out.println(-2.0/0);
      System.out.println(-2f/0);
			
		
	}
}
 
