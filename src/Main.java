import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
      char clientOS = '1';
      switch (clientOS) {
          case '1':
              System.out.println("Установите версию приложения для Android по ссылке");
              break;
          case '0':
              System.out.println("Установите версию приложения для iOS по ссылке");
              break;
      }
    }
}