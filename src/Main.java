public class Main {
    public static void main(String[] args) {

        // Задача 1

            int years = 18;
        if (years >= 18) {
            System.out.println("Если возраст человека равен 18 или больше лет, он совершеннолетний.");

        int years1 = 17;
        if (years1 < 18 )
            System.out.println("Если возраст человека не равен 18 или меньше лет, он не достиг совершеннолетия, нужно немного подождать");
        }

        // Задача 2

        int temperature = 1;
        if (temperature < 5) {
            System.out.println("На улице 1 градус, нужно надеть шапку.");
        }
        int temperature2 = 10;
        if (temperature2 > 5) {
            System.out.println("На улице 10 градусов, можно идти без шапки.");
        }

        // Задача 3

        int speed = 60;
        if (speed <= 60) {
            System.out.println("Если скорость меньше или равна 60 км/ч, можно ездить спокойнно.");
        }
        int speed2 = 70;
        if (speed2 > 60) {
            System.out.println("Если скорость больше 60 км/ч, то придется заплатить штраф.");
        }

        // Задача 4

        int age1 = 4;
        if (age1 > 2 && age1 < 6) {
            System.out.println("Если возраст человека равен 4 годам, то ему нужно ходить в детский сад");
        }
        int age2 = 10;
        if (age2 > 7 && age2 < 17) {
            System.out.println("Если возраст человека равен 10 годам, то ему нужно ходить в школу");
        }
        int age3 = 19;
        if (age3 >= 18 && age3 <= 24) {
            System.out.println("Если возраст человека равен 19 годам, то его место в университете");
        }
        int age4 = 29;
        if (age4 > 24) {
            System.out.println("Если возраст человека составляет 29 лет, то ему пора ходить на работу");
        }

        // Задача 5

        int age5 = 3;
        if (age5 < 5) {
            System.out.println("Если возраст ребенка равен 3-м годам, то он не может кататься на аттракционе.");
        }
        int age6 = 13;
        if (age6 > 5 && age6 < 14) {
            System.out.println("Если возраст ребенка равен 13 годам, то он может кататься только в сопровождении взрослого.");
        }
        int age7 = 21;
        if (age7 > 14) {
            System.out.println("Если возраст ребенка равен 21 году, то он может кататься без сопровождения взрослого.");
        }

        // Задача 6

        int peopleSitting = 54;
        int peopleStanding = 41;
        if (peopleSitting < 60 || peopleStanding < 42) {
            System.out.println("В вагоне есть сидячие или стоячие места");
        } else {
            System.out.println("Вагон полостью забит");
        }

        // Задача 7

        int one = 1;
        int two = 2;
        int three = 3;
        if (three > two && one < three) {
            System.out.println("");
        }
    }
}