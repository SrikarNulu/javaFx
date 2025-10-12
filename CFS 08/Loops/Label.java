class Label 
{
	public static void main(String[] args) 
	{   int count =1;
		a:for (int i=0; i<5; i++)
            {
                System.out.println("Outer Loop"+i);
			b:for (int j=0; j<5 ; j++) 
			{
                System.out.println("      Inner Loop"+count);
                count++;
                break a;
			}
            System.out.println();
		    }
	}
}
