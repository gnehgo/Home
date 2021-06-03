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
        return array.length;
    }
    
    public T get(int index){
        if(size() <=index | index < 0){throwException();}
        return array[index];
    }

    public void set(int index,T value){
        if(size() <=index | index < 0){throwException();}
        array[index] = value;
    }
}
