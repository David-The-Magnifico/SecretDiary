package src;

import java.util.Calendar;
import java.util.List;

public class Diary {
    private String username, password;
    private boolean isLocked;
    private Entry[] entries;
    private int nextId;

    public Diary() {
	this(userame:null, password:null);
    }

     public Diary(String username, String password) {
        this.username = username;
        this.password = password;
        locked = true; //assume that the diary is locked initially
        entries = new Entry[0];
        nextId = 1;
    }

    public void addEntry(Entry entry) {
        Entry[] newEntries = new Entry[entries.length + 1];
        System.arraycopy(entries, 0, newEntries, 0, entries.length);
        newEntries[entries.length] = entry;
        entries = newEntries;
    }

    public Entry findEntryById(int id) {
        for (Entry entry : entries) {
            if (entry.getId() == id) {
                return entry;
            }
        }
        return null;
    }

    public void deleteEntry(int id) {
        Entry[] newEntries = new Entry[entries.length - 1];
        int index = 0;
        for (Entry entry : entries) {
            if (entry.getId() != id) {
                newEntries[index] = entry;
                index++;
            }
        }
        entries = newEntries;
    }