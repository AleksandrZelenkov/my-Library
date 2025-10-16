import java.util.Scanner;
class Statics{
    Scanner scan = new Scanner(System.in);
    // Массив строк для вывода на консоль:
    static String[] text = {"\n\nАвтор: %s\nЖанр: %s\nСтраниц: %d\nРейтинг: %.1f\n\n",
            "\nСумма страниц всех книг в библиотеке: ",
            "\nСредний балл книг в библиотеке: ",
            "Что бы вернуться в меню, нажмите ↩"};

    static void greeting(){System.out.printf("В нашей библиотеке хранится %d книг.\n\n",Books.num);}

    static void sumPages(int ...pages){
        int sum = 0;
        for (int i: pages){sum+=i;}
        System.out.println(text[1] + sum+"\n");
    }

    static void averageRating(float ...ratings){
        float average = 0;
        for (float a: ratings){average+=a;} average/=ratings.length;
        System.out.printf("%s%.1f\n\n",text[2], average);
    }
}