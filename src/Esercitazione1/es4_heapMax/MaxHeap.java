package Esercitazione1.es4_heapMax;

import java.util.ArrayList;
import java.util.Collections;

public class MaxHeap<E extends Comparable<E>> {

    private ArrayList<E> a = new ArrayList<>();

    private int left(int i) {
        return (i >= 0 && i < a.size()) ? 2 * i + 1 : -1;
    }

    private int right(int i) {
        return (i >= 0 && i < a.size()) ? 2 * i + 2 : -1;
    }

    private int parent(int i) {
        return (i > 0 && i < a.size()) ? (i - 1) / 2 : -1;
    }

    /**
     * Restore the Max Heap property starting from node i.
     * It assumes that the 2 sub heap ingrained in left(i) satisfy the max heap property
     *
     * @param i refers to a heap node.
     * @throws ArrayIndexOutOfBoundsException if the index is out of bound (i< 0 || i >= a.size())
     */
    private void Maxheapify(int i) throws ArrayIndexOutOfBoundsException {
        if (i < 0 || i >= a.size())
            throw new ArrayIndexOutOfBoundsException("Position " + i + "must be in [0;a.size] = [0;" + a.size() + "]");
        int l = left(i);
        int r = right(i);
        int max_index;
        //Which node has the max value?
        if (l < a.size() && a.get(l).compareTo(a.get(i)) > 0) max_index = l;
        else max_index = i;
        if (r < a.size() && a.get(r).compareTo(a.get(max_index)) < 0) max_index = r;
        if (max_index != i) {
            Collections.swap(a, i, max_index);
            Maxheapify(max_index);
        }
    }


    public ArrayList<E> getArrayList() {
        return a;
    }

    /**
     * Add a new object into the heap
     */
    public void add(E newObject) {
        int i;
        a.add(newObject);
        i = a.size() - 1;
        //Max heap prop could be broken above
        while (i > 0 && a.get(parent(i)).compareTo(a.get(i)) < 0) {
            Collections.swap(a, parent(i), i);
            i = parent(i);
        }

    }

    /**
     * Remove the root from the heap
     */
    public E remove() {
        if (a.size() == 0) throw new RuntimeException("Heap is empty.");
        E max = a.remove(0);
        a.add(0, a.remove(a.size() - 1));
        Maxheapify(0);
        return max;
    }

    /**
     * Get the number of nodes in the heap
     */
    public int getSize() {
        return a.size();
    }

    @Override
    /** Override the proctected clone method defined in the Object class */
    public Object clone() throws CloneNotSupportedException {
        // Assign the shallow copy to new refernce variable t
        MaxHeap t = (MaxHeap) super.clone();
        t.a = (ArrayList<E>) a.clone();
        // Create a new object for the field c
        // and assign it to shallow copy obtained,
        // to make it a deep copy
        return t;
    }

    @Override
    /**
     * Override the equals method in the Object class
     */
    public boolean equals(Object other) {
        if (!(other instanceof MaxHeap)) return false;
        return ((MaxHeap) other).a.equals(a);
    }


}
