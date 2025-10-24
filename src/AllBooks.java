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

    protected void averageRating(){Menu.headAverageRating();
        float averageRating =0; for(Books i: books){averageRating += i.getRating();}
        averageRating /= books.size();
        Menu.averageRatingBody(averageRating);
    }

    protected void addBook(){
        System.out.print("");
        String name = null; String author = null; String genre = null; int pages = 0; float rating = 0;
        for(int i = 0; i < 6; i++){System.out.print(menu.addBookText.get(i));
            switch(i){
                case 0: name = scan.nextLine();  break;
                case 1: author = scan.nextLine(); break;
                case 2: genre = scan.nextLine(); break;
                case 3: pages = (scan.nextInt());    break;
                case 4: rating = scan.nextFloat(); break;
            }
        }
        books.add(new Books(name, author, genre, pages, rating));
    }
}
