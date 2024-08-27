import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        // Task 1

        int [] New = {1,2,3};
        double [] fraction = {1.57, 7.654, 9.986};
        long [] Long = {12635655668321456L, 192345678975343L};

        System.out.println(" ");

        // Task 2

        System.out.println(New[0]+ ", " +New[1]+ ", " +New[2]);
        System.out.println(fraction[0] + ", " + fraction[1] + ", " + fraction[2]);
        System.out.println(Long[0] + ", " + Long[1]);

        System.out.println(" ");

        // Task 3

        System.out.println(New[2] + ", " + New[1] + ", " + New[0]);
        System.out.println(fraction[2] + ", " + fraction[1] + ", " + fraction[0]);
        System.out.println(Long[1] + ", " + Long[0]);

        System.out.println(" ");

        // Task 4

        for (int i = 0; i < 2; i++){
            New [0] = New[0] + 1;
            New [2] = New[2] + 1;
            System.out.println(New[0]+ ", " + New[2]);
        }
    }
}