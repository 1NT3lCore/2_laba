public class Ten {
    public static void main(String[] args) {
        String input = "abocd";
        System.out.println("Циклические перестановки строки \"" + input + "\":");

        // Вывод всех циклических перестановок
        printCyclicPermutations(input);
    }

    /**
     * Метод для вывода всех циклических перестановок строки.
     *
     * @param input Исходная строка.
     */
    public static void printCyclicPermutations(String input) {
        int length = input.length();
        String current = input;

        for (int i = 0; i < length; i++) {
            System.out.println(current);
            // Сдвигаем строку на один символ влево
            current = current.substring(1) + current.charAt(0);
        }
    }
}