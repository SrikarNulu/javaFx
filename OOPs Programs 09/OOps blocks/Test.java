
// develop a program to count no of objects created from the class.  //06/09/25
class counter
{ 
   private static int count;  
   int num;
   String name;

   {
    count+=1;
   }
  
   counter(){
	  
   }

   counter(int num){
	  this.num = num;
   }

   counter(String name){
	   this.name = name;
   } 
  
   counter(String name, int num){
	   this.name = name;
       this.num = num;
   } 

     int getCount(){
		return counter.count;
    }
 
}

class Test
{
   public static void main (String [] args){
	  counter c1 = new counter();
        System.out.println(c1.num + " " + c1.name +" "+ c1.getCount());
        												 
	  counter c2 = new counter(5);						 
        System.out.println(c2.num + " " + c2.name +" "+ c2.getCount());
														 
														 
	  counter c3 = new counter("Srikar");				 
        System.out.println(c3.num + " " + c3.name +" "+ c3.getCount());
														 
														 
	  counter c4 = new counter("Ram",6);				 
         System.out.println(c4.num + " " + c4.name +" "+ c4.getCount());
  }
}

