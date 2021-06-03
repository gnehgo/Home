package Code;

public class DynamicArray <T> {
    public void throwException(){
    throw new ArithmeticException("Зачем ломаешь");

    }
    private final int DEFAULT_SIZE = 10;
    private final int DEFAULT_RATE = 2;
    private T[] array;
    public DynamicArray(){
        array = (T[])new Object[DEFAULT_SIZE];
    }

    public DynamicArray(int firstSize){
        if (firstSize > -1) {
            array = (T[]) new Object[firstSize];
        }
        else {array = (T[])new Object[DEFAULT_SIZE];}
    }

    public int size(){
        int number = 0;
        for(int i = 0; i < capacity(); i++){
            if(array[i] != null){
                number = i;
            }}
        return number + 1;
    }

    public int capacity(){
        return array.length;
    }

    public T get(int index){
        if(capacity() <=index | index < 0){throwException();}
        return array[index];
    }

    public void set(int index,T value){
        if(capacity() <=index | index < 0){throwException();}
        array[index] = value;
    }

    public void resize(int newSize){
        if (newSize < 0){throwException();}
        T[] newArray = array.clone();
        array = (T[])new Object[newSize];
        for(int i = 0; i < newSize; i++) {
            for (i = 0; i < Math.min(newSize, newArray.length); i++) {
                array[i] = newArray[i];
            }
        }
    }
    
    public int findFirst(T value){
        for(int i = 0; i < capacity(); i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }

    public int findLast(T value){
        for(int i = capacity() - 1; i > -1; i--){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }

    public void add(T value){
        int count = 0;
        if (size() >= capacity()) {
            resize(capacity() * DEFAULT_RATE + 1);
        }
        set(size(), value);
    }

    public void insert(int index, T value){
        if(index < 0){throwException();}
        int number = -1;
        if(index >= capacity()){resize(index + 1);}
        if(array[index] == null){
            array[index] = value;
        }
        else{
            int oldSize = capacity();
            for(int i = 0; i < capacity(); i++){
                if(array[i] != null){
                    number = i;
                }
            }
            if (number == size() - 1) {
                resize(size() * DEFAULT_RATE + 1);
            }
            for (int i = oldSize; i > index; i--){
                array[i] = array[i - 1];
            }
            array[index] = value;
        }
    }


}
