package Data.Repositories;

import Data.Exceptions.UsernameAlreadyExistException;
import Data.Model.Entry;

import java.util.List;

public interface EntryRepository {
    Entry findById(int id);

    Entry findEntriesByTitle(String title);

    Entry findEntryByAuthor(String author);

    boolean deleteByEntry(Entry entry);

    Entry save(Entry entry) throws UsernameAlreadyExistException;

    List<Entry> findAll();

    Entry findByTitle(String title);

    long count();

    void deleteById(int id);

    void delete(Entry entry);

    void update(Entry entry);

    Entry findByUsername(String username);

    void deleteByUsername(String username);
}
