class A
{

    static int a;
    int y;
    String z;
   
    
    static {
		a=50;
    }

    A(){
		//no-org
       this(101, "UnDefined");
    }

    A(int y, String z){
		this.y=y;
        this.z=z;
    }

   
  
	static final void  m1(){
		  System.out.println("This is AM1");
	}
  
    final void m2(){
		  System.out.println("This is AM2");
	}
   
    static void  m3(){
		  System.out.println("This is AM3");
	}
  
    void  m4(){
		  System.out.println("This is AM4");
	}

   

}

class B extends A
{
   static int b;
   static  {b=100;}
   int p ;
   String q;


    B(){
		 this(0, "Not Disclosed");
    }

    B(int p, String q){ //compiler adds default constructor here as there is no this() and super() is not declared yet
		  this.p =p;
          this.q=q;
    }
   
   /*  static  final void  m1(){
		  System.out.println("This is BM1");
	}								  
  									  
    final void  m2(){				  
		  System.out.println("This is BM2");
	}*/								  
   									  
    static void  m3(){				  
		  System.out.println("This is BM3");
	}								  
  									  
    void  m4(){						  
		  System.out.println("This is BM4");
	}
}

 
 class C extends B
 {
    static final void  m3(){
		  B.m3();
	}
  
    final void  m4(){
		  super.m4();
	}

 }


  
 class D extends C
 { //WE can't override the method m3() because it is declared final in class C
   // static void  m3(){
	//	  System.out.println("This is DM3");
	//}
  
   // void  m4(){
	//	  System.out.println("This is DM4");
	//}

 } 

 class E extends B
 {
    static final void  m3(){
		  System.out.println("This is EM3");
	}
  
    final void  m4(){
		  System.out.println("This is EM4");
	}

 }



 class Tester3
 {
    public static void main (String [] args){
		A a1 = new B();
        A.m1();
        a1.m2();
        A.m3();
        a1.m4();
     System.out.println();
     System.out.println();
     System.out.println();

     C c1 = new C();
     C.m1();
     c1.m2();
     C.m3();
     c1.m4();

     System.out.println();
     System.out.println();
     System.out.println();
     
       D d1 = new D();
     D.m1();
     d1.m2();
     D.m3();
     d1.m4();


    System.out.println();
     System.out.println();
     System.out.println();
     
       E e1 = new E();
     E.m1();
     e1.m2();
     E.m3();
     e1.m4();
    }
 }
