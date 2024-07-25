public class Main {
    public static void main(String[] args) {

        // Задача 1

            int years = 17;
        if (years >= 18) {
            System.out.println("Если возраст человека "+ years +" лет, он совершеннолетний.");
        }else{
            System.out.println("Если возраст человека "+ years +" лет, он не достиг совершеннолетия, нужно немного подождать");
        }

        // Задача 2

        int temperature = 19;
        if (temperature < 5) {
            System.out.println("На улице "+ temperature +" градус, нужно надеть шапку.");
        }else {
            System.out.println("На улице "+ temperature +" градусов, можно идти без шапки.");
        }

        // Задача 3

        int speed = 61;
        if (speed <= 60) {
            System.out.println("Если скорость "+ speed +" км/ч, можно ездить спокойнно.");
        }else{
            System.out.println("Если скорость "+ speed +" км/ч, то придется заплатить штраф.");
        }

        // Задача 4

        int age1 = 40;
        if (age1 > 2 && age1 < 6) {
            System.out.println("Если возраст человека равен "+ age1 +" годам, то ему нужно ходить в детский сад");
        }else if (age1 > 7 && age1 < 17) {
            System.out.println("Если возраст человека равен "+ age1 +" лет, то ему нужно ходить в школу");
        }else if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен "+ age1 +" лет, то его место в университете");
        }else {
            System.out.println("Если возраст человека составляет "+ age1 +" лет, то ему пора ходить на работу");
        }

        // Задача 5

        int age = 30;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен "+ age +" года, то он не может кататься на аттракционе.");
        } else if (age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен "+ age +" лет, то он может кататься только в сопровождении взрослого.");
        }else {
            System.out.println("Если возраст ребенка равен "+ age +" лет, то он может кататься без сопровождения взрослого.");
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
            System.out.println("Наибольшее число " + three);
        } else if (one > three){
            System.out.println("Набиольшее число " + one);
        } else {
            System.out.println("Наибольшее число " + two);
        }

    }
}