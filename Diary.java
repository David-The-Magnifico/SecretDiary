package src;

import java.util.ArrayList;

public class Diary {
    private String username, password;
    private boolean isLocked;
    private src.Entry[] entries;

    public Diary() {
        this(null, null);
    }

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
        boolean locked = true; //assume that the diary is locked initially
        entries = new src.Entry[0];
        int nextId = 1;
    }

    public void addEntry(src.Entry entry) {
        src.Entry[] newEntries = new src.Entry[entries.length + 1];
        System.arraycopy(entries, 0, newEntries, 0, entries.length);
        newEntries[entries.length] = entry;
        entries = newEntries;
    }

    public src.Entry findEntryById(int id) {
        for (src.Entry entry : entries) {
            if (entry.getId() == id) {
                return entry;
            }
        }
        return null;
    }

    public void deleteEntry(int id) {
        src.Entry[] newEntries = new src.Entry[entries.length - 1];
        int index = 0;
        for (src.Entry entry : entries) {
            if (entry.getId()!= id) {
                newEntries[index] = entry;
                index++;
            }
        }
        entries = newEntries;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void lockDiary() {
        isLocked = true;
    }

    public void unlockDiary(String password) {
        if (this.password.equals(password)) {
            isLocked = false;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Entry[] getEntries() {
        return entries;
    }

    public static Diary findDiaryByUsername(String username) {
        for (Diary diary : Diary.getAllDiaries()) {
            if (diary.getUsername().equals(username)) {
                return diary;
            }
        }
        return null;
    }

    public static void deleteDiary(String username) {
        Diary diary = findDiaryByUsername(username);
        if (diary!= null) {
            diary.setEntries(new src.Entry[0]);
        }
    }

    private void setEntries(src.Entry[] entries) {
        this.entries = entries;
    }

    public static Diary[] getAllDiaries() {
        Diary[] diaries = new Diary[0];
        for (Diary diary : diaries) {
            if (diary.getUsername()!= null) {
                ArrayList<Diary> diariesList = new ArrayList<>();
                diariesList.add(diary);
                diaries = diariesList.toArray(diaries);
            }
        }
        return diaries;
    }

    public Object lock() {
        Object lock = null;
        return lock;
    }

    public Object unlock() {
        Object unlock = null;
        return unlock;
    }

    public void updateEntry(Entry entry) {
        Entry[] newEntries = new Entry[entries.length];
        for (int i = 0; i < entries.length; i++) {
            if (entries[i].getId() == entry.getId()) {
                newEntries[i] = entry;
            } else {
                newEntries[i] = entries[i];
            }
        }
        entries = newEntries;
    }
}