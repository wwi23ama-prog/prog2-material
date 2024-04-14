package de.wwi23ama.vl_2024_04_11;

public class Element {
    int key;
    int height;

    Element left;
    Element right;

    public boolean isEmtpy() {
        return left == null || right == null;
    }

    public void setKey(int key) {
        this.key = key;
        this.left = new Element();
        this.right = new Element();
        this.height = 1;
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
            this.height = 1 + Math.max(left.height, right.height);
            int bf = right.height - left.height;
            if (bf == 2) {
                int bf_right = right.right.height - right.left.height;
                if (bf_right == 1) {
                    // rotate left
                } else { // bf_right == -1
                    // rotate right-left
                }
            } else if (bf == -2) {
                // if balance factor of left subtree is 1, rotate left-right
                // if balance factor of left subtree is -1, rotate right
            }
        }
    }
}
