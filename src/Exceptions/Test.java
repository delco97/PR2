package Exceptions;

class Test {


    private static void test1() {
        throw new Error("Errore a caso 1");
    }

    private static void test2() {
        throw new RuntimeException("Errore a caso 2");
    }

    private static void test3() throws Exception {
        //Exception è una classe Chekcked, percui deve essere obbligatoriamente gestita nell'header:
        // 1 - Deve essere messo throws Exception nell'header
        // 2 - Try catch intorno al codice che può generare l'eccezione checked
        throw new Exception("Errore a caso 3");
    }

    public static void main(String[] args) {
        test1(); //Non necessaria la gestione dell'ecezione perché di tipo unchecked
        test2(); //Non necessaria la gestione dell'ecezione perché di tipo unchecked
        try {
            test3();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
