public class Security {
    public static void main(String[] args) {
        // Координаты объекта охраны (пусть это будет (0, 0))
        double objectX = 0.0;
        double objectY = 0.0;

        // Координаты предмета (задаются в программе)
        double itemX = 2.0; // Пример координаты X предмета
        double itemY = 5.0; // Пример координаты Y предмета

        // Заданные расстояния
        double r = 5.0; // Ближняя граница (тревога)
        double R = 10.0; // Дальняя граница (обнаружение)

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