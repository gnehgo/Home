package DoubleLinkedLIstHomework;

public class DoubleLinkedListElement <L> {

    L data;
    DoubleLinkedListElement<L> next;
    DoubleLinkedListElement<L> prev;

    public DoubleLinkedListElement(L data, DoubleLinkedListElement<L> next, DoubleLinkedListElement<L> prev){
        this.data = data;
        this.next = next;
        this.prev = prev;

    }

}