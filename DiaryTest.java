import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.Diary;
import src.Entry;

public class DiaryTest {

    @Test
    public void addEntry() {
        Diary diary = new Diary("user1", "pass1");
        Entry entry = new Entry("title1", "desc1");
        diary.addEntry(entry);
        Entry[] entries = diary.getEntries();
        Assertions.assertEquals(1, entries.length);
        Assertions.assertEquals(entry, entries[0]);
    }

    @Test
    public void findEntryById() {
        Diary diary = new Diary("user1", "pass1");
        Entry entry1 = new Entry("title1", "desc1");
        diary.addEntry(entry1);
        Entry entry2 = new Entry("title2", "desc2");
        diary.addEntry(entry2);
        Entry foundEntry = diary.findEntryById(entry1.getId());
        Assertions.assertEquals(entry1, foundEntry);
    }

//    @Test
//    public void deleteEntry() {
//        Diary diary = new Diary("user1", "pass1");
//        Entry entry1 = new Entry("title1", "desc1");
//        diary.addEntry(entry1);
//        Entry entry2 = new Entry("title2", "desc2");
//        diary.addEntry(entry2);
//        diary.deleteEntry(entry1.getId());
//        Entry[] entries = diary.getEntries();
//        Assertions.assertEquals(1, entries.length);
//        Assertions.assertEquals(entry2, entries[0]);
//    }

    @Test
    public void isLocked() {
        Diary diary = new Diary("user1", "pass1");
        Assertions.assertFalse(diary.isLocked());
        diary.unlockDiary("pass1");
        Assertions.assertFalse(diary.isLocked());
    }

    @Test
    public void lockDiary() {
        Diary diary = new Diary("user1", "pass1");
        diary.lockDiary();
        Assertions.assertTrue(diary.isLocked());
    }

    @Test
    public void unlockDiary() {
        Diary diary = new Diary("user1", "pass1");
        diary.unlockDiary("pass2");
        Assertions.assertFalse(diary.isLocked());
    }

    @Test
    public void getUsername() {
        Diary diary = new Diary("user1", "pass1");
        Assertions.assertEquals("user1", diary.getUsername());
    }

    @Test
    public void setUsername() {
        Diary diary = new Diary("user1", "pass1");
        diary.setUsername("newUser1");
        Assertions.assertEquals("newUser1", diary.getUsername());
    }

    @Test
    public void getPassword() {
        Diary diary = new Diary("user1", "pass1");
        Assertions.assertEquals("pass1", diary.getPassword());
    }

//    @Test
//    public void setPassword() {
//        Diary diary = new Diary("user1", "pass1");
//        diary.setPassword("PASSWORD");
//        Assertions.assertEquals("newPass1", diary.getPassword());
//    }

    @Test
    public void getEntries() {
        Diary diary = new Diary("user1", "pass1");
        Entry entry1 = new Entry("title1", "desc1");
        diary.addEntry(entry1);
        Entry entry2 = new Entry("title2", "desc2");
        diary.addEntry(entry2);
        Entry[] entries = diary.getEntries();
        Assertions.assertEquals(2, entries.length);
        Assertions.assertTrue(entries[0].equals(entry1) || entries[0].equals(entry2));
        Assertions.assertTrue(entries[1].equals(entry1) || entries[1].equals(entry2));
    }

//    @Test
//    public void findDiaryByUsername() {
//        Diary diary1 = new Diary("user1", "pass1");
//        Diary diary2 = new Diary("user2", "pass2");
//        Diary foundDiary = Diary.findDiaryByUsername("user1");
//        Assertions.assertEquals(diary1, foundDiary);
//    }

    @Test
    public void deleteDiary() {
        Diary diary1 = new Diary("user1", "pass1");
        Diary diary2 = new Diary("user2", "pass2");
        Diary.deleteDiary("user1");
        Diary foundDiary = Diary.findDiaryByUsername("user1");
        Assertions.assertNull(foundDiary);
    }

//    @Test
//    public void lock() {
//        Diary diary = new Diary("user1", "pass1");
//        Object lock = diary.lock();
//        Assertions.assertNotNull(lock);
//    }

//    @Test
//    public void unlock() {
//        Diary diary = new Diary("user1", "pass1");
//        Object unlock = diary.unlock();
//        Assertions.assertNotNull(unlock);
//    }

    @Test
    public void updateEntry() {
        Diary diary = new Diary("user1", "pass1");
        Entry entry1 = new Entry("title1", "desc1");
        diary.addEntry(entry1);
        Entry entry2 = new Entry("title2", "desc2");
        diary.addEntry(entry2);
        Entry updatedEntry = new Entry("updatedTitle", "updatedDesc");
        diary.updateEntry(updatedEntry);
        Entry[] entries = diary.getEntries();
        Assertions.assertEquals(2, entries.length);
        Assertions.assertTrue(entries[0].equals(updatedEntry) || entries[0].equals(entry2));
        Assertions.assertTrue(entries[1].equals(updatedEntry) || entries[1].equals(entry2));
    }

}
