import java.util.Scanner;

class Menu{ // Хранит в себе все элементы меню и методы для вывода их в консоль.
    // Colors:
    private static final String RESET_COLOR      = "\u001B[0m";
    private static final String BLACK_TEXT       = "\u001B[30m";
    private static final String WHITE_BACKGRAUND = "\u001B[47m";
    private static final String RED_TEXT         = "\u001B[31m";
    // Heads:
    private   static final String HEAD_MENU           = WHITE_BACKGRAUND + BLACK_TEXT+    "Меню:                                         "+RESET_COLOR;
    private   static final String HEAD_EMPTY          = WHITE_BACKGRAUND +                "                                              "+RESET_COLOR;
    protected static final String HEAD_BOOK_SELECTION = WHITE_BACKGRAUND + BLACK_TEXT +   "Введите номер книги от 1 до %d.               "+RESET_COLOR;
    private   static final String HEAD_DESCRIPTION    = WHITE_BACKGRAUND + BLACK_TEXT +   "Описание:                                     "+RESET_COLOR;
    private   static final String EMPTY_STRING        =                                 "\n                                              ";
    private   static final String HEAD_ALL_BOOKS      = WHITE_BACKGRAUND + BLACK_TEXT +   "Список всех книг:                             "+RESET_COLOR;
    private   static final String POINTS              =                                 "\n1. Список всех книг.                          "+
            "\n2. Описание.                                  "+
            "\n3. Сумма страниц всех книг в библиотеке.      "+
            "\n4. Средний рейтинг книг.                      "+
            "\n5. Добавить книгу.                            ";
    private   static final String SEPARATOR           =                                 "\n——————————————————————————————————————————————";
    private   static final String returnMenu          =                                 "\n1. Вернуться в меню  ↩|2. Завершение работы ⬅";
    private   static final String exit                =                                 "\n2. Завершение работы ⬅                        ";
    protected static final String SUM_PAGES           = WHITE_BACKGRAUND + BLACK_TEXT +   "Сумма страниц всех книг в библиотеке:         "+RESET_COLOR;
    protected static final String AVERAGE_RATING      = WHITE_BACKGRAUND + BLACK_TEXT +   "Средний рейтинг книг в библиотеке:            "+RESET_COLOR;
    protected static final String ADD_BOOK            = WHITE_BACKGRAUND + BLACK_TEXT +   "Добавление книги:                             "+RESET_COLOR;

    protected static final String descriptionBody = HEAD_DESCRIPTION + "\nНазвание:               %s\nАвтор:                  %s\nЖанр:                   %s\nКоличество страниц:     %d\nРейтинг:                %.1f";

    Scanner scan = new Scanner(System.in);
    Books book = new Books();
    protected static void menu(){System.out.println(HEAD_MENU+POINTS+SEPARATOR+EMPTY_STRING+SEPARATOR);}
    protected static void headAllBooks(){System.out.print(HEAD_ALL_BOOKS);}
    protected        void headBookSelection(){System.out.printf(HEAD_BOOK_SELECTION, book.getSize());}

    protected static void emptySubMenu(){System.out.println(SEPARATOR+ EMPTY_STRING + SEPARATOR);}
    protected boolean subMenu(){boolean exit = true;
        System.out.println(SEPARATOR+ returnMenu + SEPARATOR);
        int numSubMenu = scan.nextInt();
        switch(numSubMenu){
            case 1: exit = true; break;
            case 2: exit = false; System.out.println("До новых встреч!"); break;
            default:
        }
        return exit;
    }
}