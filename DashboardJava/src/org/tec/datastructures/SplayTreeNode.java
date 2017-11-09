package org.tec.datastructures;

public class SplayTreeNode<V> {

    private final String nullNodeString = "_";
    private SplayTreeNode<V> left;
    private SplayTreeNode<V> right;
    private SplayTreeNode<V> parent;

    private V value;
    private boolean isDeleted = false;

    public SplayTreeNode(V value, SplayTreeNode<V> parent) {
        this.value = value;
        this.parent = parent;
    }

    public String toString() {
        return value + " : { " +
                (leftExists() ? left.toString() : nullNodeString) + " , " +
                (rightExists() ? right.toString() : nullNodeString) + " }";
    }

    public boolean leftExists() {
        return left != null;
    }

    public boolean rightExists() {
        return right != null;
    }

    public boolean parentExists() {
        return parent != null;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public SplayTreeNode<V> getLeft() {
        return left;
    }

    public void setLeft(SplayTreeNode<V> left) {
        this.left = left;
    }

    public SplayTreeNode<V> getRight() {
        return right;
    }

    public void setRight(SplayTreeNode<V> right) {
        this.right = right;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public SplayTreeNode<V> getParent() {
        return parent;
    }

    public void setParent(SplayTreeNode<V> parent) {
        this.parent = parent;
    }

}