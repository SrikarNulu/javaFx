import java.util.*;
class ArrayProblems 
{   
    


    public static int reverseNumber(int number){
		/* String rev =""; 
         String s  = Integer.toString(number);
         for(int i=s.length()-1;i>=0;i--){
			  rev += s.charAt(i); 
         } 

       int reverse = Integer.parseInt(rev); 
       return reverse;*/
        int temp = number;
        int rev = 0;
        int count = 0;
        while (number>0)
        {  
           int digit = number%10; 
           count+=1;           //last digit
           rev = rev*10 + digit;
           number /= 10;
        }
     System.out.println("Count "+count);

      return rev;
     
    }

   public static boolean palindrome(int number){
	  int reversed = reverseNumber(number);

      if(reversed == number){
		  return true;
      }
     return false;
   } 
    
    public static void factorial(int num){
		 int fact = 2;
         for(int i=3;i<=num;i++){
			 fact *= i;
         } 
      System.out.println(fact);
    }


    public static void power(int num, int power){
		int p = num;
 
        for(int i=1;i<power;i++){
			 p *= num;
        }

      System.out.println(p);
    }

   public static boolean isLeapYear(int year){
	   if(year%400 == 0 || (year%100 !=0 && year%4 ==0)){
		   return true;
	   }
        return false;
   }


    public static void multiplicationTable(int number){
		  
        for(int i=1;i<=12;i++){
			  System.out.println(number + " * "+ i +" = " + number*i);
        }
    }

    public static void swap(int a,int b){
	    //a = a + b;
        //b = a-b; 
        //a = a -b;

      // a = a*b;
      // b = a/b;
      // a = a/b;

      a = a^b;
      b = a^b;
      a = a^b;

      System.out.println("a : "+ a + " b : "+b);
    }
    
    public static void divisors(int num){
		 
       for(int i=1;i<num+1;i++){
		   if(num%i==0){
			   System.out.print(i + " ");
		   }
       }
    }
    
   //------------------------------ INTERMEDIATE STARTED ------------------------------------------
    





public static boolean isPrime(int num){
	if(num<2){
		 return false;
	}

    else if(num==2 || num==3){
		 return true;
    }

    for(int i=2;i< Math.sqrt(num)+1; i++){
		 if(num%i==0){
			 return false;
		 }
    }
   return true;
}


public static void primes(int start, int end){
	 for(int i=start; i<end+1;i++){
		 if(isPrime(i)){
			 System.out.print(i+" ");
		 }
	 }
}


public static int gcd(int a, int b){
	while (b>0)
	{ 
       int temp = b;
       b = a%b;
       a = temp;
	}
   return a;
}

public static int lcm(int a,int b){
	 int gcd = gcd(a,b);
     return Math.abs(a*b)/ gcd;
} 

public static long pow(long num, int power){
	 long res = num;
     for(int i=2; i<= power; i++){
		 res *= num;
         //System.out.println(res);
	 }
   return res;
}


public static boolean armstrong(int num){
   String val = Integer.toString(num);
   int count = val.length();
   int sum =0;
   for(int i=0;i<count;i++){
      sum += Math.pow((val.charAt(i)-'0'),count); 
   }
  return sum==num;
}

public static boolean arm(int num){
  // arm = sum of digit to power of count
  // num =153 , count =3, sum = 1^3 + 5^3+3^3 -> 1+125+27 == 153
	 int temp =num;
     int val = num;
     int digit;
     int count=0;
     int sum=0;
   //count digit
     while(num>0){
		 count++; 
         num /= 10;    
     }

   // sum
   while (temp>0)
   {
       digit= temp%10;
       sum += pow(digit,count);
       temp /=10; 
      //System.out.println(sum);
   }
   return sum==val;
}


public static boolean perfectNumber(int num){
	int sum=0;
    //pn = sum of all divisors equal to num
    //ex = num =6,  divisors = 1,2,3 -> 1+2+3 =6 --> perfect number  
  
    for(int i=1; i<num/2 + 1; i++){
		 if(num%i==0){
			 sum+=i;
             System.out.println(sum + " -> i: "+i);
		 }
    }
   return num==sum;
}
public static int fact(int num){
	 if(num==0){
		return 1;
	 }
     int f =num;
     for(int i=num-1;i>1;i--){
		 f*= i; 
     }
  return f;
}
public static boolean strongNumber(int num){
	 // sum of each digit factoral equals that number 
     // ex num =145 -> 1! + 4! + 5! ==145 ->STRONG NUM 
    int temp = num;
    int digit;
    int sum=0;
    while (num>0)
    { 
        digit = num%10;
        sum += fact(digit);
        num/=10;
        System.out.println(sum + " Digit-> "+digit);
    }
    
     return sum==temp;
}


public static void main(String[] args){ 
       
    Scanner sc  = new Scanner(System.in);
    int num =40585;
    
    System.out.println(strongNumber(num));
     
    //System.out.println(perfectNumber(num));
    

     // System.out.println(arm(num));
    //System.out.println(armstrong(num));

      // System.out.println(pow(64,2));
     //System.out.println(lcm(18,12));
  
    //int num = sc.nextInt();

    //System.out.println(isPrime(num));  

   //primes(1,100);



































 //int num = sc.nextInt();

      //System.out.println("----Reversed Number-----");
      // System.out.println(reverseNumber(num));
      //System.out.println(palindrome(num));
      //factorial(num);
      //power(2,3);

   
   // int year =2021;

    //System.out.println(isLeapYear(year));   

   //int num = 11;
   //multiplicationTable(num);

    // int a =5, b =10;
     
    // swap(a,b);
   
  //int num = 64;

   //divisors(num);



   sc.close();






















        /*int number = 1001;
        String s = Integer.toString(number);

        int num =  Integer.parseInt(s,16);
        System.out.println(num);
    
    // int a = 5;
    // String s = Integer.toString(a);
    //System.out.println(s+" Srikar Nulu");

     //String s = "1234";
     //int a =  Integer.parseInt(s)+100;
     //System.out.println(a);



     




 /*  double d = 45.67;
      Double dw1 = d;
      Double dw2 = Double.valueOf(d);
     
      String s = Double.toString(dw1);
      
      System.out.println(s+100);

     double d2 = Double.valueOf(s);
     System.out.println(d2+100);

    //System.out.println(dw1 instanceof Double);
    //System.out.println(dw2 instanceof Double);













/*int n =25;
     
      String s = Integer.toString(n)  ;
      System.out.println(n+100); 

      int num = Integer.valueOf(s);

       System.out.println(num+10); 













      
   /*int  a =5;
   Integer b = a; 

   int c =20;
   Integer d = Integer.valueOf(b);


   int e = b;

  
   int f =  d.intValue();
   

   try{
	  System.out.println(b instanceof Integer);
	  System.out.println(d instanceof Integer);
	  System.out.println(e instanceof Integer);
      
   }catch(Exception es){
	  System.out.println("Exception occurred: "+ es.getMessage());
   }

  try{
	  
	  System.out.println(f instanceof Integer);
      
   }catch(Exception es){
	  System.out.println("Exception occurred: "+ es.getMessage());
   } 





     //ArrayProblems arr = new ArrayProblems();
     //Scanner sc = new Scanner(System.in);
     //System.out.print("Enter a Number: ");
     //int num  = sc.nextInt();

     //Integer n = num;
     //Integer n2 = 
     //System.out.println(n instanceof Integer);
     
     
      









































		//List <Integer> arr = new ArrayList<>();
       /* int a = 5, b=10;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a+ " "+ b );

        Scanner sc  = new Scanner(System.in);
        String number = sc.next();
        sc.nextLine();
        

        String rev = "";
        System.out.println(rev.hashCode());
        System.out.println();
        
        for(int i=number.length()-1;i>=0;i--){
			//System.out.println(number.charAt(i));
            rev += number.charAt(i);
            System.out.println();
            System.out.println(rev);
            System.out.println(rev.hashCode());
            System.out.println();
        }

          System.out.println(rev);
          System.out.println(rev.hashCode()); */
       
	}
}
