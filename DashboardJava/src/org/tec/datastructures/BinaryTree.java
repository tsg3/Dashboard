package org.tec.datastructures;

public class BinaryTree <V> {

	private BinaryTreeNode<V> root;

	public BinaryTree (){
		root = null;
	}

	public void add (V value){
		BinaryTreeNode<V> node = new BinaryTreeNode<>();
		node.setValue(value);
		if (root == null)
			root = node;
		else {
			BinaryTreeNode<V> current = root;
			BinaryTreeNode<V> root;
			while (true){
				root = current;
				if ((Integer) value < (Integer) current.getValue()){
					current = current.getLeftChild();
					if (current == null){
						root.setLeftChild(node);
						return;
					}
				} else {
					current = current.getRightChild();
					if (current == null) {
						root.setRightChild(node);
						return;
					}
				}
			}
		}
	}
	public void delete (V value) {
		BinaryTreeNode<V> root = this.root;
		BinaryTreeNode<V> current = this.root;
		boolean isLeftChild = true;
		while (current.getValue() != value) {
			root = current;
			if((Integer) value < (Integer) current.getValue()){
				isLeftChild = true;
				current = current.getLeftChild();
			} else {
				isLeftChild = false;
				current = current.getRightChild();
			}
			if (current == null) {
				return;
			}
		}
		if (current.getLeftChild()==null && current.getRightChild()==null){
			if (current == this.root)
				this.root = null;
			else if (isLeftChild)
				root.setLeftChild(null);
			else
				root.setRightChild(null);
		} else if (current.getRightChild()==null){
			if (current == this.root)
				this.root = current.getLeftChild();
			else if (isLeftChild)
				root.setLeftChild(current.getLeftChild());
			else
				root.setRightChild(current.getLeftChild());
		} else if (current.getLeftChild()==null){
			if (current == this.root)
				this.root = current.getRightChild();
			else if (isLeftChild)
				root.setLeftChild(current.getRightChild());
			else
				root.setRightChild(current.getRightChild());
		} else {
			BinaryTreeNode<V> substitute = substitute(current);
			if (current == this.root)
				this.root = substitute;
			else if (isLeftChild)
				root.setLeftChild(substitute);
			else
				root.setRightChild(substitute);
			substitute.setLeftChild(current.getLeftChild());
		}
	}
	public BinaryTreeNode<V> substitute (BinaryTreeNode<V> node){
		BinaryTreeNode<V> rootSubstitute = node;
		BinaryTreeNode<V> substitute = node;
		BinaryTreeNode<V> current=node.getRightChild();
		while (current != null){
			rootSubstitute = substitute;
			substitute = current;
			current = current.getLeftChild();
		}
		if (substitute != node.getRightChild()){
			rootSubstitute.setLeftChild(substitute.getRightChild());
			substitute.setRightChild(node.getRightChild());
		}
		return substitute;
	}
	public void inOrder (BinaryTreeNode<V> current){
		if (current != null){
			inOrder (current.getLeftChild());
			System.out.println(current.getValue()+", ");
			inOrder (current.getRightChild());
		}
	}
	public static void main (String[] args){
		BinaryTree<Integer> T = new BinaryTree<Integer>();
		T.add(6);
		T.add(1);
		T.add(30);
		T.add(13);
		T.add(78);
		T.add(2);
		T.add(3);
		T.delete(78);
		T.inOrder(T.root);
	}
}
