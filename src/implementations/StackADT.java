

import utilities.Iterator;
/**
 *
 * @author Emily
 */
public interface StackADT<T> {
     /**
     * Pushes an element onto the top of the stack.
     *
     * @precondition element must not be null
     * @postcondition element is added at the top of the stack.
     * The size of the stack increases  by 1 and element is put 
     * over the previous top element
     * @param element The element to be pushed onto the stack.
     * @return true if the element was successfully pushed.
     * @throws NullPointerException if the specified element is null.
     */
    public void push(T element);

    /**
     * Removes and returns the top element from the stack.
     *
     * @precondition stack cannot be empty
     * @postcondition element at the top is removed from the stack and returned.
     * The size of the stack is decreased by 1 and the new next element
     * is now the top element.
     * @return The top element of the stack.
     * @throws java.util.EmptyStackException if the stack is empty.
     */
    public T pop();

    /**
     * Returns the top element of the stack without removing it.
     *
     * @precondition stack must not be empty
     * @postcondition element at the top is of the stack is returned.
     * The size of the stack remains the same.
     * @return The top element of the stack.
     * @throws java.util.EmptyStackException if the stack is empty.
     */
    public T peek();

    /**
     * Checks if the stack is empty.
     *
     * @postcondition returns true if stack has no elements, otherwise it returns false
     * @return true if the stack contains no elements.
     */
    public boolean isEmpty();

    /**
     * Returns the number of elements in the stack.
     *
     * @postcondition returns size of stack
     * @return The number of elements in the stack.
     */
    public int size();

    /**
     * Removes all elements from the stack.
     * 
     * @postconditions removes all elements from stack
     */
    public void clear();

}
