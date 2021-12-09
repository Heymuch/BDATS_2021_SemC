package cz.upce.bdats.ds;

import java.util.Iterator;

public interface IPriorityQueue<T extends Comparable<T>> extends Iterable<T> {
    // zrušení prioritní fronty
    void clear();

    // test naplněnosti prioritní fronty
    boolean isEmpty();

    // vložení prvku do prioritní fronty
    void add(T data) throws Exception;

    // odebrání prvku z prioritní fronty s maximální prioritou
    T popMax() throws Exception;

    // zpřístupnění prvku z prioritní fronty s maximální prioritou
    T access() throws Exception;

    // vytvoří iterátor prioritní fronty
    Iterator<T> iterator();
}
