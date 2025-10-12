import java.util.Scanner;
public class СalculatorB {
    public static void main (String [] args){

        Scanner aScan = new Scanner(System.in);
        Scanner bScan = new Scanner(System.in);

        System.out.println("Первое Число");
        float aNum = aScan.nextFloat();

        System.out.println("Действие");
        String action = bScan.nextLine();

        System.out.println("Второе Число");
        float bNum = aScan.nextFloat();

float answer = 0;

        if (action.equals("+")){
            answer = aNum + bNum;
        } else if (action.equals("-")){
            answer = aNum - bNum;
        } else if (action.equals("*")) {
            answer = aNum * bNum;
        } else if (action.equals("/")){
            answer = aNum/bNum;
        }
        System.out.println("Ответ: "+ answer);
    }
}