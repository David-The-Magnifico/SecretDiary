package Data.Repositories;

import Data.Exceptions.DiaryNotFoundException;
import Data.Exceptions.InvalidUsernameException;
import Data.Exceptions.UsernameNotFoundException;
import Data.Exceptions.UsernameAlreadyExistException;

import Data.Model.Diary;
import Data.Model.Entry;

import java.util.List;

public class DiaryRepositoryImpl implements DiaryRepository {
    private List<Diary> diaries = new ArrayList<>();
    private long count = 0;

    @Override
    public List<Diary> findAll() {
        return diaries;
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
    public Diary findByUsername(Diary username) throws InvalidUsernameException {
        for (Diary diary : diaries) {
            if (diary.getUsername().equals(username)) {
                return diary;
            }
        }
        throw new InvalidUsernameException("Username not found");
    }

    @Override
    public Diary findById(String username) {
        for (Diary diary : diaries) {
            if (diary.getUsername().equals(username)) {
                return diary;
            }
        }
        return null;
    }

    @Override
    public Diary save(Diary diary) throws UsernameAlreadyExistException {
        for (Diary d : diaries) {
            if (d.getUsername().equals(diary.getUsername())) {
                throw new UsernameAlreadyExistException("Username already exists");
            }
        }
        diaries.add(diary);
        count++;
        return diary;
    }

    @Override
    public void delete(Diary diary) {
        diaries.remove(diary);
    }

    public Diary deleteById(int id) {
        for (Diary diary : diaries) {
            if (diary.getId() == id) {
                diaries.remove(diary);
                return diary;
            }
        }
        return null;
    }

    public void update(Diary diary) {

    }

    public void updateById(int id, Diary diary) {

    }

    @Override
    public long count() {
        return diaries.size();
    }

    @Override
    public void delete(String username) {
        Diary diary = findById(username);
        if (diary!= null) {
            diaries.remove(diary);
        }
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
}