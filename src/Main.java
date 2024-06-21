public class Main
{ public static void main(String[] args)
        {
        var Dog = 8.0;
        var Cat = 3.6;
        var Paper = 763789;
        System.out.println("Задача 1");
        System.out.println("Dog "+Dog);
        System.out.println("Cat "+Cat);
        System.out.println("Paper "+Paper);

        System.out.println("Задача 2");
        System.out.println("Dog "+(Dog+4));
        System.out.println("Cat "+(Cat+4));
        System.out.println("Paper "+(Paper+4));

        System.out.println("Задача 3");
        System.out.println("Dog "+((Dog+4)-3.5));
        System.out.println("Cat "+((Cat+4)-1.6));
        System.out.println("Paper "+((Paper+4)-7639));


        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("friend "+friend);
        System.out.println("friend "+(friend+2));
        System.out.println("friend "+((friend+2)/7));

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("frog "+frog);
        System.out.println("frog "+(frog*10));
        System.out.println("frog "+((frog*10)/3.5));
        System.out.println("frog "+(((frog*10)/3.5)+4));

        System.out.println("Задача 6");
        var aWeight = 78.2;
        var bWeight = 82.7;
        System.out.println("Weight all "+(aWeight+bWeight));
        System.out.println("Weight difference "+(bWeight-aWeight));

        System.out.println("Задача 7");
        System.out.println("The remainder of the division "+(bWeight%aWeight));

        System.out.println("Задача 8");
        System.out.println("Вариант 1");
        var allHours = 640;
        var hoursPerPerson = 8;
        System.out.println("Всего работников в компании "+(allHours/hoursPerPerson)+" человек");
        System.out.println("Вариант 2");
        var more = 94;
        System.out.println(" Если в компании работает "+((allHours/hoursPerPerson)+more)+" человек, то всего "+(((allHours/hoursPerPerson)+more)*hoursPerPerson)+" часа работы можеть быть поделено между сотрудниками");
        }
}