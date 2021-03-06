/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module9Demo1;

/**
	* LinkedListADT defines the interface to a general list collection. Specific
	* types of lists will extend this interface to complete the
	* set of necessary operations.
	*
	* @author Dilshad Haleem
	*/
	public interface LinkedListADT<T> extends Iterable <T>
	{
		/** 
		 * Add the first element at the front of the the LinkedList. 
		 * @param element the element to be added to the list
		*/
		public void addFirst(T element);

	/** 
		 * Removes and returns the first element from this list. 
		 * 
		 * @return the first element from this list
		 */
		public T removeFirst();
                
                
                public T removeLast();
                
                public boolean contains (T target);
                
                public T remove(T target);
                
                public void addAfter(T element, T target);

		
		
		/** 
		 * Returns a reference to the first element in this list. 
		 *
		 * @return a reference to the first element in this list
		 */
		public T inspectFirst();

                
                /**
                 * 
                 * @param e 
                 */
		public void addLast(T e);
                
                
                /**
                 * 
                 * @return T the last element in the list
                 */
                public T inspectLast();
		/** 
		 * Returns true if this list contains no elements. 
		 *
		 * @return true if this list contains no elements
		 */
		public boolean isEmpty();

		/** 
		 * Returns the number of elements in this list. 
		 *
		 * @return the integer representation of number of elements in this list
		 */
		public int size();

		/** 
		 * Returns a string representation of this list. 
		 *
		 * @return a string representation of this list
		 */
		public String toString();
}