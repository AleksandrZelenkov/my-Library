import java.util.ArrayList;
class Description {
    ArrayList<Books> books;

    Description(ArrayList<Books> books){this.books = books;}

    AllBooks aB = new AllBooks();
    Menu menu = new Menu();

    public void description(){
        menu.headBookSelection(books.size()); aB.allBooks();

    }
}