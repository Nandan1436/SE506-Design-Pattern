public class RealLibraryAccess implements LibraryAccess{
    @Override
    public void accessItem(String itemID, User user) {
        System.out.println(user.getName() + " is accessing item ID: " + itemID);
    }
}
