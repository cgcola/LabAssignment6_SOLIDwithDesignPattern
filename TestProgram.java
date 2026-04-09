public class TestProgram {
    public static void main(String[] args) {
        Student student1 = new Student("Pedro Mallari", "26-12345-678");
        Student student2 = new Student("Joshua Gallardo", "24-90123-456");
        Student student3 = new Student("Princess Ponce", "25-78901-234");

        LibraryResource book = new Book("Introduction to Algorithms");
        LibraryResource journal = new Journal("IEEE Transactions on Software Engineering");
        LibraryResource audioBook = new AudioBook("The Pragmatic Programmer");

        System.out.println("NEU Library Borrowing Log:\n");
        student1.borrowResource(book);
        student2.borrowResource(journal);
        student3.borrowResource(audioBook);
    }
}
