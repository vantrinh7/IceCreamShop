/**
 * This class defines a queue, with the ability to enqueue (add element),
 * dequeue (remove element), peek (get data at the top) and check if queue is
 * empty
 *
 * @param <T>
 *            The generic type of QueueLL
 */
public class QueueLL<T> implements Queue<T> {
	// A linked list to contain element in queue.
	private LinkedList<T> queue;

	public QueueLL() {
		queue = new LinkedList<T>();
	}

	/**
	 * Return true if this queue is empty
	 */
	@Override
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	/**
	 * @Return the element at the beginning of the queue
	 */
	@Override
	public T peek() {
		if (!queue.isEmpty())
			return queue.getFirst();
		return null;
	}

	/**
	 * @Return the element at the beginning of the queue, and remove it from the
	 *         queue. First item in is the first item out.
	 */
	@Override
	public T dequeue() {
		T elem = null;
		if (!queue.isEmpty()) {
			elem = queue.getFirst();
			queue.deleteFirst();
		}
		return elem;
	}

	
	/**
	 * Add the element to the end of the queue.
	 * 
	 * @param data
	 *            element to add to queue
	 */
	@Override
	public void enqueue(T data) {
		queue.insertLast(data);
	}

	/**
	 * Returns a String representation of the queue.
	 * 
	 * @return queue as String
	 **/
	@Override
	public String toString() {
		return "";
	}

}
