package cz.upce.bdats.ds;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class PriorityQueue<T extends Comparable<T>> implements IPriorityQueue<T> {
    private class PQIterator implements Iterator<T> {
        private IBinaryTree<T, T> itTree = new BinaryTree<>();

        private PQIterator() {
            try {
                Iterator<T> it = tree.iterator(IterationType.BREADTH);
                while (it.hasNext()) {
                    T data = it.next();
                    // System.out.println(data);
                    itTree.add(data, data);
                }
            } catch (Exception e) {}
        }

        @Override
        public boolean hasNext() {
            return !itTree.isEmpty();
        }

        @Override
        public T next() {
            try {
                T data = itTree.min();
                // System.out.println(data);
                return itTree.remove(data);
            } catch (Exception e) {
                throw new NoSuchElementException(e);
            }
        }
    }

    // --- Atributy
    private final IBinaryTree<T, T> tree = new BinaryTree<>();

    // --- Konstruktor
    public PriorityQueue() {}

    public PriorityQueue(T[] data) throws Exception {
        for (int i = 0; i < data.length; i++) {
            this.add(data[i]);
        }
    }

    // --- Metody rozhraní IPriorityQueue
    @Override
    public void clear() {
        tree.clear();
    }

    @Override
    public boolean isEmpty() {
        return tree.isEmpty();
    }

    @Override
    public void add(T data) throws Exception {
        tree.add(data, data);
    }

    @Override
    public T access() throws Exception {
        return tree.min();
    }

    @Override
    public T popMax() throws Exception {
        return tree.remove(tree.min());
    }

    @Override
    public Iterator<T> iterator() {
        return new PQIterator();
    }

}
