public class Hello {
    public static void main(String[] args) {
        // Пример строки для анализа
        String input = "Hello World 123! ww ٤٥٦";

        // Вызов метода для анализа строки
        analyzeString(input);
    }

    /**
     * Метод для анализа строки.
     *
     * @param input Строка для анализа.
     */
    public static void analyzeString(String input) {
        // Инициализация счетчиков
        int totalLetters = 0;          // Общее количество букв
        int lowercaseLetters = 0;     // Количество строчных букв
        int uppercaseLetters = 0;     // Количество прописных букв
        int totalDigits = 0;          // Общее количество цифр
        int arabicDigits = 0;         // Количество арабских цифр (0-9)
        int nonArabicDigits = 0;      // Количество не арабских цифр
        int otherCharacters = 0;      // Количество других символов
        int totalCharacters = input.length(); // Общее количество символов

        // Проход по каждому символу строки
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) { // Проверка, является ли символ буквой
                totalLetters++;
                if (Character.isLowerCase(ch)) {
                    lowercaseLetters++;
                } else if (Character.isUpperCase(ch)) {
                    uppercaseLetters++;
                }
            } else if (Character.isDigit(ch)) { // Проверка, является ли символ цифрой
                totalDigits++;
                if (ch >= '0' && ch <= '9') { // Проверка на арабские цифры
                    arabicDigits++;
                } else {
                    nonArabicDigits++;
                }
            } else { // Остальные символы
                otherCharacters++;
            }
        }

        // Вывод результатов
        System.out.println("Общее количество символов: " + totalCharacters);
        System.out.println("Количество букв: " + totalLetters);
        System.out.println("  Строчные буквы: " + lowercaseLetters);
        System.out.println("  Прописные буквы: " + uppercaseLetters);
        System.out.println("Количество цифр: " + totalDigits);
        System.out.println("  Арабские цифры: " + arabicDigits);
        System.out.println("  Не арабские цифры: " + nonArabicDigits);
        System.out.println("Количество других символов: " + otherCharacters);
    }
}