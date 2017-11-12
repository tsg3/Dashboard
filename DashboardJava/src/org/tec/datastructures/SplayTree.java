package org.tec.datastructures;

public class SplayTree<V> implements Comparable<V> {

    public SplayTreeNode<V> root;

    public SplayTree() { }

    @Override
	public int compareTo(V value) {
		return this.compareTo(value);
	}
    private void splay(SplayTreeNode<V> node) {
        while (node.parentExists()) {
            SplayTreeNode<V> parent = node.getParent();
            if (!parent.parentExists()) {
                if (parent.getLeft() == node) {
                    rotateRight(parent);
                } else {
                    rotateLeft(parent);
                }
            } else {
                SplayTreeNode<V> gparent = parent.getParent();
                if (parent.getLeft() == node && gparent.getLeft() == parent) {
                    rotateRight(gparent);
                    rotateRight(node.getParent());
                } else if (parent.getRight() == node &&
                        gparent.getRight() == parent) {
                    rotateLeft(gparent);
                    rotateLeft(node.getParent());
                } else if (parent.getLeft() == node &&
                        gparent.getRight() == parent) {
                    rotateRight(parent);
                    rotateLeft(node.getParent());
                } else {
                    rotateLeft(parent);
                    rotateRight(node.getParent());
                }
            }
        }
    }

    private void rotateLeft(SplayTreeNode<V> x) {
        SplayTreeNode<V> y = x.getRight();
        x.setRight(y.getLeft());
        if (y.getLeft() != null) {
            y.getLeft().setParent(x);
        }
        y.setParent(x.getParent());
        if (x.getParent() == null) {
            root = y;
        } else {
            if (x == x.getParent().getLeft()) {
                x.getParent().setLeft(y);
            } else {
                x.getParent().setRight(y);
            }
        }
        y.setLeft(x);
        x.setParent(y);
    }

    private void rotateRight(SplayTreeNode<V> x) {
        SplayTreeNode<V> y = x.getLeft();
        x.setLeft(y.getRight());
        if (y.getRight() != null) {
            y.getRight().setParent(x);
        }
        y.setParent(x.getParent());
        if (x.getParent() == null) {
            root = y;
        } else {
            if (x == x.getParent().getLeft()) {
                x.getParent().setLeft(y);
            } else {
                x.getParent().setRight(y);
            }
        }
        y.setRight(x);
        x.setParent(y);
    }

    public void insert(V value) {
        if (root == null) {
            root = new SplayTreeNode<V>(value, null);
            return;
        }

        insert(value, root);
        search(value);
    }

    @SuppressWarnings("unchecked")
	private void insert(V value, SplayTreeNode<V> node) {
        if (((Comparable<V>) value).compareTo(node.getValue() ) < 0) {
            if (node.leftExists()) {
                insert(value, node.getLeft());
            } else {
                node.setLeft(new SplayTreeNode<V>(value, node));
            }
        }
        if (((Comparable<V>) value).compareTo(node.getValue() )>0) {
            if (node.rightExists()) {
                insert(value, node.getRight());
            } else {
                node.setRight(new SplayTreeNode<V>(value, node));
            }
        }
    }

    public void delete(V key) {
        if (root == null) {
            return;
        }

        search(key);
        delete(key, root);
    }

    @SuppressWarnings("unchecked")
	private void delete(V value, SplayTreeNode<V> node) {
        if (((Comparable<V>)value).compareTo(node.getValue())< 0) {
            if (node.leftExists()) {
                delete(value, node.getLeft());
            }
            if (node.getLeft().isDeleted()) {
                node.setLeft(null);
            }
            return;
        }

        if (((Comparable<V>)value).compareTo(node.getValue()) > 0) {
            if (node.rightExists()) {
                delete(value, node.getRight());
            }
            if (node.getRight().isDeleted()) {
                node.setRight(null);
            }
            return;
        }

        delete(node);
    }

    private void delete(SplayTreeNode<V> node) {
        if (!(node.leftExists() || node.rightExists())) {
            node.setDeleted(true);
            return;
        }

        if (node.leftExists() && !node.rightExists()) {
            node.setValue(node.getLeft().getValue());
            if (node.getLeft().rightExists()) {
                node.setRight(node.getLeft().getRight());
            }
            if (node.getLeft().leftExists()) {
                node.setLeft(node.getLeft().getLeft());
            } else {
                node.setLeft(null);
            }
            return;
        }

        if (node.rightExists() && !node.leftExists()) {
            node.setValue(node.getRight().getValue());
            if (node.getRight().leftExists()) {
                node.setLeft(node.getLeft().getLeft());
            }
            if (node.getRight().rightExists()) {
                node.setRight(node.getLeft().getRight());
            } else {
                node.setRight(null);
            }
            return;
        }

        // both exist, replace with minimum from right sub-tree
        V min = findMin(node.getRight());
        node.setValue(min);
    }

    public V findMin(SplayTreeNode<V> node) {
        if (!node.leftExists()) {
            node.setDeleted(true);
            return node.getValue();
        }

        V min = findMin(node.getLeft());
        if (node.getLeft().isDeleted()) {
            node.setLeft(null);
        }
        return min;
    }

    public boolean search(V value) {
        if (root == null) {
            return false;
        }

        SplayTreeNode<V> node = search(value, root);
        splay(node);
        return node != null;
    }

    @SuppressWarnings("unchecked")
	private SplayTreeNode<V> search(V value, SplayTreeNode<V> node) {
        if (value == node.getValue()) {
            return node;
        }

        if (((Comparable <V>) value).compareTo(node.getValue()) < 0) {
            if (!node.leftExists()) {
                return null;
            }
            return search(value, node.getLeft());
        }

        if (((Comparable <V>) value).compareTo(node.getValue()) > 0) {
            if (!node.rightExists()) {
                return null;
            }
            return search(value, node.getRight());
        }

        return null;
    }

    public String toString() {
        return root.toString();
    }

    public static void main (String[] args){
    	SplayTree<Integer> st = new SplayTree<Integer>();
    	st.insert(3);
    	System.out.println(st.toString());
    	st.insert(5);
    	System.out.println(st.toString());;
    	st.insert(2);
    	System.out.println(st.toString());;
    	st.insert(7);
    	System.out.println(st.toString());;
    	System.out.println(st.search(2));
    	System.out.println(st.toString());;

    }

}