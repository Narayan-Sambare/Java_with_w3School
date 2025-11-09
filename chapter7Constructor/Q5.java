/*
Q5. Problem:
 Create a class Book with fields:
bookId, title, author, and price.
Use:
1.A default constructor to print “Book object created”.
2.A parameterized constructor with bookId and title.
3.Another parameterized constructor with bookId, title, author, and price
 that calls the previous `constructor using this() (constructor chaining).
Add a method display() to show book details.
Hint:
 Use this(bookId, title) inside the main constructor to reuse initialization logic.
Explanation:
 This question checks understanding of constructor chaining, which helps avoid code duplication inside multiple constructors.
*/
public class Q5 {
    public static void main(String[] args) {
        Book b = new Book(1, "Java", "Tushar", 500);
        b.show();
    }
}
class Book {
    int bookId;
    String title;
    String author;
    int price;

    Book() {
        System.out.println("Book object created");
    }

    Book(int bookId, String title) {
        this();
        this.bookId = bookId;
        this.title = title;
    }

    Book(int bookId, String title, String author, int price) {
       
        this(bookId, title); // constructor chaining
        this.author = author;
        this.price = price;
    }

    void show() {
        System.out.println("Book id = " + bookId + " Title = " + title + 
                           " Author = " + author + " Price = " + price);
    }
}


