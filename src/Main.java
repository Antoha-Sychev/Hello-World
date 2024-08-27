public class Main {
    public static void main(String[] args) {
        // Task 1

        int deposit = 15000;
        int annualSavings = 0;
        int i = 0;
        while (annualSavings < 2_459_000) {
            annualSavings = deposit + annualSavings;
            i++;
            System.out.println("Месяц " + i + " Итого " + annualSavings);
        }
        System.out.println(" ");

        // Task 2

        int ii = 0;
        while (ii < 10) {
            ii++;
            System.out.print(ii + " ");
        }
        System.out.println(" ");
        int io = 10;
        for (; io > 0; io--) {
            System.out.print(io + " ");
        }
        System.out.println(" ");
        System.out.println(" ");

        // Task 3

        int populationSize = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        int byTheNumberOf = 1000;
        for (i = 1; i < 11; i++) {
            populationSize = (((populationSize * (birthRate - mortalityRate)) / byTheNumberOf) + populationSize);
            System.out.println("Год " + i + ", численнссть населения составляет " + populationSize);
        }
        System.out.println(" ");

        // Task 4

        int deposits = 15000;
        int theAmountOfSavings = 0;
        int percent = 7;
        for (i = 0; theAmountOfSavings < 12_000_000; i++) {
            theAmountOfSavings = theAmountOfSavings + theAmountOfSavings / 100 * percent;
            theAmountOfSavings = theAmountOfSavings + deposits + theAmountOfSavings / 100 * percent;
            System.out.println("Месяц " + i + ", сумма накомлений " + theAmountOfSavings);
        }
        System.out.println("");

        // Task 5
        int theAmountOfSavings2 = 0;

        for (i = 0; theAmountOfSavings2 < 12_000_000; i++) {
            theAmountOfSavings2 = theAmountOfSavings2 + theAmountOfSavings2 / 100 * percent;
            theAmountOfSavings2 = theAmountOfSavings2 + deposits + theAmountOfSavings2 / 100 * percent;
            if (i % 6 == 0){
        System.out.println("Месяц " + i + ", сумма накомлений " + theAmountOfSavings2);
            }

        }
        System.out.println(" ");

        // Task 6

        long theAmountOfSavings3 = 0L;
        for (i = 0; i < 109; i++) {
            theAmountOfSavings3 = theAmountOfSavings3 + theAmountOfSavings3 / 100 * percent;
            theAmountOfSavings3 = theAmountOfSavings3 + deposits + theAmountOfSavings3 / 100 * percent;
            if (i % 6 == 0){
                System.out.println("Месяц " + i + ", сумма накомлений " + theAmountOfSavings3);
            }

        }
        System.out.println(" ");

        // Task 7

        int day = 7;
        for (i = 1; i < 31; i++) {
            day = day + i;
            if (i % 7 == 0){
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
            }
        }
        System.out.println(" ");

        // Task 8

        int yearsLater = 79;
        for (i = 1800; i < 2100; i++){
            yearsLater = yearsLater + i;
            if (i % 79 == 0){
                System.out.println(i);
            }
        }

    }
}