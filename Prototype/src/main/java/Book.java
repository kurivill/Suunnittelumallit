public class Book implements Cloneable {

    private String author;
    private String title;
    private Genre genre;
    private int year;
    private int pages;

    public Book(String author, String title, Genre genre, int year, int pages) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book Details:\n" +
                "  Author: " + author + "\n" +
                "  Title: " + title + "\n" +
                "  Genre: " + genre + "\n" +
                "  Year: " + year + "\n" +
                "  Pages: " + pages;
    }

    @Override
    public Book clone() {
        try {
            return (Book) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
