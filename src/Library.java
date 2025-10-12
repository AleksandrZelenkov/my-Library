import java.util.Scanner;
public class Library{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Books book1 = new Books("Географ глобус пропил","А. Иванов","роман",992,4.9f);
        Books book2 = new Books("Вегетация","А. Иванов","научная фантастика",536,4.7f);
        Books book3 = new Books("Пикник на обочине","Братья Стругацкие","научная фантастика",256,4.3f);
        Books book4 = new Books("Братья Карамазовы","Ф. Достоевкий","роман",992,4.9f);
        Books book5 = new Books();

        Books.greeting();
        while(true){  // Нужно для того, что бы пользователь сразу возвращался в меню, после взаимодействия с программой.

            System.out.println("Меню:\n1. Описание.\n2. Сумма страниц всех книг в библиотеке.\n3. Средний рейтинг книг.\n4. Добавить книгу.");

            int menu1 = scan.nextInt();
// Меню:
            switch (menu1){
                case 1:
                    System.out.println("Введите номер книги от 1 до 4.");
                    int menu2 = scan.nextInt();
                    switch (menu2){
                        case 1: book1.description(); break;
                        case 2: book2.description(); break;
                        case 3: book3.description(); break;
                        case 4: book4.description(); break;
                        case 5: book5.description(); break;
                        default: System.out.println("В нашей библиотеке пока только 4 книги.");
                    }
                    break;
                case 2: book1.sumPages(book1.getPages(), book2.getPages(), book3.getPages(), book4.getPages()); break;
                case 3: book1.averageRating(book1.getRating(), book2.getRating(), book3.getRating(), book4.getRating()); break;
                case 4: book5.addBook();
                default: System.out.println("Ошибка");
            }
        }
    }
}