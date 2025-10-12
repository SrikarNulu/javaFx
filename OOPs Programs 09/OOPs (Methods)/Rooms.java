class Rooms
{
	private double length;
    private double breadth;

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
   
      
		 Rooms r1 = new Rooms();
         System.out.println(r1.findArea());
         System.out.println(r1.getLength());
         r1.setBreadth(5);
         r1.setLength(5);
   
         System.out.println(r1.findArea());
         System.out.println(r1.findPerimeter());
    }
 }


