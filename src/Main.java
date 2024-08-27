public class Main {
    public static void main(String[] args) {

        // Task 1

        int [] weight = new int [12];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;

        double [] fractions = {1.57, 7.654, 9.986};

        long [] weightLong = new long [12];
        weightLong[0] = 1894982579852L;
        weightLong[1] = 12856926894222L;
        weightLong[2] = 1294982579852L;
        System.out.println(" ");
        System.out.println(" ");

        // Task 2

        for (int i = 0; i < 12; i++) {
            System.out.print(weight[i]+", ");
        }
        System.out.println(" ");

        for (int i = 0; i < 3; i++){
            System.out.print(fractions[i] + ", ");
        }
        System.out.println(" ");

        for (int i = 0; i < 12; i++) {
            System.out.print(weightLong[i]+", ");
        }
        System.out.println(" ");
        System.out.println(" ");

        // Task 3

        for (int i = 2; i > -1; i--) {
            System.out.print(weight[i] + ", ");
        }
        System.out.println(" ");

        for (int i = 2; i > -1; i--) {
            System.out.print(fractions[i] + ", ");
        }
        System.out.println(" ");

        for (int i = 2; i > -1; i--) {
            System.out.print(weightLong[i] + ", ");
        }
        System.out.println(" ");
        System.out.println(" ");

        // Task 4

        for ( int i = 0; i < 3; i++){
            weight [i] = (i | 1) + 1 ;
            System.out.print(weight[i] + ", ");
        }
    }
}