import java.util.Scanner;
import java.util.ArrayList;
class AllBooks {
    Scanner scan = new Scanner(System.in);
    ArrayList<Books> books;
    Menu menu = new Menu();

    AllBooks(ArrayList<Books> books){this.books = books;}

    protected void allBooks(){int j =0; for(Books i: books){j++; System.out.print("\n"+j+". "+i.getName());}}
    protected void allBooksFinal(){Menu.headAllBooks(); allBooks();}

    protected void description() {menu.headBookSelection(books.size()); allBooks(); Menu.emptySubMenu();
        int bookSelect = scan.nextInt();
        Menu.headDescription();
        menu.descriptionBody(books.get(bookSelect -1));
    }

    protected void sumPages(){Menu.headSumPages(); int sumPages =0; for(Books i: books){sumPages += i.getPages();} Menu.sumPagesBody(sumPages);}

    protected void averageRating(){}
}
