import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
       char color = 'l';
       switch (color) {
           case 'r':
               System.out.println("Красный! Ехать нельзя.");
               break;
           case 'y':
               System.out.println("Желтый. Внимание.");
               break;
           case 'g':
               System.out.println("Зеленый! Проезд разрешен.");
               break;
           case 'l':
               System.out.println("Поворот налево.");
               break;
           default:
               System.out.println("Светофор сломался.");
       }
    }
}