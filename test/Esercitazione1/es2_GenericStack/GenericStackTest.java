package Esercitazione1.es2_GenericStack;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenericStackTest {

    @Test
    void getSize() {
        GenericStack<Integer> s = new GenericStack<>();
        assertEquals(0, s.getSize());
        s.push(1);
        assertEquals(1, s.getSize());
        s.peek();
        assertEquals(1, s.getSize());
        s.pop();
        assertEquals(0, s.getSize());
    }

    @Test
    void peek() {
        GenericStack<Integer> s = new GenericStack<>();
        assertEquals(null, s.peek());
        s.push(1);
        assertEquals(1, s.peek());
        s.push(2);
        assertEquals(1, s.peek());
        s.push(3);
        assertEquals(1, s.peek());
        s.pop();
        assertEquals(2, s.peek());
    }

    @Test
    void push() {
        GenericStack<Integer> s = new GenericStack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        assertEquals(1, s.pop());
        assertEquals(2, s.pop());
        assertEquals(3, s.pop());
        assertEquals(null, s.pop());
    }

    @Test
    void pop() {
        GenericStack<Integer> s = new GenericStack<>();
        assertEquals(null, s.pop());
        s.push(1);
        s.push(2);
        s.push(3);
        assertEquals(1, s.pop());
        assertEquals(2, s.pop());
        assertEquals(3, s.pop());
        assertEquals(null, s.pop());
    }

    @Test
    void isEmpty() {
        GenericStack<Integer> s = new GenericStack<>();
        assertEquals(true, s.isEmpty());
        assertEquals(true, s.isEmpty());
    }

    @Test
    void toString1() {
        GenericStack<Integer> s = new GenericStack<>();
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(3, 2, 1));
        s.push(1);
        s.push(2);
        s.push(3);
        assertEquals(a.toString(), s.toString());
    }
}