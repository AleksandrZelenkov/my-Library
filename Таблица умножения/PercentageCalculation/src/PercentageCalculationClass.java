import java.util.Scanner;
public class PercentageCalculationClass {
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        String[] text = new String[]{

                "Введите сумму вклада, что бы узнать, какой процент вам будет начисляться.",
                "Вы хотите вложить ",
                " рублей. Процент по вкладу на эту сумму составляет ",
                "5%",
                "7%",
                "10%",
                "Простите, вы дебил?"
        };

        while (true){
            System.out.println(text[0]);
            int depositAmount = scan.nextInt();

            if (depositAmount>0&&depositAmount<100_000){
                System.out.println(text[1] + depositAmount + text[2] + text[3]);
            }
            else if (depositAmount>=100_000&&depositAmount<200_000){
                System.out.println(text[1] + depositAmount + text[2] + text[4]);
            }
            else if (depositAmount>=200_000){
                System.out.println(text[1] + depositAmount + text[2] + text[5]);
                }
            else{
                System.out.println(text[6]);
            }
        }
    }
}
