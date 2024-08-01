import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        // Заданеи 1
        {
            int clientOS = 1;
            switch (clientOS) {
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
            }

        }
        // Задание 2

        {
            int clientDeviceYear = 1;
            int productionYear = 2018;
            switch (clientDeviceYear) {
                case 1:
                    if (productionYear > 2015) {
                        System.out.println("Установите полную версию для Android по ссылке");
                    } else {
                        System.out.println("Установите облегченную версию для Android по ссылке");
                    }
                    break;
                case 0:
                    if (productionYear > 2015) {
                        System.out.println("Установите полную версию приложения для iOS по ссылке");
                    } else {
                        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    }
                    break;
            }
        }
        // Задание 3
        int year = 2023;
        if (year < 1584) {
            System.out.println("Год не является високосным");
        } else {
            if ((year % 4 == 0 && year % 100 > 0) || year % 400 == 0) {
                System.out.println("Год является високосным");
            } else {
                System.out.println("Год не является високосным");
            }
        }
        // Задача 4
        int deliveryDistance = 95;
        int days;
        if (deliveryDistance <= 20) {
            days = 1;
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            days = 2;
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            days = 3;
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставка невозможна");
        }
        // Задача 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неверный номер месяца");
                break;

        }
    }
}