import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Books{ // Хранит в себе списки и методы для доступа к их содержимому.
    ArrayList<String> name   = new ArrayList<String> (List.of("Географ глобус пропил", "Вегетация"         , "Пикник на обочине" , "Братья Карамазовы"));
    ArrayList<String> author = new ArrayList<String> (List.of("А. Иванов"            , "А.Иванов"          , "Братья Стругацкие" , "Ф. Достоевский"   ));
    ArrayList<String> genre  = new ArrayList<String> (List.of("роман"                , "научная фантастика", "научная фантастика", "роман"            ));
    ArrayList<Integer>pages  = new ArrayList<Integer>(List.of( 992                   ,  536                ,  256                ,  992               ));
    ArrayList<Float>  rating = new ArrayList<Float>  (List.of( 4.9f                  ,  4.7f               ,  4.3f               ,  4.9f              ));
    //Геттеры:
    protected String getName  (int num){return name.get(num);}
    protected String getAuthor(int num){return author.get(num);}
    protected String getGenre (int num){return genre.get(num);}
    protected int    getPages (int num){return pages.get(num);}
    protected float  getRating(int num){return rating.get(num);}
    protected int    getSize  ()       {return name.size();}
    // Сеттеры:
    protected boolean setName  (String newName)  {return name.add(newName);}
    protected boolean setAuthor(String newAuthor){return author.add(newAuthor);}
    protected boolean setGenre (String newGenre) {return genre.add(newGenre);}
    protected boolean setPages (int    newPages) {return pages.add(newPages);}
    protected boolean setRating(float  newRating){return rating.add(newRating);}

    protected void listOfOllBooks(){
        for(String names: name){System.out.print("\n"+(1+name.indexOf(names))+". "+names);}
    }
    protected void description(int numBook){
        numBook-=1;
        System.out.printf(Menu.descriptionBody, getName(numBook), getAuthor(numBook), getGenre(numBook), getPages(numBook), getRating(numBook));
    }
    protected void sumPages(){
        int sumPages = 0;
        for(int i: pages){sumPages += i;}
        System.out.print(Menu.SUM_PAGES +"\n"+sumPages+"\n\n\n\n");
    }
    protected void averageRating(){
        int sumRating = 0;
        for(int i: pages){sumRating += i;}
        System.out.print(Menu.AVERAGE_RATING+"\n"+sumRating/rating.size()+"\n\n\n\n");
    }

    List<String> addBookText = List.of(
            "\nВведите название книги:  ",
            "Введите имя автора:    ",
            "Введите жанр:  ",
            "Введите количество страниц:    ",
            "Введите рейтинг по пятибальной шкале:  ",
            "\n\u001B[32mНовая книга успешно добавлена в библиотеку.\u001B[0m");

    Scanner scan = new Scanner(System.in);

    protected void addBook(){
        System.out.print(Menu.ADD_BOOK);
        for(int i = 0; i < 6; i++){System.out.print(addBookText.get(i));
            switch(i){
                case 0: name.add(scan.nextLine());  break;
                case 1: author.add(scan.nextLine()); break;
                case 2: genre.add(scan.nextLine()); break;
                case 3: pages.add(scan.nextInt());    break;
                case 4: rating.add(scan.nextFloat()); break;
            }
        }
    }
}