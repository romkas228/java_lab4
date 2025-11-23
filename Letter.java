/**
 * Клас, що представляє окрему літеру.
 */
public class Letter {
    private final char value;

    public Letter(char value) {
        this.value = value;
    }

    /**
     * Перевіряє, чи є літера голосною.
     */
    public boolean isVowel() {
        String vowels = "AEIOUYaeiouyАЕЄИІЇОУЮЯаеєиіїоуюя";
        return vowels.indexOf(value) != -1;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}