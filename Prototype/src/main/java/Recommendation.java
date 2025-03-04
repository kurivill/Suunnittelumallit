import java.util.ArrayList;
import java.util.Comparator;

public class Recommendation implements Cloneable {

    private String targetAudience;
    private ArrayList<Book> books;

    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }

    @Override
    public Recommendation clone() {
        try {
            Recommendation clone = (Recommendation) super.clone();
            clone.books = new ArrayList<>();
            for (Book book : books) {
                clone.addBook(book.clone());
            }
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }




}
