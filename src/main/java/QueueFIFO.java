package main.java;

public class QueueFIFO<V> {
	
	Node<V> front, rear;
	int numberElems = 0;
	
	public QueueFIFO(Node<V> front, Node<V> rear) {
		this.front= front;
		this.rear = rear;
	}
	
    void enqueue(V value){
    	
    	Node<V> node = new Node<>(value);
    	numberElems++;
    	
    	if(this.rear == null) {
    		this.rear = node;
    		this.front = node;
    		return;
    	}
    	
    	this.rear.next  = node;
    	this.rear = node;
    	
    }
  
    Node<V> dequeue(){
       
    	if(this.rear == null) {
    		return null;
    	}
    	
    	Node<V> result = this.front;
    	this.front = this.front.next;
    	numberElems--;
    	
    	if(this.rear == null) {
    		this.front = null;
    	}
    	
    	return result;
    }

 	// is empty - if stack is empty
 	public boolean isEmpty() {
 		return numberElems == 0;
 	}
 	
 	// size - return size of stack
 	public int getSize() {
 		return numberElems;
 	}

	
    @SuppressWarnings("hiding")
	class Node<V>{
		
		V value;
		Node<V> next;
		
		Node(V value){
			this.value=value;
			next = null;
		}
	}
	
	public static void main(String[] args) {
		
		Integer value1 = new Integer("1");
		Integer value2 = new Integer("2");
		Integer value3 = new Integer("3");
		Integer value4 = new Integer("4");
		Integer value5 = new Integer("5");
		
		QueueFIFO<Integer> stack = new QueueFIFO<>(null,null);
		
		stack.enqueue(value1);
		stack.enqueue(value2);
		stack.enqueue(value3);
		stack.enqueue(value4);
		stack.enqueue(value5);

		System.out.println("SIZE:" +stack.getSize());
		
		Integer dequeue = stack.dequeue().value;
		
		System.out.println("DEQUEUE:" + dequeue);
		
		System.out.println("SIZE:" +stack.getSize());
		
		stack.enqueue(value1);

		System.out.println("SIZE:" +stack.getSize());
		
		
		Integer dequeue2 = stack.dequeue().value;
		Integer dequeue3 = stack.dequeue().value;
		Integer dequeue4 = stack.dequeue().value;
		
		System.out.println("DEQUEUE:" + dequeue2);
		System.out.println("DEQUEUE:" + dequeue3);
		System.out.println("DEQUEUE:" + dequeue4);
		
		stack.enqueue(value1);
		
		System.out.println("SIZE:" +stack.getSize());
	}
		
	

}
