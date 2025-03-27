public class LibraryConfigManager {
    private static LibraryConfigManager instance;
    private double lateFee;
    private int borrowingLimit;
    private String libraryHours;

    private LibraryConfigManager() {
        this.lateFee = 10;
        this.borrowingLimit = 5;
        this.libraryHours = "11 AM - 4 PM";
    }

    public static LibraryConfigManager getInstance() {
        if (instance == null) {
            synchronized (LibraryConfigManager.class) {
                if (instance == null) {
                    instance = new LibraryConfigManager();
                }
            }
        }
        return instance;
    }

    public double getLateFee() {
        return lateFee;
    }

    public void setLateFee(double lateFee) {
        this.lateFee = lateFee;
    }

    public int getBorrowingLimit() {
        return borrowingLimit;
    }

    public void setBorrowingLimit(int borrowingLimit) {
        this.borrowingLimit = borrowingLimit;
    }

    public String getLibraryHours() {
        return libraryHours;
    }

    public void setLibraryHours(String libraryHours) {
        this.libraryHours = libraryHours;
    }
}
