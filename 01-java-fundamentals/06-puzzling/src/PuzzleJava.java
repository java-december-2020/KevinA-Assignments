import java.util.*;


public class PuzzleJava {

    public void array() {
        int[] myArray = {3, 5, 1, 2, 7, 9, 8, 13, 25, 32};

        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
//            sum +=myArray[i];
//            System.out.println(sum);

            if (myArray[i] > 10) {
                System.out.println(myArray[i]);
            }
        }

    }

    public void getArrayPerson() {
        List<String> names = new ArrayList<>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");

        Collections.shuffle(names);
        for (String person : names) {
            System.out.println(person);
        }

    }

    public void generateArray() {
        List<Integer> randomNum = new ArrayList<>();

        Random rn = new Random();

        for (int i = 0; i < 10; i++) {
            int randomIndex = rn.nextInt(100) + 55;
            System.out.println(randomIndex);
            randomNum.add(randomIndex);
        }

    }

    public void alphabet() {
        List<String> alhapabet = new ArrayList<>();

        alhapabet.add("A");
        alhapabet.add("B");
        alhapabet.add("C");
        alhapabet.add("D");
        alhapabet.add("E");
        alhapabet.add("F");
        alhapabet.add("G");
        alhapabet.add("H");
        alhapabet.add("I");
        alhapabet.add("J");
        alhapabet.add("K");
        alhapabet.add("L");
        alhapabet.add("M");
        alhapabet.add("N");
        alhapabet.add("O");
        alhapabet.add("P");
        alhapabet.add("Q");
        alhapabet.add("R");
        alhapabet.add("S");
        alhapabet.add("T");
        alhapabet.add("U");
        alhapabet.add("V");
        alhapabet.add("W");
        alhapabet.add("X");
        alhapabet.add("Y");
        alhapabet.add("Z");

        Collections.shuffle(alhapabet);
        // System.out.println(alhapabet);

       // System.out.println(alhapabet.get(alhapabet.size() - 1));
        //System.out.println(alhapabet.get(0));


    }

    public void randomString(){
        String[] strArr = { "P", "Q", "R", "S","T", "U", "V", "W" };

        Random rnd = new Random();
        int newRandom = rnd.nextInt(strArr.length);
        System.out.println(strArr[newRandom]);
    }

}





