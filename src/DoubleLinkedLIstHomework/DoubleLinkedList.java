package DoubleLinkedLIstHomework;

public class DoubleLinkedList <L> {

    private DoubleLinkedListElement head;
    private DoubleLinkedListElement tail;
    private int size;

    public DoubleLinkedList() {

        head = null;
        tail = null;}
        public void addFirst(L data) {
            DoubleLinkedListElement tmp = new DoubleLinkedListElement(data, head, null);
            if(head != null ) {
                head.prev = tmp;
            }
            head = tmp;
            if(tail == null) {
                tail = tmp;
            }
            size++;
        }
    }
