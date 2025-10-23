public class StopPropagation {

      public static void method1(){
           int i=0;
           int j =5;

           System.out.println(j/i);
      }

      public static void method2(){
           try{method1();}
           catch(ArithmeticException e){
             System.out.println("Error occurred: "+e.getMessage());
           }
           
      }
    public static void main(String [] args){
           System.out.println("Program Started: ");
          method2();

          System.out.println("Program Ended");

    }
}
