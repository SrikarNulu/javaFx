
package p1;

class Parent
{
   void m1(){
	  System.out.println("This is parent class ");
   }
}


class Example extends Parent
{
    void m1(){
		 System.out.println("This is child class ");
    }
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
  
        Parent p  =  new Example();
        p.m1();
	}
}
