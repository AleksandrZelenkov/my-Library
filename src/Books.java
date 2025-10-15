import java.util.Scanner;
class Books{
    // Поля класса:
    public static int num;
    // Поля объектов:
    private String name;        // Название
    private String author;      // Автор
    private String genre;       // Жанр
    private int pages;          // Количество страниц
    private float rating;       // Рейтинг
    // Инициализатор:
    {name = "Название утрачено"; author = "неизвестен"; genre = "неизвестен"; pages = 0; rating = 0;}
    // Геттеры:
    public int getPages(){return pages;}
    public float getRating(){return rating;}
    // Конструкторы:
    public Books(){num++;}
    public Books(String name, String author, String genre, int pages, float rating){
        this.name = name; this.author = author; this.genre = genre; this.pages = pages; this.rating = rating;
        num++;}

    public String toString(){return name;} // Изменяет текстовое представление объекта.

    // Массив строк для вывода на консоль:
    static String[] text = {"\n\nАвтор: %s\nЖанр: %s\nСтраниц: %d\nРейтинг: %.1f\n\n",
            "\nСумма страниц всех книг в библиотеке: ",
            "\nСредний балл книг в библиотеке: "};

    // Методы:
    Scanner scan = new Scanner(System.in);
    static void greeting(){System.out.printf("В нашей библиотеке хранится %d книг.\n\n",num);}

    void description(){System.out.printf(text[0], author, genre, pages, rating);}

    static void sumPages(int ...pages){
        int sum = 0;
        for (int i: pages){sum+=i;}
        System.out.println(text[1] + sum+"\n");
    }

    static void averageRating(float ...ratings){
        float average = 0;
        for (float a: ratings){average+=a;} average/=ratings.length;
        System.out.printf("%s%.1f\n\n",text[2], average);
    }

    void addBook(){
        String[] text ={
                "Введите название книги:",
                "Введите имя автора:",
                "Введите жанр:",
                "Введите количество страниц:",
                "Введите рейтинг по пятибальной шкале:",
                "\nНовая книга успешно добавлена в библиотеку:"};
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