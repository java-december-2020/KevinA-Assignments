public class Main {
    public static void main(String[] args) {
        StringManipulator stringManipulator = new StringManipulator();
        String result = stringManipulator.trimAndConcat("      Hello       ", "        World          ");
        System.out.println(result);


        char letter = 'o';
        Integer a1 = stringManipulator.getIndexOrNull("Coding", letter);
        Integer b1 = stringManipulator.getIndexOrNull("Hello World", letter);
        Integer c1 = stringManipulator.getIndexOrNull("Hi", letter);
        System.out.println(a1); // 1
        System.out.println(b1); // 4
        System.out.println(c1); // null


        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer a = stringManipulator.getIndexOrNulls(word, subString);
        Integer b = stringManipulator.getIndexOrNulls(word, notSubString);
        System.out.println(a); // 2
        System.out.println(b); // null



        String words = stringManipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(words); // eworld

    }
}
