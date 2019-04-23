package Esercitazione1.es2_GenericStack;

import java.util.ArrayList;

/**
 *
 */
public class GenericStack<E> implements IStack<E> {
    private ArrayList<E> stack = new ArrayList<>();


    GenericStack() {
    }

    @Override
    public int getSize() {
        return stack.size();
    }

    @Override
    public E peek() {
        return stack.isEmpty() ? null : stack.get(stack.size() - 1);
    }

    @Override
    public void push(E o) {
        stack.add(0, o);
    }

    @Override
    public E pop() {
        return stack.isEmpty() ? null : stack.remove(stack.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override // Override the toString in the Object class
    public String toString() {
        return stack.toString();
    }
}
