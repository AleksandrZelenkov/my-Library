import java.util.Scanner;
class Books extends Statics{
    // Поля класса:
    public static int sumBooks;
    // Поля объектов:
    private String name;        // Название
    private String author;      // Автор
    private String genre;       // Жанр
    private int pages;          // Количество страниц
    private float rating;       // Рейтинг
    // Инициализатор:
    {name = "\u001B[31mНазвание утрачено\u001B[0m"; author = "\u001B[31mнеизвестен\u001B[0m"; genre = "\u001B[31mнеизвестен\u001B[0m"; pages = 0; rating = 0;}
    // Геттеры:
    public int getPages(){return pages;}
    public float getRating(){return rating;}
    // Конструкторы:
    public Books(){sumBooks++;}
    public Books(String name, String author, String genre, int pages, float rating){
        this.name = name; this.author = author; this.genre = genre; this.pages = pages; this.rating = rating;
        sumBooks++;}

    public String toString(){return name;} // Изменяет текстовое представление объекта.

    // Методы:
    Scanner scan = new Scanner(System.in);

    void description(){System.out.printf(text[0], author, genre, pages, rating);}

    void addBook(){
        String[] text ={
                "Введите название книги:",
                "Введите имя автора:",
                "Введите жанр:",
                "Введите количество страниц:",
                "Введите рейтинг по пятибальной шкале:",
                "\n\u001B[32mНовая книга успешно добавлена в библиотеку:\u001B[0m"};
        for(int i = 0; i<6;i++){
            System.out.println(text[i]);
            switch(i){
                case 0: this.name=scan.nextLine(); break;
                case 1: this.author=scan.nextLine(); break;
                case 2: this.genre=scan.nextLine(); break;
                case 3: this.pages=scan.nextInt(); break;
                case 4: this.rating=scan.nextFloat(); break;
            }
        }
    }
}