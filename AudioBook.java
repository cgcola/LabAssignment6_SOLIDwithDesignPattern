//A new resource type added to test for future added features
public class AudioBook implements LibraryResource {
    private String title;

    public AudioBook(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrowItem() {
        System.out.println("accessed: " + title + " (Audio Book)\n");
    }
    
}
