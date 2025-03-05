public class Numbersys {
    public static void main(String[] args) {
        // Проверка количества аргументов
        if (args.length != 1) {
            System.out.println("Использование: java NumberSystems <целое_число>");
            return;
        }

        // Парсинг аргумента командной строки
        int number;
        try {
            number = Integer.parseInt(args[0]); // Преобразуем строку в целое число
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Введите корректное целое число.");
            return;
        }

        // Вывод числа в различных системах счисления
        System.out.println("Десятичное: " + number);
        System.out.println("Двоичное: " + Integer.toBinaryString(number));
        System.out.println("Восьмеричное: " + Integer.toOctalString(number));
        System.out.println("Шестнадцатеричное: " + Integer.toHexString(number));
    }
}