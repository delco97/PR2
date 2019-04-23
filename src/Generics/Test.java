package Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Test {
    /**
     * Naive use of generic.
     * Remember that in general, if Foo is a subtype (subclass or subinterface) of Bar, and G is some
     * generic type declaration, it is not the case that G<Foo> is a subtype of G<Bar>.
     * So in this case, I wouldn't be able to pass a Collection<Pippo> to this method for example. (Obviously Pippo could be any class )
     *
     * @param c
     */
    public static void printCollection(Collection<Object> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        //List<Object> lo = ls; //Compile error should seem strange.
        //**********
        Collection<Integer> ca = new ArrayList<Integer>();
        ca.add(1);
        //printCollection(ca); //Error:(27, 25) java: incompatible types: java.util.Collection<java.lang.Integer> cannot be converted to java.util.Collection<java.lang.Object>
        //**********
        Collection<?> c = new ArrayList<String>();
        //c.add(new Object());//Error:(32, 15) java: incompatible types: java.lang.Object cannot be converted to capture#1 of ?))
        c.add(null); //The sole exception because is a member of every type.
    }
}
