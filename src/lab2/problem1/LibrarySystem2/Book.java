package lab2.problem1.LibrarySystem2;

public class Book extends LibraryItem {
    private int numberOfPages;
    private int idShelf;
    public Book(String title, String author, int year, int pages) {
        super(title, author, year);
        this.numberOfPages = pages;
    }

    public Book(String title,  String author, int year, int pages, int idShelf) {
        super(title, author, year);
        this.numberOfPages = pages;
        this.idShelf = idShelf;
    }

    // Number of pages
    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }


    // Id Shelf
    @Override
    public int getIdShelf() {
        return idShelf;
    }

    public void setIdShelf(int idShelf) {
        this.idShelf = idShelf;
    }

    @Override
    public String getType() {
        return "Type of item in the library: Book ";
    }

    @Override
    public String toString() {
        return (super.toString() + "Type: Book, Number of pages: " + numberOfPages );
    }








// continue with anything necessary
}
