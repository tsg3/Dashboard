package org.tec.datastructures;
public class DoubleLinkedList <V> {

	private DoubleLinkedListNode <V> start;
	private DoubleLinkedListNode <V> end;

	public DoubleLinkedList(){
		start = null;
		end = null;
	}

	public void add(V value){
		DoubleLinkedListNode <V> node = new DoubleLinkedListNode <V>();
		node.setValue(value);
		if(start==null){
			start=node;
			end=start;
		}
		else{
			end.setNext(node);
			node.setPrev(end);
			end = node;
		}
	}
	public void delete (int pos){
        DoubleLinkedListNode <V> current = start;
        DoubleLinkedListNode <V> prev = null;
        int count = 0;
        if (pos < 0 || pos >= length())
            System.out.println("Error: Posición Inválida");
        else if (pos == length()-1){
        	prev = end.getPrev();
        	end.setPrev(null);
        	prev.setNext(null);
		}
        else {
            while (current != null) {
                if (pos == count){
                    if (prev == null){
                    	if (end == start)
                    		end = end.getNext();
                        start = start.getNext();
                    } else {
                        prev.setNext(current.getNext());
                        current.getNext().setPrev(prev);
                        current.setPrev(null);
                        current.setNext(null);
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
        DoubleLinkedListNode <V> current = start;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
	public int length () {
        DoubleLinkedListNode <V> current = start;
        int numElementos = 0;
        while (current != null){
            numElementos++;
            current = current.getNext();
        }
        return numElementos;
    }
	public void print2 () {
        String data = "[";
        DoubleLinkedListNode <V> current = start;
        while (current != null) {
        	data += current.getValue();
        	if (current != end)
        		data += ", ";
            current = current.getNext();
        }
        data += "]";
        System.out.println(data);
    }
	public static void main (String[] args){
		DoubleLinkedList <Integer> Lista = new DoubleLinkedList <Integer>();
		Lista.add (0);
		Lista.add (1);
		Lista.add (2);
		Lista.add (3);
		Lista.add (4);
		System.out.println(Lista.length ());
		Lista.delete (1);
		Lista.print ();
		Lista.print2();
	}
}
