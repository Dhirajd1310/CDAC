class Book {
    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
}

class Library {
    private String libraryName;
    private static int totalBooks = 0;

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public void addBook(Book b) {
        totalBooks++;
        System.out.println("Book Added: " + b.getTitle() + " by " + b.getAuthor());
    }

    public void displayTotalBooks() {
        System.out.println("Total Books in Library: " + totalBooks);
    }
}

class BookLibrary17 {
    public static void main(String[] args) {
        Library lib = new Library("City Central Library");

        Book b1 = new Book(101, "Java Programming", "James Gosling");
        Book b2 = new Book(102, "Python Basics", "Guido van Rossum");

        lib.addBook(b1);
        lib.addBook(b2);

        lib.displayTotalBooks();
    }
}
