import java.util.Scanner;
class Menu{
    Scanner scan = new Scanner(System.in);
    static String head1     = "\u001B[47m"+"\u001B[30mМеню:                                         \u001B[0m";
    static String head2     =              "\u001B[47m                                              \u001B[0m";
    static String points    =                      "\n1. Список всех книг.                          "+
            "\n2. Описание.                                  "+
            "\n3. Сумма страниц всех книг в библиотеке.      "+
            "\n4. Средний рейтинг книг.                      "+
            "\n5. Добавить книгу.                            ";
    static String separator =                      "\n——————————————————————————————————————————————";
    String[] exitAndReturn  =                     {"\n1. Вернуться в меню  ↩                        ",
            "\n2. Завершение работы ⬅                        "};

    static void error(){System.out.println("\n\u001B[31mОшибка\u001B[0m");}

    public static boolean exit = true;
    void exitAndReturnTheMenu(){System.out.print(separator+exitAndReturn[0]+exitAndReturn[1]+"\u001B[0m"+"\n"+separator);
        int exitReturn = scan.nextInt();
        switch(exitReturn){
            case 1: exit = true;  break;
            case 2: exit = false; System.out.println("До новых встреч!"); break;
            default: Menu.error();
        }
    }
}