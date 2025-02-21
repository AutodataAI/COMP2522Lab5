package bcit.BookStore;

import java.util.Comparator;

public class Lab6Driver
{
    public static void main(final String[] args)
    {

        final BookStore<Literature> store;
        store = new BookStore<>("Store");
        store.addItem(new Novel("War and Peace", "Leo Tolstoy", 1867));
        store.addItem(new ComicBook("Spider-Man"));
        store.addItem(new Magazine("National Geographic"));
        store.printItems(); // Should print titles from different item types
    }
}
