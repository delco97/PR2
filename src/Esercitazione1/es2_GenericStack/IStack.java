package Esercitazione1.es2_GenericStack;

interface IStack<E> {
    /**
     * Return the number of elements in the stack
     */
    int getSize();

    /**
     * Return the top element from the stack
     */
    E peek();

    /**
     * Push a new element to the top of the stack
     */
    void push(E o);

    /**
     * Return and remove the top element from the stack
     */
    E pop();

    /**
     * Test whether the stack is empty
     */
    boolean isEmpty();

}
