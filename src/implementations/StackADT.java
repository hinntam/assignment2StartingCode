

import utilities.Iterator;
/**
 *
 * @author Emily
 */
public interface StackADT<T> {
    /**
     * Pushes an element onto the top of the stack.
     *
     * @param element The element to be pushed onto the stack.
     * @return true if the element was successfully pushed.
     * @throws NullPointerException if the specified element is null.
     */
    public void push(T element);

    /**
     * Removes and returns the top element from the stack.
     *
     * @return The top element of the stack.
     * @throws java.util.EmptyStackException if the stack is empty.
     */
    public T pop();

    /**
     * Returns the top element of the stack without removing it.
     *
     * @return The top element of the stack.
     * @throws java.util.EmptyStackException if the stack is empty.
     */
    public T peek();

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack contains no elements.
     */
    public boolean isEmpty();

    /**
     * Returns the number of elements in the stack.
     *
     * @return The number of elements in the stack.
     */
    public int size();

    /**
     * Removes all elements from the stack.
     */
    public void clear();

}
