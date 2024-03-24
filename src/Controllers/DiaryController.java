package Controllers;

import Data.Model.Diary;
import Data.Model.Entry;

public class DiaryController {
    private Diary diary;

    public DiaryController(Diary diary) {
        this.diary = diary;
    }

    public void addEntry(int id, String title, String body, String author) {
        Entry newEntry = new Entry(id, title, body, author);
        diary.addEntry(newEntry);
    }

    public Entry[] getEntries() {
        return diary.getEntries();
    }

    public boolean isDiaryLocked() {
        return diary.isLocked();
    }

    public void lockDiary() {
        diary.setLocked(true);
    }

    public void unlockDiary() {
        diary.setLocked(false);
    }
}