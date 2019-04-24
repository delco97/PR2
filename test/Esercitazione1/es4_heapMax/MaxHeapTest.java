package Esercitazione1.es4_heapMax;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxHeapTest {

    @Test
    void add() {
        MaxHeap<Integer> h = new MaxHeap<>();
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(6);
        h.add(8);
        h.add(9);
        h.add(10);
        h.add(2);
        h.add(1);
        h.add(0);
        assertEquals(new ArrayList<>(Arrays.asList(10, 6, 9, 3, 5, 4, 8, 2, 1, 0)), h.getArrayList());
    }

    @Test
    void remove() {
        MaxHeap<Integer> h = new MaxHeap<>();
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(6);
        h.add(8);
        h.add(9);
        h.add(10);
        h.add(2);
        h.add(1);
        h.add(0);
        assertEquals(10, h.remove());
    }

    @Test
    void getSize() {
        MaxHeap<Integer> h = new MaxHeap<>();
        assertEquals(0, h.getSize());
        h.add(3);
        h.add(4);
        h.add(5);
        assertEquals(3, h.getSize());
    }
}