public class Main {
    public static void main(String[] args) {

        // Task 1

        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        System.out.println(" ");

        // Task 2

        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullName.toUpperCase());

        System.out.println(" ");

        // Task 3

        String fullName2 = fullName.replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName2);
    }
}