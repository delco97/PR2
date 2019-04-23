package Arrays;

class Test {

    private static void test1() {
        String[][] names =
                {{"Mr. ", "Mrs. ", "Ms. "},
                        {"Smith", "Jones"}};
        // prints "Mr. Smith"
        System.out.println(names[0][0] + names[1][0]); // prints "Ms. Jones" System.out.println(names[0][2] + names[1][1]);
    }

    public static void main(String[] args) {
        test1();
    }

}
