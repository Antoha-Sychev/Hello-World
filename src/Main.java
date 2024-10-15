public class Main {
    public static void main(String[] args) {}

    public static void isYearLeap(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + "год високосный");
        }else{
            System.out.println(year + "год не является високосным");
        }
        }
}