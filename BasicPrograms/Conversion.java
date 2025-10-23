class Conversion
{
	// binary to decimal
   
   public static void toDecimal(int num){
       //int temp =num;
       //String s = Integer.toString(temp);
	   //int decimal = Integer.parseInt(s,2);
       //System.out.println(decimal);

      
       int res =0;
       int val =1; //2^1 = 0 

       while (num>0)
       {  
          int digit = num%10;
          if(digit==1){
			 res += val;
          }
     
          val *= 2; 
          num/=10;
          
       }
    System.out.println(res);
   } 

    public static void toBinary(int num){
		 String binary ="";
         while(num>0){
			 int digit = num%2;
             binary = digit + binary;
             num/=2;
         }
      System.out.println(binary);
    }
     
   public static void fromOctalToDecimal(int num){
	    int base = 1; // 8^0 =1 
        int val =0; //47
        int digit;   
        while(num>0){
			 digit = num%10; //1
             val += digit * base; //47+64==111
             base*=8; //8*8*8
             num/=10;
         }
      System.out.println(val);
   } 

   public static void fromDecimalToOctal(int num){
	   String octalNum ="";
       int digit;
       while(num>0){
		   digit = num%8;
           octalNum = digit+octalNum;
           num/=8;
       }
    System.out.println(octalNum);
   }


 public static void fromDecimalToHexaDecimal(int num){
	 String s = "ABC";
     int value = Integer.parseInt(s,16);
      System.out.println(value);
     int digit;
     String val;
     String HexaDecimal="";
     
    while(num>0){
		 digit = num%16;
         if(digit>=10){
			 switch(digit){
				 case 10: {
					 HexaDecimal = "A"+HexaDecimal;
                     break;
				 } 
                case 11: {
					 HexaDecimal = "B"+HexaDecimal;
                     break;
				 }

               case 12: {
					 HexaDecimal = "C"+HexaDecimal;
				      break;
                     }

               case 13: {
					 HexaDecimal = "D"+HexaDecimal;
                      break;
				 }

               case 14: {
					 HexaDecimal = "E"+HexaDecimal;
                      break;
				 }

               case 15: {
					 HexaDecimal = "F"+HexaDecimal;
                      break;
				 }
			 }
         }

        else{
			HexaDecimal = digit + HexaDecimal; 
        }

      num/=16;
 
    }

System.out.println(HexaDecimal);
    
 }




  public static void fromHexaToDecimal(String s){
	  String temp =s;
       int num =0;
       int base =1; 
       //char[] arr = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
       boolean flag =true;
       int count =s.length()-1;
       while(flag){ 
           int digit = s.charAt(count)-55;
           count--;
           num = num + base * digit;
           base *= 16;         
           if(count<0)
              flag=false;
      }

      System.out.println(num);
      System.out.println(Integer.parseInt(temp,16));   
     }
  
    
   public static void main(String[] args) 
	{       int  num = 2748;
            String s ="ABC";
	     	//toDecimal(num);
            //toBinary(num);
            //fromOctalToDecimal(num);
            //fromDecimalToOctal(num);
            //fromDecimalToHexaDecimal(num);
            fromHexaToDecimal(s);
	}
}
