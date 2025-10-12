import java.util.ArrayList;
import java.util.List;
public class Main {

     public static int count(ArrayList <Integer> arr){
           int maxi=arr.get(0);
            for (int i=0; i<arr.size();i++){
                int counter = 0;
                for(int j=0; j<=i;j++){
                    counter += arr.get(j);
                }
                if(counter>maxi){
                    maxi = counter;
                }
            }
        return maxi;
     }
    public static void main (String [] args){
     ArrayList<Integer> arr = new ArrayList<>(List.of(2,-4,5,-1,2,3));
      int maxSubArray = 0;
      
          System.out.println(Main.count(arr));
      
} 
}