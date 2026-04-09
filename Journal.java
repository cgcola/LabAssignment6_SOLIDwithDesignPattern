public class Journal implements LibraryResource {
    private String title;

    public Journal(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrowItem() {
        System.out.println("borrowed: " + title + " (Academic Journal)\n");
    }
    
}
