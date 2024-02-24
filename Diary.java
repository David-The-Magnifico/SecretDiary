package src;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String username;
    private String password;
    private boolean isLocked;
    private List<Entry> entries;

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
        this.isLocked = true; //assume that diary is locked initially
        this.entries = new ArrayList<>();
    }

    public void unlockDiary(String password) {
        if (this.password.equals(password)) {
            this.isLocked = false;
        }
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void lockDiary() {
        this.isLocked = true;
    }

    public void createNewDiary(String title, String body) {
        if (isLocked) {entries.add(new Entry(title, body));
        }
    }

    public void addEntry(String title, String body) {
        if
    }


    //create new diary
    //lock diary
    //unlock diary
    //add entry
    //delete entry
    //edit entry
    //find entry by id
}
