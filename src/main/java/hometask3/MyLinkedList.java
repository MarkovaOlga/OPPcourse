package hometask3;

import java.util.Iterator;

public class MyLinkedList <E> implements Iterable<E> {
    private int size = 0;
    private Element<E> first;
    private Element<E> last;

    private static class Element<E> {
        Element<E> previous;
        E element;
        Element<E> next;

        public Element(Element<E> previous, E element, Element<E> next) {
            this.previous = previous;
            this.element = element;
            this.next = next;
        }
    }
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Element<E> current = first;

            @Override
            public boolean hasNext() {
                return current != null;
            }
            @Override
            public E next() {
                E element = current.element;
                current = current.next;
                return element;
            }
        };
    }
    public void add(E element) {
        Element<E> newElem = new Element<>(null, element, null);
        if (first == null) {
            first = newElem;
        } else {
            newElem.previous = last;
            last.next = newElem;
        }
        last = newElem;
        size++;
    }
    public void addFirst(E element) {
        Element<E> f = first;
        Element<E> newElem = new Element<>(null, element, f);
        first = newElem;
        if (f == null) {
            last = newElem;
        } else {
            f.previous = newElem;
        }
        size++;
    }
    public void addLast(E element) {
        Element<E> l = last;
        Element<E> newElem = new Element<>(l, element, null);
        last = newElem;
        if (l == null) {
            first = newElem;
        } else {
            l.next = newElem;
        }
        size++;
    }
    public int size() {
        return size;
    }

    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    public E remove(int index) {
        isPositionIndex(index);
        Element<E> elem = element(index);
        if (elem == first) {
            first = elem.next;
            first.previous = null;
        } else if (elem == last) {
            last = elem.previous;
            last.next = null;
        } else {
            Element<E> previousElem = elem.previous;
            Element<E> nextElem = elem.next;
            previousElem.next = nextElem;
            nextElem.previous = previousElem;
        }
        size--;
        return elem.element;
    }
    Element<E> element(int index) {
        Element<E> x;
        if (index < (size >> 1)) {
            x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
        } else {
            x = last;
            for (int i = size - 1; i > index; i--)
                x = x.previous;
        }
        return x;
    }
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }
    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Element<E> x = first; x != null; x = x.next) {
                if (x.element == null)
                    return index;
                index++;
            }
        } else {
            for (Element<E> x = first; x != null; x = x.next) {
                if (o.equals(x.element))
                    return index;
                index++;
            }
        }
        return -1;
    }
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }
    public E get(int index){
        isPositionIndex(index);
        Element<E> elem = element(index);
        return elem.element;
    }
    public void set(E value, int index) {
        isPositionIndex(index);
        Element<E> elem = element(index);
        elem.element = value;
    }
}
