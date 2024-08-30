public class Main {
    public static void main(String[] args) {

        // Task 1


        double spendingSum = 0;
        int [] spending = new int [5];
        spending[0] = 45647;
        spending[1] = 63654;
        spending[2] = 23456;
        spending[3] = 76543;
        spending[4] = 19859;
        for (int i = 0; i < 5; i++) {
            spendingSum = spendingSum + spending[i];
        }
        System.out.println("Сумма трат за месяц составила " + spendingSum + " рублей.");

        System.out.println(" ");

        // Task 2

        int weeks = 4;
        double min = spending[0];
        double max = spending[0];
        for (int i = 1; i < spending.length; i++) {
            if (spending[i] > max){
            max = spending[i];
            }
               else if(spending[i] < min){
                   min = spending[i];
               }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min );
        System.out.println("Максимальная сумма трат за неделю составила " + max );

        System.out.println(" ");

        // Task 3

        System.out.println("Средняя сумма трат за месяц составила " + spendingSum / weeks + " рублей.");

        System.out.println(" ");

        // Task 4

        char[] reversFullName = {'n','a','v','I',' ','v','o','n','a','v','I'};
        for (int i = reversFullName.length - 1; i > -1; i--) {
            System.out.print(reversFullName[i]);

        }

    }
}