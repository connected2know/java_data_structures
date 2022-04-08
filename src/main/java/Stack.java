package main.java;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

	List<T> valuesStack;
	
	int capacity;
	
	T top;
	
	public Stack(int capacity) {
		this.capacity = capacity;
		valuesStack = new ArrayList<>(capacity);
	}

	// push - add element to top of stack
	public void push(T element) {
		if(isFull()) {
			return;
		}else{
			valuesStack.add(valuesStack.size(), element);
		}
	}
	
	// pop - return top element from stack removing it
	public T pop() {
		if(isEmpty()) {
			return null;
		}else{
			T result = valuesStack.get(valuesStack.size() - 1);
			valuesStack.remove(valuesStack.size() - 1);
			return result;
		}
	}
	
	// peek - return top element from stack without removing it
	public T peek() {
		if(isEmpty()) {
			return null;
		}else{
			return valuesStack.get(valuesStack.size() - 1);
		}
	}
	
	// is full - if capacity is maximum
	public boolean isFull() {
		return valuesStack.size() == capacity;
	}
	
	// is empty - if stack is empty
	public boolean isEmpty() {
		return valuesStack.size() == 0;
	}
	
	// size - return size of stack
	public int getSize() {
		return valuesStack.size();
	}
	
	public static void main(String[] args) {
		Integer value1 = new Integer("1");
		Integer value2 = new Integer("2");
		Integer value3 = new Integer("3");
		Integer value4 = new Integer("4");
		Integer value5 = new Integer("5");
		
		Stack<Integer> stack = new Stack<>(6);
		
		stack.push(value1);
		stack.push(value2);
		stack.push(value3);
		stack.push(value4);
		stack.push(value5);
		
		System.out.println("SIZE:" +stack.getSize());
		
		Integer peek = stack.peek();
		
		System.out.println("PEEK:" + peek);
		
		Integer pop= stack.pop();
		
		System.out.println("POP:" + pop);
		System.out.println("SIZE:" +stack.getSize());
		
		stack.push(value1);
		stack.push(value1);
		stack.push(value1);
		stack.push(value1);
		System.out.println("SIZE:" +stack.getSize());
	}

}
