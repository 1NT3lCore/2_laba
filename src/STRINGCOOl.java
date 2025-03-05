public class STRINGCOOl {
    public static void main(String[] args) {
        String input = "abababababYYrteYY";
        String substring = "YY";

        int count = countSubstringOccurrences(input, substring);
        System.out.println("Подстрока \"" + substring + "\" встречается " + count + " раз(а).");
    }

    /**
     * Метод для подсчета количества вхождений подстроки в строку.
     *
     * @param input     Исходная строка.
     * @param substring Подстрока для поиска.
     * @return Количество вхождений подстроки.
     */
    public static int countSubstringOccurrences(String input, String substring) {
        int count = 0;
        int index = 0;

        // Поиск всех вхождений подстроки
        while ((index = input.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length(); // Перемещаем индекс за найденное вхождение
        }

        return count;
    }
}