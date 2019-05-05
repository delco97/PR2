package Esercitazione3_20171025;

import java.util.List;

public class LimitedTwoListsSSMap<K extends Comparable<K>, V> extends TwoListsSSMap<K, V> {
    // Overview: Tipo modificabile delle funzioni parziali con dominio un ordine totale K
    // e codominio V, definite solo su un sottoinsieme finito di K
    // AF = f: K -> V tale che f(keys.get(i)) = values.get(i) per 0 <= i < dim, e
    //      indefinito altrimenti && |K| <= keys_limit
    // IR = keys_limit => 0

    private int keys_limit;

    public LimitedTwoListsSSMap(int p_keys_limit) {
        super();
        if (p_keys_limit < 0) throw new IllegalArgumentException();
        keys_limit = p_keys_limit;
    }

    public LimitedTwoListsSSMap(int p_keys_limit, List<? extends K> lstK, List<? extends V> lstV) {
        super(lstK, lstV);
        if (p_keys_limit < 0) throw new IllegalArgumentException();
        keys_limit = p_keys_limit;
    }
    /*
     REQUIRES: collK != null && collV != null && collK.size() = collK.size()
     THROWS: se collK = null o collV = null lancia una NullPointerException
             (eccezione disponibile in Java, unchecked)
     MODIFIES: dim, keys, values
     EFFECTS: inizializza keys e values con i valori di lstK e lstV, rispettivamente
     */

    public V put(K key, V value) throws NullPointerException {
        if (super.size() == keys_limit) throw new IllegalStateException();
        return super.put(key, value);
    }

}
