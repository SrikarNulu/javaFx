class Constructors 
{
	int id ;
    String name;
    int age; 
   
   Constructors(){
	   //no-arg
   }
   
   Constructors(int id){
	   //1-arg
       this.id = id;
   }
   
   Constructors(String name){
	   //1-arg
       this.name = name;
   }

     Constructors(int age){
	   //1-arg
       this.age = age;
   }

   Constructors(int id,String name){
	   //2-arg
       this.id = id;
       this.name = name;
   } 
   
    Constructors(int id,String name, int age){
	   //3-arg
       this.id = id;
       this.name = name;
       this.age = age;
   }

    public String toString(){
		  return "id \t: "+ id+ "\n"+
                  "name \t: "+ name+ "\n"+
                  "age \t: "+ age ;
    }

   public static void main (String [] args){
	     Constructors c1 = new Constructors();
         System.out.println(c1);
         System.out.println();
         System.out.println();

         Constructors c2 = new Constructors(225);
         System.out.println(c2);
         System.out.println();
         System.out.println();
   }
}
