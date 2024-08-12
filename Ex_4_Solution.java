class Library {
    public String[] Books;
    public int No_Of_Books;

    Library() {
        this.Books = new String[10];
        this.No_Of_Books = 0;
    }

    public void addBook(String Book) {
        if (No_Of_Books < Books.length) {
            this.Books[No_Of_Books] = Book;
            System.out.println(Book + " Has been added to the library. \n");
            No_Of_Books++;
        } else {
            System.out.println("Sorry sir! The library is full.\n");
        }
    }

    public void showAvailableBooks() {
        System.out.println("The availible books in the library are:");
        for (String book : Books) {
            if (book == null) {
                continue;
            } else {
                System.out.println("* " + book);
            }

        }
        System.out.println();
    }

    public void issueBook(String bookName) {
        for (int i = 0; i < this.Books.length; i++) {
            if (this.Books[i] != null && this.Books[i].equals(bookName)) {
                System.out.println(bookName + " has been issued from the library.\n");
                this.Books[i] = null; // Mark the book as null (unavailable)
                return;
            }
        }
        System.out.println("Sorry, " + bookName + " isn't available in the library.\n");
    }

    public void returnBook(String Book) {

        if (No_Of_Books < Books.length) {
            this.Books[No_Of_Books] = Book;
            System.out.println(Book + " Has been returned to the library.\n");
            No_Of_Books++;
        } else {
            System.out.println("Sorry sir! The library is full.\n");
        }
    }

    public class Ex_4_Solution {
        public static void main(String[] args) {

            Library lb = new Library();

            lb.showAvailableBooks();

            lb.addBook("Think And Grow Rich");
            lb.addBook("Rich Dad Poor Dad");
            lb.addBook("Phycology Of Money");

            lb.showAvailableBooks();

            //lb.issueBook("Think And Grow Rich");
            //lb.issueBook("Rich Dad Poor Dad");
            //lb.issueBook("Phycology Of Money");
            // lb.issueBook("XYZ");

            // lb.returnBook("Phycology Of Money");
            lb.showAvailableBooks();
        }
    }
}
