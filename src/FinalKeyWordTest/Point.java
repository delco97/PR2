package FinalKeyWordTest;

/**
 * La parola chiave final vincola l'inizializzazione degli attributi
 * al solo costruttore della super classe. Quindi x,y dopo essere stati inizializzati
 * in nel costruttore di Point non potranno essere jpiù modificati all'interno di Point e neanche
 * in eventulai classi che estendono Point. La stessa cosa vale per i metodi: un metodo final non può essere
 * sovrascritto da una classe che eredita Point
 */
class Point {

    private final int x, y;
    private final String name;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
        name = makeName();
    }

    String makeName() {
        return "[" + x + ", " + y + "]";
    }

    public final String toString() {
        return name;
    }
}