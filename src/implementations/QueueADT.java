
package utilities;

import java.io.Serializable;

/**
 *
 * @author Emily
 */
public interface QueueADT <E> extends Serializable
{
    /**
	 * The size method will return the current element count contained in the list.
	 * 
	 * @return The current element count.
	 */
	public int size();
        
        
        /**
	 * Returns <code>true</code> if this stack contains no elements.
	 * 
	 * @return <code>true</code> if this stack contains no elements.
	 */
	public boolean isEmpty();
        
        /**
	 * Returns an array containing all of the elements in this stack in proper
	 * sequence. Obeys the general contract of the
	 * <code>java.util.Collection.toArray()</code> method.
	 * 
	 * @return An array containing all of the elements in this stack in proper
	 *         sequence.
	 */
	public Object[] toArray();
        
        /**
	 * Returns an array containing all of the elements in this stack in proper
	 * sequence; the runtime type of the returned array is that of the specified
	 * array. Obeys the general contract of the
	 * <code>java.util.Collection.toArray(Object [])</code> method.
	 * 
	 * @param toHold The array into which the elements of this list are to be
	 *               stored, if it is big enough; otherwise, a new array of the same
	 *               runtime type is allocated for this purpose.
	 * @return An array containing the elements of this list.
	 * @throws NullPointerException If the specified array is <code>null</code>.
	 */
	public E[] toArray( E[] toHold ) throws NullPointerException;
        
        /**
	 * Returns an iterator over the elements in this stack, in proper sequence.
	 * 
	 * @return An iterator over the elements in this stack, in proper sequence. NB:
	 *         The return is of type <code>linearUtilities.Iterator<E></code>, not
	 *         <code>java.util.Iterator</code>.
	 */
	public Iterator<E> iterator();
        
        public void enqueue();
        public void peek();
        public void dequeue();
        public void equals();
}
