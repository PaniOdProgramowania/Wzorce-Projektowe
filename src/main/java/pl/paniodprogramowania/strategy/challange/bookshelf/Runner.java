package pl.paniodprogramowania.strategy.challange.bookshelf;

import java.util.List;

public class Runner {
  public static void main(String[] args) {
    Book comedy = new RomanticComedy();
    Book historical = new Historical();
    Book thriller = new Thriller();
    BookShelf bookShelf = new BookShelf(List.of(comedy, historical, thriller));
    bookShelf.getDusty();
  }
}
