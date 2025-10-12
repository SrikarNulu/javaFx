import java.util.Scanner;
class Person
{  
    //static fields
	 private static int eyes;
     private static int ears;
     private static int hands;
     private static int legs;
     private static int objectCounter;
   
   // non static fields
    private String name;
    private int age;
    private int height;
    private int weight;

 

//static block
   static {
	   eyes = 2;
       ears = 2;
       hands= 2;
       legs = 2;       
   }
// non-static block
    {
		  objectCounter++;
    } 

  Person(String name, int age, int height, int weight){
	  this.name=name;
      this.age = age;
      this.height= height;
      this.weight = weight;
  }

// static getters & setters methods 
   
   public static void setEyes(int eyes){
	    Person.eyes = eyes;
   }

   public static void setEars(int ears){
	    Person.ears = ears;
   }

    public static void setHands(int hands){
	    Person.hands = hands;
   }

   public static void setLegs(int legs){
	    Person.legs = legs;
   }

   public static int getEyes(){
	   return eyes;
   }

    public static int getEars(){
	   return ears;
   } 

    public static int getHands(){
	   return hands;
   } 
  
    public static int getLegs(){
	   return legs;
   } 
  
 // instance getters & setters
  
   public void setName (String name){
	    this.name = name;
   }  
   
   public String getName (){
	   return name;
   }

   public void setAge (int  age){
	    this.age = age;
   }  
   
   public int getAge (){
	   return age;
   }

   public void setHeight (int  height){
	    this.height = height;
   }  
   
   public int getHeight (){
	   return height;
   } 

    public void setWeight (int weight){
	    this.weight = weight;
   }  
   
   public int getWeight (){
	   return weight;
   } 


   void sleep(){
	   System.out.println(getName() + " is sleeping" );
   }
  
  void eat(){
	   System.out.println(getName() + " is eating" );
   }
  

  void learn(){
	   System.out.println(getName() + " is learning" );
   }
  
   @Override
  public String toString(){
	  return  
        " Person Details \n"+
        " Eyes\t:" + eyes + "\n"+
        " Eyes\t:" + ears + "\n"+
        " Eyes\t:" + hands + "\n"+
        " Eyes\t:" + legs + "\n" ;      
  } 

   public static void main (String [] args){
       Person p1 = new Person("Srikar Nulu", 23, 163,57);
	   System.out.println(p1);
   }
}



