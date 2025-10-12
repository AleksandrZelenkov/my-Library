import java.util.Scanner;
public class KurvaB {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char[] massive = new char[]{'А','А','Б','В','Г','Д','Е','Ё','Ж','З','И','Й','К','Л','М','Н','О','П','Р','С',
                'Т','У','Ф','Х','Ц','Ч','Ш','Щ','Ъ','Ы','Ь','Э','Ю','Я'};
        while (true){
            System.out.println("Введите номер буквы из русского алфавита.");
            int num = scan.nextInt();

            if (num>=1&num<=33) {
                System.out.println("Этому номеру соответствует буква: " + massive[num]);
            } else if (num==0) {
                System.out.println("Это слово \"Хуй\"");

            } else {
                System.out.println("Нет такой буквы, чурка не русская. \uD83D\uDE01 (◕‿◕) \n");
            }
            }
        }
    }

