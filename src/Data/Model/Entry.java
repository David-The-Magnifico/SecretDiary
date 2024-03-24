package Data.Model;

import java.time.LocalDateTime;

public class Entry {
    private int id;
    private String title;
    private String body;
    private LocalDateTime dateCreated = LocalDateTime.now();
    private String author;
    private String username;

    public Entry(int id, String title, String body, String author) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.author = author;
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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return STR."Entry{id=\{id}, title='\{title}\{'\''}, body='\{body}\{'\''}, dateCreated=\{dateCreated}, author='\{author}\{'\''}\{'}'}";
    }
}