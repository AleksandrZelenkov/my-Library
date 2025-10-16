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

        while(Menu.exit){  // Нужно для того, что бы пользователь сразу возвращался в меню, после взаимодействия с программой.
            System.out.println(Menu.head1+Menu.points+Menu.separator);
            int pointSelect = scan.nextInt();
// Меню:
            switch (pointSelect){
                case 1: System.out.print(Menu.head2+"\n1. "+book1+"\n2. "+book2+"\n3. "+book3+"\n4. "+book4+"\n5. "+book5); break;
                case 2: System.out.printf("Введите номер книги от 1 до %d.\n",Books.sumBooks);
                    int menu2 = scan.nextInt();
                    switch (menu2){
                        case 1: System.out.print(book1+":"); book1.description(); break;
                        case 2: System.out.print(book2+":"); book2.description(); break;
                        case 3: System.out.print(book3+":"); book3.description(); break;
                        case 4: System.out.print(book4+":"); book4.description(); break;
                        case 5: System.out.print(book5+":"); book5.description(); break;
                        default: Menu.error(); System.out.printf("В нашей библиотеке пока только %d книг.\n\n",Books.sumBooks);
                    }
                    break;
                case 3: Books.sumPages(book1.getPages(), book2.getPages(), book3.getPages(), book4.getPages(), book5.getPages()); break;
                case 4: Books.averageRating(book1.getRating(), book2.getRating(), book3.getRating(), book4.getRating()); break;
                case 5: book5.addBook(); System.out.print(book5); book5.description(); break;
                default: Menu.error();
            }
            Menu menu1 = new Menu();
            menu1.exitAndReturnTheMenu();
        }
    }
}