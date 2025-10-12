abstract class A
{
    abstract void m1();
    abstract void m2();
}

class B extends A
{
   void m1(){
	   System.out.println("Bm1()");
   }

   void m2(){
	   System.out.println("Bm2()");
   }
}

class C extends A
{
   void m1(){
	   System.out.println("Cm1()");
   }
  
   void m2(){
	   System.out.println("Cm2()");
   }
}





class  Test01
{
	public static void main(String[] args) 
	{
		 A a1 = new C();
         a1.m1();
         a1.m2();
	}
}
