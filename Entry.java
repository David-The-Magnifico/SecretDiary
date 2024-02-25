package src;
import java.time.LocalDateTime;

public class Entry {
    public static int Entry;
    private int id;
    private String title, body;

    public Entry(String title, String body) {
        int nextId = 0;
        this.id = nextId++;
        this.title = title;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }