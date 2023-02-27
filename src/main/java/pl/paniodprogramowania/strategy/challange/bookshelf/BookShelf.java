package pl.paniodprogramowania.strategy.challange.bookshelf;

import java.util.List;

public class BookShelf {
  private List<Book> books;

  public BookShelf(List<Book> books) {
    this.books = books;
  }

  public void getDusty(){
    System.out.println("On this shelf these books get dusty:");
    for (Book book : books) {
      System.out.println(book.bookGenre());
    }
  }
}
