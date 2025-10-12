import java.util.Arrays;
class Laptop 
{
   static String name ;
    
   private String [] specifications;
   private String color;
   private Boolean msOfficeIncluded;
    
   Laptop(){
	  System.out.println("You Initilized constructor without values,\n so instance variables are initilized with default values,\n You need to modify the values of instance variables of current object reference through setter methods.");
   } 

   Laptop(String [] specifications, String color, Boolean msOfficeIncluded){
	   this.specifications = specifications;
       this.color = color;
       this.msOfficeIncluded= msOfficeIncluded;
   }

   void setSpecifications(String [] specifications){
	   this.specifications = specifications; 
   }  
  
   String [] getSpecifications(){
	   return specifications;
   }
  
   void setColor(String color){
	   this.color = color;
   }
  
   String getColor(){
	   return color;
   }

   void setMsOfficeIncluded(Boolean msOfficeIncluded){
	   this.msOfficeIncluded = msOfficeIncluded;
   }
  
   Boolean isMsOfficeIncluded(){
	   return msOfficeIncluded;
   }

   void display(){
	  System.out.println("//-Laptop Details-\\");
      System.out.println();
	  System.out.println(Laptop.name);
	  System.out.println(Arrays.toString(specifications));
	  System.out.println(color);
	  System.out.println(msOfficeIncluded);
      System.out.println();
      System.out.println("--------------------");
   }
}


class Refrigirator
{
   private String name;
   private String color;
   private String brand;
   private int warrenty;
   private int stars;

  
   Refrigirator(String name,String color,String brand,int warrenty,int stars){
	  this.name = name;
      this.color = color;
      this.brand = brand;
      this.warrenty = warrenty;
      this.stars = stars;
   }

  Refrigirator(){
	System.out.println("You need to initilize with setters....");
   }
    
   void display(){
	  System.out.println("//-Refregirator Details-\\");
      System.out.println();
	  System.out.println(name);
	  System.out.println(color);
	  System.out.println(brand);
	  System.out.println(warrenty);
      System.out.println(stars);
      System.out.println("--------------------");
  
  
  }
}





class Electronics
{
   public static void main (String [] args){
     /*  Laptop.name = "HP Victus";
	   Laptop l1 = new Laptop();
       l1.display();
       String [] specs = new String[] {"HP","Gaming Laptop", "8GB RAM","512GB SSD","AMD Ryzen 5 5600H Processor","AMD Radeon 4GB Graphic Card"};
       l1.setSpecifications(specs);
       l1.display();
       l1.setColor("Black");
       l1.setMsOfficeIncluded(true);
       l1.display();  */
  
     Refrigirator r1 = new Refrigirator("LG Single Door REF","Maroon-Violet","LG",10,4);
     r1.display();
   }
}


