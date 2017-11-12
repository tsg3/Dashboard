package org.tec.datastructures;

public class BTree<Key extends Comparable<Key>, Value>  {

    private static final int M = 4; //Se coloca por defecto un valor maximo de 4

    private Node root;
    private int height;
    private int n;

    private static class Node {
        private int m;
        private Entry[] children = new Entry[M];

        private Node(int k) {
            m = k;
        }
    }

    private static class Entry {
        private Comparable key;
        private final Object val;
        private Node next;
        public Entry(Comparable key, Object val, Node next) {
            this.key  = key;
            this.val  = val;
            this.next = next;
        }
    }

    public BTree() {
    	int i = 0;
        root = new Node(i);
    }

    public boolean Empty() {
    	if (size()==0)
    		return true;
    	else
    		return false;
    }

    public int size() {
        return n;
    }

    public int height() {
        return height;
    }

    public Value get(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to get() is null");
        return find(root, key, height);
    }

    private Value find(Node x, Key key, int ht) {
        Entry[] children = x.children;

        if (ht == 0) {
            for (int j = 0; j < x.m; j++) {
                if (eq(key, children[j].key)) return (Value) children[j].val;
            }
        }

        else {
            for (int j = 0; j < x.m; j++) {
                if (j+1 == x.m || less(key, children[j+1].key))
                    return find(children[j].next, key, ht-1);
            }
        }
        return null;
    }


    public void put(Key key, Value val) {
        if (key == null) throw new IllegalArgumentException("argument key to put() is null");
        Node u = insert(root, key, val, height);
        n++;
        if (u == null)
        	return;
        // Se realiza la division
        Node t = new Node(2);
        t.children[0] = new Entry(root.children[0].key, null, root);
        t.children[1] = new Entry(u.children[0].key, null, u);
        root = t;
        height++;
    }

    private Node insert(Node h, Key key, Value val, int ht) {
        int j;
        Entry t = new Entry(key, val, null);

        if (ht == 0) {
            for (j = 0; j < h.m; j++) {
                if (less(key, h.children[j].key)) break;
            }
        }

        else {
            for (j = 0; j < h.m; j++) {
                if ((j+1 == h.m) || less(key, h.children[j+1].key)) {
                    Node u = insert(h.children[j++].next, key, val, ht-1);
                    if (u == null) return null;
                    t.key = u.children[0].key;
                    t.next = u;
                    break;
                }
            }
        }

        for (int i = h.m; i > j; i--)
            h.children[i] = h.children[i-1];
        h.children[j] = t;
        h.m++;
        if (h.m < M) return null;
        else         return split(h);
    }

    // Dividir a la mitad es decir 4/2 en este caso
    private Node split(Node h) {
        Node t = new Node(M/2);
        h.m = M/2;
        for (int j = 0; j < M/2; j++)
            t.children[j] = h.children[M/2+j];
        return t;
    }

    public String toString() {
        return toString(root, height, "") + "\n";
    }

    private String toString(Node h, int ht, String indent) {
        StringBuilder s = new StringBuilder();
        Entry[] children = h.children;

        if (ht == 0) {
            for (int j = 0; j < h.m; j++) {
                s.append(indent + children[j].key + " " + children[j].val + "\n");
            }
        }
        else {
            for (int j = 0; j < h.m; j++) {
                if (j > 0) s.append(indent + "(" + children[j].key + ")\n");
                s.append(toString(children[j].next, ht-1, indent + "     "));
            }
        }
        return s.toString();
    }


    // Comparacion de los Keys
    private boolean less(Comparable k1, Comparable k2) {
        return k1.compareTo(k2) < 0;
    }

    private boolean eq(Comparable k1, Comparable k2) {
        return k1.compareTo(k2) == 0;
    }

    public static void main(String[] args) {
        BTree<String, String> st = new BTree<String, String>();

        st.put("a", "1");
        st.put("b", "2");
        st.put("c", "3");
        st.put("d", "4");
        st.put("e", "5");
        st.put("f", "6");
        st.put("g", "7");
        st.put("h", "8");
        st.put("i", "9");
        st.put("j", "10");
        st.put("k", "11");
        st.put("l", "12");
        st.put("m", "13");
        System.out.println("Datos con sus respectivos valores");
        System.out.println();

        System.out.println("a = " + st.get("a"));
        System.out.println("b = " + st.get("b"));
        System.out.println("c = " + st.get("c"));
        System.out.println("d = " + st.get("d"));
        System.out.println("e = " + st.get("e"));
        System.out.println("f = " + st.get("f"));
        System.out.println("g = " + st.get("g"));
        System.out.println("h = " + st.get("h"));
        System.out.println("i = " + st.get("i"));
        System.out.println("j = " + st.get("j"));
        System.out.println("k = " + st.get("k"));
        System.out.println("l = " + st.get("l"));
        System.out.println("m = " + st.get("m"));
        System.out.println();

        System.out.println("size:    " + st.size());
        System.out.println("height:  " + st.height());
        System.out.println();
        System.out.println(st);
        System.out.println();
    }

}