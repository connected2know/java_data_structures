package main.java;

public class BinaryTree<T extends Comparable> {
	
	Node<T> root;

	@SuppressWarnings("hiding")
	class Node<T extends Comparable>{
		
		T value;
		Node<T> left;
		Node<T> right;
		
		Node(T value){
			this.value=value;
			this.left = null;
			this.right = null;
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public void insertElem(T value) {
		
		Node<T> node = new Node<>(value);
		
		if(root == null) {
			root = node;
			
		}else {
			
			T valueRoot = root.value;
			int compare= value.compareTo(valueRoot);
			
			if(compare < 0) {
				// insert element right
				
				
			}else {
				// insert left
				
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		BinaryTree<Integer> tree = new BinaryTree<>();
		
		
		Integer a = new Integer("2");
		Integer b = new Integer("1");
		int c = a.compareTo(b);
		int g = 7;
	}

}
