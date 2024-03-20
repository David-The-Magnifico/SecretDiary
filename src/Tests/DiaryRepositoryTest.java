package Tests;

import Data.Model.Diary;
import Data.Model.Entry;
import Data.Repositories.DiaryRepository;
import Data.Repositories.DiaryRepositoryImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class DiaryRepositoryTest {


    @Test
    public void testFindById() {
        DiaryRepository diaryRepository = new DiaryRepositoryImpl();
        Diary diary = new Diary("David");
        diaryRepository.save(diary);
        Diary foundDiary = diaryRepository.findById("David");
        assertEquals(diary, foundDiary);
    }

    @Test
    public void testDeleteById() {
        DiaryRepository diaryRepository = new DiaryRepositoryImpl();
        Diary diary = new Diary("David");
        diaryRepository.save(diary);
        diaryRepository.deleteById(1);
        Diary foundDiary = diaryRepository.findById("David");
        assertNull(foundDiary);
    }

    @Test
    public void testSave() {
        DiaryRepository diaryRepository = new DiaryRepositoryImpl();
        Diary diary = new Diary("David-the Magnifico");
        diaryRepository.save(diary);
        Diary foundDiary = diaryRepository.findById("David-the Magnifico");
        assertEquals(diary, foundDiary);
    }

    @Test
    public void testFindAll() {
        // Arrange
        DiaryRepository diaryRepository = new DiaryRepositoryImpl();
        Diary diary1 = new Diary("David");
        Diary diary2 = new Diary("Osmond");
        diaryRepository.save(diary1);
        diaryRepository.save(diary2);
        List<Diary> diaries = diaryRepository.findAll();
        assertTrue(((List<?>) diaries).contains(diary1));
        assertTrue(diaries.contains(diary2));
    }

    @Test
    public void testFindByUsername() {
        DiaryRepository diaryRepository = new DiaryRepositoryImpl();
        Diary diary = new Diary("David");
        Entry entry = new Entry("Entry", "Note");
        diary.addEntry(entry);
        diaryRepository.save(diary);
        Entry foundEntry = diaryRepository.findByUsername("David");
        assertEquals(entry, foundEntry);
    }

    @Test
    public void testCount() {
        DiaryRepository diaryRepository = new DiaryRepositoryImpl();
        Diary diary1 = new Diary("David-the Magnifico1");
        Diary diary2 = new Diary("David-the Magnifico2");
        diaryRepository.save(diary1);
        diaryRepository.save(diary2);
        long count = diaryRepository.count();
        assertEquals(2, count);
    }

    @Test
    public void testDelete() {
        DiaryRepository diaryRepository = new DiaryRepositoryImpl();
        Diary diary = new Diary("David-the Magnifico");
        diaryRepository.save(diary);
        diaryRepository.delete("David-the Magnifico");
        Diary foundDiary = diaryRepository.findById("David-the Magnifico");
        assertNull(foundDiary);
    }

    @Test
    public void testDeleteByDiary() {
        DiaryRepository diaryRepository = new DiaryRepositoryImpl();
        Diary diary = new Diary("David-the Magnifico");
        diaryRepository.save(diary);
        diaryRepository.delete(diary);
        Diary foundDiary = diaryRepository.findById("David-the Magnifico");
        assertNull(foundDiary);
    }

    @Test
    public void testUpdate() {
        DiaryRepository diaryRepository = new DiaryRepositoryImpl();
        Diary diary = new Diary("David-the Magnifico");
        diaryRepository.save(diary);
        diary.setName("My Diary");
        diaryRepository.update(diary);
        Diary foundDiary = diaryRepository.findById("David-the Magnifico");
        assertEquals("newName", foundDiary.getName());
    }

    @Test
    public void testDeleteByUserName() {
        DiaryRepository diaryRepository = new DiaryRepositoryImpl();
        Diary diary = new Diary("David-the Magnifico");
        diaryRepository.save(diary);
        diaryRepository.deleteByUserName("David-the Magnifico");
        Diary foundDiary = diaryRepository.findById("David-the Magnifico");
        assertNull(foundDiary);
    }

    public void main() {
    }
}