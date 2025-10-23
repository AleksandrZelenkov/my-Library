import java.util.List;
import java.util.Scanner;
class Books{ // Хранит в себе списки и методы для доступа к их содержимому.
    // Поля:
    private String name;        // Название
    private String author;      // Автор
    private String genre;       // Жанр
    private int pages;          // Количество страниц
    private float rating;       // Рейтинг
    // Конструктор:
    public Books(){}
    public Books(String name, String author, String genre, int pages, float rating){
        this.name = name; this.author = author; this.genre = genre; this.pages = pages; this.rating = rating;}
    //Геттеры:
    protected String getName  (){return name;}
    protected String getAuthor(){return author;}
    protected String getGenre (){return genre;}
    protected int    getPages (){return pages;}
    protected float  getRating(){return rating;}

    // Сеттеры:
    protected void setName (String newName)  {this.name = newName;}
    protected void setAuthor(String newAuthor){this.author = newAuthor;}
    protected void setGenre (String newGenre) {this.genre = newGenre;}
    protected void setPages (int    newPages) {this.pages = newPages;}
    protected void setRating(float  newRating){this.rating = newRating;}

    List<String> addBookText = List.of(
            "\nВведите название книги:  ",
            "Введите имя автора:    ",
            "Введите жанр:  ",
            "Введите количество страниц:    ",
            "Введите рейтинг по пятибальной шкале:  ",
            "\n\u001B[32mНовая книга успешно добавлена в библиотеку.\u001B[0m");

    Scanner scan = new Scanner(System.in);

    protected void addBook(){
        System.out.print("");
        for(int i = 0; i < 6; i++){System.out.print(addBookText.get(i));
            switch(i){
                case 0: setName(scan.nextLine());  break;
                case 1: setAuthor(scan.nextLine()); break;
                case 2: setGenre(scan.nextLine()); break;
                case 3: setPages(scan.nextInt());    break;
                case 4: setRating(scan.nextFloat()); break;
            }
        }
    }
}