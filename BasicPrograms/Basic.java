import java.util.Map;
import java.util.HashMap;

class Basic {
   // public static void main (String [] args){
       // System.out.println("\tSrikar\n\t\tNulu\n\t\t\t\tn\st\sp");
        //System.out.println("Name\t\t: Srikar Nulu");
        // System.out.println("Age\t\t: 23");
       // System.out.println("Class\t\t: Graduated");
       //  System.out.println("Jobready\t: No");
       // System.out.println("123456781234567\t: No");
    /*  int a =4;
       int b =5;
           // int res = a+b;
           System.out.println("The addition of " + a + " and " + b + " is : "+ (a+b));
           System.out.printf("The addition of %d and %d is : %d",a,b,a+b);  */
   //  System.out.println("Hello"); 
   //}
   
  
//public static int meth1(int a, int b)
 /*throws IllegalArgumentException
 {
	if (!(a>0 && b>0))
	{ 
		throw new IllegalArgumentException("Values should not be less than Zero...");
	}
    else{
		return a+b;
    }*/

public static void main(String args[]){
    
    Map <Integer, String> dict1 =  new HashMap <>();

    dict1.put(1,"Srikar Nulu");
    dict1.put(2,"Vijay");
    dict1.put(3,"Ravi");
    dict1.put(4,"Bala");
    dict1.put(5,"potti");
   
   System.out.println();
   System.out.println(dict1.get(1));
   System.out.println();

   System.out.println();
   System.out.println(dict1.remove(5));
   System.out.println();

   System.out.println();
   System.out.println(dict1.containsKey(4));
   System.out.println();

   System.out.println();
   System.out.println(dict1.containsValue("Bala"));
   System.out.println();

   System.out.println();
   System.out.println(dict1.size());
   System.out.println();

   System.out.println();
   System.out.println(dict1.keySet());
   System.out.println();

  System.out.println();
   System.out.println(dict1.values());
   System.out.println();

System.out.println();
   System.out.println(dict1.entrySet());
   System.out.println();
  
//Printing keys-values using keys
  for (Integer key : dict1.keySet() )
  {
     System.out.println("Key: "+ key + " Value: "+ dict1.get(key));
  }



   //Printing using values
  
   for(String value : dict1.values()){
	   System.out.println("value: "+ value);
   }

  

   

  } 
}