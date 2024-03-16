package Data.Repositories;

import Data.Model.Diary;
import Data.Model.Entry;

import java.util.List;

public interface DiaryRepository  {
    Diary findById(String username);
    Diary deleteById(int id);
    Diary save (Diary diary);
    List<Diary> findAll();
    Diary findById(int id);
    Entry findByUsername(Entry username);
    long count();
    void delete(String username);
    void delete(Diary diary);
    void update(Diary diary);

    Entry findByUsername(String username);
}
