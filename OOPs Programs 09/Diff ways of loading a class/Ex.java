class Ex 
{
	int id ;
    String name;
    int age; 
     
    Ex(){
		  this(0,"Undefined",0);
          System.out.println("NPC");
    }
  
    Ex(int id){
		 this(id,"Undefined", 0);
         System.out.println("SIPC");
    } 
    
    Ex(String name){
		 this(0,name, 0);
          System.out.println("SSPC");
    }
   
    Ex(int age, boolean isTrue){
		 this(0,"Undefined", age);
         System.out.println("SAIPC");
    }

    
    Ex(int id, String name){
		 this(id,name,0);	
        System.out.println("2PC");	 
    }

    Ex(int id, String name, int age){
		  this.id = id;
          this.name = name; 
          this.age = age;	 
         System.out.println("3PC");
    }
 
 
    public String toString(){
		  return "id \t: "+ id+ "\n"+
                  "name \t: "+ name+ "\n"+
                  "age \t: "+ age ;
    }

   public static void main (String [] args){ 
         Ex c1 = new Ex();
         System.out.println(c1);
         System.out.println();
         System.out.println();

      Ex c2 = new Ex(1);
         System.out.println(c2);
         System.out.println();
         System.out.println(); 

     Ex c3 = new Ex(25,true);
         System.out.println(c3);
         System.out.println();
         System.out.println(); 

      Ex c4 = new Ex("Srikar Nulu");
         System.out.println(c4);
         System.out.println();
         System.out.println(); 

      Ex c5 = new Ex(2,"Ram K");
         System.out.println(c5);
         System.out.println();
         System.out.println(); 

      Ex c6 = new Ex(3,"Ram z",27);
         System.out.println(c6);
         System.out.println();
         System.out.println();


     Ex c7 = new Ex();
         System.out.println(c7);
         System.out.println();
         System.out.println(); 
   
  }
}
