package lab2.problem1.LibrarySystem2;

public abstract class LibraryItem {
    private String title;
    private String author;
    private int publicationYear;

    // Constructor, Getters, and Setters
    public LibraryItem(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // TITLE
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // AUTHOR
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // PUBLICATION YEAR
    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public abstract String getType();

    public abstract int getIdShelf();
// toString() and other methods

    @Override
    public String toString() {
        return ("Title: " + title + ", Author: " + author + ", Publication Year: " + publicationYear);
    }

}

