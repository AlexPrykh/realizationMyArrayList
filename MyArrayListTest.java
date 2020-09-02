package testArray;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    MyArrayList list = new MyArrayList();

    @Test
    void get() {
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(list.get(0), 1);
        assertEquals(list.get(1), 2);
        assertEquals(list.get(2),3);
    }

    @Test
    void set() {
        list.add(1);
        list.add(2);
        list.add(3);

        list.set(1,4);

        assertEquals(list.get(0),1);
        assertEquals(list.get(1), 4);
        assertEquals(list.get(2), 3);
    }

    @Test
    void add() {
        list.add(1);
        assertEquals(list.size(), 1);
    }

    @Test
    void size() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertEquals(list.size(), 5);
    }

    @Test
    void contains() {
        MyArrayList list = new MyArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        Assert.assertTrue(list.contains(1));
        Assert.assertTrue(list.contains(2));
        Assert.assertTrue(list.contains(3));
    }

    @Test
    void remove() {
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(list.size(), 3);
        list.remove(1);
        assertEquals(list.size(), 2);
    }

    @Test
    void addAll() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.addAll(4, list);
        assertEquals(list.size(),4);
    }

    @Test
    void removeAll() {
        MyArrayList list1 = new MyArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        Assert.assertTrue(list.removeAll(list1));
    }

    @Test
    void containsAll() {
        MyArrayList actual = new MyArrayList();
        actual.add(1);
        actual.add(2);
        actual.add(3);

        MyArrayList expected = new MyArrayList();
        expected.add(1);
        expected.add(2);
        expected.add(3);

        assertNotNull(actual);
        assertNotNull(expected);
        Assert.assertTrue(actual.containsAll(expected));
        Assert.assertNotSame(expected, actual);
    }
}