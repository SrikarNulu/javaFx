class VoidMethods 
{    
     
    static void m1(){
		return;
    }
     
    static int m2(){
		return 5;
    }
	public static void main(String[] args) 
	{
		
     System.out.println(m1());// CE: Void type not allowed as void doen't return anything
     System.out.println(m2()); // allowed because non-void mehtod return a value
	}


 
}


