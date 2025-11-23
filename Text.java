import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Клас Текст, що складається з масиву речень.
 */
public class Text {
    private final List<Sentence> sentences;

    public Text(String textString) {
        this.sentences = new ArrayList<>();
        String cleanText = textString.replaceAll("[\\t\\s]+", " ");
        parseText(cleanText);
    }

    /**
     * Розбиває текст на речення.
     */
    private void parseText(String textString) {
        String[] rawSentences = textString.split("(?<=[.!?])\\s*");
        for (String s : rawSentences) {
            sentences.add(new Sentence(s));
        }
    }

    /**
     * Виконує завдання варіанту 6: повертає відсортований список всіх слів тексту.
     */
    public void sortAndPrintWordsByVowels() {
        List<Word> allWords = new ArrayList<>();

        for (Sentence sentence : sentences) {
            for (SentenceElement element : sentence.getElements()) {
                if (element instanceof Word) {
                    allWords.add((Word) element);
                }
            }
        }

        Collections.sort(allWords);

        System.out.println("### Слова, відсортовані за зростанням кількості голосних:");
        for (Word word : allWords) {
            System.out.println(word + " (голосних: " + word.countVowels() + ")");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Sentence s : sentences) {
            sb.append(s.toString()).append(" ");
        }
        return sb.toString().trim();
    }
}