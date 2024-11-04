

import java.io.Serializable;
/**
 *
 * @author Emily
 */
public interface StackADT <E> extends Serializable
{
    /**
	 * The size method will return the current element count contained in the list.
	 * 
	 * @return The current element count.
	 */
	public int size();
        
    /**
	 * Removes all of the elements from this stack. This stack will be empty after
	 * this call returns.
	 */
	public void clear();
        
        /**
	 * Returns true if this list contains the specified element. More formally,
	 * returns true if and only if this list contains at least one element
	 * <code>e</code> such that <code>toFind.equals(e)</code>.
	 * 
	 * @param toFind The element whose presence in this list is to be tested.
	 * @return <code>true</code> if this list contains the specified element.
	 * @throws NullPointerException If the specified element is <code>null</code>
	 *                              and the list implementation does not support
	 *                              having <code>null</code> elements.
	 */
	public boolean contains( E toFind ) throws NullPointerException;
        
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
	//public Iterator<E> iterator();
        
        public void search();
        public void push();
        public void pop();
        public void peek();
        public void equals();
}
