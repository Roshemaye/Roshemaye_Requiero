public class Tasksheet123 {
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, 18.99);
        Book book2 = new Book("1984", "George Orwell", 1949, 14.99);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 10.99);

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
    }
}
class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Book [Title: " + title + ", Author: " + author +
               ", Year Published: " + yearPublished + ", Price: $" + price + "]";
    }
}