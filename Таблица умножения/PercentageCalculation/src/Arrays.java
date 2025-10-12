import java.util.Scanner;
public class Arrays {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Это список дел.\nВведите первое дело:\n");

        String[] task = new String[10];

        for(int i = 0; i<task.length; i++){
            System.out.println("Дело "+(i+1)+"\n");
            task[i] = scan.nextLine();
        }

        System.out.println("Список дел на сегодня:\n");

        for(int I =0; I<task.length; I++){
            System.out.println(I+1+". "+task[I]);
        }
    }
}