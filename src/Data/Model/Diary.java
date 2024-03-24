package Data.Model;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String username;
    private String password;
    private boolean isLocked = false;
    private final List<Entry> entries = new ArrayList<>();

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Diary(Diary username) {
        this.username = username.getUsername();
        this.password = password;
        this.isLocked = username.isLocked();
        this.entries.addAll(username.getEntries());
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Entry[] getEntries() {
        return List.of(entries.toArray(new Entry[0]));
    }

    public void addEntry(Entry entry) {
        entries.add(entry);
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public int getId() {
        return 0;
    }

    public void setEntries(Entry[] entries) {
        this.entries.clear();
        for (Entry entry : entries) {
            this.entries.add(entry);
        }
    }
}