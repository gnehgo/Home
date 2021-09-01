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

    public DoubleLinkedListElement(DoubleLinkedListElement<L> prev, L y, DoubleLinkedListElement<L> current) {
    }

    public DoubleLinkedListElement getNextElement(){
        return next;
    }
    public DoubleLinkedListElement getPrevElement(){
        return prev;
    }

    public void setNextElement(DoubleLinkedListElement next){
        this.next = next;
    }

    public void setPrevElement(){
        this.prev = prev;
    }


    public L getData(){
        return data;
    }


}