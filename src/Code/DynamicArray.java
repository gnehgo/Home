package Code;

public class DynamicArray {
public class DynamicArray <T> {
    public void throwException(){
    throw new ArithmeticException("Зачем ломаешь");

    }
    private final int DEFAULT_SIZE = 10;
    private T[] array;

    public DynamicArray(){
        array = (T[])new Object[DEFAULT_SIZE];
    }
}
