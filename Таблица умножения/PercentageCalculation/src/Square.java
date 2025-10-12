
import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Figure figure = new Figure();

        while (true) {
            System.out.println("Это прграмма для расчёта площади, или объёма фигуры.\nВыберите фигуру (введите номер):\n\n" +
                    "1. Прямоугольник.\n" +
                    "2. Треугольник.\n" +
                    "3. Куб\n");

            int figureSelection = scan.nextInt();

            switch (figureSelection) {
                case 1:
                    figure.rectangleVoid();
                    break;
                case 2:
                    figure.triandleVoid();
                    break;
                case 3:
                    figure.cubeVoid();
                    break;
                default:
                    System.out.println("Неправильный номер фигуры.");
                    break;
            }
            figure.ansver();
        }
    }
}
class Figure {
    Scanner scan2 = new Scanner(System.in);
    int a; //Длина
    int b; //Высота
    int c; //Глубина
    float s; //Площадь
    String ansverText = "Площадь фигуры равна: ";

    void rectangleVoid(){
        System.out.println("Введите длину и высоту прямоугольника:");
        a = scan2.nextInt();
        b = scan2.nextInt();

        s = a*b;
    }

    void triandleVoid(){
        System.out.println("Введите длину основания и высоту треугольника:");
        a = scan2.nextInt();
        b = scan2.nextInt();

        s = (float)(a*b)/2;
    }

    void cubeVoid(){
        System.out.println("Введите длину, высоту и глубину куба:");
        a = scan2.nextInt();
        b = scan2.nextInt();
        c = scan2.nextInt();

        s = a*b*c;

        ansverText = "Объём фигуры равен: ";
    }
    void ansver(){
        System.out.println(ansverText+s+"\n");
    }
}