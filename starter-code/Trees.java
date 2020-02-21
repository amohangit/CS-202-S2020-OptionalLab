/*
ADD HONOR CODE HERE.
*/
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
public class Trees {
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
    public static int[] getChildren(int[] data, int node){
        int[] res = new int[2];
        /*
            Add logic here
        */        
        return res;
    }
    public static int getParent(int[] data, int node){
        int res = 0;
        /* Add logic here */
        return res;
    }
    public static int[] getAncestors(int[] data, int node){
        /* Get Ancestors */
        /* here I am finding the highest power of 2 closer to the node (pos) */
        int size = (int)Math.pow(2, Math.floor(Math.log(node+1) / Math.log(2)));
        /* here I am finding the log base 2 of the value computed above
        --  this will give me the size of the ancestor set.  */
        size = (int) (Math.log(size) / Math.log(2));
        int[] res = new int[size];
        
        /* Figure out the algorithm. 
        Add required logic here, can be done mathematically 
        or iteratively (programmatic).*/   
        
        return res;
    }
    public static int[] getDescendents(int[] data, int node){
        /* Get Decendents */
        int[] res;
        /* how to identify if a node is a leaf node? 
             identifying the root node is easy. 
            see how I had identified the leaf node below. 
            I need to do this to calculate the size of the 
            decendents set. 
        */
        int leaf_start = (int) Math.floor((double)data.length/2) + 1;
        if (node >= leaf_start)
            res = new int[0];
        else{
            int lower = (int)Math.pow(2, Math.floor(Math.log(node+1) / Math.log(2)));
            /* here I am finding the log base 2 of the value 
            computed above */
        
            lower = (int) (Math.log(lower) / Math.log(2));
            int higher = (int)Math.pow(2, Math.floor(Math.log(data.length) / Math.log(2)));
            /* here I am finding the log base 2 of the value 
            computed above */
        
            higher = (int) (Math.log(higher) / Math.log(2));
            res = new int[higher-lower];
        }
        
        /* Figure out the algorithm. 
        Add required logic here, can be done mathematically 
        or iteratively (programmatic).*/   
        
        
        return res;
    }
    public static int findDepth(int[] data, int node){
        /* Find Depth */
        int res = 0;
        
        /* add required logic here */   
        
        return res;
    }
    public static int findHeight(int[] data, int node){
        /* Find Height */
        int res = 0;
        
        /* add required logic here */   
        
        return res;
    }

    public static boolean isBalanced(int[] data){
        /* Check if the tree is balanced or not. */
        boolean res = false;
        
        /* add required logic here */   
        
        return res;
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
        System.out.println("Array: " + Arrays.toString(raw_data_populated));

        /* The line below will print the output. 
        Do not uncomment this lines.  */
        
        System.out.println("Welcome to the trees structure:");
        while(true){
            System.out.println("------------------------------------------------");
            System.out.println("Please make the following choice to get started:");
            System.out.println("1 to get Children\n2 to get Parent \n" +
                "3 to get Ancestors \n4 to get Descendents \n" + 
                "5 to get Depth \n6 to get Height \n7 to check balance");
            int choice = scan.nextInt();
            if (choice == 1){
                /* Get children nodes */
                // node is the Position no in the array
                System.out.println("Tell me the node no(pos - start from 0):");
                int node = scan.nextInt();
                int[] children = getChildren(raw_data_populated, node);
                System.out.println("children:" + Arrays.toString(children));
            }
            else if (choice == 2){
                /* Get parent node */
                // node is the Position no in the array
                System.out.println("Tell me the node no(pos - start from 0):");
                int node = scan.nextInt();
                int parent = getParent(raw_data_populated, node);
                System.out.println("parent:" + parent);   
            }
            else if (choice == 3){
                /* Get ancestors */
                // node is the Position no in the array
                System.out.println("Tell me the node no(pos - start from 0):");
                int node = scan.nextInt();
                int[] ancestors = getAncestors(raw_data_populated, node);
                System.out.println("ancestors:" + Arrays.toString(ancestors));   
            }
            else if (choice == 4){
                /* Get descendents */
                // node is the Position no in the array
                System.out.println("Tell me the node no(pos - start from 0):");
                int node = scan.nextInt();
                int[] descendents = getDescendents(raw_data_populated, node);
                System.out.println("descendents:" + Arrays.toString(descendents));   
            }
            else if (choice == 5){
                /* Get depth */
                // node is the Position no in the array
                System.out.println("Tell me the node no(pos - start from 0):");
                int node = scan.nextInt();
                int depth = findDepth(raw_data_populated, node);
                System.out.println("depth:" + depth);   
            }
            else if (choice == 6){
                /* Get height */
                // node is the Position no in the array
                System.out.println("Tell me the node no(pos - start from 0):");
                int node = scan.nextInt();
                int height = findHeight(raw_data_populated, node);
                System.out.println("height:" + height);   
            }
            else if (choice == 7){
                /* Check if tree is balanced */
                boolean bal = isBalanced(raw_data_populated);
                System.out.println("balance status:" + bal);   
            }
            else{
                System.out.println("Invalid choice. Please try again.");      
                continue;
            }
            System.out.println("------------------------------------------------");
            System.out.println("Do you want to try again? y/n");
            char repeat = scan.next().charAt(0);
            repeat = Character.toLowerCase(repeat);
            if (repeat == 'y')
                continue;
            else
                break;
          
               
        }


        
        
    }   
}
