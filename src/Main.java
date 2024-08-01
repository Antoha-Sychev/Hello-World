import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        // Заданеи 1
        {
            char clientOS = '1';
            switch (clientOS) {
                case '1':
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                case '0':
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
            }

        }
        // Задание 2

        {
            char clientOS = '1';
            int age = 2018;
            switch (clientOS) {
                case '1':
                    if (age > 2015) {
                        System.out.println("Установите полную версию для Android по ссылке");
                    }else {
                        System.out.println("Установите облегченную версию для Android по ссылке");
                    }
                    break;
                case '0':
                     if (age > 2015){
                         System.out.println("Установите полную версию приложения для iOS по ссылке");
                     }else {
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
            if ((year % 4 == 0 && year % 100 > 0)|| year % 400 == 0){
                System.out.println("Год является високосным");
            } else {
                System.out.println("Год не является високосным");
            }
        }
        // Задача 4
        int deliveryDistance = 950;
         int days;
         if(deliveryDistance <= 20){
             days = 1;
             System.out.println("Потребуется дней: "+days);
         } else if (deliveryDistance > 20 && deliveryDistance < 60){
             days = 2;
             System.out.println("Потребуется дней: "+days);
         } else if (deliveryDistance > 60 && deliveryDistance < 100){
             days = 3;
             System.out.println("Потребуется дней: "+days);
         }else{
             System.out.println("Доставка невозможна");
         }

    }

}