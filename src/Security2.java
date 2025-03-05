public class Security2 {
    public static void main(String[] args) {
        // Проверка количества аргументов
        if (args.length != 4) {
            System.out.println("Использование: java RadarDetection <itemX> <itemY> <r> <R>");
            return;
        }

        // Парсинг аргументов командной строки
        double itemX = Double.parseDouble(args[0]); // Координата X предмета
        double itemY = Double.parseDouble(args[1]); // Координата Y предмета
        double r = Double.parseDouble(args[2]);     // Ближняя граница (тревога)
        double R = Double.parseDouble(args[3]);     // Дальняя граница (обнаружение)

        // Координаты объекта охраны (пусть это будет (0, 0))
        double objectX = 0.0;
        double objectY = 0.0;

        // Вычисление расстояния от предмета до объекта охраны
        double distance = Math.sqrt(Math.pow(itemX - objectX, 2) + Math.pow(itemY - objectY, 2));

        // Определение статуса предмета и вывод сообщения
        if (distance > R) {
            System.out.println("Не обнаружен");
        } else if (distance > r && distance <= R) {
            System.out.println("Обнаружен");
        } else if (distance <= r) {
            System.out.println("Тревога");
        }
    }
}