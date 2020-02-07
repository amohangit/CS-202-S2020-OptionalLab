/*
ADD HONOR CODE HERE.
*/
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Stack;
public class Sorting {
    static void printStack(Stack<Integer> s)  
    {  
        // If stack is empty then return  
        if (s.isEmpty()) 
            return;  
        int x = s.peek();  
        // Pop the top element of the stack  
        s.pop();  
        // Recursively call the function PrintStack  
        printStack(s);  
        // Print the stack element starting  
        // from the bottom  
        System.out.print(x + " ");  
        // Push the same element onto the stack  
        // to preserve the order  
        s.push(x);  
    }
    public static Stack<Integer> prepareData(Stack<Integer> athletes, int size){
        /*
        Data is prepared by inserting random values 
        between 150 and 300. Data items may be assumed to 
        be unique. 
        Please refer to lab spec for the problem definiton.
        */
        // what is our range?
        int min = 150;
        // create instance of Random class
        Random randomNum = new Random();
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<size; i++) {
            int weight = min + randomNum.nextInt(min);
            list.add(weight);
        }
        Collections.shuffle(list);
    
        for (int i=0; i<size; i++) {
             athletes.push(list.get(i));
        }
    

        return athletes;
    }  
    public static Stack<Integer> sortArray(Stack<Integer> athletes_weight){
        /*
        Add your logic below to sort the array.*/
        


        return athletes_weight;
    }

    public static void main(String[] args) {
        System.out.println("Enter the no of athletes:");
        Scanner scan = new Scanner(System.in);
        int athletes = scan.nextInt();
        Stack<Integer> athletes_weight = new Stack<Integer>();

        Stack<Integer> weights_populated = prepareData(athletes_weight, athletes);

        
        
        /* Implement the sortArray method, so as to 
        get the correct results.*/
        Stack<Integer> sorted_array = sortArray(weights_populated);
        
        /* The two lines below will print the output. 
        Do not uncomment these lines.  */
        System.out.print("Unsorted:\t");
        printStack(weights_populated);   
        System.out.print("\nSorted:\t");
        printStack(sorted_array);   
        
    }   
}
