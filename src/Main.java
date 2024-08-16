import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // Task 1
        int deposit = 15000;
        int annualSavings = 0;
        int i = 0;
        while ( annualSavings < 2_459_000) {
            annualSavings = deposit + annualSavings;
            i++;
                System.out.println("Месяц " + i + " Итого " + annualSavings );
            }
        System.out.println("");
        // Task 2
        int ii = 0;
        while (ii < 10){
            ii++;
            System.out.print(ii+" ");
        }
        System.out.println(" ");
        int io = 10;
        for (; io > 0; io--){
            System.out.print(io + " ");
        }
        System.out.println(" ");
        // Task 3
        int populationSize = 12_000_000;
        int birthRate = 17/1000;
        int mortalityRate = 8/1000;
        for (i = 0; i < 11; i++){
            birthRate = populationSize * birthRate;
            mortalityRate = populationSize * mortalityRate;
            populationSize = populationSize + birthRate - mortalityRate;
            System.out.println("Год " + i + ", численнссть населения составляет " + populationSize);
            System.out.println(birthRate);
        }
    }
}