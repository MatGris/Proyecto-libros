/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
public class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private int borrowed;
    private boolean isBorrowed;

    /**
     * Set the author, title, and number of pages
     * fields when this object is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numberPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numberPages;
        borrowed = 0;
        isBorrowed = false;
    }

    // Add the methods here ...
    public String getAuthor() //consulta el autor del libro.
    {
        return author;
    }
    
    public String getTitle() //consulta el titulo del libro.
    {
        return title;
    }
    
    public int getPages() //consulta cuantas paginas tiene el libro.
    {
        return pages;
    }
    
    public int getBorrowed() //consulta cuantas veces se presto.
    {
        return borrowed;
    }
    
    public void borrow() //comando, simula prestar el libro.
    {
        assert (isBorrowed == false): "El libro ya esta prestado.";
        borrowed += 1;
        isBorrowed = true;
    }
    
    public boolean isBorrowed() //consulta si esta prestado.
    {
        return isBorrowed;
    }

    public void orderBook() //comando, simula pedir el libro solo si esta prestado.
    {
        assert (isBorrowed == true): "El libro no esta prestado.";
        isBorrowed = false;
    }
}

