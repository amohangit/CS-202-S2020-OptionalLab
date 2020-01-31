/*
Please refer to the link below for more examples:
https://www.geeksforgeeks.org/stack-class-in-java/
*/

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
public class StackUsage {
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

    public static void main(String[] args) {
        // Initialize the stack
        System.out.println("Enter the size of the stack:");
        Scanner scan = new Scanner(System.in);
        int stack_size = scan.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < stack_size; i++){
            stack.push(i+1);
        }
        printStack(stack);   
        System.out.print("\n");
        
    }   
}
