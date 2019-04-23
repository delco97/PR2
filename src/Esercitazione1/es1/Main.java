package Esercitazione1.es1;

import java.util.ArrayList;

class Main {

    private static ArrayList<Integer> compareArrList(ArrayList<String> al1, ArrayList<String> al2) {
        ArrayList<Integer> res = new ArrayList<>();
        if (al1 == null || al2 == null) return res;
        for (String s : al1) {
//            if (al2.contains(s))
//                res.add(1);
//            else
//                res.add(0);
            res.add(al2.contains(s) ? 1 : 0);
        }

        return res;
    }

    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        ArrayList<String> al2 = new ArrayList<>();
        System.out.println(compareArrList(al1, al2));
        al1.add("a");
        al1.add("b");
        al2.add("a");
        al2.add("b");
        System.out.println(compareArrList(al1, al2));
    }
}
