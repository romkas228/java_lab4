/**
 * Клас для розділових знаків.
 */
public class Punctuation implements SentenceElement {
    private final String symbol;

    public Punctuation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}