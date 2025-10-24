import java.util.ArrayList;
import java.util.Scanner;

public class MyLibrary3_0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();

        ArrayList<Books> books = new ArrayList<Books>();
        books.add(new Books("Географ глобус пропил","А. Иванов","роман",992,4.9f));
        books.add(new Books("Вегетация","А. Иванов","научная фантастика",536,4.7f));
        books.add(new Books("Пикник на обочине","Братья Стругацкие","научная фантастика",256,4.3f));
        books.add(new Books("Братья Карамазовы","Ф. Достоевкий","роман",992,4.9f));
        AllBooks aB = new AllBooks(books);
        do{
            Menu.menu();
            int selectMenuPoint_0 = scan.nextInt();
            switch (selectMenuPoint_0){
                case 1: aB.allBooksFinal(); break;
                case 2: aB.description();
                case 3: aB.sumPages();
                case 4:
                case 5:
                default:
            }
        } while(menu.subMenu());
    }
}