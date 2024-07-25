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
    }
}