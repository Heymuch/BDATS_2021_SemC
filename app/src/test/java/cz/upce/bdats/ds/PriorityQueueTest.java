package cz.upce.bdats.ds;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Iterator;


public class PriorityQueueTest {
    @Test
    public void iteratorTest() throws Exception {
        IPriorityQueue<Integer> pq = new PriorityQueue<>(new Integer[] {3, 2, 4, 1, 5});
        Iterator<Integer> it = pq.iterator();

        System.out.println("START");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("END");
    }

    @Test
    public void iteratorTest2() throws Exception {
        IPriorityQueue<Integer> pq = new PriorityQueue<>(new Integer[] {1, 2, 3, 4, 5});
        Iterator<Integer> it = pq.iterator();

        System.out.println("START");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("END");
    }
}
