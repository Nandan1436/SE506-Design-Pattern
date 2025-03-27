public class LibraryItemFactory {
    public static LibraryItem createLibraryItem(String type, String title, String authorOrIssue,String id) {
        switch (type.toLowerCase()) {
            case "book":
                return new Book(title, authorOrIssue, id);
            case "magazine":
                return new Magazine(title, authorOrIssue, id);
            default:
                throw new IllegalArgumentException("Invalid item type");
        }
    }
}