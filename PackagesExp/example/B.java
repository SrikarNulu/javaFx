

package p1;
public class B 
{
    public static void m2(){
		 System.out.println("B m2()");
         System.out.println("Calling A class from B m2()" + (A.m1()));
    }
	public static void main(String[] args) 
	{
		System.out.println("This is class B");
        System.out.println(A.m1());
	}
}
