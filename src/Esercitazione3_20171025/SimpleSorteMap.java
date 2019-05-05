package Esercitazione3_20171025;

import java.util.Set;

public interface SimpleSorteMap<K, V> {
    /**
     * OVERVIEW:
     * Una SimpleMap rappresenta una funzione parziale mutabile che mappa elementi di un dominio K
     * su un codominio V. (funzione parziale significa che per alcuni valori k del dom K f(k) = null)
     * Abstract State: f: K -> V
     */

    /**
     * @modifies: this
     * @effects: Associa il valore value alla chiave key di this (f(key) = value)
     * @return: restituisce il valore precedentemente associato a key se questo esisteva, e null altrimenti (return this_pre.f(key))
     */
    V put(K key, V value);

    /**
     * @return: Restituisce il valore associato alla chiave key di this se questo esiste, e null altrimenti; (f(key))
     */
    V get(K key);

    /**
     * @return: restituisce l'inseieme K' delle chiavi a cui e' associato un valore.
     * K' = {k appartenente a K | f(k) != null}
     */
    Set<K> keySet();

    /**
     * @return: restituisce l'inseieme K' delle chiavi a cui e' associato un valore.
     * K' = {k appartenente a K | f(k) != null}
     */
    K lastKey();


}
