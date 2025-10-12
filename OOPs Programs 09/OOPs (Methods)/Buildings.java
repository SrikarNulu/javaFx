class Rooms
{
	private double length;
    private double breadth;

   Rooms(double length, double breadth){
	  this.length = length;
      this.breadth = breadth;
   }

    void setLength(double length){
		this.length = length;
    }

    double getLength(){
		return length;
    }

    void setBreadth(double breadth){
		this.breadth = breadth;
    }

    double getBreadth(){
		return breadth;
    }

   double findArea(){
	   return (length * breadth);
   }
   
   double findPerimeter(){
	   return (2 * (length * breadth));
   }
}

 class Buildings
 {
    public static void main (String [] args){
   
      
		 Rooms r1 = new Rooms(25,25);
         System.out.println(r1.findArea());
         System.out.println(r1.getLength());
         r1.setBreadth(6);
         r1.setLength(5);
   
         System.out.println(r1.findArea());
         System.out.println(r1.findPerimeter());
    }
 }


