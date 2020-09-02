package testArray;

import javax.swing.*;
import java.util.*;

public class MyArrayList implements List {

    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_ELEMENTDATA = new Object[0];
    private Object[] array = new Object[DEFAULT_CAPACITY];
    private int index = 0;

    public MyArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity >= 0) {
            this.elements = new Object[initialCapacity];
        } else {
            throw new IllegalStateException("Capacity can't be less than 0!");
        }
        this.elements = EMPTY_ELEMENTDATA;
    }

    public Object get(int index) {
        isIndexExist(index);
        return elements[index];
    }

    @Override
    public Object set(int index, Object object) {
        isIndexExist(index);
        Object temp = elements[index];
        elements[index] = object;
        return temp;
    }

    @Override
    public void add(int index, Object o) {
        if (index > size || index < 0){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
        }
        System.arraycopy(elements, index, elements, index + 1, size - index);
        if (isIndexExist(index) <= size){
            increaseCapacity();
        }
        elements[index] = o;
        size++;
    }

    public int size() {
        return size;
    }

    public boolean add(Object value) {
        if (size == elements.length) {
            elements = increaseCapacity();
        }
        elements[size] = value;
        size++;
        return true;
    }

    private Object[] increaseCapacity() {
        Object[] temp = new Object[(elements.length * 2)];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        return temp;
    }

    private int isIndexExist(int index) { //перевірка індексів, чи не виходять вони за грані масиву
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Element can't be found! "
                    + "Number of elements in array = " + size
                    + ". Total size of array = " + elements.length);
        }
        return index;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(Object o) {
        Object[] temp = this.elements;
        if (o != null) {
            for (int i = 0; i < size; i++) {
                if (o.equals(temp[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] objects) {
        return new Object[0];
    }

    @Override
    public boolean remove(Object o) {
        Object[] temp = this.elements;
        int size = this.size;
        int i = 0;
        if (o == null) {
            temp[i] = null;
            i++;

            System.arraycopy(temp, 0, elements, 0, i);
            System.arraycopy(temp, i + 1, elements, i, temp.length - i - 1);
            --size;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection collection) {
        for (Object o : collection) {
            add(o);
        }
        return true;
    }

    @Override
    public boolean addAll(int i, Collection collection) {
        return false;
    }


    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection collection) {
        for (Object o : collection) {
            if (o != null) {
                remove(o);
            }
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection collection) {
        for (Object o : collection) {
            if (o != null) {
                if (!contains(o)) {
                    return false;
                }
            }
        }
        return true;
    }

    public Object remove(int index) {
        isIndexExist(index);
        Object[] temp = elements;
        elements = new Object[temp.length - 1];
        Object value = temp[index];
        System.arraycopy(temp, 0, elements, 0, index);
        System.arraycopy(temp, index + 1, elements, index, temp.length - index - 1);
        size--;
        return value;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int i) {
        return null;
    }

    @Override
    public List subList(int i, int i1) {
        return null;
    }
}
