package main.java.util;
import java.util.Arrays;
/**
 * This class is to implement basic queue operations.
 * @author Amit Sharma 
 */
public class Queue<T> {
	private T[] queueArray;
	
	/**
	 * Constructor to initiate the array
	 */
	@SuppressWarnings("unchecked")
	public Queue () {								
		queueArray = (T[]) new Object[0];
	}
	
	/**
	 * To get the queue
	 * @return queue
	 */
	public T[] getQueueArray() {
		return queueArray;
	}

	/**
	 * To get the length of queue
	 * @return length of queue
	 */
	public int length() {
		return queueArray.length;
	}
	
	/**
	 * This function inserts element into the queue
	 * @param item to add
	 */
	public void enQueue(T item) {
		T[] tempArray = (T[]) new Object[queueArray.length + 1];
		tempArray = Arrays.copyOf(queueArray,queueArray.length +1);
		tempArray[queueArray.length] = item;
		queueArray = tempArray;
	}
	
	/**
	 * This function deletes element from the queue
	 * @return deleted element
	 */
	public T deQueue () {
		if(queueArray.length <= 0) {
			return null;
		}
		T deletedElement = queueArray[0];
		T[] tempArray = (T[]) new Object[queueArray.length -1 ];
		tempArray = Arrays.copyOfRange(queueArray,1,queueArray.length);
		queueArray = tempArray;
		return deletedElement;
	}
	
	/**
	 * This function empties the queue
	 */
	public void makeempty() {
		queueArray = (T[]) new Object[0];
	}
	
	/**
	 * This function returns the least recently inserted item
	 * @return the front element
	 */
	public T getFront () {
		if(queueArray.length <= 0) {
			return null;
		}
		return queueArray[0];
	}
}
