public class Book implements LibraryItem {
    private String title;
    private String author;
    private String id;

    public Book(String title, String author,String id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    public String getID(){
        return this.id;
    }

    @Override
    public void getDetails() {
        System.out.println("Book Title: " + title + ", Author: " + author);
    }

    @Override
    public void borrowItem(User user) {
        System.out.println(user.getName() + " borrowed the book: " + title);
    }
}