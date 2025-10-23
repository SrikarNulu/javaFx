import java.util.*;
class Patterns 
{   
    public static void squarePattern(int num){
		 for(int i=0;i<num;i++){
			 for(int j=0;j<num;j++){
				 System.out.print("* ");
			 }
            System.out.println();
		 }
    } 

    public static void trianglePattern1(int num){
		 for(int i=0;i<num;i++){
			 for(int j=0;j<i+1;j++){
				 System.out.print("*");
			 }
            System.out.println();
		 }
    }

    public static void trianglePattern2(int num){
		 for(int i=0;i<num;i++){
			 for(int j=0;j<i+1;j++){
				 System.out.print(j+1);
			 }
            System.out.println();
		 }
    }
  
    public static void trianglePattern3(int num){
		 for(int i=0;i<num;i++){
			 for(int j=0;j<i+1;j++){
				 System.out.print(i+1);
			 }
            System.out.println();
		 }
    } 

    public static void trianglePattern4(int num){
		 for(int i=0;i<num;i++){
			 for(int j=num-i;j>0;j--){
				 System.out.print(num-j+1);
			 }
            System.out.println();
		 }
    }

    public static void pyramid1(int num){
		 for(int i=0;i<num;i++){
             for(int k=0;k<num-i-1;k++){
				 System.out.print("  ");
             }
			 for(int j=0;j<2*i+1;j++){
				 System.out.print("* ");
			 }
            System.out.println();
		 }
    } 


   

   public static void pyramid2(int n){
		 for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
				 System.out.print(" ");
            }

            for(int k=0;k<2*n-2*i-1;k++){
				System.out.print("*"); 
            }
        System.out.println();
    }
}


public static void fullPyramid(int n){
		 for(int i=0;i<n;i++){
             for(int k=0;k<n-i-1;k++){
				 System.out.print("  ");
             }
			 for(int j=0;j<2*i+1;j++){
				 System.out.print("* ");
			 }
            System.out.println();
		 }

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
				 System.out.print("  ");
            }

            for(int k=0;k<2*n-2*i-1;k++){
				System.out.print("* "); 
            }
        System.out.println();
    }
    } 


public static void pyramid3(int num){
		 for(int i=0;i<num;i++){
             for(int k=0;k<num-i-1;k++){
				 System.out.print(" ");
             }
			 for(int j=0;j<2*i+1;j++){
				 System.out.print("*");
			 } 
           
             for(int k=0;k<num-i-1;k++){
				 System.out.print("  ");
             }
			 for(int j=0;j<2*i+1;j++){
				 System.out.print("*");
			 }
    
            System.out.println();
		 }
    } 


public static void halfTriangle(int n){
	 for(int i=0;i<n;i++){
		 for(int j=0;j<i+1;j++){
			 System.out.print("* ");
		 }
        System.out.println();
	 }

    for(int i=0;i<n-1;i++){
		for(int j=n-i-1;j>0;j--){
			System.out.print("* ");
		}
       System.out.println();
    }
}


public static void binaryTriangle(int n){
	 
     for(int i=1;i<=n;i++){
         
		 for(int j=1;j<i+1;j++){
             if(i%2!=0){
				 if(j%2!=0){
					 System.out.print(1);
				 }
                 else{
					 System.out.print(0);
                 }
             }

            else{
				 if(j%2 !=0){
					System.out.print(0);
				 }
                else{
					System.out.print(1);
                }
            }
		 }
        System.out.println();
	 }
}


public static void binaryPattern(int n){
	 for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			System.out.print( (i+j) % 2 == 0 ? 1 : 0 );
		}
        System.out.println();
	 }
} 

public static void binarySquarePattern(int n){
	 for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			System.out.print((i+j)%2 == 0 ? 1 : 0) ;
		}
        System.out.println();
	 }
}



public static void binarySquarePattern1(int n){
	  int val = 0;
      for(int i=1;i<=n;i++){
         
		for(int j=1;j<=n;j++){
			System.out.print(val) ;
            val = 1-val;
		}
        System.out.println();
	 }
}


public static void p1(int n){
	for(int i=1;i<=n;i++){
		 for(int j=1;j<=i;j++){
			 System.out.print(j);
		 }
         for(int k=1;k<=2*n-2*i;k++){
			System.out.print(" ");
         }
         for(int l=i;l>=1;l--){
			System.out.print(l);
         }
      System.out.println();
	}
}

public static void alphabetTriangle(int n){
	 
     for(int i=1;i<=n;i++){
		 for(int j=1;j<=i;j++){
             int val = 64 + j;
			 System.out.print((char)val);
		 }
      System.out.println();
	 }
}


public static void alphabetPyramid2(int n){
	 
     for(int i=1;i<=n;i++){
		 for(int j=n-i;j>=1;j--){
             System.out.print(" ");
		 }
         
         for(int k=1;k<=i;k++){
             int val =64+k;
			 System.out.print((char)val);
         }

         for(int l=i-1;l>=1;l--){
             int val = 64+l;
			 System.out.print((char)val);
         }
      System.out.println();
	 }
}


public static void tp1(int n){
	for(int i=1;i<=n;i++){
         
		 for(int j=1;j<=i;j++){
			 int val = 69-i+j;
             System.out.print((char)val);
             
		 }System.out.println();
	}
}


public static void patt(int n){
	int mid =n/2;
   for(int i=1;i<=mid;i++){
		for(int j=mid-i+1;j>=1;j--){
			System.out.print("* ");
		}
        for(int k=1; k<=2*i-2;k++){
			System.out.print("  "); 
        }

       for(int l=mid-i+1;l>=1;l--){
		   System.out.print("* ");
       }
     System.out.println();
	}

   for(int i=1;i<=mid;i++){
	    for(int j=1;j<=i;j++){
			 System.out.print("* ");
	    }
       for(int k=1;k<=n-2*i;k++){
		 System.out.print("  ");
       }

      for(int l=1;l<=i;l++){
		  System.out.print("* ");
      }
     
   System.out.println();
   }
}

public static void distancePattern(int n){
	for(int i=0;i<2*n;i++){
		 for(int j=0;j<2*n;j++){
			 int distance = Math.min(Math.min(i,j),Math.min(2*n-1-i,2*n-1-j));
             System.out.print(distance);
		 }
      System.out.println();
	} 
}


	public static void main(String[] args) 
	{
		//squarePattern(7);
       //trianglePattern1(7);
       //trianglePattern2(7);
       //trianglePattern3(7);
       //trianglePattern4(5);
       //pyramid1(5);
       //pyramid2(5);
       //fullPyramid(5);
       //pyramid3(5);

       //halfTriangle(5);
      // binaryTriangle(7);
       //binaryPattern(7);
       //binarySquarePattern1(7);
      // p1(7);

      //alphabetTriangle(7);
      //alphabetPyramid2(4);

      //tp1(5);
     //patt(10);
    distancePattern(4);
	}

}
