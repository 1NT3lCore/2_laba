public class PrimitiveTypesTable {
    public static void main(String[] args) {
        // Вывод заголовка таблицы
        System.out.println("+----------------------+----------------------+----------------------+");
        System.out.println("| Тип данных           | Минимальное значение | Максимальное значение |");
        System.out.println("+----------------------+----------------------+----------------------+");

        // Вывод информации для каждого типа
        printRow("byte", Byte.MIN_VALUE, Byte.MAX_VALUE);
        printRow("short", Short.MIN_VALUE, Short.MAX_VALUE);
        printRow("int", Integer.MIN_VALUE, Integer.MAX_VALUE);
        printRow("long", Long.MIN_VALUE, Long.MAX_VALUE);
        printRow("float", Float.MIN_VALUE, Float.MAX_VALUE);
        printRow("double", Double.MIN_VALUE, Double.MAX_VALUE);
        printRow("char", (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);

        // Завершение таблицы
        System.out.println("+----------------------+----------------------+----------------------+");
    }

    // Метод для вывода строки таблицы
    private static void printRow(String type, Number min, Number max) {
        System.out.printf("| %-20s | %-20s | %-20s |%n", type, min, max);
    }
}