package Tests;

import Code.DynamicArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DynamicArrayTest extends Assertions {
    @Test
    public void TestSet (){
        DynamicArray dynamicArray = new DynamicArray();
        assertThrows(ArithmeticException.class, () -> dynamicArray.set(-1, 5));
        assertThrows(ArithmeticException.class, () -> dynamicArray.set(10, 18));
    }

    @Test
    public void TestResizeAndSize (){
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.resize(1);
        assertEquals(1, dynamicArray.capacity());
    }

    @Test
    public void TestSetAndGet(){
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.resize(1);
        dynamicArray.set(0, 5);
        assertEquals(5, dynamicArray.get(0));
    }

    @Test
    public void TestResize(){
        DynamicArray dynamicArray = new DynamicArray();
        assertThrows(ArithmeticException.class, () -> dynamicArray.resize(-1));
    }

    @Test
    public void TestGet(){
        DynamicArray dynamicArray = new DynamicArray();
        assertThrows(ArithmeticException.class, () -> dynamicArray.resize(-1));
        assertThrows(ArithmeticException.class, () -> dynamicArray.get(10));
    }
    @Test
    public void TestWith(){
        DynamicArray dynamicArray = new DynamicArray(5);
        assertEquals(5, dynamicArray.capacity());
    }
    @Test
        public void TestWithout() {
        DynamicArray dynamicArray = new DynamicArray(-5);
        assertEquals(10, dynamicArray.capacity());
    }
    @Test
    public void TestFindFirstF(){
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.resize(3);
        dynamicArray.set(0, 5);
        dynamicArray.set(1, 2);
        dynamicArray.set(2, 5);
        assertEquals(0, dynamicArray.findFirst(5));
    }
    @Test
    public void TestFindFirstS(){
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.resize(3);
        dynamicArray.set(0, 5);
        dynamicArray.set(1, 2);
        dynamicArray.set(2, 5);
        assertEquals(-1, dynamicArray.findFirst(3));
    }
    @Test
    public void TestFindF(){
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.resize(3);
        dynamicArray.set(0, 5);
        dynamicArray.set(1, 2);
        dynamicArray.set(2, 5);
        assertEquals(2, dynamicArray.findLast(5));
    }

    @Test
    public void TestFindS(){
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.resize(3);
        dynamicArray.set(0, 5);
        dynamicArray.set(1, 2);
        dynamicArray.set(2, 5);
        assertEquals(-1, dynamicArray.findFirst(3));
    }
    @Test
    public void TestInsert(){
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.resize(3);
        dynamicArray.set(0, 5);
        dynamicArray.set(2, 5);
        assertNull(dynamicArray.get(1));
        dynamicArray.insert(1, 5);
        dynamicArray.insert(2,28);
        dynamicArray.insert(28,999999);
        assertEquals(5, dynamicArray.get(1));
        assertEquals(28, dynamicArray.get(2));
        assertEquals(5, dynamicArray.get(3));
        assertEquals(999999, dynamicArray.get(28));
        assertEquals(29, dynamicArray.capacity());
        assertThrows(ArithmeticException.class, () -> dynamicArray.insert(-1, 5));
    }
    @Test
    public void TestAdd(){
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.resize(4);
        dynamicArray.set(0, 5);
        dynamicArray.set(2, 5);
        dynamicArray.add(3);
        dynamicArray.add(4);
        assertEquals(3, dynamicArray.get(3));
        assertEquals(4, dynamicArray.get(4));
        assertEquals(8, dynamicArray.size());
        assertNull(dynamicArray.get(7));
    }


}


