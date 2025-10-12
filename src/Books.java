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
    // Сеттеры:
    public void setName(String name){this.name = name;}
    public void setAuthor(String author){this.author = author;}
    public void setGenre(String genre){this.genre = genre;}
    public void setPages(int pages){this.pages = pages;}
    public void setRating(float rating){this.rating = rating;}
    // Геттеры:
    public String getName(){return name;}
    public String getAuthor(){return author;}
    public String getGenre(){return genre;}
    public int getPages(){return pages;}
    public float getRating(){return rating;}
    // Конструкторы:
    public Books(){text[0] = "Пустая книга. Название утрачено.\n\nАвтор: никто\nЖанр: нет\nСтраниц: 0\nРейтинг: 0\n\n"; num++;}
    public Books(String name, String author, String genre, int pages, float rating){
        this.name = name; this.author = author; this.genre = genre; this.pages = pages; this.rating = rating;
        num++;}

    // Массив строк для вывода на консоль:
    String[] text = {"\n%s:\n\nАвтор: %s\nЖанр: %s\nСтраниц: %d\nРейтинг: %.1f\n\n",
            "\nСумма страниц всех книг в библиотеке: ",
            "\nСредний балл книг в библиотеке: "};

    // Методы:
    Scanner scan = new Scanner(System.in);
    static void greeting(){System.out.printf("В нашей библиотеке хранится %d книг.\n\n",num);}

    void description(){System.out.printf(text[0], name, author, genre, pages, rating);}

    void sumPages(int ...pages){
        int sum = 0;
        for (int i: pages){sum+=i;}
        System.out.println(text[1] + sum+"\n");
    }

    void averageRating(float ...ratings){
        float average = 0;
        for (float a: ratings){average+=a;} average/=ratings.length;
        System.out.printf("%s%.1f\n\n",text[2], average);
    }

    void addBook(){
        String[] text ={"Введите название книги:",
                "Введите имя автора:",
                "Введите жанр:",
                "Введите количество страниц:",
                "Введите рейтинг по пятибальной шкале:",
                "\nНовая книга успешно добавлена в библиотеку:"};
        System.out.println(text[0]);
        this.name = scan.nextLine();
        System.out.println(text[1]);
        this.author = scan.nextLine();
        System.out.println(text[2]);
        this.genre = scan.nextLine();
        System.out.println(text[3]);
        this.pages = scan.nextInt();
        System.out.println(text[4]);
        this.rating = scan.nextFloat();
        System.out.println(text[5]);
        description();
    }
}