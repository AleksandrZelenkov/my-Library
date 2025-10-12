/*Программа будет спрашивать любое целое число, и выводить ряд всех значений, кратных второму числу, находящихся в диапазоне от нуля до первого.*/
import java.util.Scanner;
public class Multiplicity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Эта программа показывает все значения, кратные заданному числу, в заданном диапазоне от: \n(введите число)");
        int aNum = scan.nextInt();
        System.out.println("До:");
        int bNum = scan.nextInt();
        System.out.println("Введите делитель:");
        int cNum = scan.nextInt();
        System.out.println("Все числа, в заданном диапазоне, кратные "+cNum);
        for (;aNum<=bNum; aNum++){
            if (aNum%cNum==0){
                System.out.println(+aNum);
            }
        }
    }
}