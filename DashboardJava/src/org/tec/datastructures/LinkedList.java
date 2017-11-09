package org.tec.datastructures;
public class LinkedList <V> {

	public LinkedListNode <V> root;

	public LinkedList(){
		root = null;
	}

	public void add(V value){
		LinkedListNode <V> node = new LinkedListNode <V>();
		node.setValue(value);
		if(root==null)
			root=node;
		else{
			LinkedListNode <V> current = root;
			while (current.getNext() != null)
				current = current.getNext();
			current.setNext(node);
		}
	}
	public void delete (int pos){
        LinkedListNode <V> current = root;
        LinkedListNode <V> prev = null;
        int count = 0;
        if (pos < 0 || pos >= length())
            System.out.println("Error: Posición Inválida");
        else {
            while (current != null) {
                if (pos == count){
                    if (prev == null){
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
        LinkedListNode <V> current = root;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
	public int length () {
        LinkedListNode <V> current = root;
        int numElementos = 0;
        while (current != null){
            numElementos++;
            current = current.getNext();
        }
        return numElementos;
    }
	public void print2 () {
        String data = "[";
        LinkedListNode <V> current = root;
        while (current != null) {
        	data += current.getValue();
        	if (current.getNext() != null)
        		data += ", ";
            current = current.getNext();
        }
        data += "]";
        System.out.println(data);
    }
	public LinkedListNode<V> pos (int pos){
		if (pos<0||pos>length())
			return null;
		LinkedListNode<V> node = root;
		int i = 0;
		while (i<pos){
			node = node.getNext();
			i++;
		}
		return node;
	}
	public static void main (String[] args){
		LinkedList <String> Lista = new LinkedList <String>();
		Lista.add ("34td1");
		Lista.add ("34td2");
		Lista.add ("34td3");
		Lista.add ("34td4");
		Lista.add ("34td5");
		Lista.delete (3);
		Lista.print ();
		System.out.println(Lista.length ());
		Lista.print2();
	}
}
