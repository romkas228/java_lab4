public class Lab4 {
    public static void main(String[] args) {
        String rawText = "Java   is an amazing language!  Programming\trequires logic.";
        
        System.out.println("Вхідний брудний текст:\n" + rawText);
        System.out.println("--------------------------------------------------");
        Text textObject = new Text(rawText);

        System.out.println("Відновлений текст (з об'єктів):");
        System.out.println(textObject);
        System.out.println("--------------------------------------------------");

        textObject.sortAndPrintWordsByVowels();
    }
}