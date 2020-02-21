/*
ADD HONOR CODE HERE.
*/
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
public class HeapSort {
    public static int[] prepareData(int[] data){
        /*
        Data is prepared by inserting random values 
        between 1 and data.length. Data items may be assumed to 
        be unique. 
        Please refer to lab spec for the problem definiton.
        */
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i< data.length; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
    
        for (int i=0; i < data.length; i++) {
            data[i] = list.get(i);
        }
        return data;
    }

    public static int[] heapify(int[] data){
        /*
        Add your logic here */
        // make the call to fix it from here.     
        return data;
    }
    public static int[] sortArray(int[] data){
        /*
        Add your logic here */

        return data;
    }
    public static void main(String[] args) {
        /*
            Assume binary tree, either complete or atmost complete.
            But not in-complete.   
        */
        System.out.println("Enter the no of elements:");
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int[] raw_data = new int[count]; 
        int[] raw_data_populated = prepareData(raw_data);
        System.out.println("Unsorted Array: " + Arrays.toString(raw_data_populated));

        /* The line below will print the output. 
        Do not uncomment this lines.  */
        
        sortArray(raw_data_populated);
        System.out.println("Sorted Array: " + Arrays.toString(raw_data_populated));        
        


        
        
    }   
}
