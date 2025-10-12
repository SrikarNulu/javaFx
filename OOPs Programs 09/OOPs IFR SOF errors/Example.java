class Example
{   static int a =0;
   void m1(){
	   System.out.println("m1() start");
       if (a<=100)
       {  a++;
           m1();
       }
      
       System.out.println("m1() end");
   }

   public static void main(String [] args){
	 System.out.println("main start");
     Example e = new Example();
     System.out.println("object is created");
     e.m1();
     System.out.println("main end");
  }

   int x = m2();
   int m2(){
	  System.out.println("NSV x");
      return 50;
   } 
    
   Example(){
	  System.out.println("constructor start");
      System.out.println("end of constructor");
   }
}