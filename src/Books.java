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
    public Books(String name, String author, String genre, int pages, float rating){
        this.name = name; this.author = author; this.genre = genre; this.pages = pages; this.rating = rating;}
    //Геттеры:
    protected String getName  (){return name;}
    protected String getAuthor(){return author;}
    protected String getGenre (){return genre;}
    protected int    getPages (){return pages;}
    protected float  getRating(){return rating;}
}
