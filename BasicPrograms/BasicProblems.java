import java.util.*;
class BasicProblems
{
    //1) Reverse Number
    public static int reverseNumber(int num){
		  int rev =0;
          int temp =num;
          int digit;
          while (temp>0)
          {  
              digit = temp%10;
              rev =  rev * 10 + digit;
              temp/=10;
          }
       return rev;
    }
   
    // 2) palindrome
    public static boolean isPalindrome(int num){
		 int rev = reverseNumber(num);
         return rev==num;
    }

    //3) prime number
    public static boolean isPrime(int num){
		int limit = (int)Math.sqrt(num)+1;
        if(num<2){
			return false;
		 }
  
        else if (num==2 || num==3)
        {
           return true;
        }

        for (int i=2; i<=limit; i++)
        {
           if(num%i==0){
			   return false;
           }
        }
      return true;
    }

    //4) All Primes in a Range

    public static void primes(int start, int end){
		 for(int i=start; i<=end; i++){
			 if(isPrime(i)){
				 System.out.print(i+" ");
			 }
		 }
    }

    // 5) GCD 

    public static int gcd(int a, int b){  // gcd(a,b) = gcd(b,a%b);
		 int res=-1;
         int temp=0;
         while (b!=0)
         {  temp = b;
            b = a%b;
            a = temp;
         }

      return a;
    }
    // 6) LCM
    public static int lcm(int a, int b){
		 int gcd = gcd(a,b);
         int lcm = Math.abs(a*b) / gcd;
         return lcm;  
    }
    

    //7) Factorial 
    public static long factorial(int num){
		 long fact =1;
         if(num<0){
			 throw new IllegalArgumentException("Enter a valid number.");
         }
        
        for(int i=2; i<=num;i++){
			 fact *= i;
        }

      return fact;
    }

   //8) power 
    public static double powerOfNum(double num, int power){
        double value = 1;
        for(int i=1; i<=power;i++){
			 value*=num;
        }
      return value;
    }
 // 9) Fibonacci
    public static List<Integer> fibonacci(int num){
		int a=0, b=1;
        
        List <Integer> arr = new ArrayList<>();
        if(num<=0){
			 return arr;
        }
        else if(num==1){
			arr.add(0);
            return arr;
        }

        arr.add(a);
        arr.add(b);
        for(int i=2;i<num;i++){
		    int next = a+b; 
            arr.add(next);
            a = b;
            b =next;
        }
      return arr;
    }

  //10) prime factors
 public static void primeFactors(int num){
	 List <Integer> set = new ArrayList<>();
   
       for(int i=2;i<num/2+1;i++){
		   while(num%i == 0){
				 set.add(i);
                 num/=i;
		    }
               
       }
       if(num>2){
		   set.add(num);
       }
   
      System.out.println(set);
    }

 //11) perfect square or not
   
  public static boolean perfectSquare(int num){
	  int s = (int) Math.sqrt(num);

     if(s*s == num){
         //System.out.println(s + " ->"+ num);
		 return true;
     }
   return false;
  }

//10)
 public static void primeFact(int num){
	 if(num<=1){
		 System.out.println(-1); 
	 }

     for(int i=2;i<= (int) Math.sqrt(num); i++){
		 while (num%i==0 && num>0)
		 {
             System.out.print(i+" ");
             num/=i;
		 }
     }
  
   if(num>=2){
	   System.out.println(num);
   }
}
//armstrong //perfect // strong -> 

	public static void main(String[] args) 
	{   
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        primeFact(num);
                   // System.out.println(perfectSquare(num)); //11
                 //primeFactors(num);                      // 10
                // System.out.println(fibonacci(num));    // 9   
               // System.out.println(powerOfNum(2.5,3)); // 8
              //System.out.println(factorial(num));}    // 7
             // System.out.println(lcm(22,46));        // 6
            //System.out.println(gcd(18,12));         // 5
		   // primes(start,end);                     // 4
          //System.out.println(isPrime(num));       // 3
		 //System.out.println(isPalindrome(num));  // 2
		//System.out.println(reverseNumber(num)); // 1
		
	}
}
