import java.io.FileReader;
import java.io.IOException;

public class NewException{
    
    
   
    
    
    public void readFile()  throws IOException {
         FileReader f = new FileReader("Data.txt");
    }

    public static void main (String [] args){
          NewException e = new NewException();
         try{ e.readFile();}
         catch(IOException a){
             System.out.println(a.getMessage());
         }
         finally{
             System.out.println("Stable"); 
         }
    }





















    
    //throws 
    // public  static void readFile() throws IOException{
    //        FileReader f = new FileReader("data.txt"); 
    //   }
    
    
    
    
    
    // public static void main (String [] args){
    //     try{ readFile();}
    //     catch(IOException e){System.out.println("IO Exception Occurred: "+e.getMessage());}
    // }








    /*private int age;

     public void setAge(int age){
        if(age<=0){
             throw new IllegalArgumentException("Age cannot be negative...");   
        }
        System.out.println("Age is setted.");
        this.age = age;
     }




     public static void main(String [] args){
        
        NewException n = new NewException();
        int age =0;
        try{
        n.setAge(age);}

        catch(IllegalArgumentException e){
             System.out.println("Age can't be negative");
        }

    


    
   */





















        /*
    ------------------------------------------------------------------------------------------------------------------------------------------------    
        int i =0;
         int j =25;

          try{
              j = j/i;
          }

          catch(ArrayIndexOutOfBoundsException e) {
              System.out.println("Arithmetic Exception: "+ e.getMessage());
          }

          catch(Exception e){
              System.out.println("Exception occurred: "+ e.getMessage());
          }

          finally{
             System.out.println("Finally Block executed!");
          }
    ----------------------------------------------------------------------------------------------------------------------------------------------------
          */
  

        /*  int i =0;
          int j =5;
          int[] arr = {1,2,3,4,5,6};
         try{

           
            int k =  j/i;
             arr[7] = 45;
          
         }  
         catch( ArrayIndexOutOfBoundsException | ArithmeticException  e){System.out.println("Error occurred\t :"+ e.getMessage());}
         
         catch(Exception e){System.out.println("Exception Occurred\t: " + e.getMessage() );}*/



        /*  int i =0;
            System.out.println("The value of i is: "+ i);
            int j =5;
            int [] arr = {1,2,3,4};


            try{
                
                System.out.println(j = j/i) ;
                System.out.println(arr[5]);
            
            }
            catch (ArithmeticException e){
                 System.out.println("AEx "+e.getMessage());
            }

            System.out.println("The value of j is: "+j);


             try{
                
                System.out.println(j = j/i) ;
                System.out.println(arr[5]);
            
            }
            catch (Exception e){
                 System.out.println("Ex "+e.getMessage());
            }

            System.out.println("The value of j is: "+j); */
     
}