import java.util.Scanner;
public class finallyBlock {
    private  int age;
    private Scanner sc = new Scanner(System.in);
    public void setAge(int age){
          
          if(age<=0){
            throw new IllegalArgumentException("Age bust be greater than 0");
          }
          this.age = age;
    }
    public static void main(String [] args){
       
       finallyBlock fb = new finallyBlock();
       System.out.print("Enter age: ");
        int age =  fb.sc.nextInt();
        fb.setAge(age);
       System.out.println(fb.age);
       
       
       
        /* int i=7;
         int j=25;
          try{
             System.out.println(j/i);
          }
          catch(ArithmeticException e){
            System.out.println("Exception Occurred: "+ e.getMessage() );

          }
          finally{
              System.out.println("Exception Handled Correctly.");
          }*/
    }
}
