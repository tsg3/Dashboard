package org.tec.datastructures;
public class CircularLinkedList <V> {

	private CircularLinkedListNode <V> root;

	public CircularLinkedList(){
		root = null;
	}

	public void add(V value){
		CircularLinkedListNode <V> node = new CircularLinkedListNode <V>();
		node.setValue(value);
		if(root==null){
			root=node;
			root.setNext(root);
		}
		else{
			CircularLinkedListNode <V> current = root;
			while (current.getNext() != root)
				current = current.getNext();
			current.setNext(node);
			node.setNext(root);
		}
	}
	public void delete (int pos){
        CircularLinkedListNode <V> current = root;
        CircularLinkedListNode <V> prev = lastNode();
        int count = 0;
        if (pos < 0 || pos >= length())
            System.out.println("Error: Posición Inválida");
        else {
            while (current != null) {
                if (pos == count){
                    if (prev == null){
                    	root.setNext(null);
                        root = root.getNext();
                    } else {
                        prev.setNext(current.getNext());
                    }
                    current = null;
                } else {
                    prev = current;
                    current = current.getNext();
                    count++;
                }
            }
        }
    }
	public void print () {
        System.out.println("Contenido de la lista");
        System.out.println("---------------------");
        CircularLinkedListNode <V> current = root;
        do {
            System.out.println(current.getValue());
            current = current.getNext();
        } while (current != root);
    }
	public int length () {
        CircularLinkedListNode <V> current = root;
        int numElementos = 0;
        do {
            numElementos++;
            current = current.getNext();
        } while (current != root);
        return numElementos;
    }
	public void print2 () {
        String data = "[";
        CircularLinkedListNode <V> current = root;
        do {
        	data += current.getValue();
        	if (current.getNext() != root)
        		data += ", ";
            current = current.getNext();
        } while (current != root);
        data += "]";
        System.out.println(data);
    }
	public CircularLinkedListNode <V> lastNode (){
        CircularLinkedListNode <V> current = null;
        if (root != null){
            current = root;
            while(current.getNext() != root){
                current = current.getNext();
            }
        }
        return current;
    }
	public static void main (String[] args){
		CircularLinkedList <Double> Lista = new CircularLinkedList <Double>();
		Lista.add (0.1);
		Lista.add (2.3);
		Lista.add (4.5);
		Lista.add (6.7);
		Lista.add (8.9);
		Lista.delete (3);
		Lista.print ();
		System.out.println(Lista.length ());
		System.out.println(Lista.hashCode());
		Lista.print2();
	}
}
