package Code;

public class DynamicArray <T> {
    public void throwException(){
    throw new ArithmeticException("Зачем ломаешь");

    }
    private final int DEFAULT_SIZE = 10;
    private T[] array;

    public DynamicArray(){
        array = (T[])new Object[DEFAULT_SIZE];
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
        for(int i = 0; i < newSize; i++){
            array[i] = newArray[i];
        }
    }
    


}
