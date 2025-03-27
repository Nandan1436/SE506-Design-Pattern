public class Magazine implements LibraryItem {
    private String title;
    private String issue;
    private String id;

    public Magazine(String title, String issue, String id) {
        this.title = title;
        this.issue = issue;
        this.id = id;
    }

    public String getID(){
        return this.id;
    }

    @Override
    public void getDetails() {
        System.out.println("Magazine Title: " + title + ", Issue: " + issue);
    }

    @Override
    public void borrowItem(User user) {
        System.out.println(user.getName() + " borrowed the magazine: " + title);
    }
}