/*
Please refer to the link below for more examples:
https://www.geeksforgeeks.org/queue-interface-java/
*/

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
public class QueueUsage {
    static void printQueue(Queue<Integer> q)  
    {  
        // If queue is empty then return  
        if (q.isEmpty()) 
            return;  
        int x = q.peek();   // peek is same as front in java
        // Remove the front element from the queue  
        q.remove();  // dequeue
        // Recursively call the function printQueue  
        printQueue(q);  
        // Print the queue element starting  
        // from the front 
        System.out.print(x + " ");  
        

    public static void main(String[] args) {
        // Initialize the queue
        System.out.println("Enter the size of the queue:");
        Scanner scan = new Scanner(System.in);
        int queue_size = scan.nextInt();
        Queue<Integer> queue = new LinkedList();
        for (int i = 0; i < queue_size; i++){
            queue.add(i+1); //enqueue
        }
        printQueue(queue);   
        System.out.print("\n");
        
    }   
}
