package kyu6.StopgninnipSMysdroW;

public class SpinWords {

    public String spinWords(String sentence) {
        String[] wordsList = sentence.split(" ");
        StringBuilder newSentence = new StringBuilder();

        for (String word : wordsList) {
            newSentence.append(word.length() >= 5 ? reverseWord(word) : word);
            newSentence.append(" ");
        }

        return newSentence.toString().trim();
    }

    private String reverseWord(String word) {
        StringBuilder newWord = new StringBuilder();

        for (int i = word.length(); i > 0; i--) {
            newWord.append(word.charAt(i - 1));
        }

        return newWord.toString();
    }

}