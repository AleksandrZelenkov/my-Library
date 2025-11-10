import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyLibrary3_0 {
    public static void main(String[] args) throws FileNotFoundException {
        boolean tumbler = false;
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();

        ArrayList<Books> books = new ArrayList<>();
        books.add(new Books("Географ глобус пропил","А. Иванов","роман",992,4.9f, "geographer"));
        books.add(new Books("Вегетация","А. Иванов","научная фантастика",536,4.7f, "vegetation"));
        books.add(new Books("Пикник на обочине","Братья Стругацкие","научная фантастика",256,4.3f, "picnic"));
        books.add(new Books("Братья Карамазовы","Ф. Достоевкий","роман",992,4.9f,"theBrothersKaramazov"));
        AllBooks aB = new AllBooks(books);

        do{if(tumbler){ menu.mistakeMenu();} else Menu.menu();
            tumbler = false;

                int selectMenuPoint_0 = scan.nextInt();
                switch (selectMenuPoint_0) {
                    case 1: aB.allBooksFinal(); break;
                    case 2: aB.description(); break;
                    case 3: aB.sumPages(); break;
                    case 4: aB.averageRating(); break;
                    case 5: aB.addBook(); break;
                    case 6: aB.content(); break;
                    default: tumbler = true;
                }
        } while(tumbler||menu.subMenu());
    }
}