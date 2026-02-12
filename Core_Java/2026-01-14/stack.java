/* Stack:
    - It is an implementing class of List interface.
    - It is a legacy class.
    - It is a subclass of Vector class.
    - It follows LIFO (Last In First Out) principle.
    - It is present in java.util package.
    - It is synchronized in nature.
    - It provides methods like push(), pop(), peek(), search().

    - push(E item): This method is used to add an item to the top of the stack.
    - pop(): This method removes and returns the item at the top of the stack. It throws EmptyStackException if the stack is empty.
    - peek(): This method returns the item at the top of the stack without removing it. It also throws EmptyStackException if the stack is empty.
    - search(Object o): This method returns the 1-based position of the object from the top of the stack. If the object is not found, it returns -1.
    - empty(): This method checks if the stack is empty and returns a boolean value.
*/

import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after pushes: " + stack); // [10, 20, 30]

        // Peeking at the top element
        System.out.println("Top element (peek): " + stack.peek()); // 30

        // Popping elements from the stack
        System.out.println("Popped element: " + stack.pop()); // 30
        System.out.println("Stack after pop: " + stack); // [10, 20]

        // Searching for an element
        int position = stack.search(10);
        if (position != -1) {
            System.out.println("Element 10 found at position: " + position); // 2
        } else {
            System.out.println("Element 10 not found in the stack.");
        }

        // Checking if the stack is empty
        System.out.println("Is the stack empty? " + stack.empty()); // false
    }
}