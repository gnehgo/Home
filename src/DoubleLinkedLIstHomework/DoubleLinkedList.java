package DoubleLinkedLIstHomework;

public class DoubleLinkedList <L> {

    private DoubleLinkedListElement head;
    private DoubleLinkedListElement tail;
    private int size;

    public DoubleLinkedList() {

        head = null;
        tail = null;
        size = 0;
    }

    public int size(){
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
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
    public void addLast(L data) {

        DoubleLinkedListElement tmp = new DoubleLinkedListElement(data, null, tail);
        if(tail != null) {
            tail.next = tmp;
        }
        tail = tmp;
        if(head == null) {
            head = tmp;
        }
        size++;
    }

    private void throwsException(){
        throw new ArithmeticException();
    }
    public void addBefore (L x, L y){
        if (isEmpty())
            throw new ArithmeticException(x.toString());
        DoubleLinkedListElement<L> current = head;
        while (current != null && !current.data.equals(x))
            current = current.next;
        if (current == null)
            throw new ArithmeticException(x.toString());
        DoubleLinkedListElement<L> tmp = new DoubleLinkedListElement<L>(current.prev, y, current);
        if (current.prev != null)
            current.prev.next = tmp;
        else head = tmp;
        current.prev = tmp;

        size++;
    }
    public void addAfter (L x, L y){
        if (isEmpty())
            throw new ArithmeticException(x.toString());
        DoubleLinkedListElement<L> current = head;
        while (current != null && !current.data.equals(x))
            current = current.next;
        if (current == null)
            throw new ArithmeticException(x.toString());
        DoubleLinkedListElement<L> tmp = new DoubleLinkedListElement<L>(current, y, current.next);
        if (current.next != null)
            current.next.prev = tmp;
        current.next = tmp;

        size++;
    }

}
