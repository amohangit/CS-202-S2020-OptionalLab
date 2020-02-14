/*
ADD HONOR CODE HERE.
*/
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
public class CountingSort {
    public static int[] prepareData(int[] patients){
        /*
        Data is prepared by inserting random values 
        between 1 and 1000. Data items may be assumed to 
        be unique. 
        Please refer to lab spec for the problem definiton.
        */
        // what is our range?
        int max = 1000;
        // create instance of Random class
        Random randomNum = new Random();
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<patients.length; i++) {
            int ids = randomNum.nextInt(max);
            list.add(ids);
        }
        Collections.shuffle(list);
    
        for (int i=0; i<patients.length; i++) {
            patients[i] = list.get(i);
        }
    

        return patients;
    }  
    public static int[] sortArray(int[] patient_ids){
        /*
        Add your logic below to sort the array.*/
        


        return patient_ids;
    }

    public static void main(String[] args) {
        System.out.println("Enter the no of patients:");
        Scanner scan = new Scanner(System.in);
        int patients = scan.nextInt();
        int[] patient_ids = new int[patients]; 
        int[] patients_populated = prepareData(patient_ids);

        /* The line below will print the output. 
        Do not uncomment this lines.  */
        System.out.println("Unsorted:\t" + Arrays.toString(patients_populated));   
        
        /* Implement the sortArray method, so as to 
        get the correct results.*/
        int[] sorted_array = sortArray(patients_populated);
        
        /* The line below will print the output. 
        Do not uncomment this lines.  */
        System.out.println("Sorted:\t" + Arrays.toString(sorted_array));   
        
    }   
}
