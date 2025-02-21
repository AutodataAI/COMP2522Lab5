package bcit.BookStore;

public class ComicBook extends Literature
{
    private final String title;

    public ComicBook(final String title)
    {
        validateTitle(title);
        this.title = title;
    }

    private static void validateTitle(final String title)
    {
        if (title == null ||
            title.isBlank())
        {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
    }

    @Override
    public String getTitle(){return title;}
}
