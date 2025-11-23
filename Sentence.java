import java.util.ArrayList;
import java.util.List;

/**
 * Клас Речення, що складається з елементів (Слів та Розділових знаків).
 */
public class Sentence {
    private final List<SentenceElement> elements;

    public Sentence(String sentenceString) {
        elements = new ArrayList<>();
        parseSentence(sentenceString);
    }

    /**
     * Парсинг рядка речення на слова та пунктуацію.
     */
    private void parseSentence(String sentenceString) {
        String[] parts = sentenceString.split("(?=[,.!?])|\\s+");

        for (String part : parts) {
            if (part.isEmpty()) continue;

            if (part.matches("[,.!?]")) {
                elements.add(new Punctuation(part));
            } else {
                elements.add(new Word(part));
            }
        }
    }

    public List<SentenceElement> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < elements.size(); i++) {
            SentenceElement el = elements.get(i);
            sb.append(el.toString());
            
            if (el instanceof Word && i < elements.size() - 1 && elements.get(i+1) instanceof Word) {
                sb.append(" ");
            }
            if (el instanceof Punctuation && i < elements.size() - 1) {
                 sb.append(" ");
            }
        }
        return sb.toString();
    }
}