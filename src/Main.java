import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2025;
        checkYear(year);
        System.out.println();
        System.out.println("Задание 2");
        int clientOS = 0;
        int clientDeviceYear = 2014;
        checkOS(clientOS, clientDeviceYear);
        System.out.println();
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        int days = calculateDays(deliveryDistance);
        if (days > 0) {
            System.out.print("Потребуется дней на доставку: " + days);
        } else {
            System.out.println("Доставка на такое расстояние не производится");
        }
    }

    public static void checkYear(int year) {
        System.out.print(year + " год - ");
        if ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0) {
            System.out.print("високосный");
        } else {
            System.out.println("не високосный");
        }
    }

    public static void checkOS(int clientOS, int clientDeviceYear) {
        int dateNow = 2015;
        if (clientOS == 1 && clientDeviceYear >= dateNow) {
            System.out.println("Установите версию приложения для Android по ссылке: ");
        } else if (clientOS == 0 && clientDeviceYear >= dateNow) {
            System.out.println("Установите версию приложения для iOS по ссылке: ");
        } else if (clientOS == 1 && clientDeviceYear < dateNow) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке: ");
        } else {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке: ");
        }
    }

    public static int calculateDays(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }

}