import java.util.ArrayList;
class AllBooks {
    ArrayList<Books> books;

    AllBooks(){}
    AllBooks(ArrayList<Books> books){this.books = books;}

    protected void allBooks(){int j =0; for(Books i: books){j++; System.out.print("\n"+j+". "+i.getName());}}
    protected void allBooksFinal(){Menu.headAllBooks(); allBooks();}
}