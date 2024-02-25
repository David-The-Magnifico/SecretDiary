package src;

import java.util.ArrayList;
import java.util.List;

public class User {

	private Diary secretDiary;

	public void createDiary() {
        	secretDiary = new Diary();
        	secretDiary.lock();
    	}

	public void lockDiary() {
        	secretDiary.lock();
    	}

	public void unlockDiary() {
        	secretDiary.unlock();
    	}

	public Entry findEntryById(int id) {
        	return secretDiary.findEntryById(id);
    	}	

	public void addEntry(Entry entry) {
        	secretDiary.addEntry(entry);
    	}

	public void updateEntry(Entry entry) {
        	secretDiary.updateEntry(entry);
    	}	

	public void deleteEntry(int id) {
        secretDiary.deleteEntry(id);
    }
}