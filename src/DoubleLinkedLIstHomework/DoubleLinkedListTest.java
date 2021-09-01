package DoubleLinkedLIstHomework;

       import  DoubleLinkedLIstHomework.DoubleLinkedList;
       import org.junit.jupiter.api.Test;
       import org.junit.jupiter.api.Assertions;

        public class DoubleLinkedListTest {

            @Test
            public void testIsEmptyReturnsTrue() {
                DoubleLinkedList<Integer> doublelist = new DoubleLinkedList<Integer>();
                Assertions.assertTrue(doublelist.isEmpty());
            }

            @Test
            public void testIsEmptySizeZero() {
                DoubleLinkedList<Integer> doublelist = new DoubleLinkedList<Integer>();
                Assertions.assertEquals(0, doublelist.size());
            }
            @Test
            public void testAddHead() {
                DoubleLinkedList<Integer> doublelist = new DoubleLinkedList<Integer>();
                for (int i = 0; i < 5; i++) {
                    doublelist.addHead(i);
                }
                Assertions.assertEquals(4, doublelist.getData(0));
            }

            @Test
            public void testAddTail(){
                DoubleLinkedList<Integer> doublelist = new DoubleLinkedList<Integer>();
                for (int i = 0; i < 5; i++) {
                    doublelist.addTail(i);
                }
                Assertions.assertEquals(3, doublelist.getData(3));
            }

        }
//
