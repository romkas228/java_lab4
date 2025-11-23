import java.util.ArrayList;
import java.util.List;

/**
 * Клас Слово, що складається з масиву (списку) літер.
 */
public class Word implements SentenceElement, Comparable<Word> {
    private final List<Letter> letters;

    public Word(String wordString) {
        letters = new ArrayList<>();
        for (char c : wordString.toCharArray()) {
            letters.add(new Letter(c));
        }
    }

    /**
     * Метод для підрахунку кількості голосних у слові.
     * Необхідний для виконання варіанту 6.
     */
    public int countVowels() {
        int count = 0;
        for (Letter letter : letters) {
            if (letter.isVowel()) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Letter letter : letters) {
            sb.append(letter.toString());
        }
        return sb.toString();
    }

    /**
     * Реалізація порівняння для сортування за зростанням кількості голосних.
     */
    @Override
    public int compareTo(Word other) {
        return Integer.compare(this.countVowels(), other.countVowels());
    }
}