package de.wwi23ama.vl_2024_04_11;

public class Element {
    int key;

    Element left;
    Element right;

    public boolean isEmtpy() {
        return left == null || right == null;
    }

    public void setKey(int key) {
        this.key = key;
        this.left = new Element();
        this.right = new Element();
    }

    public void add(int key) {
        if (isEmtpy()) {
            setKey(key);
        } else {
            if (key < this.key) {
                left.add(key);
            } else {
                right.add(key);
            }
        }
    }
}
