package Esercitazione3_20171025;

public abstract class Sequence<E> {
    /*
    OVERVIEW:
    Un oggetto Sequence<E> è una sequenza finita di oggetti di tipo E. Una sequenza è caratterizzata dalla sua lunghezza (n)
    e i suoi elementi sono determinati dalla posizione a partire dalla posizione 0 fino alla posizione n-1.
    Abstract State:
        [x0,x1,...,xn-1]
     */


    /**
     * Restituisce la lunghezza della sequenza
     *
     * @return: the length of this
     */
    public abstract int length();

    /**
     * restituisce la prima posizione nella sequenza il cui
     * elemento corrispondente è uguale a elem
     *
     * @requires: elem != null
     * @throws: elem = null => IllegalArgumentException (unchecked)
     * @return: elem in this => return 0 <= i < n
     * elem NOT in this => return -1
     */
    public abstract int indexOf(E elem) throws IllegalArgumentException;

    /**
     * restituisce la prima posizione nella sequenza a partire dalla quale gli elementi
     * successivi formano la sequenza s
     *
     * @requires: s != null
     * @throws: elem = null => IllegalArgumentException (unchecked)
     * @return: s in this => return 0 <= i < n - s.lenght
     * elem NOT in this => return -1
     */
    public abstract int indexOfSlide(Sequence<E> s) throws IllegalArgumentException;

    /**
     * modifica la sequenza inserendo alla posizione pos l’oggetto elem
     *
     * @requires: elem != null && 0 <= pos < n
     * @throws: elem = null || (pos < 0 || pos >= n) => IllegalArgumentException (unchecked)
     * @modifies: this
     * @effects: this_post contiene elm in posizione pos
     */
    public abstract void update(int pos, E elem) throws IllegalArgumentException;

    /**
     * controlla se la sequenza iniziale coincide con il parametro s
     *
     * @requires: s != null
     * @throws: elem = null => IllegalArgumentException (unchecked)
     * @return: indexOfSlide(s) == 0
     */
    public boolean checkInitial(Sequence<E> s) {
        return indexOfSlide(s) == 0;
    }
}
