import java.util.*;
/**
 * Write a description of class Catalogo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Catalogo
{
public ArrayList<Book> catalogo;
  
public Catalogo()
  {
    catalogo = new ArrayList<Book>();
    }
    
    public void addBook (Book libro)
    {
    catalogo.add(libro); 
}

public int numberOfBooks()
 { return catalogo.size();
    }
    
public void removeBook (Book libro)
    {
        for(int i=0; i<catalogo.size();i++)
        {
            if (catalogo.get(i).equals(libro)){
                catalogo.remove(i);
            }
        }
    }
    
public void printBook ()
{
    for(int i=0; i<catalogo.size();i++)
        {
            Book libro= catalogo.get(i);
            if(catalogo.get(i).equals(libro)){
                System.out.println("Autor " + libro.getTitle() + " " +   "Autor " + libro.getAuthor()); 
            }
        }
}
}
