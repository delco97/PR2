package Esercitazione3_20171025;

import java.util.List;

public class SequenceList<E> extends Sequence<E> {
    /*
    OVERVIEW:
    Un oggetto SequenceList<E> è una sequenza finita di oggetti di tipo E. Una sequenza è caratterizzata dalla sua lunghezza (n)
    e i suoi elementi sono determinati dalla posizione a partire dalla posizione 0 fino alla posizione n-1.
    Abstract State:
       s = [x0,x1,...,xn-1]
    AF = [x0,x1,...,xn-1] dove Per ogni 0<= i < n => c.s.get(i) = a.s[i] &&
        c.s.size() = |s|
    IR = Per ogni 0 <= i < n => c.s.get(i) != null
    */

    List<E> s;

    /**
     * Restituisce la lunghezza della sequenza
     *
     * @return: the length of this
     */
    @Override
    public int length() {
        return s.size();
    }

    /**
     * restituisce la prima posizione nella sequenza il cui
     * elemento corrispondente è uguale a elem
     *
     * @requires: elem != null
     * @throws: elem = null => IllegalArgumentException (unchecked)
     * @return: elem in this => return 0 <= i < n
     * elem NOT in this => return -1
     */
    @Override
    public int indexOf(E elem) throws IllegalArgumentException {
        if (elem == null) throw new IllegalArgumentException("element in sequence cant' be null");
        return s.indexOf(elem);
    }

    /**
     * restituisce la prima posizione nella sequenza a partire dalla quale gli elementi
     * successivi formano la sequenza p_s
     *
     * @requires: p_s != null
     * @throws: elem = null => IllegalArgumentException (unchecked)
     * @return: s in this => return 0 <= i < n - s.lenght
     * elem NOT in this => return -1
     */
    @Override
    public int indexOfSlide(Sequence<E> p_s) throws IllegalArgumentException {
        if (p_s == null) throw new IllegalArgumentException("p_s cant' be null");
        if (s.size() == 0 || p_s.length() == 0 || p_s.length() > s.size()) return -1;

        int k = p_s.indexOf(s.get(0));

        for (int i = 0; i < length(); i++) {
            if (indexOfSlide(i, p_s)) return i;
        }
        return -1;
    }

    private boolean indexOfSlide(int i, Sequence<E> p_s) {

    }

    @Override
    public void update(int pos, E elem) throws IllegalArgumentException {

    }
}
