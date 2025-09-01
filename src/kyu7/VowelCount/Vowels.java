package kyu7.VowelCount;



public class Vowels {

    public static int getCount(String str) {
        char[] characters = {'a', 'e', 'i', 'o', 'u'};
        int num = 0;

        for (char letter : str.toLowerCase().toCharArray()) {
            for (char vowel : characters) {
                if (vowel == letter) {
                    num++;
                }
            }
        }

        return num;
    }

}
