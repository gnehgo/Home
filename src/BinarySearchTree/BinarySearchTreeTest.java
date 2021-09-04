package BinarySearchTree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTreeTest extends Assertions {

    @Test
    public void insert() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert("a");

        String expected = "a";
        String actual = tree.search("a").key;
        assertEquals(expected, actual);
    }

    @Test
    public void search() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert("a");

        String expected = "a";
        String actual = tree.search("a").key;
        assertEquals(expected, actual);
    }

    @Test
    public void searchNotFoundException() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert("a");
        String error_message = "Not found";
        assertThrows(RuntimeException.class, () -> tree.search("g"), error_message);
    }

    @Test
    public void min() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert("ab");
        tree.insert("abcd");
        tree.insert("a");

        String expected = "a";
        String actual = tree.min().key;
        assertEquals(expected, actual);
    }

    @Test
    public void max() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert("ab");
        tree.insert("abcd");
        tree.insert("a");

        String expected = "abcd";
        String actual = tree.max().key;
        assertEquals(expected, actual);
    }

    @Test
    public void successor() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert("g");
        tree.insert("q");
        tree.insert("d");
        tree.insert("t");
        tree.insert("j");

        String expected = "q";
        String actual = tree.successor(tree.search("j")).key;
        assertEquals(expected, actual);
    }

    @Test
    public void successorException() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert("g");
        tree.insert("q");
        tree.insert("d");
        tree.insert("t");
        tree.insert("j");

        String error_message = "Not found";
        assertThrows(RuntimeException.class, () -> tree.successor(tree.search("t")), error_message);
    }

    @Test
    public void predecessor() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert("g");
        tree.insert("q");
        tree.insert("d");
        tree.insert("t");
        tree.insert("j");

        String expected = "g";
        String actual = tree.predecessor(tree.search("j")).key;
        assertEquals(expected, actual);
    }

    @Test
    public void delete() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert("g");
        tree.insert("q");
        tree.insert("d");
        tree.insert("t");
        tree.insert("j");
        tree.insert("z");

        tree.delete("t");

        String expected = "z";
        String actual = tree.successor(tree.search("q")).key;
        assertEquals(expected, actual);
    }
}
