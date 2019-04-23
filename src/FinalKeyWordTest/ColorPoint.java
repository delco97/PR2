package FinalKeyWordTest;


class ColorPoint extends Point {
    private final String color;

    private ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public static void main(String[] args) {
        System.out.println(new ColorPoint(4, 2, "viola")); //[4,2]:null (use debug to check)
    }

    protected String makeName() {
        return super.makeName() + ":" + color;
    }

}
