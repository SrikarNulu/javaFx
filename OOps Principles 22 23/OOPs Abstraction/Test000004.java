





interface TCS
{
  void m1(String software);
}

interface TataBisleri
{
   void m2(String water);
}

interface TataSteel
{
   void m3(String steel );
}

class Tata implements TataBisleri,TCS,TataSteel
{
    public void  m1(String software){ System.out.println("Tata SoftWare "+software); };
    public void  m2(String water){ System.out.println("Tata Water"+water); };
    public void  m3(String steel){ System.out.println("Tata steel"+steel); };
} 

class Infosys implements TCS
{
   public void m1(String software){System.out.println("Infi SoftWare"+software);};
} 






















interface Software
{
   void company();
}

class Tcss implements Software 
{
    public void company(){System.out.println("This is TCS");}
}


class Infosyss implements Software 
{
    public void company(){System.out.println("This is Infosys");}
}


class LTI implements Software 
{
    public void company(){System.out.println("This is LTI");}
}







class Test000004 
{
	public static void main(String[] args) 
	{
   
       
     
   /*   Software IT ; 
    
       IT = new Tcss();
       IT.company();
      
       IT = new Infosyss();
       IT.company();
      IT = new LTI();
       IT.company();
       

	  /*  TCS t1 = new Tata();
        t1.m1("SS solutions");
      
        t1 = new Infosys();
         t1.m1("Infi swo"); 
      
     A a1 = new C(); 
     a1.m1();
     a1.m2(); */



   // A a1 = new C();
   // a1.m1();
    
    B b1 = new C();
    b1.m2();
    
	}
}




/*abstract class A
{
   abstract void m1();
   
}
  

abstract class B 
{
   abstract void m2();
  
}

class C extends B
{    
   void m2() { System.out.println("BM1");}
    void m1(){ System.out.println("AM1");}
   //void m2(){ System.out.println("BM2");}
}

























/*abstract class A
{
   abstract void m1();
   abstract void m2();
}
  

abstract class B extends A
{
   void m1(){ System.out.println("BM1");}
   //void m2(){ System.out.println("BM2");}
}

class C extends B
{    
   void m2() { System.out.println("CM2");}
}
*/



