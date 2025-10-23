class Convertions 
{
	// binary to decimal
   
   public static void toDecimal(int num){
       String s = Integer.toString(num);
	  int decimal = Integer.parseInt(s,2);
       System.out.println(decimal);
   }
     
   public static void main(String[] args) 
	{       int  num = 1011;
	     	toDecimal(num);
	}
}
