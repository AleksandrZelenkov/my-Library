import java.util.Scanner;

public class MyLibrary2_0 {
    public static void main(String[] args) {

        Books book = new Books();
        Menu menu = new Menu();
        Scanner scan = new Scanner(System.in);

        do{
            Menu.menu();
            int selectMenuPoint_0 = scan.nextInt();
            switch (selectMenuPoint_0){
                case 1: Menu.headAllBooks(); book.listOfOllBooks(); break;
                case 2: menu.headBookSelection(); book.listOfOllBooks(); Menu.emptySubMenu(); book.description(scan.nextInt()); break;
                case 3: book.sumPages(); break;
                case 4: book.averageRating(); break;
                case 5: book.addBook(); break;
                default:
            }
        } while(menu.subMenu());
    }
}