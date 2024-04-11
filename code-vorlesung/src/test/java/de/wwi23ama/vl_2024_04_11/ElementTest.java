package de.wwi23ama.vl_2024_04_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ElementTest {
    @Test
    public void testElement() {
        // Given a default constructed Element ...
        Element e = new Element();

        // ... then the key should be 0 ...
        // ... and the element should count as empty ...
        /// ... and the height should be 0.
        assertEquals(0, e.key);
        assert(e.isEmtpy());
        assertEquals(0, e.height);
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

        // ... then the key should be 42 and the element should not be empty ...
        // ... and the height should be 1.
        assertEquals(42, e.key);
        assert(!e.isEmtpy());
        assertEquals(1, e.height);
    }

    @Test
    public void testElement_setKey() {
        // Given an empty Element ...
        Element e = new Element();

        // ... when setting the key to 42 ...
        e.setKey(42);

        // ... then the key should be 42 ...
        // ... and the element should not be empty ...
        // ... and the height should be 1.
        assertEquals(42, e.key);
        assert(!e.isEmtpy());
        assertEquals(1, e.height);
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

        // ... we do not check the height here,
        // ... because it is not updated by set.
        
        // ... when adding an element to the root ...
        root.add(1);

        // ... then there should be a new element with the key 1
        //     at root.left.left.
        assertEquals(1, root.left.left.key);
    }

    @Test
    public void testElement_add_many() {
        // Given a root element ...
        Element root = new Element();

        // ... when adding some elements ...
        root.setKey(42);
        root.add(23);
        root.add(1337);
        root.add(666);
        root.add(38);

        // ... then we should gets a tree like this:
        //     42
        //    /  \
        //  23   1337
        //   \   /
        //   38 666

        assertEquals(42, root.key);
        assertEquals(3, root.height);

        assertEquals(23, root.left.key);
        assertEquals(2, root.left.height);

        assertEquals(1337, root.right.key);
        assertEquals(2, root.right.height);

        assert(root.left.left.isEmtpy());
        assertEquals(0, root.left.left.height);

        assertEquals(38, root.left.right.key);
        assertEquals(1, root.left.right.height);
        
        assertEquals(666, root.right.left.key);
        assertEquals(1, root.right.left.height);

        assert(root.right.right.isEmtpy());
        assertEquals(0, root.right.right.height);

        assert(root.left.right.left.isEmtpy());
        assert(root.left.right.right.isEmtpy());
        assert(root.right.left.left.isEmtpy());
        assert(root.right.left.right.isEmtpy());
    }
}
