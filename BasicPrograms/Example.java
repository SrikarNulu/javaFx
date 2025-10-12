class Example{

    public static void main(String[] args){
		try{
            int result = Basic.meth1(15,-8);
            System.out.println(result);
   } catch(IllegalArgumentException e){
		System.out.println("Error: " +e.getMessage());
        
    }	
}
}
 



