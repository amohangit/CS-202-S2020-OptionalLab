/*
ADD HONOR CODE HERE.
*/
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class HOP {
    public static int[] prepareData(int[] childrens){
        /*
        Data is prepared by inserting random values 
        up to 100. Data items may be repeated. 
        Please refer to slides for the problem definiton.
        */
        for (int i = 0; i < childrens.length; i++){
                childrens[i] = i+1;
        }
        return childrens;
    }  
    public static int findWinner(int[] childrens, int steps){
        int res = 0;
        /*
        Add your logic below to compute the winner 
        by applying the variatio of the Josephus solution 
        using Queue ADT. */
        


        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of childrens:");
        int child_count = scan.nextInt();
        System.out.println("Enter the no of steps:");
        int steps = scan.nextInt();
        
        int[] childs_initialized = new int[child_count]; 
        int[] childs_populated = prepareData(childs_initialized);

        // a set of days and their respective prices. 
        /* does a random distribution of prices.
        */
        
        /* Implement the computeSoan method, so as to 
        get the correct results.*/
        int winner = findWinner(childs_populated, steps);
        
        /* The lines below will print the output. 
        Do not uncomment these lines.  */
        System.out.println("Children Position nos:\t" + Arrays.toString(childs_populated));   
        System.out.println("No of childrens:\t" + child_count);   
        System.out.println("No of steps:\t" + steps);   
        System.out.println("Winner:\t" + winner);   
        
    }   
}
