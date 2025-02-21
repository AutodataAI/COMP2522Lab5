package bcit.BookStore;

public class Magazine extends Literature
{
    private final String title;

    public Magazine(final String title)
    {
        validateTitle(title);
        this.title = title;

    }

    @Override
    public String getTitle() { return title;}

    private static void validateTitle(final String title)
    {
        if (title == null ||
            title.isBlank())
        {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
    }
}
