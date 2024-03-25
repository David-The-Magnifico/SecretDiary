package Controllers;

import Data.Model.Diary;
import Data.Model.Entry;

import java.util.Collection;

public class DiaryController {
    private Diary diary;

    public DiaryController(Diary diary) {
        this.diary = diary;
    }

    public void addEntry(int id, String title, String body, String author) {
        Entry newEntry = new Entry(id, title, body, author);
        diary.addEntry(newEntry);
    }

    
}
