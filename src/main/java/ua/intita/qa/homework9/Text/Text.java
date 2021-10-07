package ua.intita.qa.homework9.Text;

public class Text implements Statists {
    @Override
    public int countNumberLetters(String word) {
        char[] arr = word.toCharArray();
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Character.isLetter(arr[i])) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public int countNumberVowels(String word) {
        char[] arr = word.toCharArray();
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (arr[i] == vowels[j]) {
                    counter++;
                }
            }
        }
        return counter;
    }

    @Override
    public int countNumberConsonants(String word) {
        char[] arr = word.toCharArray();
        int counter = arr.length;
        int vowels = countNumberVowels(word);
        return counter - vowels;
    }

    @Override
    public int countPoints(String text) {
        char point = '.';
        char[] arr = text.toCharArray();
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == point) {
                counter++;
            }

        }
        return counter;
    }

    @Override
    public int countComas(String text) {
        char comma = ',';
        char[] arr = text.toCharArray();
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == comma) {
                counter++;
            }
        }
        return counter;
    }
}
