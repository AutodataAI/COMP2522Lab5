package bcit.BookStore;

import java.util.Comparator;

public class Lab6Driver
{
    public static void main(final String[] args)
    {
        //Bonus 1 commented out below, isn't working currently

    //        items.sort(new Comparator<Literature>())
    //        {
    //            @Override
    //            public int compare(final Literature o1,
    //            final Literature o2)
    //            {
    //                return Integer.compare(o1.getTitle().length(), o2.getTitle().length());
    //            }
    //        };

        final BookStore<Literature> store;
        store = new BookStore<>("Store");
        store.addItem(new Novel("War and Peace", "Leo Tolstoy", 1867));
        store.addItem(new ComicBook("Spider-Man"));
        store.addItem(new Magazine("National Geographic"));
        store.printItems(); // Should print titles from different item types
    }
}
