//KIT107 Assignment 3
/**
 * Stack ADT
 * 
 * This class implements a Stack using a linked list of Node objects.
 * Supports push, pop, top, and isEmpty operations.
 * 
 * @author Jahid Hasan
 * @studentID 720521
 * @version 11/05/2025
 */

 public class Stack implements StackInterface {
    // Constants
    protected final boolean TRACING = false; // Enable tracing

    // Properties
    protected Node tos; // Top of the stack

    /**
     * Default constructor — initializes an empty stack.
     */
    public Stack() {
        trace("Constructor ends");
        tos = null;
        trace("Constructor ends");
    }

    /**
     * Constructor with initial object.
     * @param o Object to place on top of the stack
     */
    public Stack(Object o) {
        trace("Constructor ends");
        tos = new Node(o);
        trace("Constructor ends");
    }

    /**
     * Check if the stack is empty.
     * @return true if stack is empty, false otherwise
     */
    public boolean isEmpty() {
        trace("isEmpty starts and ends");
        return tos == null;
    }

    /**
     * Get the object on top of the stack without removing it.
     * @return Object on top
     * @throws EmptyStackException if stack is empty
     */
    public Object top() throws EmptyStackException {
        trace("top starts");
        if (isEmpty()) {
            trace("top: empty stack");
            throw new EmptyStackException();
        }
        trace("top ends");
        return tos.getData();
    }

    /**
     * Remove the top item from the stack.
     * @throws EmptyStackException if stack is empty
     */
    public void pop() throws EmptyStackException {
        trace("pop starts");
        if (isEmpty()) {
            trace("pop: empty stack");
            throw new EmptyStackException();
        }
        trace("pop: adjusting top of stack");
        tos = tos.getNext();
        trace("pop ends");
    }

    /**
     * Push a new object onto the stack.
     * @param o Object to push
     */
    public void push(Object o) {
        trace("push starts");
        Node n = new Node(o); // Create new node
        n.setNext(tos);       // Link to current top
        tos = n;              // Update top
        trace("push ends");
    }

    /**
     * Return a string representation of the stack.
     * @return Stack contents from top to bottom
     */
    public String toString() {
        trace("toString starts");
        String s;
        if (isEmpty()) {
            trace("toString ends empty");
            s = "<>";
        } else {
            s = "<";
            Node c = tos;
            while (c != null) {
                s += c.getData().toString() + " ";
                c = c.getNext();
            }
            s += ">";
            trace("toString ends non-empty");
        }
        return s;
    }

    /**
     * Trace output helper.
     */
    protected void trace(String s) {
        if (TRACING) {
            System.out.println("Stack: " + s);
        }
    }
}
