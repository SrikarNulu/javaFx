class Ex 
{    
     int x=5, y=10;
     public static Ex e = new Ex();
   
    { 
           System.out.println("initilizer block is called...");
           System.out.println(e.x);
           System.out.println(e.y);
    }

   
	public static void main(String[] args) 
	{
	   System.out.println("Hello World!");
       System.out.println(e.x);
	}
}
