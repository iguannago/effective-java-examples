// Can you spot the "memory leak"?
package org.effectivejava.examples.chapter02.item06;

import java.util.Arrays;

public class Stack {
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public Stack() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public Object pop() {
		if (size == 0)
			throw new EmptyStackException();
		Object element = elements[--size];
		elements[size] = null;
		return element;
	}

	/**
	 * Ensure space for at least one more element, roughly doubling the capacity
	 * each time the array needs to grow.
	 */
	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}


	@Override
	public String toString() {
		return "Stack{" +
				"elements=" + Arrays.toString(elements) +
				", size=" + size +
				'}';
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("David");
		System.out.println(stack.toString());
		stack.pop();
		System.out.println(stack.toString());
	}
}
