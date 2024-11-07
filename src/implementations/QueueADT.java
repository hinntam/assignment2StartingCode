
package utilities;

import java.io.Serializable;

/**
 *
 * @author Emily
 */
public interface QueueADT <T>{
    /**
     * Adds an element to the rear of the queue.
     *
     * @param element The element to be added.
     * @return true if the element was successfully added.
     * @throws NullPointerException if the specified element is null.
     */
    public void enqueue(T element) throws NullPointerException;

    /**
     * Removes and returns the element at the front of the queue.
     *
     * @return The element at the front of the queue.
     * @throws java.util.NoSuchElementException if the queue is empty.
     */
    public T dequeue();

    /**
     * Returns the element at the front of the queue without removing it.
     *
     * @return The element at the front of the queue.
     * @throws java.util.NoSuchElementException if the queue is empty.
     */
    public T peek();

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue contains no elements.
     */
    public boolean isEmpty();

    /**
     * Returns the number of elements in the queue.
     *
     * @return The number of elements in the queue.
     */
    public int size();

    /**
     * Removes all elements from the queue.
     */
    public void clear();

    /**
     * Returns an iterator over the elements in the queue.
     *
     * @return An iterator over the elements in the queue.
     */
}
