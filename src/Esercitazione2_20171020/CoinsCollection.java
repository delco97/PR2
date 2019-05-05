package Esercitazione2_20171020;

public interface CoinsCollection {
    /**
     * OVERVIEW:
     * CoinsCollection è una collezione di monete del valore di 50 centesimi, 1 o 2 euro.
     * Un valore tipico è (Abstract State):
     * [v1 *50C, v2 *1E, v3 *2E]
     * dove v1, v2 e v3 sono valori interi maggiori di zero.
     */

    void createCC();

    /**
     * @modifies: this
     * @effects: inizializza this a una CoinsCollection vuota
     */

    void addCoin(Integer coin) throws IllegalArgumentException;

    /**
     * @modifies: this
     * @effects: inserisce la moneta di valore coin nella collezione, se coin e
     * in {50, 100, 200}
     * @throws: . Se coin = null o ha valore diverso, lancia una
     * IllegalArgumentException (eccezione disponibile in Java, unchecked).
     */

    int balance();

    /**
     * @effects: restituisce il valore totale della collezione, in centesimi di Euro.
     */

    CoinsCollection makeChange(Integer amount) throws IllegalArgumentException, NoChangeException;
    /**
     *  @mofifes: this
     *  @effects: Restituisce, se possibile, una CoinsCollection con un valore totale
     *  uguale a amount, togliendo le monete corrispondenti da this.
     *  @throws Se amount < 0,  amount > balance() o amount % 50 != 0 lancia una IllegalArgumentException.
     *  Se 0 < amount < balance() ma il cambio non e' possibile (es: this contiene solo
     *  una moneta da 1E, e amount = 50) lancia una NoChangeException, checked.
     */


}
