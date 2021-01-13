public class StringManipulator {

    public String trimAndConcat(String userValue1, String userValue2) {
        String newString = userValue1.trim();
        String newString2 = userValue2.trim();
        return newString.concat(newString2);
    }


    public Integer getIndexOrNull(String enteredString, char character) {
        int index = 0;
        for (int i = 0; i < enteredString.length(); i++) {
            if (enteredString.indexOf(character) == -1) {
                return null;
            } else {
                return enteredString.indexOf(character);
            }
        }
        return index;
    }


    public Integer getIndexOrNulls(String startString, String newString) {

        int index = startString.indexOf(newString);
        if (index == -1) {
            return null;
        } else {
            return index;
        }

    }

    public String concatSubstring(String enteredString, int enteredStringIndex, int enteredLastIndex, String wordToConcat) {
          String index = enteredString.substring(enteredStringIndex,enteredLastIndex);
          return index.concat(wordToConcat);

    }


}
