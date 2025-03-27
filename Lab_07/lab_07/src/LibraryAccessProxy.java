public class LibraryAccessProxy implements LibraryAccess{
    private RealLibraryAccess realLibraryAccess = new RealLibraryAccess();

    @Override
    public void accessItem(String itemID, User user) {
        if (user.hasPermission() || itemID.length()==4) {
            realLibraryAccess.accessItem(itemID, user);
        }
        else {
            System.out.println("Access denied for " + user.getName() + " to item ID: " + itemID);
        }
    }
}
