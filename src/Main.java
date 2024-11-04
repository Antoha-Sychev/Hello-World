public class Main {
    public static void main(String[] args) {

            // Book 1

        Author authorOne = new Author("Пауло", "Коэльо");

        Book bookOne = new Book("Частичка Мира", authorOne, 2024);

        bookOne.setYearOfPublication(1999);

        System.out.println("Название книги: " + bookOne.getNameBook());
        System.out.println("Автор книги: " + authorOne.getAuthorName());
        System.out.println("Год публикации: " + bookOne.getYearOfPublication());
        System.out.println(" ");

            // Book 2

        Author authorTwo = new Author("Антон", "Чехов");

        Book bookTwo = new Book("Палата", authorTwo, 2024);

        bookTwo.setYearOfPublication(1892);

        System.out.println("Название книги: " + bookTwo.getNameBook());
        System.out.println("Автор книги: " + authorTwo.getAuthorName());
        System.out.println("Год публикации: " + bookTwo.getYearOfPublication());

    }
}