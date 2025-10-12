import java.util.Scanner;
public class RockingChair {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Waifu waifu1 = new Waifu();
        waifu1.name = "Хоро";
        waifu1.age = 600;
        waifu1.type = "Волчица из Йойса";
        waifu1.height = 156;

        Waifu waifu2 = new Waifu();
        waifu2.name = "Апогее";
        waifu2.age = 15;
        waifu2.type = "собака (помесь лайки и шпица)";
        waifu2.height = 150;

        System.out.println("Введите рост и возраст вашей вайфу: ");
        int heightIn = scan.nextInt();
        int ageIn = scan.nextInt();


        if (heightIn == waifu1.height & ageIn == waifu1.age) {
                waifu1.characteristic();
        } else if (heightIn == waifu2.height & ageIn == waifu2.age) {
                waifu2.characteristic();
        } else {
                System.out.println("Таких не знаю.");
        }


    }
}

class Waifu{

        String name;
        int age;
        int height;
        String type;

    void characteristic(){
        System.out.println("Вашу вайфу зовут "+name+", она "+type+", возрастом около "+age+" лет, и ростом около "+height+" См.");
    }

}