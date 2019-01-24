package ga222gb_lab4.stack;

import java.util.Iterator;

public class ObjectArrayIterator implements Iterator<Object> {

    private int nextElement = 0;
    private final Object[] elements;
    private final int max;

    public ObjectArrayIterator(Object[] values, int size) {
        elements = values;
        max = size;
    }

    public boolean hasNext() {
        return nextElement < max;
    }

    public Object next() {
        return elements[nextElement++];
    }
}