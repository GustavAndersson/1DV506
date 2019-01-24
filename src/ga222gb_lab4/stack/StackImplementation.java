package ga222gb_lab4.stack;

import java.util.EmptyStackException;
import java.util.Iterator;

public class StackImplementation implements Stack{
    private int length = 4;
    private int size = 0;
    private Object[] elements = new Object[length];

    public void push(Object element){
        if(size == length){
            resize();
        }
        elements[size++] = element;
    }

    private void resize(){
        length = 2 * length;
        Object[] tmp = new Object[length];
        for(int i = 0; i < size; i++){
            tmp[i] = elements[i];
        }
        elements = tmp;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }

    public Object pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Object element = elements[size - 1];
        elements[size - 1] = null;
        size--;
        return element;
    }

    public Object peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return elements[size - 1];
    }

    public Iterator<Object> iterator(){
        return new ObjectArrayIterator(elements, size);
    }
}
