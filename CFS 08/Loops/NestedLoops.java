class NestedLoops 
{
	public static void main(String[] args) 
	{
		  int i =0;
          int count=1;
          while (i<=5)
          {
             System.out.println("\nOuter Loop Executed "+ i);
           int j =0;
           
           while(j<=3){
			   System.out.println("        Inner Loop Executed "+ count);
               j++;
               count++;
           } 
             i++;
          }
	}
}
