package Queue;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Iterator;

public class FixedSizeQueue<E> extends AbstractQueue<E> {
    final Object[] items;
    int count;

    public FixedSizeQueue(int capacity) {
        super();
        this.items = new Object[capacity];
        count=0;
    }

    @Override
    public Iterator<E> iterator() {
        return (Iterator<E>) Arrays.stream(items).iterator();
    }

    public void printCurrentQueue(){
        if (count != 0){

            for (Object item : items) {
                if(item!=null)
                    System.out.println(item);
            }
        }
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean offer(E e) {
        if(e==null)
            throw new NullPointerException("Queue can not insert null element");

        if(count == items.length)
            this.poll();

        this.items[count]=e;
        count++;

        return true;
    }

    @Override
    public E poll() {
        if (count <= 0)
            return null;

        E item = (E) items[0];
        shiftLeft();
        count--;

        return item;
    }

    @Override
    public E peek() {
        if (count <= 0)
            return null;

        return (E) items[0];
    }
    private void shiftLeft() {
        int i = 1;
        while (i < items.length) {
            if (items[i] == null) {
                break;
            }
            items[i - 1] = items[i];
            i++;
        }
    }
}
