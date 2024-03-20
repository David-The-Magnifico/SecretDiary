package Data.Model;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String username;
    private String password;
    private boolean isLocked = false;
    private final List<Entry> entries = new ArrayList<Entry>();

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Diary(Diary username) {
    }

    public Diary(String david) {
    }

    public String getUsername() {
        return username;
    }

    public Entry[] getEntries() {
        return entries.toArray(new Entry[entries.size()]);
    }

    public void addEntry(Entry entry) {
    }

    public int getId(int id) {
        return id;
    }
}