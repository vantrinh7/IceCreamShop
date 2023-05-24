/**
 * This class defines a stack, with the ability to push (add element), pop
 * (remove element), peek (get data at the top) and check if stack is empty
 *
 * @param <T>
 *            The generic type of StackLL
 */
public class StackLL<T> implements Stack<T> { 

	// Global variable, including a LinkedList implemented in previous 
	// assignment
	private LinkedList<T> stack;

	/**
	 * Constructor of the stack
	 */
	public StackLL() {
		stack = new LinkedList<T>();
	}

	/**
	 * Add the element to the top of the stack.
	 */
	@Override
	public void push(T data) {
		stack.insertLast(data);
	}

	/**
	 * @Return the element at the top of the stack, and remove it from the
	 * stack. Last item in is the first item out.
	 */
	@Override
	public T pop() {
		// The last item of the linked list is the top of the stack
		T top = null;
		if (!isEmpty()) {
			top = stack.getLast();
			stack.deleteLast();
		}
		return top;
	}

	/**
	 * @Return the element at the top of the stack
	 */
	@Override
	public T peek() {
		if (!isEmpty())
			return stack.getLast();
		return null;
	}

	/**Check if stack is empty*/
	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}

}
