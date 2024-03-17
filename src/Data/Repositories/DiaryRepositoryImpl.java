package Data.Repositories;

import Data.Exceptions.DiaryNotFoundException;
import Data.Exceptions.InvalidUsernameException;
import Data.Exceptions.UsernameNotFoundException;
import Data.Exceptions.UsernameAlreadyExistException;

import Data.Model.Diary;
import Data.Model.Entry;

import java.util.List;

public class DiaryRepositoryImpl implements DiaryRepository {
    @Override
    public List<Diary> findAll() {
        return null;
    }

    @Override
    public Diary findById(int id) {
        return null;
    }

    @Override
    public Entry findByUsername(Entry username) {
        return null;
    }


    @Override
    public Diary findByUsername(Diary username) throws InvalidUsernameException {
        for (Diary diary : diaries) {
            if (diary.getUsername().equals(username)) {
                return Diary;
            }
            break;
        }
        throw new InvalidUsernameException("Username not found");
    }
    @Override
    public Diary findById(String username) {
        return null;
    }
    @Override
    public Diary save(Diary diary) throws UsernameAlreadyExistException {
        Diary[] Diary = new Diary[0];
        for (Diary diary1 : Diary) {
            if (diary1.getUsername().equals(diary1.getUsername())) {
                throw new UsernameAlreadyExistException("Username already exists");
            }
        }
        diaries.add(diary);
        count++;
        return diary;
    }
    @Override
    public void delete(Diary diary) {
        for (Diary diary1: diaries) {
            if (diary1.getUsername().equals(diary.getUsername())) {
                diaries.remove(diary1);
                count--;
                break;
            }
            else {
                throw new DiaryNotFoundException("Diary does not exist");
            }
        }

    }
    public Diary deleteById(int id) {

        return null;
    }
    public void update(Diary diary) {


    }
    public void updateById(int id, Diary diary) {

    }
    @Override
    public long count() {
        return count;
    }
    @Override
    public void delete(String username) {
        Diary diary1 = findById(username);
        if (diary1 == null) {
            throw new UsernameNotFoundException("Username does not exist");
        }
        else {
            diaries.remove(diary1);
        }

    }
    @Override
    public Entry findByUsername(String username) {

        return Entry;
    }
}