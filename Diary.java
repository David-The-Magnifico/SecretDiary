package src;

import java.util.Calendar;
import java.util.List;

public class Diary {
    private String username, password;
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
        if (isLocked) {
            entries.add(new Entry(title, body));
        }
    }

    public void addEntry(Diary diary, Entry entry) {
        if (diary != null && !diary.isLocked()) {
            diary.getEntries().add(entry);
        }
    }

    private Calendar getEntries() {
        return null;
    }

    public void deleteEntry(Diary diary) {
        if (diary != null) {
            diaries.remove(diary);
        }
    }

    public void updateDiary(Diary diary, String newUsername, String newPassword) {
        if (diary != null && !diary.isLocked()) {
            diary.setUsername(newUsername);
            diary.setPassword(newPassword);
        }
    }

    public Entry findEntryById(Diary diary, int id) {
        if (diary != null && !diary.isLocked()) {

            for (Entry entry : diary.getEntries()) {
                if (entry.getId() == id) {
                    return entry;
                }
            }


        }
        return null;
    }

}