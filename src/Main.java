import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        isYearLeap(2025);

        checkApplicationVersion(1, 2019);
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
        int currentYear = LocalDate.now().getYear();

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
}