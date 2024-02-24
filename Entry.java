package src;

public class Entry {
    private int id;
    private String title;
    private String body;
    private LocalDateTime dateCreated;

    public Entry(String title, String body) {
        this.title = title;
        this.body = body;
        this.dateCreated = LocalDateTime.now();
        this.id = 0;
    }
}
