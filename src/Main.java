import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        for (int i = 1; i < 11; i++) {
            System.out.println( + i);
        }
        System.out.println("");
        // Задача 2
        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }
        System.out.println("");
        // Задача 3
        for(int i = 0; i < 18; i = i + 2){
            System.out.println(i);
        }
        System.out.println("");
        // Задача 4
        for(int i = 10; i > - 11; i--){
            System.out.println(i);
        }
        System.out.println("");
        // Задача 5
        for(int i = 1904; i < 2097; i = i + 4){
            System.out.println(+i+" год является високосным");
        }
        System.out.println("");
        // Задача 6
        for(int i = 7; i < 99; i = i + 7){
            System.out.println(i);
        }
        System.out.println("");
        // Задача 7
        for(int i = 1; i < 513; i = i*2){
            System.out.println(i);
        }
        System.out.println("");
        // Задача 8
        int deposit = 29000;
        int annualSavings = 0;
        for (int i = 1; i < 13; i++){
            annualSavings = deposit + annualSavings;
            System.out.println("Месяц " + i + ", сумма накомплений равна " + annualSavings + " рублей");
        }
        System.out.println("");
        // Задача 9
        int deposits = 29000;
        int annualSavingsInPercent = 0;
        for (int i = 1; i < 13; i++){
            annualSavingsInPercent = annualSavingsInPercent + annualSavingsInPercent / 100;
            annualSavingsInPercent = deposits + annualSavingsInPercent + annualSavingsInPercent / 100;
            System.out.println("Месяц " + i + ", сумма накомплений равна " + annualSavingsInPercent + " рублей");
        }
        System.out.println("");
        // Задача 10

        for ( int i = 1 ; i < 11; i++ ){
            System.out.println(2 * i);
        }
    }
}