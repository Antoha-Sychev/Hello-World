import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        isYearLeap(2025);

        System.out.println(" ");

        checkApplicationVersion(1, 2019);

        System.out.println(" ");

        int deliveryDistance = calculateDeliveryTime(95);

        System.out.println(deliveryDistance);
    }
  
    // Task 1

    public static void isYearLeap(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " год високосный");
        }else{
            System.out.println(year + " год не високосный");
        }
   }

    // Task 2

    public static void checkApplicationVersion (int os, int clientDeviceYear){
        int currentYear = 2015;

        if (os == 0) {
            if (clientDeviceYear <= currentYear){
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            }else{
                System.out.println("Установите обычную версию приложения для IOS по ссылке");
            }
        }else if (os == 1){
            if (clientDeviceYear <= currentYear){
                System.out.println("Установите облеченную версию приложения для Android по ссылке");
            }else{
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        }
    }


    // Task 3

    public static int calculateDeliveryTime(int distance){
        int deliveryTime;

        if (distance <= 20){
            deliveryTime = 1;
        }else if (distance > 20 && distance <= 60){
            deliveryTime = 2;
        }else if (distance > 60 && distance <= 100){
            deliveryTime = 3;
        }else{
            deliveryTime = -1;
        }
        return deliveryTime;

    }
}