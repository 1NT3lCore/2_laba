public class Unicodetable {

    /**
     * Метод для отображения таблицы символов Unicode.
     *
     * @param startCode   Стартовый код символа (в шестнадцатеричном формате).
     * @param rows        Количество строк.
     * @param columns     Количество столбцов.
     */
    public static void printUnicodeTable(int startCode, int rows, int columns) {
        // Вывод заголовка таблицы
        System.out.print("   ");
        for (int col = 0; col < columns; col++) {
            System.out.printf("%4x", col);
        }
        System.out.println();

        // Вывод символов
        for (int row = 0; row < rows; row++) {
            int rowStartCode = startCode + row * columns;
            System.out.printf("%04x ", rowStartCode); // Вывод кода строки
            for (int col = 0; col < columns; col++) {
                int code = rowStartCode + col;
                if (code <= 0xFFFF) { // Проверка, чтобы код не выходил за пределы Unicode
                    System.out.printf("%4c", (char) code);
                } else {
                    System.out.print("    "); // Пустое место, если код выходит за пределы
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Вывод символов Кириллицы (диапазон 0x0400 - 0x04FF)
        System.out.println("Символы Кириллицы:");
        printUnicodeTable(0x0400, 16, 16);

        // Вывод символов денежных единиц (диапазон 0x20A0 - 0x20BF)
        System.out.println("\nСимволы денежных единиц:");
        printUnicodeTable(0x20A0, 2, 16);
    }
}