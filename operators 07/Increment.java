class Increment 
{
	public static void main(String[] args) 
	{
		/*int i =1;
        int j = i++ + ++i;
       System.out.println(j + "   " +i);*/

     int[] a = {5,10,15};
         int i=0, num;
     num = a[++i] + ++i + (++i);
    System.out.println(i + "  " + num );
    System.out.println("------------");


    i=0; num=0;
     num = a[i++] + i++ + (i++);
    System.out.println(i + "  " + num );

     System.out.println("------------");



     int z =001, y=010, x=100;
     
    System.out.println(z + "  " + y+ " " + x );


      System.out.println("------------");
    

      char che = 'a';
      System.out.println(che);
      System.out.println(+che);
      System.out.println(++che);


     
	}
}
