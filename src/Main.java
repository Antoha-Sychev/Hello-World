public class Main {
    public static void main(String[] args) {

        int[] rack = new int [10];
        rack [0] = 12;
        rack [1] = 9;
        rack [2] = 11;
        rack [3] = 10;

        int[] rack2 = new int [10];
        rack2 [0] = 12;
        rack2 [1] = 9;
        rack2 [2] = 11;
        rack2 [3] = 10;

        boolean rackAreEqual = true;
        rackAreEqual = rack.length == rack2.length;

        if (rackAreEqual) {
            for (int i = 0; i < rack.length; i++) {
                if (rack[i] != rack2[i]) {
                    rackAreEqual = false;
                }
            }
        }
        if (rackAreEqual) {
            System.out.println("Стеллажи одинаковые");
        } else {
            System.out.println("Стеллажи разные");
        }
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int[] weightsCopy = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};

        boolean arraysAreEqual = true;
        arraysAreEqual = weights.length == weightsCopy.length;
        if (arraysAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightsCopy[i]) {
                    arraysAreEqual = false;
                }
            }
        }
        if (arraysAreEqual) {
            System.out.println("Массивы одинаковые");
        } else {
            System.out.println("Массивы разные");
        }
    }
}