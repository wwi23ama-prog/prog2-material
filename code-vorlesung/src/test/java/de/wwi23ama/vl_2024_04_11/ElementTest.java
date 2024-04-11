package de.wwi23ama.vl_2024_04_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ElementTest {
    @Test
    public void testElement() {
        // Given a default constructed Element ...
        Element e = new Element();

        // ... then the key should be 0 ...
        // ... and the element should count as empty.
        assertEquals(0, e.key);
        assert(e.isEmtpy());
    }
    
    @Test
    public void testElement_nonEmpty() {

        // Given an empty Element ...
        Element e = new Element();

        // ... when setting the key to 42 and creating a left child ...
        e.key = 42;
        e.left = new Element();

        // ... the element should still be empty.
        assert(e.isEmtpy());

        // ... when creating a right child ...
        e.right = new Element();

        // ... then the key should be 42 and the element should not be empty.
        assertEquals(42, e.key);
        assert(!e.isEmtpy());
    }

    @Test
    public void testElement_setKey() {
        // Given an empty Element ...
        Element e = new Element();

        // ... when setting the key to 42 ...
        e.setKey(42);

        // ... then the key should be 42 ...
        // ... and the element should not be empty.
        assertEquals(42, e.key);
        assert(!e.isEmtpy());
    }

    @Test
    public void testElement_add() {
        // Given a proper tree ...
        Element root = new Element();
        root.setKey(42);
        root.left.setKey(23);
        root.right.setKey(1337);
        root.right.left.setKey(666);
        root.left.right.setKey(38);

        // We have a tree like this:
        //     42
        //    /  \
        //  23   1337
        //   \   /
        //   38 666

        // ... then the tree should not be empty ...
        assert(!root.isEmtpy());
        
        // ... when adding an element to the root ...
        root.add(1);

        // ... then there should be a new element with the key 1
        //     at root.left.left.
        assertEquals(1, root.left.left.key);
    }
}
