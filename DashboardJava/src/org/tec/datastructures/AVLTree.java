package org.tec.datastructures;

public class AVLTree<V> implements Comparable<V>{

	AVLTreeNode<V> root;

	int height(AVLTreeNode<V> node) {
     if (node == null)
         return 0;

     return node.height;
 }

	@Override
	public int compareTo(V value) {
		return this.compareTo(value);
	}

 int max(int a, int b) {
     return (a > b) ? a : b;
 }

 AVLTreeNode<V> rightRotate(AVLTreeNode<V> y) {
	 AVLTreeNode<V> x = y.left;
	 AVLTreeNode<V> T2 = x.right;

     // Perform rotation
     x.right = y;
     y.left = T2;

     // Update heights
     y.height = max(height(y.left), height(y.right)) + 1;
     x.height = max(height(x.left), height(x.right)) + 1;

     // Return new root
     return x;
 }

 // A utility function to left rotate subtree rooted with x
 // See the diagram given above.
 AVLTreeNode<V> leftRotate(AVLTreeNode<V> x) {
	 AVLTreeNode<V> y = x.right;
     AVLTreeNode<V> T2 = y.left;

     // Perform rotation
     y.left = x;
     x.right = T2;

     //  Update heights
     x.height = max(height(x.left), height(x.right)) + 1;
     y.height = max(height(y.left), height(y.right)) + 1;

     // Return new root
     return y;
 }

 // Get Balance factor of node N
 int getBalance(AVLTreeNode<V> node) {
     if (node == null)
         return 0;

     return height(node.left) - height(node.right);
 }

 @SuppressWarnings("unchecked")
AVLTreeNode<V> insert(AVLTreeNode<V> node, V value) {

     /* 1.  Perform the normal BST insertion */
     if (node == null)
         return (new AVLTreeNode<V>(value));

     if (((Comparable<V>) value).compareTo(node.value )<0)
         node.left = insert(node.left, value);
     else if (((Comparable<V>) value).compareTo(node.value )>0)
         node.right = insert(node.right, value);
     else // Duplicate keys not allowed
         return node;

     /* 2. Update height of this ancestor node */
     node.height = 1 + max(height(node.left),
                           height(node.right));

     /* 3. Get the balance factor of this ancestor
           node to check whether this node became
           unbalanced */
     int balance = getBalance(node);

     // If this node becomes unbalanced, then there
     // are 4 cases Left Left Case
     if (balance > 1 && ((Comparable<V>)value).compareTo(node.left.value) < 0)
         return rightRotate(node);

     // Right Right Case
     if (balance < -1 && ((Comparable<V>)value).compareTo(node.right.value) > 0)
         return leftRotate(node);

     // Left Right Case
     if (balance > 1 && ((Comparable<V>)value).compareTo(node.left.value) > 0) {
         node.left = leftRotate(node.left);
         return rightRotate(node);
     }

     // Right Left Case
     if (balance < -1 && ((Comparable<V>)value).compareTo(node.right.value) < 0) {
         node.right = rightRotate(node.right);
         return leftRotate(node);
     }

     /* return the (unchanged) node pointer */
     return node;
 }

 // A utility function to print preorder traversal
 // of the tree.
 // The function also prints height of every node
 void preOrder(AVLTreeNode<V> node) {
     if (node != null) {
         System.out.print(node.value + " ");
         preOrder(node.left);
         preOrder(node.right);
     }
 }

 public static void main(String[] args) {
     AVLTree<Integer> tree = new AVLTree<Integer>();

     /* Constructing tree given in the above figure */
     tree.root = tree.insert(tree.root, 10);
     tree.root = tree.insert(tree.root, 20);
     tree.root = tree.insert(tree.root, 30);
     tree.root = tree.insert(tree.root, 40);
     tree.root = tree.insert(tree.root, 50);
     tree.root = tree.insert(tree.root, 25);

     /* The constructed AVL Tree would be
          30
         /  \
       20   40
      /  \     \
     10  25    50
     */
     
     System.out.println(tree.getBalance(tree.root.right));
     System.out.println(tree.getBalance(tree.root.left));
     System.out.println("Preorder traversal" +
                     " of constructed tree is : ");
     tree.preOrder(tree.root);
 }

}
//This code has been contributed by Mayank Jaiswal
