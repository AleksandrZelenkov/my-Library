import java.util.Scanner;
class Menu{ // Хранит в себе все элементы меню и методы для вывода их в консоль.
    // Colors:
    private static final String RESET_COLOR      = "\u001B[0m";
    private static final String BLACK_TEXT       = "\u001B[30m";
    private static final String WHITE_BACKGRAUND = "\u001B[47m";
    private static final String RED_TEXT         = "\u001B[31m";
    // Heads:
    private static final String HEAD_MENU           = WHITE_BACKGRAUND + BLACK_TEXT+  "\nМеню:                                         "+RESET_COLOR;
    private static final String HEAD_BOOK_SELECTION = WHITE_BACKGRAUND + BLACK_TEXT + "\nВведите номер книги от 1 до %d.               "+RESET_COLOR;
    private static final String HEAD_DESCRIPTION    = WHITE_BACKGRAUND + BLACK_TEXT + "\nОписание:                                     "+RESET_COLOR;
    private static final String HEAD_ALL_BOOKS      = WHITE_BACKGRAUND + BLACK_TEXT + "\nСписок всех книг:                             "+RESET_COLOR;
    private static final String HEAD_ADD_BOOK       = WHITE_BACKGRAUND + BLACK_TEXT + "\nДобавление книги:                             "+RESET_COLOR;
    private static final String HEAD_SUM_PAGES      = WHITE_BACKGRAUND + BLACK_TEXT + "\nСумма страниц всех книг в библиотеке:         "+RESET_COLOR;
    private static final String HEAD_AVERAGE_RATING = WHITE_BACKGRAUND + BLACK_TEXT + "\nСредний рейтинг книг в библиотеке:            "+RESET_COLOR;
    private static final String EMPTY_STRING        =                                 "\n                                              ";

    private static final String POINTS              =                                 "\n1. Список всех книг.                          "+
            "\n2. Описание.                                  "+
            "\n3. Сумма страниц всех книг в библиотеке.      "+
            "\n4. Средний рейтинг книг.                      "+
            "\n5. Добавить книгу.                            ";

    private static final String SUB_MENU            =                                 "\n——————————————————————————————————————————————\n1. Вернуться в меню  ↩|2. Завершение работы ⬅\n——————————————————————————————————————————————";
    private static final String EMPTY_SUB_MENU      =                                 "\n——————————————————————————————————————————————\n                                              \n——————————————————————————————————————————————";

    private static final String DESCRIPLION_BODY    = "\nНазвание:               %s\nАвтор:                  %s\nЖанр:                   %s\nКоличество страниц:     %d\nРейтинг:                %.1f";

    Scanner scan = new Scanner(System.in);
    Books book = new Books();
    protected static void menu(){System.out.println(HEAD_MENU+POINTS+EMPTY_SUB_MENU);}

    protected static void headAllBooks(){System.out.print(HEAD_ALL_BOOKS);}
    protected        void headBookSelection(int size){System.out.printf(HEAD_BOOK_SELECTION,size);}
    protected static void headDescription(){System.out.print(HEAD_DESCRIPTION);}
    protected static void headSumPages(){System.out.print(HEAD_SUM_PAGES);}
    protected static void headAverageRating(){System.out.print(HEAD_AVERAGE_RATING);}


    protected static void emptySubMenu(){System.out.println(EMPTY_SUB_MENU);}

    protected boolean subMenu(){boolean exit = true;
        System.out.println(SUB_MENU);
        int numSubMenu = scan.nextInt();
        switch(numSubMenu){
            case 1: exit = true; break;
            case 2: exit = false; System.out.println("До новых встреч!"); break;
            default:
        }
        return exit;
    }
}