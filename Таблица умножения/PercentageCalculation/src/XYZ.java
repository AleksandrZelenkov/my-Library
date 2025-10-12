public class XYZ {
    public static void main (String[]args){

        int population = 10_000_000;
        int birthRate  = 14;
        int mortalityRate = 8;

        for(int i= 1; i<=10; i++){
            population+= population*(birthRate-mortalityRate)/1000;
            if(birthRate>=7) birthRate--;
            if (mortalityRate>=6) mortalityRate--;
            }
        System.out.println("Численность населения через 10 лет составляеет "+population);
    }
    }