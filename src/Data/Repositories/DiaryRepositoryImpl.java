
package Data.Repositories;

import Data.Exceptions.UsernameAlreadyExistException;
import Data.Model.Diary;
import Data.Model.Entry;

import java.util.ArrayList;
import java.util.List;

public class DiaryRepositoryImpl implements DiaryRepository {
    private List<Diary> diaries;

    public DiaryRepositoryImpl() {
        this.diaries = new ArrayList<>();
    }

    @Override
    public Diary findById(int id) {
        for (Diary diary : diaries) {
            if (diary.getId() == id) {
                return diary;
            }
        }
        return null;
    }

    @Override
    public Entry findByUsername(Entry username) {
        return null;
    }

    @Override
    public Entry findByUsername(String username) {
        for (Diary diary : diaries) {
            for (Entry entry : diary.getEntries()) {
                if (entry.getUsername().equals(username)) {
                    return entry;
                }
            }
        }
        return null;
    }


    @Override
    public Diary save(Diary diary) throws UsernameAlreadyExistException {
        for (Diary existingDiary : diaries) {
            if (existingDiary.getUsername().equals(diary.getUsername())) {
                throw new UsernameAlreadyExistException("Username already exists: " + diary.getUsername());
            }
        }
        diaries.add(diary);
        return diary;
    }

    @Override
    public List<Diary> findAll() {
        return diaries;
    }

    @Override
    public long count() {
        return diaries.size();
    }

    @Override
    public void delete(String username) {
        diaries.removeIf(diary -> diary.getUsername().equals(username));
    }

    @Override
    public Diary findById(String username) {
        return null;
    }

    @Override
    public void deleteById(int id) {
        diaries.removeIf(diary -> diary.getId() == id);
    }

    @Override
    public void delete(Diary diary) {
        diaries.remove(diary);
    }

    @Override
    public void update(Diary diary) {
        for (Diary existingDiary : diaries) {
            if (existingDiary.getId() == diary.getId()) {
                existingDiary.setUsername(diary.getUsername());
                existingDiary.setEntries(diary.getEntries());

                break;
            }
        }
    }

    @Override
    public void deleteByUsername(String username) {
        diaries.forEach(diary -> diary.getEntries().removeIf(entry -> entry.getUsername().equals(username)));
    }
}
