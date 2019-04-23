package Exceptions;

//Estende la classe Exception => Eccezione checked
class NuovoTipoEcc extends Exception {
    public NuovoTipoEcc(String s) {
        super(s);
    }
}
