public class Main {
    public static void main(String[] args) {
        LibraryItemFactory factory = new LibraryItemFactory();
        LibraryItem item1 = factory.createLibraryItem("book","Sherlock Holmes","Arthor Canon Doyle","1436");
        LibraryItem item2 = factory.createLibraryItem("magazine","Lifestyle","Daily Star","1448");
        LibraryItem item3 = factory.createLibraryItem("book","History","Nandan","13700");

        User user1 = new User("Ismail",true);
        User user2 = new User("Protta", false);

        LibraryAccess accessUser1 = new LibraryAccessProxy();
        accessUser1.accessItem(((Book) item1).getID(),user1);

        LibraryAccess accessUser2 = new LibraryAccessProxy();
        accessUser2.accessItem(((Magazine) item2).getID(),user2);

        accessUser2.accessItem(((Book) item3).getID(),user2);

        LibraryConfigManager configManager = LibraryConfigManager.getInstance();
        System.out.println(configManager.getLateFee());
        configManager.setLateFee(20);
        System.out.println(configManager.getLateFee());

    }
}